package ex02;

public class UserArrayList implements UserList {

    private int size = 10;
    private int it = -1;
    private User[] users = new User[size];

    @Override
    public void addUser(User user) {
        if (user == null) {
            System.out.println("Error: you try to put null in the list of users.");
            return;
        }
        for (int i = 0; i < retrieveTheNumberOfUsers(); i++){
            if (users[i].getIdentifier() == user.getIdentifier()) {
                System.out.println("Error: you try to add the same user.");
                return;
            }
        }
        if (++it == size) {
            size *= 2;
            User[] tmp = users;
            users = new User[size];
            for (int i = 0; i < tmp.length; i++) {
                users[i] = tmp[i];
            }
        }
        users[it] = user;
        arrayNullSort(users);
    }

    private static void arrayNullSort(User[] array) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                for (int j = i; j < array.length; j++) {
                    if (array[j] != null) {
                        array[i] = array[j];
                        array[j] = null;
                        break;
                    }
                }
            }
        }
    }

    public void showAllUsers() {
        for (User user : users) {
            if (user != null) {
                System.out.println(user);
            }
        }
    }

    public void showArray() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Override
    public User retrieveUserById(Integer id) throws NoUserException {
        if (id > retrieveTheNumberOfUsers()) {
            throw new NoUserException("No user here with such id.");
        }
        for (User user : users) {
            if (user.getIdentifier().equals(id)) {
                return user;
            }
        }
        throw new NoUserException("No user here with such id.");
    }

    @Override
    public User retrieveUserByIndex(int index) throws IndexOutOfBoundsException{
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return users[index];
    }

    @Override
    public int retrieveTheNumberOfUsers() {
        int usersNum = 0;
        for (User user : users) {
            if (user != null) {
                usersNum++;
            }
        }
        return usersNum;
    }
}
