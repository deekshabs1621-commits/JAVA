interface i
{
    default void java()
    {
        System.out.println("demo");
    }
    static void python()
    {
        System.out.println("python");
    }
}
class j implements i
{

}
public interface interjava8 {
    public static void main(String[] args){
           j n=new j();
           n.java();
           i.python();
        }
    }
