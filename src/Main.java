import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1,tmp = 1;
        while (N != tmp){
            i++;
            tmp*=i;
        }
        System.out.print(i);
    }
}
