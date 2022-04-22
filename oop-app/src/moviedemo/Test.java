package moviedemo;

public class Test {
    //案例 电影信息展示
    /*"长津湖",9.7,"吴京"
     * "我和我的父辈",9.6,"吴京"
     * "扑水少年",9.5,"王川"
     * */

    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0]=new Movie("长津湖",9.7,"吴京");
        movies[1]=new Movie("我和我的父辈",9.6,"吴京");
        movies[2]=new Movie("扑水少年",9.5,"王川");

        for (int i = 0; i < movies.length; i++) {
            System.out.println("电影名："+movies[i].getName());
            System.out.println("得分："+movies[i].getScore());
            System.out.println("主演："+movies[i].getActor());
        }

    }
}