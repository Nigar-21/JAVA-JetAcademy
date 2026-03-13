import java.util.Scanner;

public class User {
    String[] usernames;
    public User(int size){
            usernames= new String[size];
    }
    public void inputUsernames(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<usernames.length;i++){
            System.out.println((i+1) +". Username daxil edin:");
            usernames[i]=sc.nextLine();
        }
    }


}
