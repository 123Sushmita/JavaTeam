import java.util.Scanner;
public class IfElseIfElseIf {
    public static void main(String[]args){
        Scanner obj2 = new Scanner(System.in);
        System.out.println(" Please enter your City name: ");
        String cityName = obj2.next();

        if (cityName.equalsIgnoreCase("Irving"))
        {
            System.out.println("MiniBus will come to pick the students.");

        }
        else if (cityName.equalsIgnoreCase("Lascolinas"))
        {
            System.out.println("Bus will come to pick the students.");

        }
        else if (cityName.equalsIgnoreCase("Dallas "))
        {
            System.out.println("Van will come to pick the students.");

        }
        else {
            System.out.println("Data not available.");
        }

    }
}
