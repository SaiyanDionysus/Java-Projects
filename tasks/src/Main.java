import java.util.*;

/**
 *
 * @author Denis
 */
public class Main {
    protected void timerSleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        Main timer = new Main();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        System.out.println("Теперь генерируем рандомное число... \n");

        timer.timerSleep();

        Random random = new Random();
        int randomNumber = random.nextInt();
        System.out.println("Новое рандомное число до 100: " + randomNumber);
        System.out.println("Теперь подсчитаем результат рандомного числа сложенного с вашим введенным... \n");

        timer.timerSleep();

        int sumResult = number + randomNumber;
        System.out.println("Проводится подсчет..");
        timer.timerSleep();
        System.out.println("Полученное число равно: " + sumResult);

    }
}
