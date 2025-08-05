import java.util.*;

public class calculator {
    public static void subb(int a, int b){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        if(c == "S"){
            subb(a, b);
        }
        sc.close();
    }
}
