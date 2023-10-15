package day04logicial_and_operators_if_switch;

public class C01PreIncreiment {
    public static void main(String[] args) {

        //Post increment

        int a = 12;

        int b = a++;

        System.out.println(a);//13
        System.out.println(b);//12 or 13

        double x = 11.5;

        double y = x++;
        System.out.println(x);
        System.out.println(y);

        //Pre Increment

        int t = 10;

        int u = ++t;

        System.out.println(t);//11
        System.out.println(u);//11

        //Post Decrement

        int c =15;

        int d = c--;

        System.out.println(c);
        System.out.println(d);

        //Pre Decrement

        int e =20;
        int f = --e;

        System.out.println(e);
        System.out.println(f);
    }
}
