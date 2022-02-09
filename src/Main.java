public class Main {
    public static void main(String[] args) {
        // Данные
        int refill = 1000;
        int balance = 2000;
        //Логика
        int bonus = (refill >= 1000) ? refill / 100 : 0;
        int total = (refill + balance + bonus);

        System.out.println("Начислен бонус " + bonus);
        System.out.println("Итоговый баланс " + total);
    }
}
