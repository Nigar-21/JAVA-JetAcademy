package Cinema;

public class Customer {
    private String name;
    private Ticket[] tickets;
    private int ticketIndex = 0;

    public Customer(String name, int maxTickets) {
        this.name = name;
        tickets = new Ticket[maxTickets];
    }

    public void buyTicket(Film film, int count) {
        if (film.sellTickets(count)) {
            tickets[ticketIndex++] = new Ticket(film, count);
            System.out.println(name + " " + count + " bilet aldı.");
        } else {
            System.out.println("Kifayət qədər bilet yoxdur!");
        }
    }

    public void showTickets() {
        System.out.println("\n" + name + " üçün alınan biletlər:");
        for (int i = 0; i < ticketIndex; i++) {
            tickets[i].printTicket();
            System.out.println("-------------------");
        }
    }
}

