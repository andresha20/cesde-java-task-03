
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String outputChatbox;
        int n = 2;
        Scanner parser = new Scanner(System.in);
        Random random = new Random();
        outputChatbox = "Insert loop size:";
        System.out.println(outputChatbox);
        if (n > 1) {
            n = parser.nextInt();
        }
        int[] numbers = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int number = random.nextInt(10);
            outputChatbox = String.valueOf(number);
            System.out.println(outputChatbox);
            numbers[i] = number;
        }
        int length = n - 1;
        int halfLength = length / 2;
        for (int index = 0; index < halfLength; index++) {
            int tempEl = numbers[index];
            numbers[index] = numbers[length - index];
            numbers[length - index] = tempEl;
        }
        for (int index = 0; index < n; index++) {
            System.out.println(numbers[index]);
        }
    }
}