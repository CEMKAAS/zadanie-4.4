import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());
        while (!queue.isEmpty()) {
            Person person = queue.poll();
                if (person != null && person.ticket()) {
                    System.out.println(person.getName() + " " + person.getFamily() + " На Атракционе, осталось билетов " + person.getTicket());
                    queue.offer(person);
                }
        }
    }

    public static List<Person> generateClients() {
        List<Person> list = new LinkedList<>();
        list.add(new Person("Олег", "Афанасьев", 2));
        list.add(new Person("Александр", "Филотов", 2));
        list.add(new Person("Танька", "Палкина", 3));
        list.add(new Person("Александр", "Кононов", 4));
        list.add(new Person("Сережа", "Михайлов", 3));
        return list;
    }
}
