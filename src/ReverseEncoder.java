public class ReverseEncoder extends Encoder {
    @Override
    public String encode(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

}
