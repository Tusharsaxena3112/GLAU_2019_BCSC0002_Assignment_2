public class Task {
	// TODO write your method here and delete this line afterwards!
    public double maximumOfThreeNumbers(double num1,double num2,double num3){
        if(num1>num2 && num1>num3){
            return num1;
        }
        else if(num2>num1&&num2>num3){
            return num2;
        }
        else {
            return num3;
        }
    }
}