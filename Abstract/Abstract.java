public class Abstract {
    public static void main(String args[]) {
        myAccount acc = new myAccount();
        acc.withdraw();
        acc.deposit();
        Bank b1 = new myAccount();
        b1.withdraw();
    }
}





    abstract class Bank {
        abstract void withdraw();

    }
    

    class myAccount extends Bank {
    int deposit = 50000;
    int withdraw = 25000;
        void deposit() {

            System.out.println("Deposit my salary."+deposit);
        }

        void withdraw() {
            System.out.println("withdraw the amount:"+withdraw);
        }


        }






