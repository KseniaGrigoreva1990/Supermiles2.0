public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 6000;
        int miles = service.calculate(price);
        System.out.println(price + " руб" + " : Cтоимость билета");

        int result = miles;
        System.out.println(result + " : Новое количество миль");
    }
}

