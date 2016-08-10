//Hua Xia 
//CIS 35A 
//Assignment 3
//Due Date: May 9
//Submit Date: May 9
public class Ship
{
    private String name;//name to built 
    private String year;//year to built 

    public Ship(String newName, String newYear)
    {
        this.name = newName;
        this.year = newYear;
    }

    public void setShipName(String newName)
    {
        this.name = newName;
    }

    public void setYearBuilt(String newYear)
    {
        this.year = newYear;
    }

    public String getShipName()
    {
        return this.name;
    }

    public String getYearBuilt()
    {
        return this.year;
    }

    public String toString()//This function is to print the information 
    {//collected from above
        return ("Ship: " + this.name + " - Built: " + this.year);
    }
}