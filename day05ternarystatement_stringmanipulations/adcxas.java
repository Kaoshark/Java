package day05ternarystatement_stringmanipulations;

public class adcxas {
    public static void main(String[] args) {
        int  s = 27;
        String sonuc1=  s%2==0 ?  "even" : "odd";
        System.out.printf(sonuc1);


        int k = 785;
        String sonuc2 = k>99 && k<1000 ? " 3 digits" : " does not 3";
        System.out.printf(sonuc2);

        double m = 7;
        Double sonuc3= m>0 ? m*1 : m ;
        System.out.println(sonuc3);

        int p = -7;
        int o = 8;

        Object sonuc4 = (p>0 && o>0) || (p<0 && o<0) ? p*o : o*p  ;
        System.out.print(sonuc4);

        int t = 30;
        String sonuc5= t%2!=0 ? " even and 3 divisible" : " even but not 3 divisible";
        System.out.printf(sonuc5);

        int year = 4449 ;
        String sonuc6 = ( year%100==0 ) ? (year%50==0 ? " leap " : " no leap") : ( year%8==0 ? " Leap year " : " Not leap year");
        System.out.printf(sonuc6);

        String s5= " Ismail SAHIN...!";
        int numOfChar=  s5.replaceAll("A-Za-z", ""   ).length();
        System.out.print(numOfChar);

        String pwd= "s1455ds7!";
        String hiddenPwd= pwd.replaceAll("[0-9]","*");
        System.out.print(pwd);

        String name= " asmail sahin ";
        String firstinitial= name.trim().substring(0,1).toUpperCase();
        String lastinitial=name.trim().split("")[1].substring(0,1).toUpperCase();
        System.out.printf(firstinitial+lastinitial);

    }

}