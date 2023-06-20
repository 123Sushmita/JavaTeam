import org.w3c.dom.ls.LSOutput;

public class InheritanceFruits {
    public static void main(String[]args){
        Fruits fruits = new Fruits();
        Banana banana = new Banana();
        Apple apple = new Apple();
        fruits.Energy();
        fruits.Healthy();
        banana.goodProtein();
        banana.yellowInColour();
        apple.RedInColour();
        apple.KeepsADoctorAway();

    }
}
class Fruits{
    void Healthy (){
        System.out.println("Fruits are good for health.");
    }
    void Energy(){
        System.out.println("Fruits gives us energy.");

    }
        }
        class Banana {
    void goodProtein ()
    {
        System.out.println("Bananas count in a good protein.");
    }

    void yellowInColour ()
    {
        System.out.println("Banana's colour is yellow.");
    }
        }
class Apple{
    void KeepsADoctorAway(){
        System.out.println("A apple in a day keeps a doctor away");
    }
    void RedInColour(){
        System.out.println("Apple's colour is red.");
    }
}