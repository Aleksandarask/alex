import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pot {
    List<Egg> eggs;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd HH:mm");
    LocalDateTime datetime = LocalDateTime.now();
    LocalDateTime finaldate;

    public Pot(){
        eggs = new ArrayList<>();
    }

    public void addEgg(){
        eggs.add(new Egg());
    }

    public void boil(){
        datetime = LocalDateTime.now();
        finaldate = datetime.plusMinutes(10);
    }

    public void getOut(){
        System.out.println("Eggs are now out, but not ready");
    }
}
