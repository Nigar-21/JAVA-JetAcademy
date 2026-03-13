package Cinema;

public abstract class Film implements FilmInfo{
    private String name;
    private double price;
    private int availableTickets;
    private String country;
    private String language;
    private int duration;
    private int ageLimit;


    public Film(String name, double price, int availableTickets, String country,
                String language, int duration, int ageLimit) {
        this.name = name;
        this.price = price;
        this.availableTickets = availableTickets;
        this.country = country;
        this.language = language;
        this.duration = duration;
        this.ageLimit = ageLimit;

    }


        public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public int getAgeLimit() {
        return ageLimit;
    }


    public boolean sellTickets(int count) {
        if (count <= availableTickets) {
            availableTickets -= count;
            return true;
        }
        return false;
    }

    public abstract String getGenre();
}

