import java.util.Scanner;

public class calculator {
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sub(int a, int b){
        System.out.println(a-b);
    }
    public static void mult(int a, int b){
        System.out.println(a*b);
    }
    public static void div(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.nextLine();
        if(c == "A"){
            sum(a, b);
        }
        if(c == "S"){
            sum(a, b);
        }
        if(c == "M"){
            sum(a, b);
        }
        if(c == "D"){
            sum(a, b);
        }
    }
}
