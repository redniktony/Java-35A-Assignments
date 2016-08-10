//Hua Xia 
//CIS 35A 
//Assignment 3
//Due Date: May 9
//Submit Date: May 9
public class CargoShip extends Ship
{
    private int tonnage;

    public CargoShip(String newName, String newYear, int newTonnage)
    {
        super(newName, newYear);//get the value from the ship.calss
        this.tonnage = newTonnage;//assign different value
    }

    public void setCargoCapacity(int newTonnage)
    {
        this.tonnage = newTonnage;
    }

    public int getCargoCapacity()
    {
        return this.tonnage;
    }

    public String toString()//print the information collected from above
    {
        return ("Cargo Ship: " + super.getShipName() + " - tonnage: " + this.tonnage);
    }
}