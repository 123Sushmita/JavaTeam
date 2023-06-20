public class InheritanceSchool {
    public static void main(String[] args) {
        School school = new School();
        school.education();
        school.takeFees();
        Teacher teach = new Teacher();
        teach.teaches();
        teach.getSalary();
        Student student = new Student();
        student.learn();
        student.pays();

    }
}
        class School{
            void education(){
                System.out.println("School provides a education.");

            }
            void takeFees(){
                System.out.println("School charge fees to their students.");
            }

        }
        class Teacher extends School{
             void teaches(){
    System.out.println("Teacher teaches in School.");
}
 void getSalary    () {
     System.out.println("School gives salary  to teachers.");
 }
}
        class Student extends School{
            void learn (){

                System.out.println("Students learn in school.");
            }
            void pays(){
                System.out.println("Student pays to school.");
            }
        }


