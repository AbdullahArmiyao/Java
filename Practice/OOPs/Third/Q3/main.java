package Practice.OOPs.Third.Q3;

import java.util.ArrayList;
import java.util.List;

public class main {

    /**
     * The functions sort out the countries with the maximum values and returns them
     * -----------------------------------------------------------------------------
     * Basically, what stream() does is it iterates through the list to perform max()
     * In concept it is similar to using a loop, but in actuality, they are different
     * ==============================================================================
     * max((c1, c2) -> Double.compare(c1.getArea(), c2.getArea())).orElse(null);
     * what the line above does is, it compares specific values of the object. This is a lambda expression
     * normally, c1 and c2 are all the object properties but with the expression, you can specify what value
     * of the object you want to compare, in this case, we are comparing the area
     * ______________________________________________________________________________________________________
     * @param countries: this represents the list of countries
     * @return: respective values
     */

    // function to find Country With Largest Area
    public static Country findCountryWithLargestArea(List<Country> countries){
        return countries.stream().max((c1, c2) -> Double.compare(c1.getArea(), c2.getArea())).orElse(null);
    }

    // function to find Country With Largest Population
    public static Country findCountryWithLargestPopulation(List<Country> countries){
        return countries.stream().max((c1, c2) -> Double.compare(c1.getPopulation(), c2.getPopulation())).orElse(null);
    }

    // function to find Country With Largest Population Density
    public static Country findCountryWithLargestPopulationDensity(List<Country> countries){
        return countries.stream().max((c1, c2) -> Double.compare(c1.getPopulationDensity(), c2.getPopulationDensity())).orElse(null);
    }

    //Main function
    public static void main(String[] args){
        List<Country> countries = new ArrayList<>();
        //This is how we add items to an array list
        //In here, we instantiate the Country object as we add it, saves time, makes code look clean
        countries.add(new Country("Ghana", 1000000, 62536958237.3));
        countries.add(new Country("China", 1000000000, 6958237.3));
        countries.add(new Country("Britain", 50000000, 8237.3));

        System.out.println("Country with largest area: " + findCountryWithLargestArea(countries).getName());
        System.out.println("Country with largest population: " + findCountryWithLargestPopulation(countries).getName());
        System.out.println("Country with largest population density: " + findCountryWithLargestPopulationDensity(countries).getName());

        /**
         // This is how we instantiated objects
         // As you can see, it uses more lines and takes more time

            Country cc = new Country("Nigeria", 932489, 6373.98);
            Country cc0 = new Country("UAE", 932489, 652);
            Country cc1 = new Country("Russia", 839282486, 5425245343.543);

            countries.add(cc);
            countries.add(cc0);
            countries.add(cc1);

            System.out.println("Country with largest area: " + findCountryWithLargestArea(countries).getName());
            System.out.println("Country with largest population: " + findCountryWithLargestPopulation(countries).getName());
            System.out.println("Country with largest population density: " + findCountryWithLargestPopulationDensity(countries).getName());
         */
    }
}
