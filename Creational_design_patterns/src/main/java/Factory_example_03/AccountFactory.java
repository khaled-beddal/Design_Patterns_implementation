package Factory_example_03;

import Factory_example_03.Account.Account;
import Factory_example_03.Account.BusinessAccount;
import Factory_example_03.Account.FamilyAccount;
import Factory_example_03.Account.PersonalAccount;

public class AccountFactory {


    public Account createAccount(String username, String password, String type){

        if (type.equals("PERSONAL")) {
            return new PersonalAccount(username, password);
        }

        if (type.equals("FAMILY")) {
            return new FamilyAccount(username, password);
        }

 
            return new BusinessAccount(username, password);  
    }

}
