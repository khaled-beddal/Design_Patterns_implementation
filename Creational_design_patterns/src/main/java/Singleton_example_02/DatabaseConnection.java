package Singleton_example_02;

public class DatabaseConnection {
    private static DatabaseConnection connection ; 

    private DatabaseConnection(){
        System.out.println("Connecting to the database ...");

        try {
            Thread.sleep(5000);

            System.out.println("Connected !!");
        }
        catch (InterruptedException e) {

        }
    }

    public static DatabaseConnection getConnection(){
        if (connection == null) {
            connection = new DatabaseConnection();
            return connection ; 
        }

        System.out.println("Connection is opeed before!");
        return connection ;
    }
}
