public class SimpleCompoundInterest {
    public static void main(String[] args) {
        SimpleIntrest calulator = new SimpleIntrest();
        calulator.SICal();
        CompoundInt cal = new CompoundInt();
        cal.CI();
    }
}
        class SimpleIntrest{
    int p = 1000;
    int t = 15;
    float r = (float)6.3;
    float SI=(p*t*r)/100;

        void SICal()
    {
        System.out.println("The Simple interest is:"+SI);

        }

        }

class CompoundInt{
    double p = 2000;
    float rt= (float)3.7;
    float tm = (float) 5.4;
    float n = (float)0.5;

 double CompInt = p*(Math.pow((1 + rt / 100),tm));


    void CI()
    {

        System.out.println("The value of Compund Interest is"+CompInt);
    }
}


