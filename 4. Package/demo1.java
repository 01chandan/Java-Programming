package trail;

public class demo
{
    int CustomerId;
    String CustomerName, CustomerBranch;
    public void getdata(int CustomerId, String CustomerName, String CustomerBranch)
    {
        this.CustomerId = CustomerId;
        this.CustomerName = CustomerName;
        this.CustomerBranch = CustomerBranch;
    }
    public void showdata()
    {
        System.out.println("Customer ID: " + CustomerId);
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Bank Branch: " + CustomerBranch);
    }
}

public class demo1 extends demo
{
    int CustomerId;
    String CustomerName, CustomerBranch;
    public void getdata(int CustomerId, String CustomerName, String CustomerBranch)
    {
        this.CustomerId = CustomerId;
        this.CustomerName = CustomerName;
        this.CustomerBranch = CustomerBranch;
    }
    public void showdata()
    {
        System.out.println("Customer ID: " + CustomerId);
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Bank Branch: " + CustomerBranch);
    }
}
