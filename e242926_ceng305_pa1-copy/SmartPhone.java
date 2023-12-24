
import java.util.Scanner;
import javax.swing.JOptionPane;
public class SmartPhone 
{
    Scanner in = new Scanner(System.in);
    public String barcode;
    public String brand;
    public String manufactureYear;
    public int price;
    public int yearOfGuarantee;
    public int displaySize;
    public int cpuSpeed;
    public int ramCap;
    public int intStorageCap;
    public String opSys;
    

    public SmartPhone()
    {
        this.barcode="";
        this.brand="";
        this.manufactureYear="";
        this.price=0;
        this.yearOfGuarantee=0;
        this.displaySize=0;
        this.cpuSpeed=0;
        this.ramCap=0;
        this.intStorageCap=0;
        this.opSys="";

    }    


    public SmartPhone(String barcode)
    {
        this.barcode=barcode;
        this.brand="";
        this.manufactureYear="";
        this.price=0;
        this.yearOfGuarantee=0;
        this.displaySize=0;
        this.cpuSpeed=0;
        this.ramCap=0;
        this.intStorageCap=0;
        this.opSys="";

    }

    
    
    
    
    public SmartPhone(String barcode,String brand, String manufactureYear, int price)
    {
        this.barcode=barcode;
        this.brand=brand;
        this.manufactureYear=manufactureYear;
        this.price=price;
        this.yearOfGuarantee=0;
        this.displaySize=0;
        this.cpuSpeed=0;
        this.ramCap=0;
        this.intStorageCap=0;
        this.opSys="";

    }    
    
    
    
    public  void setBarcode(){
        String barcode = JOptionPane.showInputDialog("Please set the barcode!:\n");
        this.barcode=barcode;
    }
    
    
    public  void setBrand(){
        String brand = JOptionPane.showInputDialog("Please set the brand!:\n");
        this.brand=brand;
    }

    
    
    public void setManufactureYear()
    {
        String manufactureYear = JOptionPane.showInputDialog("Please set the manufacture year!:\n");
        this.manufactureYear=manufactureYear;      
        
    }
    
    
    public void setPrice()
    {
        String Price = JOptionPane.showInputDialog("Please set the price!:\n");
        int price = Integer.parseInt(Price);
        this.price=price;       
        
    }
    
    
    public void setYearOfGuarantee()
    {
        String YearOfGuarantee = JOptionPane.showInputDialog("Please set the year of guarantee!:\n");
        int yearOfGuarantee = Integer.parseInt(YearOfGuarantee);
        this.yearOfGuarantee=yearOfGuarantee;      
        
    }    
    
    
    public void setDisplaySize()
    {
        String DisplaySize = JOptionPane.showInputDialog("Please set the year of display size!:\n");
        int displaySize = Integer.parseInt(DisplaySize);
        this.displaySize=displaySize;        
        
    } 
    
    
    public void setCpuSpeed(){
        String CpuSpeed = JOptionPane.showInputDialog("Please set the year of Cpu Speed!:\n");
        int cpuSpeed = Integer.parseInt(CpuSpeed);
        this.cpuSpeed=cpuSpeed; 
    }
    
    
    public void setRamCap()
    {
        String RamCap = JOptionPane.showInputDialog("Please set the year of Ram capacity!:\n");
        int ramCap = Integer.parseInt(RamCap);
        this.ramCap=ramCap;         
        
    }

    public void setIntStorageCap()
    {
        String IntStorageCap = JOptionPane.showInputDialog("Please set the year of internal storage capacity!:\n");
        int intStorageCap = Integer.parseInt(IntStorageCap);
        this.intStorageCap=intStorageCap;         
        
    }
    

    public void setOpSys()
    {
        String opSys = JOptionPane.showInputDialog("Please set the operating system!:\n");
        this.opSys=opSys;         
    }  
    
    public void getBarcode(){
        JOptionPane.showMessageDialog(null,"Barcode Number:"+this.barcode);
    }
    
    
    public void getBrand(){
        JOptionPane.showMessageDialog(null,"Brand:"+this.brand);
    }

    
    public void getManufactureYear()
    {
        JOptionPane.showMessageDialog(null,"Manufacture Year:"+this.manufactureYear);        
        
    }
    
    
    public void getPrice()
    {
        JOptionPane.showMessageDialog(null,"Price:"+this.price);        
        
    }
    
    
    public void getYearOfGuarantee()
    {
        JOptionPane.showMessageDialog(null,"Year of Guarantee:"+this.yearOfGuarantee);        
        
    }    
    
    
    
    public void getDisplaySize(){
        JOptionPane.showMessageDialog(null,"Display Size:"+this.displaySize);
    } 
    
    
    public void getCpuSpeed(){
        JOptionPane.showMessageDialog(null,"CPU Speed:"+this.cpuSpeed);
    }
    
    
    public void getRamCap()
    {
        JOptionPane.showMessageDialog(null,"RAM capacity:"+this.ramCap);        
        
    }

    public void getIntStorageCap()
    {
        JOptionPane.showMessageDialog(null,"Internal Storage Capacity:"+this.intStorageCap);        
        
    }
    


    public void getOpSys()
    {
        JOptionPane.showMessageDialog(null,"Operating System:"+this.opSys);        
        
    }    
    
    
    public String toString(){
                
        return "Barcode:"+this.barcode + "\n" +
            "Brand:"+this.brand + "\n"+
            "Manufacture Year:" + this.manufactureYear+ "\n" +
            "Price:" + this.price+ " TL\n"+
            "Year of Guarantee:" + this.yearOfGuarantee+ " Years\n" +
            "Display Size:" + this.displaySize+ " inches\n" +
            "CPU Speed:" + this.cpuSpeed + " MHz\n" +
            "RAM Capacity:" + this.ramCap+ " GB\n" +
            "Internal Storage Capacity:" + this.intStorageCap+ " GB\n" +
            "Operating System:" + this.opSys ; 
        
    }
}