package by.itacademy.andreialiasiuk.javabasics.oop;

public class Main {
    public static void main(String[] args) {
        Window window = new Window();
        window.color = "Black";
        window.manufacturer = "Terazit";
        window.material = "Vinyl";
        window.price = 175;
        window.shape = "Rectangular";
        window.quantity = 25;

        Door door = new Door();
        door.manufacturer = "ZOV";
        door.color = "White";
        door.material = "Solid wood";
        door.price = 150;
        door.type = "Interior";
        door.quantity = 10;


        House house = new House();
        house.setWindow(window);
        house.setDoor(door);

    }

}
