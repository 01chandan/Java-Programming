//Aggregation means HAS-A Relationship in Inheritance
//In aggregation we create a object reference if in child class to inherite the property & behavior or parent class

class Address
{
    String ecity, estate, eaddress;
    void getdata(String ecity, String estate, String eaddress)
    {
        this.ecity = ecity;
        this.estate = estate;
        this.eaddress = eaddress;
    }
}

class empdata 
{
    int eid;
    String ename;
    Address adr;    //aggregation (object reference id declared)
    void getdata(int eid, String ename, Address adr)    
    {
        this.eid = eid;
        this.ename = ename;
        this.adr = adr;
    }
    void show()
    {
        System.out.println("EMP ID: " + eid);
        System.out.println("Emp Name: " + ename);
        System.out.println("City: " + adr.ecity);
        System.out.println("State: " + adr.estate);
        System.out.println("Address: " + adr.eaddress);
    }
    public static void main(String args[])
    {
	  System.out.println("\nHAS-A Relationship (Aggregation) | Java");
	  System.out.println("-----------------------------------------");
      Address obj1 = new Address();
      empdata obj2 = new empdata();
      obj1.getdata("Noida", "Delhi-NCR", "Sadarpur");
      obj2.getdata(101, "Chandan", obj1);
      obj2.show();
      
    }
}