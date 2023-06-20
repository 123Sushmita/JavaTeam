  import java.util.Scanner;
    public class IfElse {
    public static void main (String[]args){
        Scanner myObj= new Scanner(System.in);
        System.out.println( "Enter your age: ");
   int age =myObj.nextInt() ;
    if( age>= 18){
        System.out.println("The person is adult ");

    }
else {
        System.out.println("The person is not adult");
    }
    }
}
