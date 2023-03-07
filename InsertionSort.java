import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int [] arr = {4,3,5,1,2}; // 배열방 
		
		System.out.println("초기 배열방 : " + Arrays.toString(arr)); // 초기 배열방 출력
		for(int i = 1; i < arr.length; i++) { // 배열방 길이 -1 만큼 반복
			for(int j = i; j > 0; j--) { // 배열방 번호
				if(arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("삽입정렬된 배열방 : " + Arrays.toString(arr)); // 삽입정렬된 배열방 출력
	}

}
