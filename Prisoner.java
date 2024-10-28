public class Prisoner implements Identifiable {
    private String name;
    private String prisonerID;

    public Prisoner(String name, String prisonerID) {
        this.name = name;
        this.prisonerID = prisonerID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return prisonerID;
    }

}