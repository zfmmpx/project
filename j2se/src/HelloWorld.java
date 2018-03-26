public class HelloWorld{
	public static void main(String[] args) {
		
		// ´òÓ¡µ¥Êý
		ol:
			for (int i = 0; i < 10; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.println(i + ":" + j);
					if(0 == j % 2)
						break ol;
				}
			}
	}
}