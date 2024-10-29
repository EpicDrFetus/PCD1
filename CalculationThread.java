public class CalculationThread extends Thread {
    @Override
    public void run() {
        // Выполнение математической формулы в отдельном потоке
        double result = calculateFormula();
        System.out.println("Результат вычислений: " + result);
    }

    // Пример функции с математической формулой
    private double calculateFormula() {
        double a = 5.0;
        double b = 3.0;
        double c = 2.0;
        return a * Math.pow(b, c) - Math.sqrt(a + b);
    }
}