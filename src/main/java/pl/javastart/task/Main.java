package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.producer = "LG";
        monitor.size = 21;
        monitor.frequency = 144;

        System.out.println("Informacje o monitorze:");
        System.out.println("Producent: " + monitor.producer);
        System.out.println("Rozmiar ekranu [cale]: " + monitor.size);
        System.out.println("Częstotliwość odświeżania [hz]: " + monitor.frequency);
    }
}
