public class LowerCaseEncoder extends Encoder {
    @Override
    public String encode(String text) {
        return text.toLowerCase();
    }
}
