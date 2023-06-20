import java.util.Scanner;

public class Overloading {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter your numbers:");
        Calculation cal = new Calculation();
        cal.add(32,65);
        cal.add(20 ,45 ,23);

    }
}
class Calculation{
    int add=0;

    void add(int x , int y ) {
        add=x+y;
        System.out.println("The value of add is :"+add);
    }
void add (int x ,int y, int z ){
        int add = 0;
        add = x+y+z;


    System.out.println("The value of add  is :"+add);

}

}