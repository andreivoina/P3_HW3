public class Prison {
    private Cell[] cells;

    public Prison(int numberOfCells) {
        cells = new Cell[numberOfCells];
        for (int i = 0; i < numberOfCells; i++) {
            cells[i] = new Cell(this); // Each cell belongs to this prison
        }
    }

    public boolean assignPrisonerToCell(String name, String prisonerID, int cellNumber) {
        Prisoner prisoner = new Prisoner(name, prisonerID);
        return assignPrisonerToCell(cellNumber, prisoner); // Call existing method
    }

    // Assign a prisoner to a specified cell
    public boolean assignPrisonerToCell(int cellNumber, Prisoner prisoner) {
        if (cellNumber < 0 || cellNumber >= cells.length) {
            System.out.println("Invalid cell number.");
            return false;
        }

        boolean added = cells[cellNumber].addPrisoner(prisoner);
        if (!added) {
            System.out.println("Failed to add prisoner to cell " + cellNumber + ". The cell is full.");
        }
        return added; // Returns false if cell is full
    }

    // Display status of all cells in the prison
    public void displayPrisonStatus() {
        for (int i = 0; i < cells.length; i++) {
            System.out.println("Cell " + i + ":");
            cells[i].displayItems();
        }
    }
}