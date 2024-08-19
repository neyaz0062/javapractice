package calc;

import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        System.out.println("Welcome to Neyaz Caculator");
        do{
        System.out.println("Enter +, -, *, / or 'q' to quit");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

            switch (c){
                case '+':
                    System.out.println("Enter two numbers to add");
                    int x= sc.nextInt();
                    int y= sc.nextInt();
                    addNumbers(x,y);
                    break;
                case '-':
                    System.out.println("Enter two numbers to Subtract");
                    int x1= sc.nextInt();
                    int y1= sc.nextInt();
                    subNumbers(x1,y1);
                    break;
                case '*':
                    System.out.println("Enter two numbers to Multiply");
                    int x2= sc.nextInt();
                    int y2= sc.nextInt();
                    mulNumbers(x2,y2);
                    break;
                case '/':
                    System.out.println("Enter two numbers to Divide");
                    int x3= sc.nextInt();
                    int y3= sc.nextInt();
                    divNumbers(x3,y3);
                    break;
               case 'q':
                   System.out.println("Exiting... Goodbye!!");
                   sc.close();
                   return;
                default:
                    System.out.println("Invalid input");
            }
        }while(true);

    }

    private static void divNumbers(int x3, int y3) {
        int div = x3 / y3;
        int rem = x3 % y3;
        System.out.println("After dividing "+x3+" by "+y3+" is "+div+" and remainder is "+rem);
    }

    private static void mulNumbers(int x2, int y2) {
        int mul = x2 * y2;
        System.out.println("The product of "+x2+" and  "+y2+" is "+mul);
    }

    private static void subNumbers(int x1, int y1) {
        int sub = x1 - y1;
        System.out.println("The subtraction of "+x1+" from "+y1+" is "+sub);
    }

    private static void addNumbers(int x, int y) {
        int add = x + y;
        System.out.println("The addition of "+x+" and "+y+" is "+add);
    }
}
