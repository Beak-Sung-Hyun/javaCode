import java.util.Scanner;

public class array {

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ���:");
		int arraySize = scanner.nextInt();
		int[] array = new int[arraySize];
		
		for (int i = 0; i < arraySize; i++) {
			System.out.print("���� �Է��ϼ���: ");
			array[i] = scanner.nextInt();
		}
		
		System.out.print("�Էµ� ��: ");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		int result = -1;
		for (int i = 0; i < arraySize; i++) {
			result = max(array[i], result);
		}
		System.out.println("�ִ밪: " + result);
	}
}
