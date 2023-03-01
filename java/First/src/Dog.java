// SOMETHING MORE SPECIFIC

public class Dog extends Animal{
    
    @Override //<---- like a note for overriding
    void speak(){
        System.out.println("The animal spoke? The Dog goes bark.");
    }
    void sleep(){
        System.out.println("The dog sleeps soundly.");
    }

}
