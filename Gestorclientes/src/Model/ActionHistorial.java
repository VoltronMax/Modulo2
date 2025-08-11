package Model;

public class ActionHistorial {
    private String description;
    private long time;

    public ActionHistorial(String description){
        this.description = description;
        this.time = System.currentTimeMillis();
    }

    public String getDescription() {
        return description;
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "["+ time +"] " + description;
    }

    
}
