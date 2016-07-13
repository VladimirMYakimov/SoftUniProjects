package HomeworkActivities.AdvancedJavaCourse.StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class Problem02_BasicStackOperations {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);

        int numElementsToPush = sc.nextInt();
        int numElementsToPop = sc.nextInt();
        int checkForElement = sc.nextInt();
        boolean elementExists = false;
        int minElementinStack = Integer.MAX_VALUE;

        for (int i = 0; i < numElementsToPush; i++) {
            stack.add(sc.nextInt());
        }

        for (int i = 0; i < numElementsToPop; i++) {
            stack.pop();
        }

        if(stack.size() > 0) {
            for (Integer integer : stack) {
                if (stack.contains(checkForElement)) {
                    elementExists = true;
                    System.out.println("true");
                    break;
                } else if (integer < minElementinStack) {
                    minElementinStack = integer;
                }
            }
        } else {
            System.out.println(stack.size());
        }

        if(!elementExists && stack.size() > 0){
            System.out.println(minElementinStack);
        }
    }
}
