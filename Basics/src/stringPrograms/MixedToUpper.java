package stringPrograms;

public class MixedToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Ra  m";
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'A' && c[i] <= 'Z') {
				System.out.print(c[i]);
			}
			else{
				System.out.print((char) (c[i] - 32));
			}
		}
	}

}
