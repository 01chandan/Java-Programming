//Single Inheritance (IS-A Relationship)

class msg1
{
  int eid;
  String ename, ecompany;

  void getdata(int eid, String ename, String ecompany)
  {
    this.eid = eid;
    this.ename = ename;
    this.ecompany = ecompany;
  }
  void setdata()
  {
    System.out.println("Emp ID: " + eid);
    System.out.println("Emp Name: " + ename);
    System.out.println("Emp Company: " + ecompany);
  }
}

class inheri extends msg1
{
  int eid;
  String ename, ecompany;

  void getdata(int eid, String ename, String ecompany)
  {
    this.eid = eid;
    this.ename = ename;
    this.ecompany = ecompany;
  }

  void setdata()
  {
    System.out.println("Emp ID: " + eid);
    System.out.println("Emp Name: " + ename);
    System.out.println("Emp Company: " + ecompany);
  }

    public static void main(String args[])
    {
	    System.out.println("\nSingle Inheritance | Java");
		  System.out.println("---------------------------");
      inheri obj2 = new inheri();
      obj2.getdata(101, "Chandan", "Google");
      obj2.setdata();
      obj2.getdata(102, "Chandan", "TCS");
      obj2.setdata();
    }
}