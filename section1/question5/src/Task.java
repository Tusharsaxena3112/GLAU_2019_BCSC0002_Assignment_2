import java.lang.reflect.Array;
import java.util.Arrays;

public class Task {
	public String convertIntegerToBinaryStringWithAddedBits(int decimalNumber) {
		int[] arr = {0, 0, 0, 0, 0, 0, 0, 0};
		int rem = 0;
		for (int i = 0; i <= 7; i++) {
			if (decimalNumber > 0) {
				arr[i] = decimalNumber % 2;
				decimalNumber=decimalNumber/2;
			}
		}
		String bin="";
		for (int i=0;i<=7;i++){
			bin=bin+String.valueOf(arr[i]);
		}
		char[] result = bin.toCharArray();
		String bin3="";
		for (int i = result.length-1; i>=0; i--)
			bin3=bin3+result[i];
		return bin3;
	}
}