package jp.ac.uryukyu.ie.e235739;

public class LivingThing {
    private String name;
    int hitPoint;
    private int attack;
    private boolean dead;
    
    
    public LivingThing(String _name,int _maximumHP,int _attack,boolean dead){
        this.name=_name;
        this.hitPoint=_maximumHP;
        this.attack=_attack;
        dead=false;

    }
    public boolean isDead() {
        return this.dead;
    }
    public String getName(){
        return this.name;
    }
    public void setHitPoint(int _hitPoint) {
        this.hitPoint = _hitPoint;
    }
    public int getHitPoint(){
        return this.hitPoint;
    }
    public void setDead(boolean _dead) {
        this.dead = _dead;
    }
    public int getAttack(){
        return this.attack;
    }
    
       
    public void attack(LivingThing opponent){
        if(dead==false){
            int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name,opponent.getName(), damage);
        opponent.wounded(damage);

        }
        }
    public void wounded(int damage){
        this.hitPoint -= damage;
        if( this.hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは道半ばで力尽きてしまった。\n", name);
        }
   


    
    }
    
}