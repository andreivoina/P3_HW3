import java.util.ArrayList;

public class Guard implements Identifiable {
    private String name;
    private String guardID;

    public Guard(String name, String badgeID) {
        this.name = name;
        this.guardID = badgeID;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return guardID;
    }

}