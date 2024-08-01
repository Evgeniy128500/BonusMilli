public class BonusMilli {
    public static void main(String[] args) {
        int amount = 13_620; // стоимость билета
        int bonus = 20; // количество рублей для одной бонусной мили
        int milli = amount / bonus; // рачитываем количество бонусных милей
        System.out.println("за сумму билета" + amount + "начислено " + milli + "бонус(ов)"); // выводим результат

    }
}
