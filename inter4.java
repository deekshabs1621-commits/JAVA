import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class demo implements Consumer<Integer>
{
    @Override
    public void accept(Integer integer)
    {
        System.out.println(integer);
    }
}

public class inter4 {
    public static void main(String[] args){
    List<Integer> data= Arrays.asList(1,3,5,7,9);
    Consumer<Integer> obj=new demo();
    //Consumer<Integer> obj=(i-> System.out.println(i));
    //l.forEach(i-> System.out.println(i)); when add this one delete the 18th line
    data.forEach(obj);
}
}

