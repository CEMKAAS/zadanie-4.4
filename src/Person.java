public class Person {

    private String name;
    private String family;
    private int ticket;

    public Person(String name, String family, int ticket){
        this.name = name;
        this.family = family;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }
    public String getFamily(){
        return family;
    }

    boolean ticket (){
        if (ticket<=0){
            return false;
        }
        ticket--;
        return true;
    }


}
