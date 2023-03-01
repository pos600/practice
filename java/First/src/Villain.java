public class Villain extends Person{

    String weapon;

    Villain(String name, int age, String weapon) {
        super(name, age);
        this.weapon = weapon;
    }

    public String toString(){
        return super.toString() + this.weapon;
    }
    
}
