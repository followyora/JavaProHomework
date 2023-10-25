import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("First file");
        stringList.add("Second file");
        stringList.add("Third file");

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


        iterator = stringList.iterator();
        for (; iterator.hasNext(); ) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}

