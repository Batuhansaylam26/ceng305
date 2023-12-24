import javax.swing.JOptionPane; 

/**
A class to test PhoneDealComparator class.
 */
public class PhoneDealComparatorDriver
{
    public static void test()
    {
        PhoneDealComparator pdc = new PhoneDealComparator();

        String purchasePrice1Str = JOptionPane.showInputDialog("Purchase price of the first phone:\n");
        int purchasePrice1 = Integer.parseInt(purchasePrice1Str);
        pdc.setFirstPhonePurchasePrice(purchasePrice1);

        String cameraQuality1Str = JOptionPane.showInputDialog("Camera quality of the first phone (mp):\n");
        int cameraQuality1 = Integer.parseInt(cameraQuality1Str);
        pdc.setFirstPhoneCameraQuality(cameraQuality1);

        String purchasePrice2Str = JOptionPane.showInputDialog("Purchase price of the second phone:\n");
        int purchasePrice2 = Integer.parseInt(purchasePrice2Str);
        pdc.setSecondPhonePurchasePrice(purchasePrice2);

        String cameraQuality2Str = JOptionPane.showInputDialog("Camera quality of the second phone (mp):\n");
        int cameraQuality2 = Integer.parseInt(cameraQuality2Str);
        pdc.setSecondPhoneCameraQuality(cameraQuality2);

        int betterDealPhone = pdc.calculateBetterDealPhone();

        if(betterDealPhone == 1){
            JOptionPane.showMessageDialog(null, "First phone is the better deal.");
        } else if(betterDealPhone == 2){
            JOptionPane.showMessageDialog(null, "Second phone is the better deal.");
        }
    }
}
