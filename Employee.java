public class Employee {
    public static void main(String[] args) {
        MyEmployee employeeobj = new MyEmployee();
        employeeobj.employee(120000);
        employeeobj.measurescale();
        System.out.println("The employee salary is:"+employeeobj.measurescale());


    }
}
class MyEmployee {
    int salary;
    char scale;

    void employee(int Sal) {
        salary = Sal;
    }

    char measurescale() {
        if (salary < 80000) {
            System.out.println("The employee scale is L");

        } else if (salary >= 100000) {
            System.out.println("The employee sclae is M");

        } else {
            System.out.println("The employee scale is H");
        }
        return scale;


    }
}

