public class HelloWorld2 {
	public static void main (String[] args) {
		float goldPoint = 0.618f;
		float cache = 30f;
		float result;
		float I = 0;
		float J = 0;
		for (int i = 1; i < 21; i++) {
			for(int j = 1; j < 21; j++) {
				if (0 == i % 2 && 0 == j % 2) {
					continue;
				}
				result = Math.abs((float)i / j - goldPoint);
				if (result < cache) {
					cache = result;
					I = i;
					J = j;
					System.out.println("20以内两个数相除,最接近黄金分割点的是: " + I + "/" + J + ",值为:" + (cache + goldPoint));
					System.out.println("result = " + result);
				}
			}
		}
		System.out.println("20以内两个数相除,最接近黄金分割点的是: " + I + "/" + J + ",值为:" + (I / J));
	}
}