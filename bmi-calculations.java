import java.util.*;
public class Main
{
    public static int BMI(int weight,double height){
        double h=Math.pow(height,2);
        double bmi=weight/h;
        if(bmi<18){
            return 0;
        }
        else if(bmi>=18 && bmi<25) {
            return 1;
        } else if(bmi>=25 && bmi<30){
            return 2;
        } else if(bmi>=30 && bmi<40) {
            return 3;
        } else {
            return 4;
        }
    }
	public static void main(String[] args) {
	    int weight=42;
	    double height=1.54;
		System.out.println(BMI(weight,height));
	}
}
