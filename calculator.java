import java.util.*;

public class calculator {
    public static void summ(int a, int b){
        System.out.println(a+b);
    }
    public static void subb(int a, int b){
        System.out.println(a-b);
    }
    public static void multi(int a, int b){
        System.out.println(a*b);
    }
    public static void div(int a, int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        if(c == "A"){
            summ(a, b);
        }
        else if(c == "S"){
            subb(a, b);
        }
        else if(c == "M"){
            multi(a, b);
        }
        else if(c == "D"){
            div(a, b);
        }
        sc.close();
    }
}
