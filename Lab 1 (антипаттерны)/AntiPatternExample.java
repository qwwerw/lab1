import java.util.*;
import java.io.*;

public class AntiPatternExample {

    // Антипаттерн: God Object (Объект-бог)
    // Класс делает всё подряд и управляет всем кодом
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AntiPatternExample example = new AntiPatternExample();
        example.run();
        example.printHello();
        example.printHi();
        example.complexLogic();
        example.increment();
        example.oldLogic();
        example.sendEmail("ползователь", "Привет!");
        System.out.println("Приветствие: " + example.getGreeting());
        System.out.println("Null Value: " + example.getNullValue());
        example.openFile();

        Addition addition = example.new Addition();
        System.out.println("Сложение: " + addition.execute(3, 4));

        AntiPatternExample singleton = AntiPatternExample.getInstance();
        singleton.increment();
    }

    // Антипаттерн: Spaghetti Code (Спагетти-код)
    // Логика перепутана и нелогична
    public void run() {
        System.out.println("Введите число: ");
        String input = scanner.nextLine();
        if (input.matches("\\d+")) {
            int number = Integer.parseInt(input);
            int result = calculate(number);
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    // Антипаттерн: Magic Numbers (Магические числа)
    // Используем числа без объяснения
    private int calculate(int x) {
        return x * 42 - 7;
    }

    // Антипаттерн: Hardcoding (Жёсткое кодирование)
    // Хардкодим значение, вместо получения из внешнего источника
    public String getGreeting() {
        return "Hello, World!";
    }

    // Антипаттерн: Copy-Paste Programming (Программирование через копипасту)
    // Код дублируется, а не переиспользуется
    public void printHello() {
        System.out.println("Hello, World!");
    }

    public void printHi() {
        System.out.println("Hello, World!");
    }

    // Антипаттерн: Dead Code (Мёртвый код)
    // Код, который никогда не используется
    private void unusedMethod() {
        System.out.println("Я никогда не вызываюсь");
    }

    // Антипаттерн: Long Method (Длинный метод)
    // Слишком длинный метод с большим количеством ответственности
    public void complexLogic() {
        int a = 5;
        int b = 10;
        int c = a + b;
        if (c > 10) {
            System.out.println("Больше 10");
        } else {
            System.out.println("Меньше или равно 10");
        }
        for (int i = 0; i < c; i++) {
            System.out.println("Итерация: " + i);
        }
    }

    // Антипаттерн: Global State (Глобальное состояние)
    // Использование глобального состояния для управления
    private static int counter = 0;

    public void increment() {
        counter++;
        System.out.println("Счётчик: " + counter);
    }

    // Антипаттерн: Lava Flow (Лавовый поток)
    // Старый код, который остался после изменения логики
    public void oldLogic() {
        System.out.println("Старая логика");
        // Теперь это не нужно, но мы оставили
    }

    // Антипаттерн: Overengineering (Чрезмерное проектирование)
    // Ненужное использование шаблонов и абстракций
    public interface Operation {
        int execute(int a, int b);
    }

    public class Addition implements Operation {
        public int execute(int a, int b) {
            return a + b;
        }
    }

    // Антипаттерн: Singleton (Одиночка)
    // Проблема с многопоточностью и тестируемостью
    private static AntiPatternExample instance;

    public static AntiPatternExample getInstance() {
        if (instance == null) {
            instance = new AntiPatternExample();
        }
        return instance;
    }

    // Антипаттерн: God Class (Класс-бог)
    // Выполняет функции всех модулей
    public void sendEmail(String recipient, String message) {
        System.out.println("Отправка письма: " + message + " для " + recipient);
    }

    // Антипаттерн: Null Pointer (Зависимость от null)
    public String getNullValue() {
        return null;
    }

    // Антипаттерн: Resource Leak (Утечка ресурсов)
    public void openFile() {
        try (FileReader fr = new FileReader("test.txt")) {
            System.out.println("Файл открыт и корректно закрыт");
        } catch (IOException e) {
            System.out.println("Ошибка открытия файла: " + e.getMessage());
        }
    }
}