package recursion.basics;
public class PrinttNumber {
    public static void print(int n ){

        if(n==1){
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n+" ");
    }
    static void main() {
        print(5);
    }
}
