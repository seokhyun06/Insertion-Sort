import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int [] arr = {4,3,5,1,2}; // �迭�� 
		
		System.out.println("�ʱ� �迭�� : " + Arrays.toString(arr)); // �ʱ� �迭�� ���
		for(int i = 1; i < arr.length; i++) { // �迭�� ���� -1 ��ŭ �ݺ�
			for(int j = i; j > 0; j--) { // �迭�� ��ȣ
				if(arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("�������ĵ� �迭�� : " + Arrays.toString(arr)); // �������ĵ� �迭�� ���
	}

}
