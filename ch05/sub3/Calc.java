package sub3;

public class Calc {
	
		//싱글톤 객체
		private static Calc instence = new Calc();
		public static Calc getInstence() {
			return instence;
		}
		private Calc( ) {}
	
		public int plus(int x, int y) {
			return x + y;
		}
		public int minus(int x, int y) {
			return x - y;
		}
		public int multi (int x, int y) {
			return x * y;
		}
		public int div (int x, int y) {
			return x / y;
		}

		

}
