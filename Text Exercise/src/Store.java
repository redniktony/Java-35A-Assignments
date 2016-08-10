
public class Store {
	private float salesbyweek[][];
	Store() {
		salesbyweek = new float[5][7];	
	}
	//getter and setters
	 	//setsaleforweekdayintersection(int week, int day, float sale)
		public void setsaleforweekdayintersection(int week, int day, float sale){
			salesbyweek[week][day]=sale;
		}
	 	//float [] getsalesforentireweek(int week)
		//float getsaleforweekdayintersection(int week, int day)
	//businessmethod
		//a. totalsalesforweek 
		//b. avgsalesforweek
		//c. totalsalesforallweeks
		//d. averageweeklysales
		//e. weekwithhighestsaleamt
		//f. weekwithlowestsaleamt
		//analyzeresults //call a through f
		//print()
}
