//@LINE 373 WITH PERSON.JAVA AS PARENT CLASS

public class Hero extends Person {

    String power;

    Hero(String name, int age, String power){
        super(name, age); //REFERS TO PERSON
        this.power = power;
    }

    public String toString(){
        return super.toString() + this.power;
    }
    
}
