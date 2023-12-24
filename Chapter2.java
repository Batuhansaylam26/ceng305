public class Chapter2{
    static int len() {
        String name="Batuhan SAYLAM";
        return name.length();
    };
    //private: accessible in only class which method declared; public: no restircted & accebile everywhere; 
    //protected: protected access modifier also provides restrictive accessibility but it is more
    // accessible than the private modifier, it is visible and accessible within the class as well as outside the package but only to the subclasses of the protected class.; 
    //default: no restircted & accebile everywhere
    private static String UpperCase(){
        String name="Batuhan SAYLAM";
        return name.toUpperCase();
    };
    private static String ReplaceString(){
        String name="Batuhan SAYLAM";
        return name.replace("Batuhan","Yafes");
    };
    public static void main(String[] args){
        System.out.println(len());
        System.out.println(UpperCase());
        System.out.println(ReplaceString());

    };
}
