

    public class OfficeSalary {
    public static void main(String args[]){
    Office office = new Office();
     Employee employee = new Employee();
     JavaDeveloper java = new JavaDeveloper();
     office.Benefits();
     office.Opportunities();
     office.PaysSalary();
     office.Works();
     employee.GetSalary();
     employee.GetsBenefit();
     employee.GetsOpportunities();
     employee.Works();
     java.Develops();
     java.GetsBenefits();
     java.GetSalary();


    }
}
class Office {
    void Works (){
        System.out.println("In office employees work.");
    }
    void PaysSalary() {
        System.out.println("Office pays salary to employee");
    }
void Opportunities(){
    System.out.println("Office provide opportunities to the employees.");
}
void Benefits(){
    System.out.println("Office give benefits to their employees.");

}
        }
        class Employee extends Office{
    void Works(){
        System.out.println("Employee works for the  office.");
    }
    void GetSalary(){
        System.out.println("Employee get salary from office");
    }
    void GetsBenefit(){
        System.out.println("Employee gets benefits from their office.");
    }
    void GetsOpportunities()
    {
        System.out.println("Employee gets more benefits in office ");
    }
    }
    class JavaDeveloper extends Employee{
    void Develops()
    {
        System.out.println("Java Developers works in office to develop a software. ");
    }
    void GetsBenefits(){
        System.out.println("Java Developers gets benefits in office. ");
    }
    void GetSalary(){
        System.out.println("Developers get salary in office");
    }
    }