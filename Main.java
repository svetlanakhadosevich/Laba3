import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

        public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        List<Integer> link = new LinkedList<Integer>();
        System.out.println("Test add for ArrayList " + Test.testAdd(array));
        System.out.println("Test add for LinkedList " + Test.testAdd(link));
        System.out.println("Test delete for ArrayList " + Test.testDelete(array));
        System.out.println("Test delete for LinkedList " + Test.testDelete(link));
        System.out.println("Test get for ArrayList " + Test.testGet(array));
        System.out.println("Test get for LinkedList " + Test.testGet(link));

    }
}