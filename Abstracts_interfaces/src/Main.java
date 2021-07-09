public class Main {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        child1.child1Says();
        child2.child2Says();
//        Parent parent = new Parent(); - abstract class can't create objects
        child1.abstractMethodShowcase();
        child2.abstractMethodShowcase();
    }
}
