public class UserAuth extends Auth {
    @Override
    public boolean authenticate(String username, String password) {
        if (username.equals("user") && password.equals("0000")) {
            return true;
        }
        return false;
    }
}
