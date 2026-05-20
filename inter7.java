import java.time.LocalTime;
import java.time.ZoneId;

public class inter7 {
    public static void main(String[] args){
        LocalTime obj1=LocalTime.now(ZoneId.of("America/El_Salvador"));
        System.out.println(obj1);
     for (String i :ZoneId.getAvailableZoneIds())
     {
         System.out.println(i);
      }
    }
}
