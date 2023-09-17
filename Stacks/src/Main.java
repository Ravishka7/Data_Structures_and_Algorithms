import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

//Stack: LIFO (Last In First Out); Here last in is E, and therefore it will be removed first.

        //stack.pop();//removes the top most object(in this case it is E)
        //String myFavLetter = stack.pop();

        System.out.println(stack.peek());//view the top most element
        System.out.println(stack.search("A"));//search for an element in the stack
        System.out.println("Stack: " + stack);
        //System.out.println(myFavLetter);


    }
}