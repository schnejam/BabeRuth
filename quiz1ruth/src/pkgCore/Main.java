package pkgCore;

public class Main {

	public static void main(String[] args) {
		Baseball_Stats Test1 = new Baseball_Stats();
		
		System.out.println("Batting Average: " + Test1.BattingAverage());
		System.out.println("On Base Percentage: " + Test1.OnBasePercent());
		System.out.println("Slugging Percentage: " + Test1.Slugging());
		System.out.println("On Base + Slugging Percentage: " + Test1.OnBaseSlug());
		System.out.println("Total Bases: " + Test1.TotalBases());
	}

}
