import java.util.Scanner;

public class Check_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " Khong phai snt");
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(number + " La snt");
            } else {
                System.out.println(number + " Khong phai snt");
            }
        }
    }
}
