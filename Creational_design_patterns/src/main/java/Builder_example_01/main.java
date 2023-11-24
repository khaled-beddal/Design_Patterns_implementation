package Builder_example_01;



public class main {
    public static void main(String[] args) {
        
    
       

        UserBuilder user1 = UserAccount.getBuilder();
        UserAccount account = user1.setFirstName("firstname user1").setAddress("Oran").build();

        System.err.println(account.firstName);
        System.err.println(account.address);
        
    
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
    UserBuilder setFirstName(String firstName);
    UserBuilder setLastName(String lastName);
    UserBuilder setMiddleName(String middleName);
    UserBuilder setDOB(String DOB);
    UserBuilder setCcNumber(String ccNumber);
    UserBuilder setAddress(String address);
    UserBuilder setAccessCode(String accessCode);
    UserBuilder setEmailAddress(String emailAddress);   
    UserBuilder setAltEmailAddress(String altEmailAddress);
    UserBuilder setPhoneNumber(String phoneNumber);
    UserBuilder setWeekendDelivery(boolean weekendDelivery);

    UserAccount build();
}

 



class UserAccountImp implements UserBuilder {
    UserAccount userAccount;

    public UserAccountImp() {
        userAccount = new UserAccount();
    }

    @Override
    public UserBuilder setFirstName(String firstName) {
        userAccount.firstName = firstName;
        return this;
    }

    @Override
    public UserBuilder setLastName(String lastName) {
        userAccount.lastName = lastName;
        return this;
    }

    @Override
    public UserBuilder setMiddleName(String middleName) {
        userAccount.middleName = middleName;
        return this;
    }

    @Override
    public UserBuilder setDOB(String DOB) {
        userAccount.DOB = DOB;
        return this;
    }

    @Override
    public UserBuilder setCcNumber(String ccNumber) {
        userAccount.ccNumber = ccNumber;
        return this;
    }

    @Override
    public UserBuilder setAddress(String address) {
        userAccount.address = address;
        return this;
    }

    @Override
    public UserBuilder setAccessCode(String accessCode) {
        userAccount.accessCode = accessCode;
        return this;
    }

    @Override
    public UserBuilder setEmailAddress(String emailAddress) {
        userAccount.emailAddress = emailAddress;
        return this;
    }

    @Override
    public UserBuilder setAltEmailAddress(String altEmailAddress) {
        userAccount.altEmailAddress = altEmailAddress;
        return this;
    }

    @Override
    public UserBuilder setPhoneNumber(String phoneNumber) {
        userAccount.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public UserBuilder setWeekendDelivery(boolean weekendDelivery) {
        userAccount.weekendDelivery = weekendDelivery;
        return this;
    }



    @Override
    public UserAccount build(){
        return userAccount;
    }

}
