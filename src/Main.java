import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        int counter = 0;
        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            Person person1 = queue.poll();
            Person person2 = queue.poll();
            Person person3 = queue.poll();
            Person person4 = queue.poll();
            Person[] people = new Person[]{person, person1, person2, person3, person4};
            counter++;
            System.out.println("--------" + counter + " Круг ---------------");
            for (Person personGeneral : people)
                if (personGeneral != null && personGeneral.ticket()) {
                    System.out.println(personGeneral.getName() + " " + personGeneral.getFamily() + " На Атракционе");
                    queue.offer(personGeneral);
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
