package jp.ac.uryukyu.ie.e235739;
public class Warrior extends Hero {
    public Warrior(String _name, int _maximumHP, int _attack,boolean dead){
        super(_name,_maximumHP,_attack, dead);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if( this.isDead() == false ){
            int damage = (int)(opponent.getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}



