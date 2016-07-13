package HomeworkActivities.AdvancedJavaCourse.StacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class Problem01_ReverseNumbersWithAStack {

    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        while(sc.next() != "\r\n" ){
            intStack.add(sc.nextInt());
        }

        for (Integer integer : intStack) {
            System.out.println(integer);
        }

        while(intStack.size() > 0){
            System.out.print(intStack.pop() + " ");
        }

        /*Stack<Integer> stack = new Stack<>();

        Scanner input = new Scanner(System.in);
        String numberOfElements = input.nextLine();
        String[] numbers = numberOfElements.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            stack.add(Integer.parseInt(numbers[i]));
        }

        while(stack.size() > 0) {
            System.out.print(stack.pop() + " ");
        }*/


    }

}
