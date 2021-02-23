import java.util.Scanner;

public class array {

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요:");
		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize];
		
		for (int i = 0; i < arraySize; i++) {
			System.out.print("값을 입력하세요: ");
			array[i] = scanner.nextInt();
		}
		
		System.out.print("입력된 값: ");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		int result = -1;
		for (int i = 0; i < arraySize; i++) {
			result = max(array[i], result);
		}
		System.out.println("최대값: " + result);
	}
}
