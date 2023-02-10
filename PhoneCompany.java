public class PhoneCompany {
    public static void main(String[] args) {
    AndroidPhone PO = new AndroidPhone("GalaxyJ " , "LgV  ");
    PO.ShowPhoneOptions();
    System.out.println("...........................................................");
    Samsung P1 = new Samsung("GalaxyJ","LgV", "GalaxyS");
    P1.PrintSamsungMobiles();
    System.out.println("......................");
    }

}
class AndroidPhone{
    String  SamsungMobile;
    String LgMobile;

    AndroidPhone(String SamsungMobile, String LgMobile) {
this.SamsungMobile = SamsungMobile;
this.LgMobile = LgMobile;
    }
    void ShowPhoneOptions(){
            System.out.println("This is the phone  of.. "+SamsungMobile);
            System.out.println("This is the phone of.."+LgMobile);
        }
    }
class Samsung   extends AndroidPhone
{
    String Galaxy;

    public Samsung(String Samsung, String Lg, String galaxyS) {
        super(Samsung, Lg);
        Galaxy = galaxyS;
    }


    void PrintSamsungMobiles(){
        super.ShowPhoneOptions();
        System.out.println("This is the type of samsung mobile:"+Galaxy);
    }
}





