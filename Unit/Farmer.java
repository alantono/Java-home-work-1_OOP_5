package Unit;

import java.util.ArrayList;

public class Farmer extends Characters {

    // крестьянин
    protected String name;
    protected int shots;


    public Farmer(int x, int y, int teams, String name, int shots, Vector2D coords, String state) {
        super(1, 1, 1, 1, 1, 1, 3, x, y, teams, coords, state);
        this.name = name;
        this.shots = shots;
    }
    public Farmer (String name, Vector2D coords) {
        super(name, coords.x, coords.y);
    }

    @Override
public void step(ArrayList<Characters> teams_1, ArrayList<Characters> teams_2) {
    if (!this.state.equals("Die")) this.state = "Stand";
}

    public int getShotsFarmer () {
        return this.shots;
    }
    public void setShotsFarmer (int shots) {
        this.shots = shots;
    }
@Override
    public String getInfo() {

        return String.format("Team: %d; %s    ; %s; speed: %d; state: %s; x: %d; y: %d",
       teams, this.getClass().getSimpleName(), this.name, speed, state, coords.x, coords.y);
   }
}
