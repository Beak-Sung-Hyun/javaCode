import java.util.Scanner;

public class randomAverage {
	
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[100];
		
		for (int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100 + 1);
			//Math.random�� 0���� 1������ �Ǽ��� �������� ��ȯ�Ѵ�.
			//�� Math.random()���� �Ǽ��� ��ȯ��Ų �� 100�� ���ϰ� 1�� ���ϸ� 1���� 100 ������ ���ڸ� �������� ��ȯ�ϰ� �ȴ�.
			//(int)�� �� ��ȯ�� �����ν� ���������� �ٲپ��ش�.
		}
		
		int result = 0;
		for (int i = 0; i < 100; i++) {
			result += array[i];
		}
		
		System.out.print("�������� ��ȯ�� ��: ");
		for (int i = 0; i < 100; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		int average = result / 100;
		System.out.println("���: " + average);
	}
}
