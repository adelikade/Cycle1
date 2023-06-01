import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.println("Введите длину одномерного массива");
        int size = enter.nextInt();

        System.out.println("Введите первый элемент массива(если дробь, то через запятую)");
        double k = enter.nextDouble();
        System.out.println("Выводится массив");

        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            array[i] = k;
            System.out.println(array[i] + "\t");
            k++;
        }
        double sum = 0;
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
        double average = sum / array.length;

        System.out.println("Среднее арифметическое чисел массива равно: " + average);
        System.out.println("Выводится массив, умноженный на среднее арифметическое");
        for (int l = 0; l < size; l++) {
            array[l] = k;
            k = (k * average);
            System.out.println(array[l] + "\t");
        }
    }
}


