package ex01;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("Gorka", -1000);
        User user2 = new User("Morka", 0);
        User user3 = new User("Kalgar", 1000);
        User user4 = new User("Malkador", 2000);
        User user5 = new User("Sebastian", 3000);

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5);
    }
}
