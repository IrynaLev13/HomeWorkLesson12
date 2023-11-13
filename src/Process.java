import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Process {
    private double totalAmount = 0.0;
    private List <DrinksMachine> drinks  = new ArrayList<>();
    public void start () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть назву напою та натисніть Enter:" + Arrays.toString(DrinksMachine.values()));
        while (true) {
            String userInput = scanner.nextLine().trim().toUpperCase();
            if (userInput.isEmpty()) break;
            try {
                DrinksMachine drinksMachine = DrinksMachine.valueOf(userInput);
                this.drinks.add(drinksMachine);
                this.totalAmount += drinksMachine.getAmount();
            } catch (java.lang.IllegalArgumentException e) {
                System.out.println("Введено некорректну назву");

            }

        }
    }
    public void process (){
        for ( DrinksMachine drinksMachine:drinks ) {
            System.out.println("Візьміть свій " + drinksMachine.getTitle());
            System.out.println("Сума до оплати: " + drinksMachine.getAmount());
        }
        System.out.println("Кількість напоїв: " + this.drinks.size());
        System.out.println("Загальна вартість: " + this.totalAmount);

        }

    public double getTotalAmount() {
        return totalAmount;
    }

    public List<DrinksMachine> getDrinks() {
        return drinks;
    }
}








