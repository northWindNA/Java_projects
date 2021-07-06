package ex02;

public class Program {
    public static void main(String[] args) {
        UserArrayList users = new UserArrayList();
        User user1 = new User("Gorka", -1000);
        User user2 = new User("Morka", 0);
        User user3 = new User("Kalgar", 1000);
        User user4 = new User("Malkador", 2000);
        User user5 = new User("Sebastian", 3000);

        users.addUser(null);
        users.addUser(user1);
        users.addUser(user1);
        users.addUser(user2);
        users.addUser(null);
        users.addUser(user3);
        users.addUser(user4);
        users.addUser(null);
        users.addUser(user5);
        System.out.println("=================================Users=================================");
        users.showAllUsers();
        System.out.println("=================================Array=================================");
        users.showArray();
        System.out.println("=============================Retrieve tests=============================");
        System.out.println("Number of users = " + users.retrieveTheNumberOfUsers());
        try {
            System.out.println("Retrieved by id: " + users.retrieveUserById(3));
            System.out.println("Retrieved by id: " + users.retrieveUserById(4));
            System.out.println("Retrieved by index: " + users.retrieveUserByIndex(3));
            System.out.println("Retrieved by index: " + users.retrieveUserByIndex(4));
            System.out.println("Retrieved by id: " + users.retrieveUserById(6));
            System.out.println("Retrieved by index: " + users.retrieveUserByIndex(11));
        } catch (IndexOutOfBoundsException | NoUserException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Number of users = " + users.retrieveTheNumberOfUsers());
    }
}
