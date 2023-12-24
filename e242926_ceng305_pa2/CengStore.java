import java.util.*;



public class CengStore
{
    static ArrayList<TV> tvList= new ArrayList<TV>();
    static ArrayList<PC> pcList= new ArrayList<PC>();
    static ArrayList<SmartPhone> spList= new ArrayList<SmartPhone>();


    public CengStore()
    {
        
        
    }


    public void addTV(TV t)
    {
        // put your code here
        tvList.add(t);
        
    }
    
    
    
    public void addPC(PC p)
    {
        
        pcList.add(p);
        
    }
    
    
    public void addSmartPhone(SmartPhone s)
    {
        
        spList.add(s);

        
    }
    
    
    public void removeTV(String barcode){
        for(int i=0;i<tvList.size();i++){
            if(tvList.get(i).barcode==barcode){
                tvList.remove(i);
            }
        }
    }
    
    public void removePC(String barcode){
        for(int i=0;i<pcList.size();i++){
            if(pcList.get(i).barcode==barcode){
                pcList.remove(i);
            }
        }
    }
    
    
    public void removeSmartPhone(String barcode){
        for(int i=0;i<spList.size();i++){
            if(spList.get(i).barcode==barcode){
                spList.remove(i);
            }
        }
    }
    
    
    public  static void printAllProducts(){
        for(int i=0;i<tvList.size();i++){
            System.out.println(tvList.get(i).toString());
            System.out.println("********************");
        }
        
        
        for(int i=0;i<pcList.size();i++){
            System.out.println(pcList.get(i).toString());
            System.out.println("********************");
        }
        
        
        for(int i=0;i<spList.size();i++){
            System.out.println(spList.get(i).toString());
            System.out.println("********************");
        }
    }
}




