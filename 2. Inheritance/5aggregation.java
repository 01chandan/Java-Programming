//Another Example of Aggregation

class empdata
{
    int customerid, empcontact;
    String empname, empaddress;
    
    void getdata(int customerid, int empcontact, String empname, String empaddress)
    {
        this.customerid = customerid;
        this.empname = empname;
        this.empcontact = empcontact;
        this.empaddress = empaddress;
    }
}

class bank 
{
    String bankname, bankaddress;
    int amountdeposit;
    empdata empdata;    //aggregation HAS-A relation (Inhertance)

    void getdata(String bankname, String bankaddress, int amountdeposit, empdata empdata)
    {
        this.bankname = bankname;
        this.bankaddress = bankaddress;
        this.amountdeposit = amountdeposit;
        this.empdata = empdata;
    }

    void show()
    {
        System.out.println("Bank name: " + bankname);
        System.out.println("Bank Address " + bankaddress);
        System.out.println("Customer ID: " + empdata.customerid);
        System.out.println("Customer Name: " + empdata.empname);
        System.out.println("Customer Contact: " + empdata.empcontact);
        System.out.println("Customer Address: " + empdata.empaddress);
        System.out.println("Amount Deposit: " + amountdeposit);
    }
    public static void main(String args[])
    {
	  System.out.println("\nHAS-A Relationship (Aggregation) | Java");
	  System.out.println("-----------------------------------------");
    
      empdata obj1 = new empdata();  
      obj1.getdata(101, 93190, "Chandan", "Noida"); 
      bank obj2 = new bank();
      obj2.getdata("Kotak Bank","Delhi",1500,obj1 );
      obj2.show();
    }
}