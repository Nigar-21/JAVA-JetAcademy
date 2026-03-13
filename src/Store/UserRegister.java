package Store;

public class UserRegister {


    public boolean register(Customer customer) {

        if (!isEmailValid(customer.getEmail())) {
            System.out.println("Email düzgün deyil!");
            return false;
        }

        if (!isPasswordValid(customer.getPassword())) {
            System.out.println("Şifrə ən az 6 simvol olmalıdır və boş ola bilməz!");
            return false;
        }

        System.out.println("Qeydiyyat uğurla tamamlandı!");
        System.out.println("Xoş gəldin, " + customer.getName());
        return true;
    }

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        return password != null && password.length() >= 6;
    }
}

