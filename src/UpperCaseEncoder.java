public class UpperCaseEncoder extends Encoder {
    @Override
    public String encode(String text) {
        return text.toUpperCase();
    }
}
