import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by wangdongyun on 2016/9/21.
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class classT = Boolean.class;
        Class c = List.class;

        System.out.println(c == List.class);
        System.out.println(classT.isPrimitive());

        String test = "fdsafa\ndfsafa";
        System.out.println(test.matches(".*\\n.*"));

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 7);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date start = calendar.getTime();
        System.out.print(start.toLocaleString());
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        Date end = calendar.getTime();
        System.out.println(end.toLocaleString());

        Calendar calendar1=Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH,-1);
    }
}
