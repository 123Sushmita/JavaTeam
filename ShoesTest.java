public class ShoesTest{
    public static void main(String[] args) {
        System.out.println("Begin with main");
        ShoesBrand Obj1 = new ShoesBrand(120 ,"Nike",(float)9.5);
        ShoesBrand Obj2 = new ShoesBrand(190,"Puma",(float)6);
        ShoesBrand Obj3 = new ShoesBrand(80, "Converse",(float)7);

        Obj1.PrintShoesBrand ();
        Obj2.PrintShoesBrand ();
        Obj3.PrintShoesBrand ();

        Obj1.ReturnShoes(120.0);
        Obj2.ReturnShoes(190.0);
        Obj3.ReturnShoes(80.0);


        System.out.println("End main..");
    }
}
class ShoesBrand{
    private double ShoesPrice;
    private String ShoesBrandName;
    private float ShoesSizeNumber;
    ShoesBrand(int ShoesPrice, String ShoesBrandName ,float ShoesSizeNumber){
        System.out.println("Constructor is setting the initial details.. ");
        this.ShoesPrice = ShoesPrice;
        this.ShoesBrandName = ShoesBrandName;
        this.ShoesSizeNumber = ShoesSizeNumber;
    }
    void PrintShoesBrand ()

    {
        System.out.println("ShoesPrice:"+ShoesPrice);
        System.out.println("ShoesBrandName:"+ShoesBrandName);
        System.out.println("ShoesSizeNumber:"+ShoesSizeNumber);
        System.out.println("..................................");
    }
    void ReturnShoes(Double amountToRefund){
        System.out.println("Returning..."+amountToRefund);
      Double ShoesPrice =amountToRefund;
    }
}
