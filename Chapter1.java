public class Chapter1{
    // Location of main method is not important in a class
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("hello");
        System.out.println("world");
        System.out.println(3+4+4);
        //System.ou.println("world"); //compile-time error (Syntax error)
        //System.out.println(1/0); //run-time error (logic error)
        // System.out.println(Hello World!); //compile-time error (Syntax error)
        System.out.print("Hello ");
        System.out.println("World!");
       //Algorithm for solving an investment problem
        balance1();
        System.out.println(balance2());
        System.out.println(balance3());
        System.out.println(balance4());
        System.out.println(balance5());
        System.out.println(len());

    };
    static void balance1() {
        float interest,InterestRate,balance;
        InterestRate=0.05f;
        balance=10000.00f;
        for (int i=0; i<4; i++){
        interest=balance*InterestRate;
        balance=balance+interest;
        }
        System.out.println(balance);

    };
    static Float balance2() {
        Float interest,InterestRate,balance;
        InterestRate=0.05f;
        balance=10000.00f;
        for (int i=0; i<4; i++){
        interest=balance*InterestRate;
        balance=balance+interest;
        }
        return balance;
    };
    static Double balance3() {
        Double interest,InterestRate,balance;
        InterestRate=0.05d;
        balance=10000.00d;
        for (int i=0; i<4; i++) {
        interest=balance*InterestRate;
        balance=balance+interest;
        }
        balance=(double) Math.round(balance*100)/100;

        return balance;
    };
    static Double balance4() {
        Double interest,InterestRate,balance;
        InterestRate=0.05d;
        balance=10000.00d;
        for (int i=1; i<5; i=i+1) {
        interest=balance*InterestRate;
        balance=balance+interest;
        }
        balance=(double) Math.round(balance*100)/100;

        return balance;
    };
    static Double balance5() {
        Double interest,InterestRate,balance;
        InterestRate=0.05d;
        balance=10000.00d;
        for (int i=1; i<5; i++) {
        interest=balance*InterestRate;
        balance=balance+interest;
        }
        balance=(double) Math.round(balance*100)/100;

        return balance;
    };
    
    static int len() {
        String name="Batuhan SAYLAM";
        return name.length();
    };

}