package ex01;

public class UserIdsGenerator {
    private Integer prevId;

    public static UserIdsGenerator instance;

    private UserIdsGenerator() {prevId = 0;}
    public static UserIdsGenerator getInstance() {
        if (instance == null){
            instance = new UserIdsGenerator();
        }
        return instance;
    }

    public Integer generateId() {
        return prevId++;
    }
}
