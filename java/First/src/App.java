import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.sound.sampled.*;;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("What is your name?");
        // String name = scanner.nextLine();
        // System.out.println("How old are you?");
        // int age = scanner.nextInt();
        // scanner.nextLine();
        // System.out.println("Favorite food?");
        // String food = scanner.nextLine();

        // System.out.println("You are " + name + ", a " + age + " year old who loves " + food);

        // System.out.println("Hello " + name);
        // System.out.println("You are " + age);
        // System.out.println("And you like eating " + food);
        
        // String name = JOptionPane.showInputDialog("Who are you?");
        // JOptionPane.showMessageDialog(null, "Hello " + name);

        // int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        // JOptionPane.showMessageDialog(null, age + " huh, i see.");

        // double stats = Double.parseDouble(JOptionPane.showInputDialog("What's your current str stat?"));
        // JOptionPane.showMessageDialog(null, stats + "?!?!?!?!? Woah, youre farmed up.");

        // System.out.println("Enter the first number:");
        // double firstNumber = scanner.nextInt();
        // System.out.println("Enter the second number:");
        // double secondNumber = scanner.nextInt();
        // scanner.nextLine();
        // System.out.println("You are? ");
        // String name = scanner.nextLine();

        // double result = Math.sqrt((firstNumber*firstNumber) + (secondNumber*secondNumber));
        // System.out.println(name + ", the hypotenuse is " + result);

        // Random random = new Random();
        // int x = random.nextInt(6)+ 1;
        // double y = random.nextDouble();
        // boolean z = random.nextBoolean();
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);

        // int age = 14;

        // if(age >= 75){
        //     System.out.println("you old");
        // } else if(age >= 50){
        //     System.out.println("you aight");
        // }else if(age >= 30){
        //     System.out.println("youre more than or 30");
        // }else if(age >= 15){
        //     System.out.println("more than or 15");
        // }else {
        //     System.out.println("you a child");
        // }

        // try{

        //     System.out.println("What brand are you looking for?");
        //     String brand = scanner.nextLine().toLowerCase();

        //     switch(brand){
        //         case "razer":
        //         System.out.println("Nice choice");
        //         break;
        //         case "logitech":
        //         System.out.println("Nice choice");
        //         break;
        //         case "red dragon":
        //         System.out.println("Nice choice");
        //         break;
        //         case "glorious":
        //         System.out.println("Nice choice");
        //         break;
        //         case "asus":
        //         System.out.println("Nice choice");
        //         break;
        //         default:
        //         System.out.println("not found");
        //     }
        // }catch(Exception e){
        //     System.out.println("Brand not available.");
        // }

        // int x = 19;
        // if (x < 10 && x > 5){
        //     System.out.println("x is less than 10 and is greater than 5.");
        // } else if (x > 10 && x < 20){
        //     System.out.println("x is greater than 10 but less than 20");
        // }

        // System.out.println("Quit game? ");
        // String decision = scanner.nextLine();

        // if (decision.equals("Q") || decision.equals("q")) {
        //     System.exit(0);
        // }else {
        //     System.out.println("in progress. . . ");
        // }

        // String name = "";

        // while(name.isBlank()){
        //     System.out.println("Enter your name: ");
        //     name = scanner.nextLine();
        // }

        // System.out.println("Welcome " + name);


        // for (int i=1; i<11; i++){
        //     System.out.println(i);
        // }

        // int rows;
        // int col;
        // String symbol;

        // System.out.println("Enter number of rows:");
        // rows = scanner.nextInt();
        // System.out.println("Enter number of columns:");
        // col = scanner.nextInt();
        // System.out.println("What symbol:");
        // symbol = scanner.next();

        // for (int i = 1; i <= rows; i++){
        //     System.out.println();
        //     for (int j = i; j <= col; j++){
        //         System.out.print(symbol + " ");

        //     }
        // }

        // int a = 10;
        // int b = 20;
        // int temp = 0;

        // temp = b;
        // b = a;
        // a = temp;

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(temp);

        // String[] cars = {"Camaro", "Corvette", "Tesla"};

        // for(int i = 0; i < cars.length; i++){
        //     System.out.println(cars[i]);
        // }

            // String[][] cars = { {"Camaro", "Corvette", "Silverado"},
            //                     {"Mustang", "Ranger", "F-150"},
            //                     {"Ferrari", "Lambo", "Tesla"}};

            // for (int i = 0; i<cars.length; i++){
            //     System.out.println();
            //     for(int j = 0; j<cars[i].length; j++){
            //         System.out.print(cars[i][j] + " ");
            //     }
            // }

            // String name = "";

            // boolean result = name.equals("Nito");
            // int result = name.length();
            // char result = name.charAt(2);
            // int result = name.indexOf("t");
            // boolean result = name.isEmpty();
            // String result = name.toLowerCase();
            // String result = name.toUpperCase();
            // String result = name.replace('i', 'a');

            // System.out.println(result);

            // Boolean a = true;
            // Character b = '@';
            // Integer c = 123;
            // Double d = 3.14;
            // String e = "Nito";

            // ArrayList<String> food = new ArrayList<String>();
            // food.add("pizza");
            // food.add("hamburger");
            // food.add("hotdog");
            // food.add("steak");
            // food.add("lex");

            // food.set(0, "sushi");
            // food.remove(2);

            // // food.clear();

            // for(int i=0; i<food.size(); i++){
            //     System.out.println(food.get(i));
            // }


        // ArrayList<ArrayList<String>> groceryList = new ArrayList();

        //     ArrayList<String> bakeryList = new ArrayList();
        //     bakeryList.add("pasta");
        //     bakeryList.add("garlic bread");
        //     bakeryList.add("donuts");

        //     ArrayList<String> produceList = new ArrayList();
        //     produceList.add("tomatoes");
        //     produceList.add("zucchini");
        //     produceList.add("peppers");

        //     ArrayList<String> drinksList = new ArrayList();
        //     drinksList.add("Soda");
        //     drinksList.add("coffee");

        //     groceryList.add(bakeryList);
        //     groceryList.add(produceList);
        //     groceryList.add(drinksList);
        //     System.out.println(groceryList.get(0).get(1));
        //     System.out.println(groceryList.get(1));

        // String[] animals = {"cat", "dog", "rat", "bird"};
        // // ArrayList<String> animals = new ArrayList<String>();

        // // animals.add("cat");
        // // animals.add("dog");
        // // animals.add("rat");
        // // animals.add("bird");

        // for (int i=0; i<animals.length; i++){
        //     System.out.println(animals[i]);
        // }

        // for(String i: animals){
        //     System.out.println(i);
        // }
        
        // String name = "nito";
        // int age = 22;
        // hello(name, age);

    // }

        // int x = 3;
        // int y= 4;

        // int z = sum(x, y);
        // System.out.println(z);

        // int x = add(1, 2, 5, 10);
        // System.out.println(x);
        // double y = add(1.2, 5.251, 7.333);
        // System.out.println(y);

        // boolean myBoolean = true;
        // char myChar = '#';
        // String myString = "Nito";
        // int myInt = 5;
        // double myDouble = 1000224.12;

        // // printf = optional method to format console window results
        // System.out.printf("%c", myChar);
        // System.out.printf("%b", myBoolean);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myInt);
        // System.out.printf("%f", myDouble);

        // System.out.printf("Hello %10s", myString); // width
        // System.out.printf("you have %.2f", myDouble); //limits decimal for console sout
        // System.out.printf("you have %,f", myDouble); //sets flags

        // final double PI = 3.14159; //similar to const in js, cant be changed or reassigned.
        // System.out.println(PI);

        // Car myCar = new Car(); //CAR.JAVA : OOP.
        // System.out.println(myCar.make);
        // System.out.println(myCar.model);

        // myCar.drive();
        // myCar.brake();

        // Human human = new Human("Nito", 22, 53.0);
        // Human human2 = new Human("Ichika", 23, 55.0);
        // System.out.println(human.name);
        // System.out.println(human.age);
        // System.out.println(human2.name);
        // System.out.println(human2.age);

        // human.eat();
        // human.drink();

        // human2.eat();
        // human2.drink();

        // Pasta pasta = new Pasta("Spaghetti", 2, 10.00);
        // Pasta pasta2 = new Pasta("Carbonara", 3, 15.99);

        // System.out.println(pasta.packs);
        // System.out.println(pasta2.pasta);

        // pasta.thePrice();
        // pasta2.thePacks();
        // pasta.thePasta();

        // DiceRoller diceRoller = new DiceRoller();

        // Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
        
        // System.out.println("The ingredients: ");
        // System.out.println(pizza.bread);
        // System.out.println(pizza.sauce);
        // System.out.println(pizza.cheese);
        // System.out.println(pizza.topping);

        // Car2 car2 = new Car2();
        // System.out.println(car2.toString());

        // Food food1 = new Food("Pizza", "Italian");
        // Food food2 = new Food("Hamburger", "American");
        // Food food3 = new Food("Hotdog", "Korean");

        // Food[] refrigerator = {food1, food2, food3};

        // System.out.println(refrigerator[0].name + " - " + refrigerator[0].cuisine);
        // System.out.println(refrigerator[1].name + " - " + refrigerator[1].cuisine);
        // System.out.println(refrigerator[2].name + " - " + refrigerator[2].cuisine);

        // Garage garage = new Garage();
        // CarGarage carGarage = new CarGarage("BMW");
        // CarGarage carGarage2 = new CarGarage("Mercedes");

        // garage.park(carGarage);
        // garage.park(carGarage2);

        // Friend friend1 = new Friend("Spongebob");
        // Friend friend2 = new Friend("Patrick");
        // Friend friend3 = new Friend("Squidward");
        // Friend friend4 = new Friend("Sandy");

        // Friend.displayFriends();

        // ============================ INHERITANCE ============================== <--- FOR CHILD CLASSES TO INHERIT DATA FROM THE PARENT CLASS

        // CarInheritance carInheritance = new CarInheritance();
        // carInheritance.go();

        // BicycleInheritance bicycleInheritance = new BicycleInheritance();
        // bicycleInheritance.stop();

        // System.out.println(carInheritance.speed);
        // System.out.println(bicycleInheritance.speed);

        // System.out.println(carInheritance.doors);
        // System.out.println(bicycleInheritance.pedals);

        // ============================ INHERITANCE ============================== <--- INHERITS VALUES FROM PARRENT CLASS. @OVERRIDE TO CHANGE IN CHIILD CLASS

        // Animal animal = new Animal();

        // Dog dog = new Dog();
        // Cat cat = new Cat();

        // animal.speak();
        // dog.speak();
        // cat.speak();

        // cat.sleep();

        // animal.pose();
        // cat.pose();
        // dog.pose();

        // ============================ SUPER ==============================
        
        // Hero hero1 = new Hero("Batman", 42, "$$$");
        // Hero hero2= new Hero("Superman", 1000, "laserbeam eyes");

        // Villain villain = new Villain("Joker", 41, "idk, cards?");

        // System.out.println(villain.toString());
        // System.out.println();
        // System.out.println(hero2.toString());

        // ============================ ABSTRACTION ============================== <--- abstract classes cant be instantiated, but can be in subclasses/child classes; // A LAYER OF SECURITY
                                                                                        // declared without an implementation or body "{}"

        // CarAbstraction carAbstraction = new CarAbstraction();
        // // VehicleAbstraction vehicleAbstraction = new VehicleAbstraction();

        // carAbstraction.go();
        // carAbstraction.brake();
        // carAbstraction.park();


        // ============================ ENCAPSULATION ============================== <---- SINCE IT CAN ONLY BE ACCESSED ON THE CLASS ITS IN, USE PUBLIC GETTERS AND SETTERS
                                                                                        // I.E carEncapsulation.getMake()

        // CarEncapsulation carEncapsulation = new CarEncapsulation("Chevrolet", "Camaro", 2021);
        // CarEncapsulation carEncapsulation2 = new CarEncapsulation("Kawasaki", "Ninja", 2022);

        // carEncapsulation.setYear(2030); // CHANGE VALUES (SETTERS)
        // carEncapsulation.setModel("IDK ANYTHING BOUT CARS YO");

        // carEncapsulation2.setYear(2020);

        // System.out.println(carEncapsulation.getMake());
        // System.out.println(carEncapsulation.getModel());
        // System.out.println(carEncapsulation.getYear());
        //     System.out.println();
        // System.out.println(carEncapsulation2.getYear());
        // System.out.println(carEncapsulation2.getMake());

        // ============================ COPY OBJECTS ==============================

            // CarCopy carCopy = new CarCopy("Chevrolet", "Camaro", 2021);
            // CarCopy carCopy2 = new CarCopy("Ford", "Mustang", 2022);

            // carCopy2.copy(carCopy);

            // // CarCopy carCopy2 = new CarCopy(carCopy); //

            // System.out.println(carCopy);
            // System.out.println(carCopy2); //ADDRESS PRINTS OUT.
            // System.out.println();
            // System.out.println(carCopy.getMake()); //IMPLEMENTED TOSTRING() METHODS
            // System.out.println(carCopy.getModel());
            // System.out.println(carCopy.getYear());
            // System.out.println();
            // System.out.println(carCopy2.getMake()); //COPIED OBJECTS
            // System.out.println(carCopy2.getModel());
            // System.out.println(carCopy2.getYear());
            // System.out.println();

    // ============================ INTERFACE ============================== <-- a template that can be applied to a class, but specifies what that class must do.
                                                                            // classes can apply one or more interfaces (check fish.java)

        // Rabbit rabbit = new Rabbit();
        // rabbit.flee();
        // rabbit.hop();

        // Hawk hawk = new Hawk();
        // hawk.hunt();

        // Fish fish = new Fish();
        // fish.hunt();
        // fish.flee();

    // ============================ POLYMORPHISM ============================== <---- ABILIY FOR AN OBJECT TO IDENTIFY AS MORE THAN 1 TYPE
        // CarPolymorphism carPolymorphism = new CarPolymorphism();
        // BicyclePolymorphism bicyclePolymorphism = new BicyclePolymorphism();
        // BoatPolymorphism boatPolymorphism = new BoatPolymorphism();
        // SkatePolymorphism skatePolymorphism = new SkatePolymorphism();

        // VehiclePolymorphism[] racers = {carPolymorphism, bicyclePolymorphism, boatPolymorphism, skatePolymorphism};

        // for(VehiclePolymorphism x: racers){
        //     x.go();
        // }

    // ============================ DYNAMIC POLYMORPHISM ============================== 

    // try{
    //         AnimalPolymorphism animalPolymorphism = new AnimalPolymorphism();
    //         System.out.println("What animal do you want? [1]Dog ; [2]Cat ; [3]Fish");
    //         int choice = scanner.nextInt();

    //         if (choice == 1){

    //             animalPolymorphism = new DogPolymorphism();
    //             animalPolymorphism.speak();

    //         }else if (choice == 2){

    //             animalPolymorphism = new CatPolymorphism();
    //             animalPolymorphism.speak();

    //         }else if (choice == 3){

    //             animalPolymorphism = new FishPolymorphism();
    //             animalPolymorphism.speak();

    //         } else {
    //             animalPolymorphism = new AnimalPolymorphism();
    //             System.out.println("invalid");
    //             animalPolymorphism.speak();
    //         }

    //     } catch (InputMismatchException e){
    //         System.out.println("The animal goes \"boy read the instructions\"");
    //     }

    // ============================ EXCEPTIONS ============================== 

    // try{
    //         System.out.println("Enter a whole number to divide: ");
    //         int x = scanner.nextInt();
    //         System.out.println("Enter a whole number to divide by: ");
    //         int y = scanner.nextInt();

    //         int z = x / y;

    //         System.out.println("result: " + z);

    //     }catch (ArithmeticException e){
    //         System.out.println("invalid");
    //     }catch (InputMismatchException e){
    //         System.out.println("please enter a number omfg.");
    //     }catch (Exception e){
    //         System.out.println("Something went wrong.");
    //     }

    //     finally{
    //         System.out.println("This will always print");
    //         scanner.close();
    //     }


    // ============================ FILES ============================== 

        // File file = new File("secret_message.txt");

        // if(file.exists()){
        //     System.out.println("file exists.");
        //     System.out.println(file.getPath());
        //     System.out.println(file.getAbsolutePath());
        //     System.out.println(file.isFile());
        //     file.delete(); //deletes the file
        // }else{
        //     System.out.println("the file does not exist.");
        // }

        // try{
        //     FileWriter fileWriter = new FileWriter("secret_message.txt");
        //     fileWriter.write("Roses are red. \n");
        //     fileWriter.write("Violets are blue. \n");
        //     fileWriter.append("\n(A Poem)");
        //     fileWriter.close();
            
        // } catch (Exception e){
        //     e.printStackTrace();
        // }

        // try{
        //     FileReader reader = new FileReader("art.txt");
        //     int data = reader.read();

        //     while (data != -1){
        //         System.out.print((char)data);
        //         data = reader.read();
        //     }

        //     reader.close();

        // }catch (FileNotFoundException e) {
        //     System.out.println("file not found");
        // }catch (IOException e){
        //     System.out.println("something went wrong");
        // }

    }

    // static void hello(String name, int age){
    //     System.out.println("Hello " + name + ". You are " + age + " years of age.");
    // }

    // static int sum(int x, int y){
    //     int z = x + y;
    //     return z;
    // }

    // static int add(int a, int b){
    //     System.out.println("overloaded method 1");
    //     return a + b;
    // }
    // static int add(int a, int b, int c){
    //     System.out.println("overloaded method 2");
    //     return a + b + c;
    // }
    // static int add(int a, int b, int c, int d){
    //     System.out.println("overloaded method 3");
    //     return a + b + c + d;
    // }

    // static double add(double a, double b){
    //     System.out.println("overloaded method 4");
    //     return a + b;
    // }
    // static double add(double a, double b, double c){
    //     System.out.println("overloaded method 5");
    //     return a + b + c;
    // }
    // static double add(double a, double b, double c, double d){
    //     System.out.println("overloaded method 6");
    //     return a + b + c + d;
    // }

}
