public class TexasTax {
    public static void main(String[] args) {
        FederalTax federal = new FederalTax();
        SocialSecurity socialSecurity = new SocialSecurity();
        Medicare medicare = new Medicare();
        medicare.CalculateTaxs();
        socialSecurity.CalculateTaxs();
        federal.CalculateTaxs();

    }
}
abstract class Tax {
    abstract void CalculateTaxs();

}
class FederalTax extends Tax{

    @Override
    void CalculateTaxs() {
        System.out.println("Calulate the federal tax. ");
    }
}
class SocialSecurity extends Tax{

    @Override
    void CalculateTaxs() {
        System.out.println("Calculate the socialsecurity tax.");
    }
}
class Medicare extends Tax{

    @Override
    void CalculateTaxs() {
        System.out.println("Calculate the medicare tax.");

    }
}

