public class Main {
    public static void main(String[] args) {

        int a = 200; // текущий счет
        int b = 1220; //пополнение
        int x; //бонус

        if (b < 1000) {
            x = 0;
        } else {
            x = b / 100;
        }

        int c = a + b + x; //итоговый счет

        System.out.println("На счету: " + (c) + " рублей");
        System.out.println("Бонус равен: " + (x) + " рублей");
    }
}