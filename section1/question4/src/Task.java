import org.graalvm.compiler.nodes.calc.IntegerTestNode;

public class Task {
	public String convertIntegerToBinaryString(int decimalNumber) {
		int rem=0;
		int bin=0;
		int i=1;
		while (decimalNumber>0){
			rem=decimalNumber%2;
			bin=bin+rem*i;
			i=i*10;
			decimalNumber=decimalNumber/2;
		}
		String bin1=String.valueOf(bin);
		return bin1;
	}
}