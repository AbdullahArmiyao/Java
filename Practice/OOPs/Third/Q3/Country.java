package Practice.OOPs.Third.Q3;

/**
 * Just like the previous 2 questions, we initialize the country class
 * Never forget: Always treat objects like what they are in real life, the functions are the properties
 */

public class Country {
    private String name;    //declare the name of the country
    private double population;    //declare the population of the country
    private double area;    //declare the area of the country

    public Country(String name, double population, double area){
        this.name = name;    //initialize the name of the country
        this.population = population;    //initialize the population of the country
        this.area = area;    //initialize the area of the country
    }

    // function to obtain country name
    public String getName(){
        return name;
    }

    // function to obtain population
    public double getPopulation(){
        return population;
    }

    // function to get area
    public double getArea(){
        return area;
    }

    // function to get population density
    public double getPopulationDensity(){
        return population / area;
    }

}
