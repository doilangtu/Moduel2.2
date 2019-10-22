import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class tets {
    public static void main(String[] args) {
        Collection <String> collection = new ArrayList<>();
        collection.add("ny");
        collection.add("ny1");
        collection.add("ny2");
        collection.add("ny3");
        Iterator<String>iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toUpperCase()+ " ");
        }
    }
}
