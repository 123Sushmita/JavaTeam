public class overriding {
    public static void main(String args[]){

        Calculation cal = new Calculation();
        cal . add(34,43);
        Addition addi = new Addition();
        addi.add(12 ,32 ,54 );

    }
    class  Calculations{
        int add = 0;

        void add(int x, int y){
            add = x+y;
            System.out.println("The number is :"+add);
        }

    }
    static class Addition extends Calculation{
        int add = 0;

        void add (int x , int y ,int z  )
        {
            add =x+y+z;
            System.out.println("The number is :"+ add);
        }
    }
}