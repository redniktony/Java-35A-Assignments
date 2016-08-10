//Hua Xia 
//CIS 35A 
//Assignment 3
//Due Date: May 2
//Submit Date: May 2

// ----------getter and setters-------
// set sales for the entire week
// (float [])get sales for entire week(int week)
// set sales for the weekday intersection
// float get sale for weekday intersection(int week, int day,float sale)
// -------- business method-----------
// a. total sales for week
// b. average sales for week
// c. total sales for all weeks
// d. average weekly sales
// e. week with highest sale amt
// f. week with lowest sale amt
// -----------analyze------------
// analyze results //call a through f (a -f means everystore)
// ---------------Print-----------------
// print() already done!!!!maybe

public class Store {// By using the 1 store for the data by giving the example
	private float salesbyweek[][];// This size can be passed by the constructor
	// 1st # for the week 2nd # for the day

	Store() {
		salesbyweek = new float[5][7];
	}

	// getter and setters
	// set sale for weekday intersection (int week, int day, float sale)
	public void setsaleforweekdayintersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}

	/*
	 * This function is use for print the data captured in the text file 1
	 */
	public void printdata() {
		System.out.println("\tThis is sales by days in each weeek ");
		System.out.println("==========================================================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("==========================================================\n\n");
	}

	// 1
	public void totalSales() {
		float sumForEachWeek = 0;
		System.out.println("-----------------------------------------------------------------");
		System.out.println("The total sales for each week: ");
		for (int b = 0; b < 5; b++) {
			for (int a = 0; a < 7; a++) {
				sumForEachWeek = salesbyweek[b][a] + sumForEachWeek;
			}
			System.out.printf(sumForEachWeek + " ");
			sumForEachWeek = 0;
		}
		System.out.println("\n-----------------------------------------------------------------");
		System.out.print("\n\n\n");

	}

	/*
	 * for (int i = 0; i < 5; i++) { for (int j = 0; j < 7; j++) {
	 * System.out.print(salesbyweek[i][j] + " "); } System.out.println(""); }
	 */
	// 2
	public void dailySale() {
		float sum = 0;
		float avgSaleDaily = 0;
		System.out.println("-----------------------------------------------------------------");
		System.out.println("The average daily sales for each week:");
		for (int bb = 0; bb < 5; bb++) {
			for (int aa = 0; aa < 7; aa++) {
				sum = salesbyweek[bb][aa] + sum;
				avgSaleDaily = sum / 7;
			}
			System.out.printf(avgSaleDaily + " ");
			avgSaleDaily = 0;
		}
		System.out.println("\n-----------------------------------------------------------------");
	}

	// 3
	public void totalSaleWeek() {
		float totalSale = 0;
		System.out.println("-----------------------------------------------------------------");
		System.out.println("The total sales for all the weeks:");
		for (int bbb = 0; bbb < 5; bbb++) {
			for (int aaa = 0; aaa < 7; aaa++) {
				totalSale = salesbyweek[bbb][aaa] + totalSale;
			}
		}
		System.out.printf(totalSale + "");
		System.out.println("\n-----------------------------------------------------------------");
	}

	// 4
	public void averagePerWeek() {
		float totalMoney = 0;
		float avgSaleWeekly = 0;
		System.out.println("-----------------------------------------------------------------");
		System.out.println("The average weekly sales:");
		for (int bbbb = 0; bbbb < 5; bbbb++) {
			for (int aaaa = 0; aaaa < 7; aaaa++) {
				totalMoney = salesbyweek[bbbb][aaaa] + totalMoney;
				avgSaleWeekly = totalMoney / 5;
			}
		}
		System.out.printf(avgSaleWeekly + "");
		System.out.println("\n-----------------------------------------------------------------");
	}

	// 5
	public void highestSaleWeek() {
		float weeklySale[];
		weeklySale = new float[5];
		System.out.println("-----------------------------------------------------------------");
		float totalSaleEveryWeek = 0;
		System.out.println("The week with the highest amount in sales:");
		for (int bbbbb = 0; bbbbb < 5; bbbbb++) {
			for (int aaaaa = 0; aaaaa < 7; aaaaa++) {
				totalSaleEveryWeek = salesbyweek[bbbbb][aaaaa] + totalSaleEveryWeek;
			}
			weeklySale[bbbbb] = totalSaleEveryWeek;
			totalSaleEveryWeek = 0;
		}

		float highest = weeklySale[0];

		for (int c = 0; c < 5; c++) {
			if (highest <= weeklySale[c]) {
				highest = weeklySale[c];
			}
		}
		System.out.println(highest);
		System.out.println("\n-----------------------------------------------------------------");
	}

	// 6
	public void lowestSaleWeek() {
		float weeklySale[];
		weeklySale = new float[5];
		System.out.println("-----------------------------------------------------------------");
		float totalSaleEveryWeek = 0;
		System.out.println("The week with the lowest amount in sales:");
		for (int bbbbb = 0; bbbbb < 5; bbbbb++) {
			for (int aaaaa = 0; aaaaa < 7; aaaaa++) {
				totalSaleEveryWeek = salesbyweek[bbbbb][aaaaa] + totalSaleEveryWeek;
			}
			weeklySale[bbbbb] = totalSaleEveryWeek;
			totalSaleEveryWeek = 0;
		}

		float lowest = weeklySale[0];

		for (int c = 0; c < 5; c++) {
			if (lowest >= weeklySale[c]) {
				lowest = weeklySale[c];
			}
		}
		System.out.println(lowest);
		System.out.println("\n-----------------------------------------------------------------");
	}

}
