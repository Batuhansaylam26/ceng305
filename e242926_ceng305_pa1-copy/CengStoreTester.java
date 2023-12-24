// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;

/**
 * Write a description of class CengStoreTester here.
 * @author (your name) @version (a version number or a date)
 */
public class CengStoreTester
{

    /**
     * 
     */
    public CengStoreTester()
    {
        CengStore store =  new CengStore();
        TV t =  new TV("111111222222");
        t.setBrand();
        t.setManufactureYear();
        t.setPrice();
        t.setYearOfGuarantee();
        t.setType();
        t.setResolution();
        t.setDisplaySize();
        store.addTV(t);
        PC p =  new PC("111111222222");
        p.setBrand();
        p.setManufactureYear();
        p.setPrice();
        p.setYearOfGuarantee();
        p.setMonitorSize();
        p.setCpuSpeed();
        p.setRamCap();
        p.setHddCap();
        p.setVgaCap();
        p.setOpSys();
        store.addPC(p);
        SmartPhone s =  new SmartPhone();
        s.setBarcode();
        s.setBrand();
        s.setManufactureYear();
        s.setPrice();
        s.setYearOfGuarantee();
        s.setDisplaySize();
        s.setCpuSpeed();
        s.setRamCap();
        s.setIntStorageCap();
        s.setOpSys();
        store.addSmartPhone(s);
        CengStore.printAllProducts();
        t.getDisplaySize();
        p.getBrand();
        s.getBarcode();
    }
}
