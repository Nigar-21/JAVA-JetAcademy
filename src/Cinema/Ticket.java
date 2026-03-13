package Cinema;

public class Ticket {
    private Film film;
    private int count;

    public Ticket(Film film, int count) {
        this.film = film;
        this.count = count;
    }

    public double getTotalPrice() {
        return film.getPrice() * count;
    }

    public void printTicket() {
        System.out.println("Film: " + film.getName());
        System.out.println("Janr: " + film.getGenre());
        System.out.println("Ölkə: " + film.getCountry());
        System.out.println("Dil: " + film.getLanguage());
        System.out.println("Müddət: " + film.getDuration() + " dəq");
        System.out.println("Yaş həddi: " + film.getAgeLimit() + "+");
        System.out.println("Bilet sayı: " + count);
        System.out.println("Qiymət: " + getTotalPrice() + " AZN");
    }

}

