package Unit;
public class Sniper extends Archer {

    // Снайпер
    public String name;
    
    // public Sniper(int attack, int defense, int damage_min, int damage_max, float hp, float hp_max, int speed,  int x, int y, int teams, int shots, String name, Vector2D coords, String state) {
    //     super(12, 10, 8, 10, 15, 15, 9, x, y, 32, teams, coords.x, coords.y, state);
    //     this.name = name;
    // }





    public Sniper(int attack, int defense, int damage_min, int damage_max, float hp, float hp_max, int speed, int x,
            int y, int shots, int teams, String state, Vector2D coords, String name) {
        super(12, 10, 8, 10, 15, 15, 9, x, y, 32, 1, coords, state);
        this.name = name;
    }
    public Sniper (Vector2D coords) {
        super(coords.x, coords.y);
    }





    public String getInfo() {
        return String.format("Team: %d; %s    ; %s; speed: %d; state: %s; x: %d; y: %d",
    teams, this.getClass().getSimpleName(), this.name, speed, state, coords.x, coords.y);
}


}

