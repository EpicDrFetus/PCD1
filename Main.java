public class Main {
    public static void main(String[] args) {
        // Создаем и запускаем поток для выполнения математической операции
        CalculationThread calculationThread = new CalculationThread();
        calculationThread.start();

        // Основной поток может выполнять другую задачу
        System.out.println("Основной поток выполняет другую задачу.");
    }
}
