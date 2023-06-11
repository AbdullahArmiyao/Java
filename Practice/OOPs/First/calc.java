package Practice.OOPs.First;

public class calc {
    double len;
    double wid;
    double hig;
    double rad;
    double num;

    /*
    calc(double len, double wid, double hig, double rad) {
        this.len = len;
        this.wid = wid;
        this.hig = hig;
        this.rad = rad;
    }
     */

    //Quadrilaterals
    calc(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }
    calc(double len, double wid, double hig, double num) {
        this.len = len;
        this.wid = wid;
        this.hig = hig;
    }

    //Circle
    calc(double rad) {
        this.rad = rad;
    }
    calc(double rad, double num, double num2, double num3, double num4, double num5) {
        this.rad = rad;
    }
    //Cylinder

    calc(double rad, double hig, double num) {
        this.rad = rad;
        this.hig = hig;
        this.num = num;
    }
    calc(double rad, double hig, double num,double num2, double num3 ) {
        this.rad = rad;
        this.hig = hig;
        this.num = num;
    }

    double area_of_quadrilateral(double len, double wid){return len*wid;}
    double volume_of_quadrilateral(double len, double wid, double hig){return len*wid*hig;}
    double circle_area(double rad){
        return 3.14 * Math.pow(rad, 2);
    }
    double volume_of_sphere(double rad){
        return ((double) 4 /3)*3.14*Math.pow(rad, 3);
    }
    double cylinder_area(double rad, double hig){
        return (2*3.14*rad*hig)+(2*3.14*Math.pow(rad, 2));
    }
    double cylinder_volume(double rad, double hig){return (3.14 * Math.pow(rad, 2))*hig;}

    
    
}
