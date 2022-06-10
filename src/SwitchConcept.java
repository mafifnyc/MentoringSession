import java.util.Scanner;

public class SwitchConcept {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        char operators;
        System.out.println("Enter num1: ");
        num1 = scan.nextInt();
        System.out.println("Enter num2: ");
        num2 = scan.nextInt();
        System.out.println("Enter operator: ");
        operators = scan.next().charAt(0);


        switch (operators) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
        }

    }
}
