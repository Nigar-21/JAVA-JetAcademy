package Cinema;

public class Cinema {
    private Film[] films;

    public Cinema(Film[] films) {
        this.films = films;
    }

    public void showFilms() {
        for (int i = 0; i < films.length; i++) {
            System.out.println(
                    (i + 1) + ". " +
                            films[i].getName() +
                            " | " + films[i].getGenre() +
                            " | " + films[i].getCountry() +
                            " | " + films[i].getLanguage() +
                            " | " + films[i].getDuration() + " dəq" +
                            " | Yaş: " + films[i].getAgeLimit() + "+" +
                            " | Bilet: " + films[i].getAvailableTickets()
            );
        }
    }


    public Film getFilm(int index) {
        return films[index];
    }
}

