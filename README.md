Антипаттерны в коде на Java

В данном проекте демонстрируются различные антипаттерны, каждый из которых сопровождается пояснением и примером реализации.

1. God Object (Объект-бог)

Описание: Класс, который делает слишком много и нарушает принцип единственной ответственности.
Пример: Класс AntiPatternExample управляет вводом данных, логикой вычислений и отправкой электронной почты.

2. Spaghetti Code (Спагетти-код)

Описание: Код с запутанной логикой и отсутствием структуры.
Пример: Метод run() обрабатывает ввод пользователя и выполняет расчёты без четкого разделения ответственности.

3. Magic Numbers (Магические числа)

Описание: Использование числовых значений без пояснений.
Пример: Метод calculate() умножает входное число на 42 и вычитает 7.

4. Hardcoding (Жёсткое кодирование)

Описание: Жёстко зашитые значения, которые должны браться из внешних источников.
Пример: Метод getGreeting() всегда возвращает строку "Hello, World!".

5. Copy-Paste Programming (Программирование через копипасту)

Описание: Дублирование кода вместо его переиспользования.
Пример: Методы printHello() и printHi() выполняют одну и ту же логику.

6. Dead Code (Мёртвый код)

Описание: Код, который никогда не выполняется.
Пример: Метод unusedMethod(), который никогда не вызывается.

7. Long Method (Длинный метод)

Описание: Метод с чрезмерным количеством ответственности.
Пример: Метод complexLogic() выполняет множество задач, включая математические операции и цикл.

8. Global State (Глобальное состояние)

Описание: Использование глобальных переменных, затрудняющих отладку и тестирование.
Пример: Переменная counter увеличивается методом increment().

9. Lava Flow (Лавовый поток)

Описание: Устаревший код, который остался после рефакторинга.
Пример: Метод oldLogic(), который не используется, но остался в коде.

10. Overengineering (Чрезмерное проектирование)

Описание: Избыточное использование шаблонов и абстракций.
Пример: Интерфейс Operation и класс Addition для простой операции сложения.

11. Singleton (Одиночка)

Описание: Шаблон проектирования, создающий сложности с многопоточностью и тестированием.
Пример: Метод getInstance() возвращает единственный экземпляр класса.

12. God Class (Класс-бог)

Описание: Класс, выполняющий функции всех модулей.
Пример: Метод sendEmail() отправляет электронные письма.

13. Null Pointer (Зависимость от null)

Описание: Возвращение null, что может привести к NullPointerException.
Пример: Метод getNullValue() возвращает null.

14. Resource Leak (Утечка ресурсов)

Описание: Неправильное управление ресурсами, приводящее к утечкам.
Пример: Метод openFile() использует блок try-with-resources, но демонстрирует потенциальную ошибку при работе с файлами.

Каждый антипаттерн демонстрирует плохие практики, которые следует избегать при написании качественного кода.
