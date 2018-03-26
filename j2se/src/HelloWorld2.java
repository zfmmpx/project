public class HelloWorld2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			boolean breakout = false;
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ":" + j);
				if (0 == j % 2) {
					breakout = true;
					break;
				}
			}
			if(breakout)
				break;
		}
	}
}