import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Queue <Person> queue1 = new LinkedList<>();
        queue1.addAll(generateClients());
        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }
        }


    public static  List<Person> generateClients() {
        List <Person> queue = new LinkedList<>();
        queue.add(new Person("Vasek", "pupkin", 30));
        queue.add(new Person("Vasek1", "pupkin1", 31));
        queue.add(new Person("Vasek2", "pupkin2", 32));
        queue.add(new Person("Vasek3", "pupkin3", 33));
        queue.add(new Person("Vasek4", "pupkin4", 34));
        return queue;
    }
}
