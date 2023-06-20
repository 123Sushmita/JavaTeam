import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class IfElseIf {
    public static void main(String[]args){
        Scanner Obj1 = new Scanner(System.in);
        System.out.println("Enter your age and Salary");
        int age = Obj1.nextInt();

        double Salary = Obj1.nextDouble();

if (Salary>=50000 && age>=25){
    System.out.println("Congratulations you salary will be increased by five  thousand.");
}
else if(Salary<50000 && age <24){
    System.out.println(" Congratulations your salary will be increased by  two thousand");
}
else {
    System.out.println("Better luck next time");
}
    }

}
