import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter postfix input: ");
        String input = scan.nextLine();
        for(String s : input.split(" ")){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                double b = Double.parseDouble(stack.pop());
                double a = Double.parseDouble(stack.pop());
                switch(s){
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a - b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stack.push(String.valueOf(a / b));
                        break;
                }
            }else{
                stack.push(s);
            }
        }
        System.out.println("Result: " + stack.pop());
    }
}