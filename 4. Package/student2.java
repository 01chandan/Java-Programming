package pack1;
public class student2
{
    int eid;
    String ename, ecompany;
    public void getdata(int eid, String ename, String ecompany)
    {
        this.eid = eid;
        this.ename = ename;
        this.ecompany = ecompany;
    }
    public void show()
    {
        System.out.println("Emp Name: " + eid);
        System.out.println("Emp Name: " + ename);
        System.out.println("Emp Name: " + ecompany);
    } 
}