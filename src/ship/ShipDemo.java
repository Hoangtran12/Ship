/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ship;
public class ShipDemo {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        
        ships[0] = new Ship("The Titanic", "1912");
        ships[1] = new CruiseShip("The Love Boat", "1977", 2000);
        ships[2] = new CargoShip("The Black Pearl", "1700", 5000);
        
        for (int i = 0; i < ships.length; i++) {
            System.out.println(ships[i].toString());
        }
    }
}
