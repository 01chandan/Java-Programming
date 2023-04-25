package Bdetails;

public class BankDetails
{
    int BranchCode, AmountDeposit;
    String BranchName, BranchAddress; 
    public void getdata(int BranchCode, int AmountDeposit, String BranchName, String BranchAddress)
    {
        this.BranchCode = BranchCode; 
        this.AmountDeposit = AmountDeposit; 
        this.BranchName = BranchName; 
        this.BranchAddress = BranchAddress; 
    }
    public void showdata()
    {
        System.out.println("Branch Code: " + BranchCode);
        System.out.println("Branch Name: " + BranchName);
        System.out.println("Branch Address: " + BranchAddress);
        System.out.println("Amount Deposit: " + AmountDeposit);
    }
}