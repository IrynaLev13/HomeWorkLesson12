public enum DrinksMachine {

    COFFEE("Кофе", Drinks.coffeePrice),
    TEA("Чай", Drinks.teaPrice),
    LEMONAD("Лимонад", Drinks.lemonPrice),
    MOXITO("Мохіто", Drinks.mohitoPrice),
    MINERALWATER("Мінеральна", Drinks.mineralPrice),
    COCACOLA("Кока-Кола", Drinks.colaPrice);
    private final String title;
    private double Amount;

    DrinksMachine(String title, double amount) {
        this.title = title;
        Amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return Amount;
    }
}