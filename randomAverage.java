import java.util.Scanner;

public class randomAverage {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[100];
		
		for (int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
			//Math.random은 0부터 1이하의 실수를 랜덤으로 반환한다.
			//즉 Math.random()으로 실수를 반환시킨 후 100을 곱하고 1을 더하면 1부터 100 사이의 숫자를 랜덤으로 반환하게 된다.
			//(int)로 형 변환을 함으로써 정수형으로 바꾸어준다.
		}
		
		int result = 0;
		for (int i = 0; i < 100; i++) {
			result += array[i];
		}
		
		System.out.print("랜덤으로 반환된 수: ");
		for (int i = 0; i < 100; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		int average = result / 100;
		System.out.println("평균: " + average);
	}
}
