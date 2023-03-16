package Unit;

import java.util.ArrayList;

public abstract class Archer extends Characters{

    // Лучник (с подклассами Арбалетчик, Снайпер)
    public int shots;

    public Archer(int attack, int defense, int damage_min, int damage_max, float hp, float hp_max, int speed, int x,
            int y, int shots, int teams, Vector2D coords, String state) {
        super(attack, defense, damage_min, damage_max, hp, hp_max, speed, x, y, teams, coords, state);
        this.shots = shots;
    }
    public Archer (String state, Vector2D coords) {
        super(state, coords.x, coords.y);
    }



    public int getShots() {return shots;}

@Override
public void step(ArrayList<Characters> teams_1, ArrayList<Characters> teams_2) {
    if (state != "Stand" || shots == 0) return;
    int target = findNearest(teams_2);
    float damage = (teams_2.get(target).defense - attack > 0) ? damage_min : 
    (teams_2.get(target).defense - attack < 0) ? damage_max : 
    (damage_max + damage_min)/2;
    teams_2.get(target).getDamage(damage); // передаем противнику повреждение

    for (int i = 0; i < teams_1.size(); i++) {
        if (teams_1.get(i).getInfo().toString().split(":")[0].equals("Farmer") && teams_1.get(i).state.equals("Stand")) {
            teams_1.get(i).state = "Busy";
            return;
        }
    }
    shots --;
    
}
protected boolean findFarmer(ArrayList<Characters> team) {
    ArrayList <Characters> arrayFarmer = new ArrayList<>();
    for (int i = 0; i < team.size(); i++) {
        if (team.get(i).getClass() == Farmer.class) {
            if(((Farmer) team.get(i)).getShotsFarmer() > 0) {
                arrayFarmer.add(team.get(i));
            }
        }
    }
    switch (arrayFarmer.size()) {
        case (0):
            return false;
        case (1):
            ((Farmer) arrayFarmer.get(0)).setShotsFarmer(0);
            return true;
        default:
            ((Farmer) arrayFarmer.get(findNearest(arrayFarmer))).setShotsFarmer(0);
            return true;
    }
} 


}
