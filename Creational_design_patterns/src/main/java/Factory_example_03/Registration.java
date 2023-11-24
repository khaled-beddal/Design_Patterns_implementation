package Factory_example_03;

import Factory_example_03.Account.Account;


public class Registration {
    
    public Account register (String username, String password, String type){

        // validation
        // sending emails
        // checking the database

        return new AccountFactory().createAccount(username, password, type);
    }

}
