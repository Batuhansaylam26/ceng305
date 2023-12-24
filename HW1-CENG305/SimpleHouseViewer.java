import javax.swing.JFrame;

/**
A class to view SimpleHouseComponent class.
 */
public class SimpleHouseViewer{
    public static void test(){
        JFrame frame = new JFrame();
        frame.setSize(340,360);
        frame.setTitle("A House");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //no need

        SimpleHouseComponent component = new SimpleHouseComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
