package Unit;

import java.util.ArrayList;

public abstract class Characters implements GameInterface{
    protected int attack;
    protected int defense;
    protected int damage_min;
    protected int damage_max;
    protected float hp;
    protected float hp_max;
    protected int speed;
    protected int teams;
    public Vector2D coords;
    public String state;

        
    public Characters(int attack, int defense, int damage_min, int damage_max, float hp, float hp_max, int speed, int x,
            int y, int teams, Vector2D coords, String state) {
        this.attack = attack;
        this.defense = defense;
        this.damage_min = damage_min;
        this.damage_max = damage_max;
        this.hp = hp;
        this.hp_max = hp_max;
        this.speed = speed;
        this.teams = teams;
        this.state = "Stand";
        coords = new Vector2D(x, y);
    }



    public Characters(String name, int i, int j, int k, int l, int m, int n, int o, int x, int y) {
    }



    public Characters(String name, int x, int y) {
    }



    // получаем индекс ближайшего противника
    protected int findNearest(ArrayList<Characters> team) {
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
                if (min > coords.getDistanсe(team.get(i).coords) & team.get(i).hp != 0) {
                index = i;
                min = coords.getDistanсe(team.get(i).coords);
            }
            }
            
        return index;    
        }

    
    public float getHp() { return hp; }
    public int getSpeed() { return speed; }

    @Override
    public void step(ArrayList<Characters>teams_1, ArrayList<Characters>teams_2) {}

    protected void getDamage(float damage){
        hp -= damage;
        if (hp > hp_max) hp = hp_max;
        if (hp < 0) state = "Die";
    }
    @Override
    public String getInfo() {
        return new String();
    }
    }

