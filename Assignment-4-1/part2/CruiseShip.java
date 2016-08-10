//Hua Xia 
//CIS 35A 
//Assignment 3
//Due Date: May 9
//Submit Date: May 9
public class CruiseShip extends Ship
{
    int maxPassengers;//set the max passengers

    public CruiseShip(String newName, String newYear, int newMaxPassengers)
    {
        super(newName, newYear);//get the value from the ship.calss
        maxPassengers = newMaxPassengers;//assign different value
    }

    public void setNumPassengers(int newMaxPassengers)
    {
        this.maxPassengers = newMaxPassengers;
    }

    public int getNumPassengers()
    {
        return this.maxPassengers;
    }

    public String toString()//print the information collected from above
    {
        return ("Cruise Ship: " + super.getShipName() + " - # Passengers: " +
                this.maxPassengers);
    }
}