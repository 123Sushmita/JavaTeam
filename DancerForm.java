public class DancerForm {
    public static void main(String[] args) {
        Style mydance = new Style();
byte x=3;
Long Contact = 987654093l;
mydance.dancer("sushmita ");
mydance.dancer(x,Contact);
mydance.dancer(Contact,x);
mydance.dancer((byte) 6);

    }
}
class Style {
    void dancer(){
        System.out.println("All Dancer Style is available in session..");
    }
    void dancer(String dancerName){
        System.out.println("dancer (String):Dancer Style "+dancerName);

    }
     void dancer (byte NumberOfDancerStyle)
     {
         System.out.println("dancer(byte) : Dancer Style "+NumberOfDancerStyle);
     }
     void dance (long DancerContact){
         System.out.println("dial(long) : All The Dancer Contact is "+DancerContact);
     }
     void dancer (byte NumberOfDancerStyle, long DancerContact){
         System.out.println("dancer(byte,long): Information of dancers dance style:"+NumberOfDancerStyle+"Dancers contact "+DancerContact);
     }
     void dancer (long DancerContact , byte NumberOfDancerStyle){
         System.out.println("dancer(long,byte): To contact dancers:"+DancerContact+ " To know Number of dance style dancer know.."+NumberOfDancerStyle);
     }
}