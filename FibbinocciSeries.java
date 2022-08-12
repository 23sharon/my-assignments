package week1.day2;

public class FibbinocciSeries {
	static void Fibonacci(int N)
	{
		int num1 = 0, num2 = 1;
		int sum =0;
		int i = 0;

		while (i < N) 
		{
			System.out.print(num1+" ");
			sum = num2 + num1;
			num1 = num2;
			num2 = sum;
			i = i + 1;
		}
	}

	public static void main(String args[])
	{
		int N = 11;
		Fibonacci(N);
	}
}

