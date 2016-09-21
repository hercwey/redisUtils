import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by wangdongyun on 2016/9/21.
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class classT = Boolean.class;
        Class c=List.class;

        System.out.println(c==List.class);
        System.out.println(classT.isPrimitive());

        String test="fdsafa\ndfsafa";
        System.out.println(test.matches(".*\\n.*"));
    }
}
