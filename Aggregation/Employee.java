


public class Employee {

    public static void main(String []args){
        Employee employee1= new Employee(1020, "Sushant ","Dallas");
        Employee employee2 = new Employee(1021,"Arshmi","Tarant");
        Address address1 = new Address("Irving","Texas","USA");
        Address address2 = new Address("Arlington","Texas","USA");
        employee1.Display();
        employee2.Display();
    }
    int Id ;
    String Name;
    String address;


    public Employee(int id, String name, String address) {
        Id = id;
        Name = name;
        this.address = address;
    }




    void Display(){
        System.out.println(Id +""+ Name);
        System.out.println(address);

}

}







