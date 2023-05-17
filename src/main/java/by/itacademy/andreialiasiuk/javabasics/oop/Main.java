package by.itacademy.andreialiasiuk.javabasics.oop;

public class Main {
    public static void main(String[] args) {
        House house1 = new House();
        house1.door.manufacturer = "ZOV";
        house1.door.color = "White";
        house1.door.material = "Solid wood";
        house1.door.price = 150;
        house1.door.type = "Interior";

        house1.window.color = "Black";
        house1.window.manufacturer = "Terazit";
        house1.window.material = "Vinyl";
        house1.window.price = 175;
        house1.window.shape = "Rectangular";
    }

}
