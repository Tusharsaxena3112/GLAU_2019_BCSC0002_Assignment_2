import org.graalvm.compiler.nodes.calc.IntegerTestNode;

public class Task {
	public String convertIntegerToBinaryString(int decimalNumber) {
		int rem=0;
		int bin=0;
		while (decimalNumber>0){
			rem=decimalNumber%2;
			bin=bin*10+rem;
		}
		rem=0;
		int bin1=0;
		while(bin>0){
			rem=bin%10;
			bin1=bin1*10+rem;
		}
		String bin2=String.valueOf(bin1);
		return bin2;
	}
}