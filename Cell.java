public class Cell implements Manageable {
    private Prison prison;
    private Prisoner[] prisoners;

    public Cell(Prison prison) {
        this.prison = prison;
        this.prisoners = new Prisoner[2]; // Each cell can hold up to 2 prisoners
    }

    // This method should remain but not part of Manageable
    public boolean addPrisoner(Prisoner prisoner) { // Accepts a Prisoner object
        for (int i = 0; i < prisoners.length; i++) {
            if (prisoners[i] == null) {
                prisoners[i] = prisoner;
                return true; // Successfully added prisoner
            }
        }
        System.out.println("Cell is full. Cannot add prisoner.");
        return false; // No space left in the cell
    }

    @Override
    public void displayItems() {
        displayPrisoners(); // Calls the existing method to display prisoners
    }

    // Method to display prisoners
    public void displayPrisoners() {
        System.out.println("Prisoners in this cell:");
        for (Prisoner prisoner : prisoners) {
            if (prisoner != null) {
                System.out.println(" - " + prisoner.getName() + " (ID: " + prisoner.getID() + ")");
            } else {
                System.out.println(" - Empty spot");
            }
        }
    }
}