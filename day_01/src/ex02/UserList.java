package ex02;

public interface UserList {
    void addUser(User user);
    User retrieveUserById(Integer id) throws NoUserException;
    User retrieveUserByIndex(int index);
    int retrieveTheNumberOfUsers();
}
