
public class Main {
    public static void main(String[] args) {
        int starting = 300; // стартовая сумма у клиента
        int fill = 1200; // сумма пополнения баланса
        if (fill > 1000) {
            System.out.println((fill / 100) + fill + starting);
        } else {
            System.out.println(fill + starting);
        }
    }
}