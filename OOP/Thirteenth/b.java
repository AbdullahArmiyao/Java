package OOP.Thirteenth;

public class b{
    private String make;
    private String model;
    private int year;

    b(String make, String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);

        //Since we are using the set method
        //this.make = name;
        //this.model = model;
        //this.year = year;
    }

    @Override
    public String toString(){
        return make + " " + model + " " + year;
    }

    //creating the getter method for each member

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear(){
        return year;
    }

    //Using Setters
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
}
