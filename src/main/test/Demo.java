import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wangdongyun on 2016/9/26.
 */
public class Demo {
    private static String getDS(int dayOfMonth) {
        if (dayOfMonth < 10)
            return "2016080" + dayOfMonth;
        return "201608" + dayOfMonth;
    }

    private static void print(List<Bean> list) {
        Collections.sort(list);
        for (Bean bean : list) {
            System.out.println(bean);
        }
    }

    public static void main(String[] args) throws IOException {

        List<String> lines = FileUtils.readLines(new File("auditStatistic.txt"));
        List<Bean> list = new ArrayList<Bean>();
        for (String line : lines) {
            String[] array = line.split("\\s+");
            if (array[0].trim().equals("0"))
                continue;
            Bean bean = new Bean();
            bean.qq = Long.parseLong(array[0]);
            bean.name = array[1];
            bean.datestr = getDS(Integer.parseInt(array[2]));
            bean.num = Integer.parseInt(array[3]);
            list.add(bean);
        }
        print(list);
//        Collections.sort(list);
    }

    static class Bean implements Comparable<Bean> {
        private long qq;
        private String name;
        private String datestr;
        private int num;


        @Override
        public String toString() {
            return qq + "    " + name + "    " + datestr + " " + num;
        }

        @Override
        public int compareTo(Bean o) {
            if (this.qq > o.qq) {
                return 1;
            } else if (this.qq == o.qq) {
                if (Long.parseLong(this.datestr) > Long.parseLong(o.datestr))
                    return 1;
                else
                    return -1;
            } else {
                return -1;
            }
//        return 1;
        }
    }
}
