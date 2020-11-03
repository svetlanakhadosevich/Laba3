import java.util.Collection;
import java.util.List;

public class Test {

    public static int iteration_count=50000;

    public static long testAdd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration_count; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;

    }

    public static long testDelete(Collection<Integer> collection) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iteration_count; i++) {
            collection.remove(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;

    }

    public static long testGet(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <iteration_count; i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;

    }
}