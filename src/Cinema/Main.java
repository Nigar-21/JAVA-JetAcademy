package Cinema;

public class Main {
    public static void main(String[] args) {

        Film f1 = new ActionFilm(
                "Fast & Furious",
                10,
                50,
                "USA",
                "English",
                130,
                16
        );

        Film f2 = new ComedyFilm(
                "Home Alone",
                8,
                40,
                "USA",
                "English",
                105,
                7
        );

        Film f3 = new HorrorFilm(
                "The Nun",
                9,
                30,
                "UK",
                "English",
                110,
                18
        );

        Film[] films = {f1, f2, f3};
        Cinema cinema = new Cinema(films);

        cinema.showFilms();

        Customer c1 = new Customer("Nigar", 5);
        c1.buyTicket(f1, 2);
        c1.buyTicket(f3, 1);

        c1.showTickets();
    }
}


