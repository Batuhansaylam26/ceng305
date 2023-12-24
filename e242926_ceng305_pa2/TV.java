

import javax.swing.JOptionPane;
public class TV 
{
    
    public String barcode;
    public String brand;
    public String manufactureYear;
    public int price;
    public int yearOfGuarantee;
    public String type;
    public String resolution;
    public int displaySize;

    

    public TV(){
        this.barcode="";
        this.brand="";
        this.manufactureYear="";
        this.price=0;
        this.yearOfGuarantee=0;
        this.type="";
        this.resolution="";
        this.displaySize=0;
        
        
        
    }

    
    
    public TV(String barcode)
    {
        this.barcode=barcode;
        this.brand="";
        this.manufactureYear="";
        this.price=0;
        this.yearOfGuarantee=0;
        this.type="";
        this.resolution="";
        this.displaySize=0;

    }

    public TV(String barcode,String brand, String manufactureYear, int price)
    {
        this.barcode=barcode;
        this.brand=brand;
        this.manufactureYear=manufactureYear;
        this.price=price;
        this.yearOfGuarantee=0;
        this.type="";
        this.resolution="";
        this.displaySize=0;

    }    
    
    public  void setBarcode(){
        do {
        String barcode = JOptionPane.showInputDialog("Please set the barcode!\n");
        this.barcode=barcode;
        }
        while(this.barcode.length() != 12);
        JOptionPane.showMessageDialog(null,"Barcode is set as:"+this.barcode);
    }
    
    
    public  void setBrand(){
        String brand = JOptionPane.showInputDialog("Please set the brand!\n");
        this.brand=brand;
        JOptionPane.showMessageDialog(null,"Brand is set as:"+this.brand);
    }

    
    
    public void setManufactureYear()
    {
        String manufactureYear = JOptionPane.showInputDialog("Please set the manufacture year!\n");
        this.manufactureYear=manufactureYear;      
        JOptionPane.showMessageDialog(null,"Manufacture year is set as:"+this.manufactureYear);
    }
    
    
    public void setPrice()
    {
        String Price = JOptionPane.showInputDialog("Please set the price!\n");
        int price = Integer.parseInt(Price);
        this.price=price;       
        JOptionPane.showMessageDialog(null,"Price is set as:"+this.price);
    }
    
    
    public void setYearOfGuarantee()
    {
        String YearOfGuarantee = JOptionPane.showInputDialog("Please set the year of guarantee!\n");
        int yearOfGuarantee = Integer.parseInt(YearOfGuarantee);
        this.yearOfGuarantee=yearOfGuarantee;      
        JOptionPane.showMessageDialog(null,"Year of guarantee is set as:"+this.yearOfGuarantee);
    }    
    
    
    public void setType(){
        String type = JOptionPane.showInputDialog("Please set the type!\n");
        this.type=type; 
        JOptionPane.showMessageDialog(null,"Type is set as:"+this.type);
    } 
    
    
    public void setResolution(){
        String resolution = JOptionPane.showInputDialog("Please set the resolution!\n");
        this.resolution=resolution; 
        JOptionPane.showMessageDialog(null,"Resolution is set as:"+this.resolution);
    }
    
    
    public void setDisplaySize()
    {
        String DisplaySize = JOptionPane.showInputDialog("Please set the year of display size!\n");
        int displaySize = Integer.parseInt(DisplaySize);
        this.displaySize=displaySize;        
        JOptionPane.showMessageDialog(null,"Display size is set as:"+this.displaySize);
    }


    
    
    public void getBarcode(){
        JOptionPane.showMessageDialog(null,"Barcode:\n"+this.barcode);
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
    
    
    
    public void getType(){
        JOptionPane.showMessageDialog(null,"Type:"+this.type);
    } 
    
    
    public void getResolution(){
        JOptionPane.showMessageDialog(null,"Resolution:"+this.resolution);
    }
    
    
    public void getDisplaySize()
    {
        JOptionPane.showMessageDialog(null,"Display Size:"+this.displaySize);        
        
    }
    
    
    public String toString(){
                
        return "Barcode:"+this.barcode + "\n" +
            "Brand:"+this.brand + "\n"+
            "Manufacture Year:" + this.manufactureYear+ "\n" +
            "Price:" + this.price+ " TL\n"+
            "Year of Guarantee:" + this.yearOfGuarantee+ " Years\n" +
            "Type:" + this.type+ "\n" +
            "Resolution:" + this.resolution+ "\n" +
            "Display Size:" + this.displaySize+ " inches"; 
        
    }


}
