package arrayPrograms;

public class AverageOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 2, 4, 5, 6 };
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum/a.length);
	}
	}
