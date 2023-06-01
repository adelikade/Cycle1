import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите неотрицательное целое число: ");
        str = scan.nextLine();
        int n = str.length();
        int sum = 0;
        str = str.replaceAll("[^0-9]", "");
        if (str.length() < n)
            System.out.println("После удаления лишних символов, "
                    + "получилось: " + str);
        else
            System.out.println("Корректный ввод числа: " + str);
        for (int i = 1; i <= Integer.parseInt(str); i++) {
            if ((i % 2) != 0) {
                sum = sum + i;
            }
            System.out.printf("Сумма нечетных чисел: %d", sum);
        }
    }
}

