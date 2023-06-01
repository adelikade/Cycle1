import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        a = in.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        b = in.nextInt();


        int[][] arr = new int[a][b];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
        in.close();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int c = a;
        int d = b;

        int[][] arr1 = new int[c][d];
        for (int l = 0; l < c; l++) {
            for (int j = 0; j < d; j++) {
                arr1[l][j] = (l + 1) * 3;
                arr1[l][j] = (j + 1) * 3;
            }
        }
        int row = 0;
        System.out.println("Вывод первой строки массива:");
        for (int col = 0; col < arr1[row].length; col++) {
            System.out.print(arr1[row][col] + "\t");
        }
    }
}

