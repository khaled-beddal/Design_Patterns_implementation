package Singleton_example_02;

public class main {
    public static void main(String[] args) {
        DatabaseConnection.getConnection();

        DatabaseConnection.getConnection();
        DatabaseConnection.getConnection();
        DatabaseConnection.getConnection();
        DatabaseConnection.getConnection();
    }
}
