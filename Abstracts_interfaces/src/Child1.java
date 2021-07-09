public class Child1 extends Parent{
    public Child1() {
        System.out.println("Child1 is here");
    }

    public void child1Says() {
        System.out.println("I'm child1");
    }

    @Override
    public void abstractMethodShowcase() {
        System.out.println("child1 showcase realization");
    }
}
