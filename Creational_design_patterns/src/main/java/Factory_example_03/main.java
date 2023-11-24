package Factory_example_03;

import Factory_example_03.Account.Account;


public class main {
    public static void main(String[] args) {
        
        Registration registration = new Registration();

        Account account = registration.register("user_username", "user_password", "PERSONAL");

        account.setupAccount();

    }
}
