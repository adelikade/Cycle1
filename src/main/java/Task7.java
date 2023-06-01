import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int x = 6;
        int y = 13;
        int z = 20;

        Scanner enter = new Scanner(System.in);

        System.out.println("Введите длину одномерного массива");
        int size = enter.nextInt();

        System.out.println("Введите первый элемент массива");
        int k = enter.nextInt();
        System.out.println("Выводится массив");

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + k + "\t");
            k++;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == x | array[i] == y | array[i] == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }

    }
}
