import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Queue<Person> queue1 = new LinkedList<>();
        queue1.addAll(generateClients());
        while (!queue1.isEmpty()) {
            Person person = queue1.poll();
            Person person1 = queue1.poll();
            Person person2 = queue1.poll();
            Person person3 = queue1.poll();
            Person person4 = queue1.poll();
            Person[] people = new Person[]{person, person1, person2, person3, person4};
            System.out.println();
            for (Person personGeneral : people)
                if (personGeneral != null && personGeneral.ticket()) {
                    System.out.println(personGeneral.getName() + " " + personGeneral.getFamily() + " На Атракционе");
                    queue1.offer(personGeneral);

                }
        }
    }


    public static List<Person> generateClients() {
        List<Person> queue = new LinkedList<>();
        queue.add(new Person("Семён", "Афанасьев", 2));
        queue.add(new Person("Александр", "Филотов", 2));
        queue.add(new Person("Танька", "Палкина", 3));
        queue.add(new Person("Александр", "Кононов", 4));
        queue.add(new Person("Сережа", "Михайлов", 3));
        return queue;
    }
}
