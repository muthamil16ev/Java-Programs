package stringPrograms;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aazr";
		char c[] = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[i] = s.charAt(i);
		}
		abc: for (int i = 0; i < c.length; i++) {
			int count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count = count + 1;
					c[j] = ' ';
				}
				if (count == 1 && c[i] != ' ') {
					System.out.println(c[i] + "---->" + count);
					break abc;
				}
			}
		}
	}

}
