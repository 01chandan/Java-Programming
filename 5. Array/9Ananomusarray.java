/* Ananomus Array */

class add
{
    int sum(int arr[])
    {
        int result = 0;
        for(int x:arr)
        {
            result = result + x;
        }
        return result;
    }
}
class main
{
    public static void main(String[] args) {
        System.out.println("Ananomus Array");
        System.out.println("--------------");

        add obj = new add();
        int result = obj.sum(new int[]{10,50,60});  //ananomus array
        System.out.println(result);
    } 
}
