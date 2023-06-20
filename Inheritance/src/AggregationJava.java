public class AggregationJava {
    public static void main(String args[]){

        Workers workers = new Workers();
        Workers.DepartmentWorkers dptworker1= new Workers.DepartmentWorkers(50000,"java");
        dptworker1.Worker1();
        Workers.DepartmentWorkers dptworker2= new Workers.DepartmentWorkers(60000,"python");
        dptworker2.Worker1();

    }
}

class Workers {

    void Worker1Salary (int pay,String dpt){
        System.out.println("Here is the salary paid by company to workers:"+pay + " and dpt :"+dpt);
    }


public static class DepartmentWorkers extends Workers {
        int pay;
        String department;
    public DepartmentWorkers(int amount,String dpt) {
        this.pay=amount;
        this.department=dpt;
    }

    void Worker1() {
        Worker1Salary(pay,department);
    }
}
}
