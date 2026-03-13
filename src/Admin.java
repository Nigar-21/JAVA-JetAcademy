public class Admin extends User{
    public Admin(int size){
        super(size);
    }
    public void checkLogin(String loginName){
        boolean found = false;
        for (String user : usernames) {
            if (user.equals(loginName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Login OK");
        } else {
            System.out.println("Tapılmadı");
        }
    }
    }

