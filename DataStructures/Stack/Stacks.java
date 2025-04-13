package DataStructures.Stack;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {

        // stack =  LIFO data structure. Last-in First-Out
        //          stores objects into a sort of "vertical tower"
        //          push() to add to the top
        //          pop() to remove from the top

        Stack<String> stack = new Stack<String>();

//        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        stack.pop(); // removes FFVII (latest item on the list)
        String myFavGame = stack.pop(); // removes Borderlands and is attributed to myFavGame

        stack.peek(); // gets latest item on the list, DOOM

        System.out.println(stack.search("Skyrim")); // returns "2" (index value + 1)

        // uses of stacks:
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        System.out.println(stack);

    }
}
