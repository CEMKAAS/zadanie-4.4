public class Person {

    private String name;
    private String family;
    private int ticket;

    public Person(String name, String family, int ticket){
        this.name = name;
        this.family = family;
        this.ticket = ticket;
    }

    boolean ticket (){
        ticket--;
        return true;
    }


}
