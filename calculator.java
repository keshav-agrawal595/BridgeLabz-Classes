import java.util.*;

public class calculator {
    public static void divid(int a, int b){
        System.out.println(a/b);
    public static void subb(int a, int b){
        System.out.println(a-b);
    }

    public static void multi(int a, int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        if(c == "D"){
            divid(a, b);
        if(c == "M"){
            multi(a, b);
        if(c == "S"){
            subb(a, b);
        }
        sc.close();
    }
}
}
