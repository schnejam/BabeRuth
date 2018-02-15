package pkgCore;
import java.util.Scanner;

public class Baseball_Stats {
	Scanner input = new Scanner (System.in); 
	private int ab, h, dub, trip, hr, r, bb, s, hbp;
	
	public Baseball_Stats() {
		System.out.println("Enter Player's At Bats.");
		ab = input.nextInt();
		System.out.println("Enter Players's Hits.");
		h = input.nextInt();
		System.out.println("Enter Player's Doubles.");
		dub = input.nextInt();
		System.out.println("Enter Player's Triples.");
		trip = input.nextInt();
		System.out.println("Enter Player's Home Runs.");
		hr = input.nextInt();
		System.out.println("Enter Player's Runs.");
		r = input.nextInt();
		System.out.println("Enter Player's Walks.");
		bb = input.nextInt();
		System.out.println("Enter PLayer's Sacrafice Flys.");
		s = input.nextInt();
		System.out.println("Enter Number of Hits by Pitch.");
		hbp = input.nextInt();
	}
	
	public Baseball_Stats(int ab, int h, int dub, int trip, int hr, int r, int bb, int s, int hbp) {
		super();
		this.ab = ab;
		this.h = h;
		this.dub = dub;
		this.trip = trip;
		this.hr = hr;
		this.r = r;
		this.bb = bb;
		this.s = s;
		this.hbp = hbp;
	}

	public int getAb() {
		return ab;
	}

	public void setAb(int ab) {
		this.ab = ab;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getDub() {
		return dub;
	}

	public void setDub(int dub) {
		this.dub = dub;
	}

	public int getTrip() {
		return trip;
	}

	public void setTrip(int trip) {
		this.trip = trip;
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getBb() {
		return bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
	
	public int getHbp() {
		return hbp;
	}
	
	public void setHbp(int hbp) {
		this.hbp = hbp;
	}

	
	
	public double BattingAverage() {
		double batavg = (double)this.h / this.ab;
		return batavg;
	}
	
	public double OnBasePercent() {
		double onbaseperc = ((double)this.h + this.bb + this.hbp)/(this.ab + this.bb + this.hbp + this.s);
		return onbaseperc;
	}
	
	public double Slugging() {
		double slugg = TotalBases() / this.ab; 
		return slugg;
	}
	
	public double OnBaseSlug() {
		double obs = Slugging() + OnBasePercent();
		return obs;
	}
	
	public double TotalBases() {
		double totbase = (double) this.h + this.dub + (this.trip * 2) + (this.hr * 3);
		return totbase;
	}
}
