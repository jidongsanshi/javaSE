package com.jidongsanshi;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        //1 定义账户类
        //2 定义一个集合容器 存储账户对象
        ArrayList<Account> accountArrayList = new ArrayList<>();
        //3 展示系统的首页
        Scanner sc = new Scanner(System.in);
        OUT:
        while (true) {
            System.out.println("----------------------ATM系统------------------------");
            System.out.println("1:账户登录");
            System.out.println("2:账户开户");
            System.out.println("0:退出系统");
            System.out.println("请您选择操作：");
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    //用户登录
                    login(accountArrayList);
                    break;
                case 2:
                    //用户账户开户
                    register(accountArrayList);
                    break;
                case 0:
                    break OUT;
                default:
                    System.out.println("输入的命令有误");
            }
        }

    }

    /**
     * 用户登录功能
     *
     * @param accountArrayList 用户账户的集合
     */
    private static void login(ArrayList<Account> accountArrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------用户登录----------------");
        if (accountArrayList.size() == 0) {
            System.out.println("当前系统中无任何账户，请先开户再进行登录");
            return;
        }

        System.out.println("请输入登录的卡号");
        String cardId = sc.next();
        Account account = getAccountByCardId(cardId, accountArrayList);
        if (account != null) {
            while (true) {
                System.out.println("请输入登录密码：");
                String password = sc.next();
                if (account.getPassword().equals(password)) {
                    //登录成功
                    System.out.println("恭喜您，" + account.getUserName() + "成功进入系统");
                    showUserCommand(sc, account, accountArrayList);
                    return;
                } else {
                    System.out.println("对不起 您输入的密码不正确！");
                }
            }

        } else {
            System.out.println("对不起 系统中不存在这个账户");
        }


    }

    /**
     * 用户所有操作入口
     *
     * @param sc               扫描器
     * @param account          当前登录用户
     * @param accountArrayList 系统中的所有用户
     */
    private static void showUserCommand(Scanner sc, Account account, ArrayList<Account> accountArrayList) {
        while (true) {
            System.out.println("-----------欢迎进入用户操作页面-----------");
            System.out.println("1 查询账户");
            System.out.println("2 存款");
            System.out.println("3 取款");
            System.out.println("4 转账");
            System.out.println("5 修改密码");
            System.out.println("6 退出");
            System.out.println("7 注销账户");
            System.out.println("请输入您的操作命令：");

            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询账户
                    showAccount(account);
                    break;
                case 2:
                    //存款
                    depositMoney(account, sc);
                    break;
                case 3:
                    //取款
                    drawMoney(account, sc);
                    break;
                case 4:
                    //转账
                    transferMoney(account, sc, accountArrayList);
                    break;
                case 5:
                    //修改密码
                    updatePassword(account, sc);
                    return;
                case 6:
                    //退出
                    System.out.println("退出成功，欢迎下次光临");
                    return;

                case 7:
                    //注销账户
                    if (deleteAccount(account, sc, accountArrayList)) {
                        //销户成功回到首页
                        return;
                    }else {
                        //没有销户成功
                        break;
                    }
                default:
                    System.out.println("您输入的命令有误！");
            }
        }
    }

    /**
     * 销户功能
     *
     * @param account          当前登录账户
     * @param sc               扫描器
     * @param accountArrayList 系统中所有账户
     * @return 是否销户成功
     */
    private static boolean deleteAccount(Account account, Scanner sc, ArrayList<Account> accountArrayList) {
        System.out.println("您确认要销户吗 y/n");
        String rs = sc.next();
        if (rs.equals("y")) {
            if (account.getMoney() > 0) {
                System.out.println("账户中的钱还没有取完 无法销户");
            } else {
                accountArrayList.remove(account);
                System.out.println("销户完成！");
                return true;
            }
        } else {
            System.out.println("好的 账户继续保留");
        }
        return false;
    }

    /**
     * 修改密码
     *
     * @param account 当前登录的用户
     * @param sc      扫描器
     */
    private static void updatePassword(Account account, Scanner sc) {
        System.out.println("----------------用户密码修改------------------");
        while (true) {
            System.out.println("请输入当前密码：");
            String password = sc.next();
            if (account.getPassword().equals(password)) {
                while (true) {
                    System.out.println("请输入新密码");
                    String newPassword = sc.next();
                    System.out.println("请再次输入新密码确认");
                    if (sc.next().equals(newPassword)) {
                        account.setPassword(newPassword);
                        System.out.println("密码修改成功");
                        return;
                    } else {
                        System.out.println("您两次输入的密码不一致");
                    }
                }
            } else {
                System.out.println("您输入的密码不正确");
            }
        }
    }

    /**
     * 转账功能
     *
     * @param account          当前账户
     * @param sc               扫描器
     * @param accountArrayList 系统全部账户集合
     */
    private static void transferMoney(Account account, Scanner sc, ArrayList<Account> accountArrayList) {
        System.out.println("----------------用户转账操作------------------");
        if (accountArrayList.size() < 2) {
            System.out.println("当前系统中不足两个账户，去开户吧");
            return;
        }

        if (account.getMoney() == 0) {
            System.out.println("对不起 您的账户没有余额 无法转账");
            return;
        }

        while (true) {
            System.out.println("请您输入对方的卡号：");
            String cardId = sc.next();

            if (cardId.equals(account.getCardId())) {
                System.out.println("您不能给自己转账");
                continue;
            }
            Account opposeAccount = getAccountByCardId(cardId, accountArrayList);
            if (opposeAccount == null) {
                System.out.println("对不起，您输入的这个账户不存在");
            } else {
                String username = opposeAccount.getUserName();
                String tip = "*" + username.substring(1);
                System.out.println("请您输入[" + tip + "]的姓氏");
                String preName = sc.next();

                if (username.startsWith(preName)) {
                    while (true) {
                        System.out.println("请输入转账金额");
                        double money = sc.nextDouble();
                        if (money > account.getQuotaMoney()) {
                            System.out.println("超出限额");
                        } else {
                            if (money > account.getMoney()) {
                                System.out.println("对不起 您余额不足 您最多可以转账" + account.getMoney());
                            } else {
                                account.setMoney(account.getMoney() - money);
                                opposeAccount.setMoney(opposeAccount.getMoney() + money);
                                System.out.println("转账成功 您当前账户余额为" + account.getMoney());
                                return;
                            }
                        }

                    }
                } else {
                    System.out.println("对不起 您输入的姓氏有误");
                }
            }
        }
    }

    /**
     * 取钱功能
     *
     * @param account 用户账户
     * @param sc      扫描器
     */
    private static void drawMoney(Account account, Scanner sc) {
        System.out.println("----------------用户取钱操作------------------");
        if (account.getMoney() < 100) {
            System.out.println("账户余额不足100，不能取钱");
            return;
        }

        while (true) {
            System.out.println("请输入取款金额");
            double money = sc.nextDouble();

            if (money > account.getQuotaMoney()) {
                System.out.println("对不起 您当前去取款金额超出每次限额 每次最多可以取 ：" + account.getQuotaMoney());
            } else {
                if (money > account.getMoney()) {
                    System.out.println("余额不足 您账户目前余额为" + account.getMoney());
                } else {
                    account.setMoney(account.getMoney() - money);
                    System.out.println("取钱成功，取钱" + money + "元");
                    showAccount(account);
                    return;
                }
            }
        }
    }

    /**
     * 存钱
     *
     * @param account 当前账户对象
     * @param sc      扫描器
     */
    private static void depositMoney(Account account, Scanner sc) {
        System.out.println("----------------用户存钱操作------------------");
        System.out.println("请输入存款金额");
        double money = sc.nextDouble();

        account.setMoney(account.getMoney() + money);
        System.out.println("存钱成功 当前用户信息如下：");
        showAccount(account);
    }

    /**
     * 展示用户信息
     *
     * @param account 当前登录的账户
     */
    private static void showAccount(Account account) {
        System.out.println("----------------用户的详情界面------------------");
        System.out.println("卡号：" + account.getCardId());
        System.out.println("用户名：" + account.getUserName());
        System.out.println("余额：" + account.getMoney());
        System.out.println("限额：" + account.getQuotaMoney());
    }

    /**
     * 用户开户功能
     *
     * @param accountArrayList 接收的账户集合
     */
    private static void register(ArrayList<Account> accountArrayList) {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------欢迎进入开户界面------------------");
        System.out.println("请您输入账户用户名：");
        String username = sc.next();
        account.setUserName(username);

        while (true) {
            System.out.println("请输入账户密码：");
            String password = sc.next();
            System.out.println("请确认用户密码：");
            if (password.equals(sc.next())) {
                account.setPassword(password);
                break;
            } else {
                System.out.println("两次输入密码不一致 请重新设置");
            }
        }

        System.out.println("请您输入账户当次限额：");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        //为账户生成一个八位不重复账号
        String cardId = getRandomCardId(accountArrayList);
        account.setCardId(cardId);
        accountArrayList.add(account);
        System.out.println("恭喜您" + username + ",开户成功，您的卡号为" + cardId + ",请您妥善保管卡号");
    }

    /**
     * 生成一个八位的不重复卡号
     *
     * @param accountArrayList 全部账户集合
     * @return 八位账户卡号
     */
    private static String getRandomCardId(ArrayList<Account> accountArrayList) {
        Random r = new Random();
        while (true) {
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }

            //判断是否重复
            Account account = getAccountByCardId(cardId, accountArrayList);
            if (account == null) {
                return cardId;
            }
        }

    }

    /**
     * 根据卡户查出一个账户
     *
     * @param cardId           卡号
     * @param accountArrayList 全部账户集合
     * @return 账户对象|null
     */
    private static Account getAccountByCardId(String cardId, ArrayList<Account> accountArrayList) {
        for (Account account : accountArrayList) {
            if (account.getCardId().equals(cardId)) {
                return account;
            }
        }
        return null;
    }

}
