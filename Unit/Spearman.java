package Unit;
public class Spearman extends Characters {

// копейщик
    protected String name;

    public Spearman(int x, int y, int teams, String name, Vector2D coords, String state) {
        super(4, 5, 1, 3, 10, 10, 4, x, y, 2, coords, state);
        this.name = name;
    }
    public Spearman (String name, Vector2D coords) {
        super(name, coords.x, coords.y);
    }

    public String getInfo() {
        return String.format("Team: %d; %s  ; %s; speed: %d; state: %s; x: %d; y: %d",
       teams, this.getClass().getSimpleName(), this.name, speed, state, coords.x, coords.y);
   }
    
}