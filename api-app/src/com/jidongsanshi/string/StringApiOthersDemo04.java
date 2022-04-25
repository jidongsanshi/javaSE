package com.jidongsanshi.string;

public class StringApiOthersDemo04 {
    public static void main(String[] args) {
//        public int length() 返回此字符串的长度
        String name = "法外狂徒张三";
        System.out.println(name.length());
//        public char charAt(int index) 获取某个索引位置处的字符
        char c = name.charAt(1);
        System.out.println(c);
        //遍历字符串中的字符
        System.out.println("---------------------");
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            System.out.println(ch);
        }
//        public char[] toCharArray()： 将当前字符串转换成字符数组返回
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
//        public String substring(int beginIndex, int endIndex) 根据开始和结束索引进行截取，得到新的字符串（包前不包后）
        String s = "java是最厉害的编程语言";
        System.out.println(s.substring(0, 9));
//        public String substring(int beginIndex) 从传入的索引处截取，截取到末尾，得到新的字符串
        System.out.println(s.substring(4));
//        public String replace(CharSequence target,CharSequence replacement)使用新值，将字符串中的旧值替换，得到新的字符串
        String s1 = "曹尼玛 你在玩什么";
        String rs1 = s1.replace("曹尼玛","***");
        System.out.println(rs1);
        //public boolean contains(CharSequence s) 判断包含
        System.out.println(s1.contains("曹尼玛"));
        System.out.println(rs1.contains("曹尼玛"));
        //public boolean startWiths(String prefix) 判断以什么开始
        System.out.println(s1.startsWith("曹尼玛"));
        System.out.println(rs1.startsWith("曹尼玛"));

//        public String[] split(String regex) 根据传入的规则切割字符串，得到字符串数组返回
        String name1 = "王宝强，贾乃亮，陈羽凡";
        String[] names = name1.split("，");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
