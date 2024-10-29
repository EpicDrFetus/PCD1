public class CalculationThread extends Thread {
    @Override
    public void run() {
        // Выполнение математической формулы в отдельном потоке
        double result = calculateFormula();
        System.out.println("\nРезультат вычислений: " + formatDouble(result));
    }

    // Пример функции с математической формулой
    private double calculateFormula() {
        double a = 5.0;
        double b = 3.0;
        double c = 2.0;

        System.out.println("Выполнение математической формулы:");
        System.out.println("-------------------------------");

        // Вывод промежуточных значений
        double power = Math.pow(b, c);
        System.out.printf("1. b^c (%.2f^%.2f) = %s\n", b, c, formatDouble(power));

        double multiplication = a * power;
        System.out.printf("2. a * (b^c) (%.2f * %.2f) = %s\n", a, power, formatDouble(multiplication));

        double squareRoot = Math.sqrt(a + b);
        System.out.printf("3. sqrt(a + b) (sqrt(%.2f + %.2f)) = %s\n", a, b, formatDouble(squareRoot));

        double finalResult = multiplication - squareRoot;
        System.out.printf("4. Итог: %s - %s = %s\n", formatDouble(multiplication), formatDouble(squareRoot), formatDouble(finalResult));

        return finalResult;
    }

    // Метод для форматирования числа с запятой
    private String formatDouble(double value) {
        return String.format("%.2f", value).replace('.', ',');
    }
}
