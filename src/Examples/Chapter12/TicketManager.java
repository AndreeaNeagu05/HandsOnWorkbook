package Examples.Chapter12;

public final class TicketManager {
    private int tickets;
    private static TicketManager instance;

    private TicketManager() {
    }

    static synchronized TicketManager getInstance() {      // k1
        if (instance == null) instance = new TicketManager(); // k2
        return instance;
    }

    public int getTicketCount() {
        return tickets;
    }

    public void addTickets(int value) {
        tickets += value;
    }  // k3

    public void sellTickets(int value) {
        synchronized (this) {                               // k4
            tickets -= value;
        }
    }

    public static void main(String[] args){
        var manager = TicketManager.getInstance();
        manager.addTickets(100);
        System.out.println("Initial tickets: " + manager.getTicketCount());
        manager.sellTickets(30);
        System.out.println("Tickets after selling 30: " + manager.getTicketCount());
    }
}