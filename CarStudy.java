
class Car{
    String name;
    String colour;
    int year;
    int maxspeed;
    void accleration(){
        System.out.println("car is acclerating");
    }
}
public class CarStudy{
    public static void main(String[] args){
    Car polo = new Car();
    System.out.println(polo.name);
    System.out.println(polo.colour);
    System.out.println(polo.year);
    System.out.println(polo.maxspeed);

    polo.name = "polo";
    polo.colour= "Red";
    polo.year= 2016;
    polo.maxspeed= 120;

    System.out.println(polo.name);
    System.out.println(polo.colour);
    System.out.println(polo.year);
    System.out.println(polo.maxspeed);


    }
}