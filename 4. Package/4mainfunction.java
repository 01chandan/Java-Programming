import Bdetails.CustomerBank;
import Bdetails.BankDetails;

class main
{
    public static void main(String[] args) 
    {
        CustomerBank obj1 = new CustomerBank();
        obj1.getdata(1002, "Chandan-Kumar", "Sec-45");
        obj1.showdata();
        BankDetails obj2 = new BankDetails();
        obj2.getdata(101, 15600, "IOB-Sec-45", "Sec-45(Noida)");
        obj2.showdata();    
    }
}