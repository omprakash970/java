import java.util.Iterator;
import java.util.Vector;

public class vectors {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
        System.out.println(v);
        System.out.println(v.capacity());
        System.out.println(v.size());
        v.add("Date");
    }

}
