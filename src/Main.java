public class Main {
    public static void main(String[] args) {

        int sum = 200; // текущий счет
        int refill = 1220; //пополнение
        int bonus; //бонус

        if (refill < 1000) {
            bonus = 0;
        } else {
            bonus = refill / 100;
        }

        int finalSum = sum + refill + bonus; //итоговый счет

        System.out.println("На счету: " + (finalSum) + " руб");
        System.out.println("Бонус равен: " + (bonus) + " руб");
    }
}