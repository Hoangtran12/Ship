/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ship;
public class CruiseShip extends Ship {
    private int maxPassengers;
    
    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }
    
    public int getMaxPassengers() {
        return maxPassengers;
    }
    
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    
    public String toString() {
        return "Name: " + getName() + " Max Passengers: " + maxPassengers;
    }
}