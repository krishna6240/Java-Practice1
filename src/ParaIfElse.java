public class ParaIfElse {
    static  void checkAge(int age){
        if(age > 18) {
            System.out.println(("Access denied - you are not old enough!"));
        }else{
            System.out.println("Access Granted - you are old enough!");
        }
    }

    public static void main(String[] args){
        checkAge(20);//call the checkAge method and pass along an age of 20
    }
}
