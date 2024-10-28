import java.util.ArrayList;

public class DiningHall implements Manageable {
    private ArrayList<String> mealsServed;

    public DiningHall() {
        mealsServed = new ArrayList<>();
    }


    public void add(String meal) {
        mealsServed.add(meal);
        System.out.println("Meal added: " + meal);
    }


    public void displayItems() {
        System.out.println("Meals served:");
        for (String meal : mealsServed) {
            System.out.println(" - " + meal);
        }
    }

}