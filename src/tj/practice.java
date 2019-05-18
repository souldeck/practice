package tj;

public class practice {
	public static void main(String[] args) {
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			//배열 9개를 돌릴 것이다.
			result[i] = 2 * (i + 1);
			//result[0]~result[9]까지의 배열에 계산값을 저장
			System.out.println(result[i]);
		}
	}
}