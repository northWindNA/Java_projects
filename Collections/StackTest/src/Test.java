import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // 5 <- 3 <- 1     first in - last out, if I want to take the item, I peek 1.
        stack.push(5);
        stack.push(3);
        stack.push(1);

//        System.out.println(stack.pop()); //get the last element
        //pop eject the element
//        System.out.println(stack.peek()); //show the last element

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        //empty shows the state of stack(
    }
}
