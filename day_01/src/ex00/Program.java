package ex00;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
        User user1 = new User(0, "Gorka", -1000);
        User user2 = new User(1, "Morka", 0);
        User user3 = new User(2, "Kalgar", 1000);
        User user4 = new User(3, "Malkador", 2000);
        User user5 = new User(4, "Sebastian", 3000);
        System.out.println("\n====================One====================\n");
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user3.toString());
        System.out.println(user4.toString());
        System.out.println(user5.toString());
        user1.setBalance(500);
        user2.setBalance(500);
        System.out.println(user1.toString());
        System.out.println(user2.toString());

        System.out.println("\n====================Two====================\n");
        System.out.println(user3.toString());
        System.out.println(user5.toString());
        Transaction transaction1 = new Transaction(UUID.randomUUID(), user3, user3, TransferCategory.DEBITS, 1000);
        Transaction transaction2 = new Transaction(UUID.randomUUID(), user3, user5, TransferCategory.DEBITS, 1000);
        System.out.println(transaction2.toString());
        System.out.println(user3.toString());
        System.out.println(user5.toString());

        System.out.println("\n====================Three====================\n");
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        user1.setBalance(-1000);
        System.out.println(user1.toString());
        Transaction transaction3 = new Transaction(UUID.randomUUID(), user2, user1, TransferCategory.DEBITS, 1000);
        System.out.println(transaction3.toString());
        Transaction transaction4 = new Transaction(UUID.randomUUID(), user1, user2, TransferCategory.DEBITS, 1000);
        System.out.println(transaction4.toString());
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}
