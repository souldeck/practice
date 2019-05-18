package tj;

public class practice {
	public static int[] calculate(int numbers) {
		int[] result = new int[9];
		result[0] = numbers * 1;
		result[1] = numbers * 2;
		result[2] = numbers * 3;
		result[3] = numbers * 4;
		result[4] = numbers * 5;
		result[5] = numbers * 6;
		result[6] = numbers * 7;
		result[7] = numbers * 8;
		result[8] = numbers * 9;
		return result;
	}
	
	public static void main(String[] args) {
		int[] result = calculate(2);
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		System.out.println(result[3]);
		System.out.println(result[4]);
		System.out.println(result[5]);
		System.out.println(result[6]);
		System.out.println(result[7]);
		System.out.println(result[8]);
		
		}
	}
			
		