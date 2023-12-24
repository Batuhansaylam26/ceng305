import javax.swing.JOptionPane; 

/**
A class to test HobbyLevel class.
 */
public class HobbyLevelDriver
{
    public static void test()
    {
        String hobbyStr = JOptionPane.showInputDialog("Enter the initial character of the hobby:\n");

        String expertiseLevelStr = JOptionPane.showInputDialog("Enter the expertise level:\n");

        HobbyLevel h = new HobbyLevel(hobbyStr, expertiseLevelStr);

        String message = h.hobbyAndLevel();
        JOptionPane.showMessageDialog(null, message);
             
    }
}
