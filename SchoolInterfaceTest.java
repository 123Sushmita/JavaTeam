public class SchoolInterfaceTest {
    public static void main(String[] args) {
        School school = new School();
        school.confidence();
        school.fees();
        school.Knowledge();
        Teachers teachers = new Teachers();
        teachers.guides();
        teachers.Salary();
        teachers.Teaches();
        teachers.helpingToSolveProblem();
        Students students = new Students();
        students.pays();
        students.playsSports();
        students.solveProblem();
        students.studies();
        students.confidence();
        students.Knowledge();
    }
}
interface giveKnowledge{
    void Knowledge();
}
interface takesMoney{
    void fees();
}
interface buildConfident{
    void confidence();
}
class School implements giveKnowledge,takesMoney,buildConfident{

    @Override
    public void Knowledge() {
        System.out.println("School is the place where students learn and gain knowledge.");

    }

    @Override
    public void fees() {
        System.out.println("School earn money in the name of fees from the students.");

    }

    @Override
    public void confidence() {
        System.out.println("In school students have a confidence to get a good marks.");

    }
}
interface teaching{
    void Teaches();
}
interface guiding{
    void guides();
}
interface helping{
    void helpingToSolveProblem();
}
interface earnMoney{
    void Salary();
}
class Teachers extends School implements teaching,guiding,helping,earnMoney{

    @Override
    public void Teaches() {
        System.out.println("Teachers teaches students in School.");
    }

    @Override
    public void guides() {
        System.out.println("Teachers guides students in right path. ");

    }

    @Override
    public void helpingToSolveProblem() {
        System.out.println("Teachers are always there for students to solve problems. ");

    }

    @Override
    public void Salary() {
        System.out.println("Teachers gets salary for helping, teaching and guiding students.");

    }
}
interface Study{
    void studies();
}
interface Solving{
    void solveProblem();
}
interface payingBills{
    void pays();
}
interface sports{
    void playsSports();
}
class Students extends School implements Study,Solving,payingBills,sports{

    @Override
    public void studies() {
        System.out.println("Students studies in school.");
    }

    @Override
    public void solveProblem() {
        System.out.println("Students learn to solve problem in school.");

    }

    @Override
    public void pays() {
        System.out.println("Student pays fees for learning in school.");
    }

    @Override
    public void playsSports() {
        System.out.println("Students participants in  School's sports week.");

    }

    @Override
    public void Knowledge() {
        super.Knowledge();
        System.out.println("Students get knowledge.");
    }

    @Override
    public void confidence() {
        super.confidence();
        System.out.println("Students have a confidence after they go school.");
    }
}