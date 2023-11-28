/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ship;
public class CargoShip extends Ship {
    private int cargoCapacity;
    
    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }
    
    public int getCargoCapacity() {
        return cargoCapacity;
    }
    
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    
    public String toString() {
        return "Name: " + getName() + " Cargo Capacity: " + cargoCapacity + " tons";
    }
}
