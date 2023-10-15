package Day19Exceptions;

public class C02Exceptions {

    public static void main(String[] args) {
        String[] s={"Adam","Marry","Joe","Mark"};

        getElementFromArrayByIndex(s,1);//Marry
        getElementFromArrayByIndex(s,4);//ArrayIndexOutBoundsException: Java throws ArrayIndexOutOfBou dsException,
                                            //if you non-existing index in an array
        System.out.println(convertStringToInt("123")+1);//124
        System.out.println(convertStringToInt("0")+1);//1
        System.out.println(convertStringToInt("-2")+1);//-1
        System.out.println(convertStringToInt("1a2")+5);//124



    }

    //Creat a method returns the element by using index from on Array
    public static void getElementFromArrayByIndex(String[] s,int idx) {

        try {

            System.out.println(s[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Do not use non-existing index");
        }
    }public static Integer convertStringToInt(String s){
        Integer result=0;
    try {
        result=Integer.valueOf(s);
    }catch (NumberFormatException e){
        System.out.println(e.getMessage());//For input string : "1a2
        System.out.println("The String is not in number format");
    }
    return result;
    }
}
