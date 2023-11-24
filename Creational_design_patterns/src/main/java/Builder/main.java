package Builder;

public class main {

    public static void main(String[] args) {
        
        // UserAccountImp ob = new UserAccountImp();

        // UserBuilder user1 = UserAccount.getBuilder();

        // UserAccount account1 = user1.setFirstName("firstName1").setLastName("lastName1").build;
        // UserAccount account = user1.setFirstName("firstName1").setLastName("");



        // System.err.println(user1temp.firstName);
        
        

    }
}


class UserAccount {
    String lastName;
    String firstName;
    String middleName;
    String title;
    String DOB;
    String ccNumber;
    String address;
    String accessCode;
    String emailAddress;
    String altEmailAddress;
    String phoneNumber;
    boolean weekendDelivery;
    static UserBuilder getBuilder(){
        return new UserAccountImp();
    }
}   

 
interface UserBuilder {
    UserAccount build();
    UserAccount setFirstName(String firstName);
    UserAccount setLastName(String lastName);
    UserAccount setMiddleName(String middleName);
    UserAccount setDOB(String DOB);
    UserAccount setCcNumber(String ccNumber);
    UserAccount setAddress(String address);
    UserAccount setAccessCode(String accessCode);
    UserAccount setEmailAddress(String emailAddress);   
    UserAccount setAltEmailAddress(String altEmailAddress);
    UserAccount setPhoneNumber(String phoneNumber);
    UserAccount setWeekendDelivery(boolean weekendDelivery);
}






class UserAccountImp implements UserBuilder {
    UserAccount userAccount;

    public UserAccountImp() {
        this.userAccount = new UserAccount();
    }

    @Override
    public UserAccount build() {
        if (userAccount.accessCode != null && !userAccount.accessCode.isEmpty()) {
            if (userAccount.address == null || userAccount.address.isEmpty()) {
                throw new Exception();
            }
        }
        return userAccount;
    }

    @Override
    public UserAccount setFirstName(String firstName) {
        userAccount.firstName = firstName;
        return this;
    }

    @Override
    public UserAccount setLastName(String lastName) {
        userAccount.lastName = lastName;
        return this;
    }

    @Override
    public UserAccount setMiddleName(String middleName) {
        userAccount.middleName = middleName;
        return this;
    }

    @Override
    public UserAccount setDOB(String DOB) {
        userAccount.DOB = DOB;
        return this;
    }

    @Override
    public UserAccount setCcNumber(String ccNumber) {
        userAccount.ccNumber = ccNumber;
        return this;
    }

    @Override
    public UserAccount setAddress(String address) {
        userAccount.address = address;
        return this;
    }

    @Override
    public UserAccount setAccessCode(String accessCode) {
        userAccount.accessCode = accessCode;
        return this;
    }

    @Override
    public UserAccount setEmailAddress(String emailAddress) {
        userAccount.emailAddress = emailAddress;
        return this;
    }

    @Override
    public UserAccount setAltEmailAddress(String altEmailAddress) {
        userAccount.altEmailAddress = altEmailAddress;
        return this;
    }

    @Override
    public UserAccount setPhoneNumber(String phoneNumber) {
        userAccount.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public UserAccount setWeekendDelivery(boolean weekendDelivery) {
        userAccount.weekendDelivery = weekendDelivery;
        return this;
    }

}
