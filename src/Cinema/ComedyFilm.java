package Cinema;

public class ComedyFilm extends Film {
    public ComedyFilm(
            String name,
            double price,
            int tickets,
            String country,
            String language,
            int duration,
            int ageLimit
    ) {
        super(name, price, tickets, country, language, duration, ageLimit);
    }

    @Override
    public String getGenre() {
        return "Comedy";
    }
}

