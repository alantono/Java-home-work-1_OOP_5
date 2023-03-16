package Unit;

import java.util.ArrayList;

public class Wizard extends Characters{

    // Колдун

    protected String name;
    protected float mana = 1;
    protected float mana_max = 1;

    public Wizard(int x, int y, int teams, String name, float mana, float mana_max, Vector2D coords, String state) {
        super(17, 12, 5, 0, 30, 30, 9, x, y, 1, coords, state);
        this.name = name;
        this.mana = mana;
        this.mana_max = mana_max;
    }
    public Wizard (String name, Vector2D coords) {
        super(name, coords.x, coords.y);
    }

    @Override
    public void step(ArrayList<Characters> teams_1, ArrayList<Characters> teams_2) {
        if (state.equals("Die") || mana <= 0) return;
    // если не труп то найти среди своих персонажа с здоровьем меньше максимального и вылечить его!
        for (int i = 0; i < teams_1.size(); i++) {
            if (teams_1.get(i).hp < teams_1.get(i).hp_max) {
                teams_1.get(i).hp++; 
                break;
            }
                }
            mana --;
        }
    public String getInfo() {

        return String.format("Team: %d; %s    ; %s; speed: %d; state: %s; x: %d; y: %d",
       teams, this.getClass().getSimpleName(), this.name, speed, state, coords.x, coords.y);
   }

}