public class CarCopy {

    private String make;
    private String model;
    private int year;

    CarCopy(String make, String model, int year){

        this.make = make; //GETTERS FOR FETCHING
        this.model = model; 
        this.year = year; 

        this.setMake(make); //SETTERS FOR EDITING
        this.setModel(model); 
        this.setYear(year);; 
    }

    // CarCopy(CarCopy x){
    //     this.copy(x);
    // }

    //  V V V SET TO PUBLIC, THUS CAN BE ACCESSED ANYWHERE NOW (GETTERS)

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    // V V V ENABLES EDITING (SETTERS)

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void copy(CarCopy x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
    
}
