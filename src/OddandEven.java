import java.util.Scanner;

public class OddandEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the range of numbers : ");
        int range = sc.nextInt();
        for(int i = 1; i<=range; i++){
                if (i % 2 == 0) //remainder 0 means it is divisible by 2
                {
                    System.out.println(i + " Even");
               }
                else {
                    System.out.println(i + " Odd");
                }
        }
    }
}
