package ge.edu.btu;

public class Passenger {
    private String name;
    private boolean ticket;

    public Passenger(String personname, boolean personticket){
        name = personname;
        ticket = personticket;
    }

    public String getName(){
        return name;
    }

    public boolean haveTicket(){
        return ticket;
    }
}
