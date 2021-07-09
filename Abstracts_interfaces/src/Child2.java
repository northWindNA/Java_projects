public class Child2 extends Parent {
    public Child2() {
        System.out.println("Child2 is here");
    }

    public void child2Says() {
        System.out.println("I'm child2");
    }

    @Override
    public void abstractMethodShowcase() {
        System.out.println("child2 showcase realization");
    }
}
