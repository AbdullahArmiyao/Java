package OOP.Sixth;

public class foodMain {
    public static void main(String[] args) {
        //Creating An Array Of Objects

        food[] refrigerator = new food[3];

        food food1 = new food("Pizza");
        food food2 = new food("Hotdog");
        food food3 = new food("Burger");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        System.out.println(refrigerator[0]);        //returns the address
        System.out.println(refrigerator[0].name);


        //but another way of doing this
        /*
            food[] refrigerator = {food1, food2, food3};
         */






    }
}
