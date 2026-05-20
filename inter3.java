import java.util.Arrays;
import java.util.List;
public class inter3 {
    public static void main(String[] args){
        List<Integer> obj= Arrays.asList(1,3,5,7,9);
       // System.out.println(obj);
        //for (int i=0;i<5;i++){
         //   System.out.println(obj.get(i));
        //}
        //for (int i:obj)
        //{
        //System.out.println(i);;
        //}
        obj.forEach(i-> System.out.println(i));
        }
    }

//(for each method
//l.foreach (i-> system.out.println(i); this future java8)
//difference d/w function interfce and normal interface