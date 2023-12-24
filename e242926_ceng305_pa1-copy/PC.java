
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PC 
{
    Scanner in = new Scanner(System.in);
    public String barcode;
    public String brand;
    public String manufactureYear;
    public int price;
    public int yearOfGuarantee;
    public int monitorSize;
    public int cpuSpeed;
    public int ramCap;
    public int hddCap;
    public int vgaCap;
    public String opSys;
    

    public PC()
    {
        this.barcode="";
        this.brand="";
        this.manufactureYear="";
        this.price=0;
        this.yearOfGuarantee=0;
        this.monitorSize=0;
        this.cpuSpeed=0;
        this.ramCap=0;
        this.hddCap=0;
        this.vgaCap=0;
        this.opSys="";

    }
    


    public PC(String barcode)
    {
        this.barcode=barcode;
        this.brand="";
        this.manufactureYear="";
        this.price=0;
        this.yearOfGuarantee=0;
        this.monitorSize=0;
        this.cpuSpeed=0;
        this.ramCap=0;
        this.hddCap=0;
        this.vgaCap=0;
        this.opSys="";

    }

    
    
    public PC(String barcode,String brand, String manufactureYear, int price)
    {
        this.barcode=barcode;
        this.brand=brand;
        this.manufactureYear=manufactureYear;
        this.price=price;
        this.yearOfGuarantee=0;
        this.monitorSize=0;
        this.cpuSpeed=0;
        this.ramCap=0;
        this.hddCap=0;
        this.vgaCap=0;
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
    
    
    public void setMonitorSize(){
        String MonitorSize = JOptionPane.showInputDialog("Please set the year of monitor size!:\n");
        int monitorSize = Integer.parseInt(MonitorSize);
        this.monitorSize=monitorSize; 
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

    public void setHddCap()
    {
        String HddCap = JOptionPane.showInputDialog("Please set the year of Hdd Capacity!:\n");
        int hddCap = Integer.parseInt(HddCap);
        this.hddCap=hddCap;       
        
    }
    
    public void setVgaCap()
    {
        String VgaCap = JOptionPane.showInputDialog("Please set the year of Vga Capacity!:\n");
        int vgaCap = Integer.parseInt(VgaCap);
        this.vgaCap=vgaCap;         
        
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
    
    
    
    public void getMonitorSize(){
        JOptionPane.showMessageDialog(null,"Monitor Size:"+this.monitorSize);
    } 
    
    
    public void getCpuSpeed(){
        JOptionPane.showMessageDialog(null,"CPU Speed:"+this.cpuSpeed);
    }
    
    
    public void getRamCap()
    {
        JOptionPane.showMessageDialog(null,"RAM capacity:"+this.ramCap);        
        
    }

    public void getHddCap()
    {
        JOptionPane.showMessageDialog(null,"HDD Capacity:"+this.hddCap);        
        
    }
    
    public void getVgaCap()
    {
        JOptionPane.showMessageDialog(null,"VGA Capacity:"+this.vgaCap);        
        
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
            "Mointor Size:" + this.monitorSize+ " inches\n" +
            "CPU Speed:" + this.cpuSpeed + " GHz\n" +
            "RAM Capacity:" + this.ramCap+ " GB\n" +
            "HDD Capacity:" + this.hddCap+ " GB\n" +
            "VGA Capacity:" + this.vgaCap+ " GB\n" +
            "Operating System:" + this.opSys ; 
        
    }
}