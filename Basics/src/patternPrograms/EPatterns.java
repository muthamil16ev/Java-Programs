package patternPrograms;

public class EPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1||i==3||j==1||i==5) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
