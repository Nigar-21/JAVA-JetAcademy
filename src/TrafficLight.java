public enum TrafficLight {
    RED("Keçmək qadağandır."),
    YELLOW("Diqqətli ol."),
    GREEN("Keçmək olar.");

    private String meaning;
    TrafficLight(String meaning) {
       this.meaning=meaning;
    }
    public String getMeaning() {
        return meaning;
    }
}
