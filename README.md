### Insertion Sort
- 정렬되지 않은 원소를 적절한 위치에 삽입하는 알고리즘.

### 삽입 정렬의 방법 
 초기 상태 : [1,4,3,8,6]
1. [1,4,3,8,6]
- 1은 정렬이 됐다고 생각하고 4부터 우선권을 가져 4와 1과 비교하여 더 작은 숫자인 1이 왼쪽으로 삽입된다.

2. [1,3,4,8,6]
- 다음 우선권인 3은 4와 비교하여 우선권(3)이 더 작으므로 왼쪽으로 삽입되고 우선권(3)이 1보다 크므로  다시 본인의 자리로 돌아온다.

3. [1,3,4,8,6]
- 다음 우선권인 8은 4와 비교하여 우선권(8)이 더 크므로 다시 본인의 자리로 돌아온다.

4. [1,3,4,6,8]
- 다음 우선권인 6은 8과 비교하여 우선권(6)이 더 작으므로 왼쪽으로 삽입되고 우선권(6)이 4보다 크므로 다시 본인의 자리로 돌아간다.

### Code
 void insertion Sort(int arr, int size) {
     int i, j, temp;
     for(i = 1; i < size; i++) {
       temp = arr[i];
      for(j = i; j > 0 && arr[j-1] > temp : j -1) {
        arr[j] = arr[j-1];
           arr[j] = temp;
           }
         }
      }
