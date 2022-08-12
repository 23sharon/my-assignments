package week1.day2;

public class Calculator {
	public int addNumbers() {
		
		int num1=20;
		int num2=19;
		int num3=9;
		int num4=num1+num2+num3;
		return num4;
		}
	public int subNumbers() {
		int num1=34;
		int num2=24;
		int num3=num1-num2;
		return num3;
	}
	public int mulNumbers() {
		int num1=10;
		int num2=24;
		int num3=num1*num2;
		return num3;
	}
	public float divNumbers() {
		int num1=57;
		int num2=7;
		int num3=num1/num2;
		return num3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator operations = new Calculator();
		int addition=operations.addNumbers();
		int subtraction=operations.subNumbers();
		int multiply=operations.mulNumbers();
		float division=operations.divNumbers();
		System.out.println("Addition result:"+addition);
		System.out.println("Subtratcion result:"+subtraction);
		System.out.println("Multiplication result:"+multiply);
		System.out.println("Division result:"+division);

	}

}

		