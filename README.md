# 🛑 Антипаттерны в коде на Java

## 📚 Оглавление
1. [God Object (Объект-бог)](#god-object)
2. [Spaghetti Code (Спагетти-код)](#spaghetti-code)
3. [Magic Numbers (Магические числа)](#magic-numbers)
4. [Hardcoding (Жёсткое кодирование)](#hardcoding)
5. [Copy-Paste Programming (Программирование через копипасту)](#copy-paste-programming)
6. [Dead Code (Мёртвый код)](#dead-code)
7. [Long Method (Длинный метод)](#long-method)
8. [Global State (Глобальное состояние)](#global-state)
9. [Lava Flow (Лавовый поток)](#lava-flow)
10. [Overengineering (Чрезмерное проектирование)](#overengineering)
11. [Singleton (Одиночка)](#singleton)
12. [God Class (Класс-бог)](#god-class)
13. [Null Pointer (Зависимость от null)](#null-pointer)
14. [Resource Leak (Утечка ресурсов)](#resource-leak)

---

## 🛑 God Object (Объект-бог)
**Описание:** Класс, который делает слишком много и нарушает принцип единственной ответственности.

```java
static Scanner scanner = new Scanner(System.in);
```

---

## 🍝 Spaghetti Code (Спагетти-код)
**Описание:** Код с запутанной логикой и отсутствием структуры.

```java
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
```

---

## 🔢 Magic Numbers (Магические числа)
**Описание:** Использование числовых значений без пояснений.

```java
private int calculate(int x) {
    return x * 42 - 7;
}
```

---

## 🔒 Hardcoding (Жёсткое кодирование)
**Описание:** Жёстко зашитые значения.

```java
public String getGreeting() {
    return "Hello, World!";
}
```

---

## 📝 Copy-Paste Programming (Программирование через копипасту)
**Описание:** Дублирование кода вместо его переиспользования.

```java
public void printHello() {
    System.out.println("Hello, World!");
}

public void printHi() {
    System.out.println("Hello, World!");
}
```

---

## 💀 Dead Code (Мёртвый код)
**Описание:** Код, который никогда не вызывается.

```java
private void unusedMethod() {
    System.out.println("Я никогда не вызываюсь");
}
```

---

## 🛤️ Long Method (Длинный метод)
**Описание:** Метод с чрезмерным количеством ответственности.

```java
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
```

---

## 🌐 Global State (Глобальное состояние)
**Описание:** Использование глобальных переменных.

```java
private static int counter = 0;

public void increment() {
    counter++;
    System.out.println("Счётчик: " + counter);
}
```

---

## 🌋 Lava Flow (Лавовый поток)
**Описание:** Устаревший код, который остался после рефакторинга.

```java
public void oldLogic() {
    System.out.println("Старая логика");
}
```

---

## 🏗️ Overengineering (Чрезмерное проектирование)
**Описание:** Избыточное использование шаблонов.

```java
public interface Operation {
    int execute(int a, int b);
}

public class Addition implements Operation {
    public int execute(int a, int b) {
        return a + b;
    }
}
```

---

## 🦄 Singleton (Одиночка)
**Описание:** Шаблон проектирования с проблемами многопоточности.

```java
private static AntiPatternExample instance;

public static AntiPatternExample getInstance() {
    if (instance == null) {
        instance = new AntiPatternExample();
    }
    return instance;
}
```

---

## 🏢 God Class (Класс-бог)
**Описание:** Класс, выполняющий функции всех модулей.

```java
public void sendEmail(String recipient, String message) {
    System.out.println("Отправка письма: " + message + " для " + recipient);
}
```

---

## ⚡ Null Pointer (Зависимость от null)
**Описание:** Возвращение null, что может привести к исключению.

```java
public String getNullValue() {
    return null;
}
```

---

## 🔥 Resource Leak (Утечка ресурсов)
**Описание:** Неправильное управление ресурсами.

```java
try (FileReader fr = new FileReader("test.txt")) {
    System.out.println("Файл открыт и корректно закрыт");
} catch (IOException e) {
    System.out.println("Ошибка открытия файла: " + e.getMessage());
}
```

---

✅ **Вывод:** Избегайте антипаттернов, чтобы код был читаемым, поддерживаемым и устойчивым к ошибкам.


