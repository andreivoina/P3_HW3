public class Main {
    public static void main(String[] args) {
        Prison prison = new Prison(5);
        DiningHall diningHall = new DiningHall();


        // Guards
        Guard guard1 = new Guard("John Smith", "G001");
        Guard guard2 = new Guard("Ray Washington", "G002");

        Guard[] guards = {guard1, guard2};

        System.out.println("Today's guards:");
        for (Guard guard : guards) {
            System.out.println("- " + guard.getName() + " (ID: " + guard.getID() + ")");
        }

        // Prisoners
        Prisoner prisoner1 = new Prisoner("Terry Davis", "ID0001");
        Prisoner prisoner2 = new Prisoner("Elon Musk", "ID0002");

        prison.assignPrisonerToCell(0, prisoner1);
        prison.assignPrisonerToCell(0, prisoner2);

        Prisoner prisoner3 = new Prisoner("Donald Trump", "ID0003");

        prison.assignPrisonerToCell(1, prisoner3);

        prison.displayPrisonStatus();

        diningHall.add("Chicken Curry with Rice");
        diningHall.add("Pork and Vegetables");
        diningHall.add("Beef stew");

        diningHall.displayItems();




        if (args.length == 0) {
            System.out.println("No arguments provided. Please specify 'add' or 'display'.");
            return;
        }

        String action = args[0]; // The first argument will determine the action

        switch (action) {
            case "add":
                if (args.length < 4) {
                    System.out.println("Usage: add <name> <prisonerID> <cellNumber>");
                    break;
                }
                String name = args[1];
                String prisonerID = args[2];
                int cellNumber;

                try {
                    cellNumber = Integer.parseInt(args[3]);
                } catch (NumberFormatException e) {
                    System.out.println("Cell number must be an integer.");
                    break;
                }

                // Attempt to add the prisoner
                if (prison.assignPrisonerToCell(name, prisonerID, cellNumber)) {
                    System.out.println("Prisoner " + name + " added to cell " + cellNumber + ".");
                } else {
                    System.out.println("Failed to add prisoner to cell " + cellNumber + ".");
                }
                break;

            case "display":
                prison.displayPrisonStatus();
                break;
            case "serve":
                diningHall.displayItems();
                break;

            default:
                System.out.println("Unknown action: " + action + ". Please specify 'add' or 'display'.");
                break;
        }

    }
}