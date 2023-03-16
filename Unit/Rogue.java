package Unit;
public class Rogue extends Characters {

    // Разбойник
    protected String name;

    public Rogue(String name, float hp, float hp_max, int attack, int damage_min, int damage_max, int defense, int speed, int x,
            int y, int teams, Vector2D coords, String state) {
        super(8, 3, 2, 4, 10, 10, 6, x, y, 1, coords, state);
        this.name = name;
    }
    public Rogue (String name, Vector2D coords) {
        super(name, coords.x, coords.y);
    }

    public String getInfo() {
        return String.format("Team: %d; %s     ; %s; speed: %d; state: %s; x: %d; y: %d",
       teams, this.getClass().getSimpleName(), this.name, speed, state, coords.x, coords.y);
   }
        
    }