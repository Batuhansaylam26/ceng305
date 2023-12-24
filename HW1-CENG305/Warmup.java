import javax.swing.JOptionPane;
import java.util.Scanner;

public class Warmup
{
    public static void main(String[] args)
    { 
        String s1 = "My name: Alperen Dalkıran \n"
            + "My ID: e1234567\n"
            + "My Department: Computer Engineering\n";
        JOptionPane.showMessageDialog(null,  s1);

        System.out.println("Enter 1 to choose the first problem  (Which phone is the better deal?)");
        System.out.println("Enter 2 to choose the second problem (What is the hobby level?)");
        System.out.println("Enter 3 to choose the third problem  (Let’s Draw a Simple House)");
        System.out.println("Enter 0 to exit.");

        Scanner choice = new Scanner(System.in);
        int problemNo; // variable for problem selection menu.

        do{
            problemNo = choice.nextInt();
            switch(problemNo){
                case 1:
                    PhoneDealComparatorDriver.test();
                    break;
                case 2:
                    HobbyLevelDriver.test();
                    break;
                case 3:
                    SimpleHouseViewer.test();
                    break;                
            }
        }while(problemNo!=0);
    }
}
