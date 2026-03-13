package Cinema;

public class ActionFilm extends Film {

    public ActionFilm(
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
        return "Action";
    }
}


