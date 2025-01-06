package Stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> names = new Stack<>();

//        names.push("AOOP");
//        names.push("Collections");
//        names.push("Project");
//        names.push("JavaFX");

        names.add("AOOP");
        names.add("Collections");
        names.add("Project");
        names.add("JavaFX");

        System.out.println("Stack names = " + names);

        System.out.println("Top element = " + names.peek());
        //shows top element
        // does not remove element

        names.pop();
        System.out.println("Stack names = " + names);

        String poppedElement = names.pop();
        // removes the top element(most recently added)

        System.out.println("Stack names = " + names);
        System.out.println("Popped element = " + poppedElement);

    }
}
