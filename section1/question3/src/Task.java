import java.lang.Math;
public class Task {
	public double calculateAreaOfPolygon(int numberOfSides, double lengthOfOneSide) {
		double area=(numberOfSides*(lengthOfOneSide*lengthOfOneSide)/(4.0*Math.tan(Math.PI/numberOfSides)));
		return area;
	}
}