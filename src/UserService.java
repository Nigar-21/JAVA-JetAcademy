public class UserService {
    private UserLogger logger;

    public UserService(UserLogger logger){
        this.logger=logger;
    }

    public void createUser(User1 user) {
        logger.log("User created: " + user.getName());
    }

    public void deleteUser(User1 user) {
        logger.log("User deleted: " + user.getName());
    }
}
