package sub2;

/*
 * 날짜 : 2024/07/16
 * 이름 : 강유정
 * 내용 : 자바 StringBuilder 클래스 실습하기
 */
public class StringBuilderTest {
	
	public static void main(String[] args) {
		
		//String 불변(immutable) 문자열
		String str = "Java";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		str += "Programing";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		System.out.println("str : " + str);
		
		// String의 불변 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java");
		
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		sb.append("Programing");
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		System.out.println("sb : " + sb);
	}

}
