import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào 3 cạnh của tam giác (số nguyên dương):");
        System.out.print("Cạnh a: ");
        int a = scanner.nextInt();
        System.out.print("Cạnh b: ");
        int b = scanner.nextInt();
        System.out.print("Cạnh c: ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {

            if (a == b && b == c) {
                System.out.println("Kết quả: Đây là Tam giác đều.");
            }
            else if (a == b || a == c || b == c) {
                System.out.println("Kết quả: Đây là Tam giác cân.");
            }
            else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Kết quả: Đây là Tam giác vuông.");
            }
            else {
                System.out.println("Kết quả: Đây là Tam giác thường.");
            }

        } else {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        }

        scanner.close();
    }
}