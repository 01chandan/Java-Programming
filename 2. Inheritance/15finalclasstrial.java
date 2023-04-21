// when we use final in class then it can't be inherite
//because inherite property is (access) & (Change) property of parent class

final class parent
{

}
class base extends parent
{
    public static void main(String args[])
    {
        base obj1 = new base();
    }
}