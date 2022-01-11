import java.util.Scanner;

public class n2정렬 {
    static int N;
    static int[] numbs;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); //N개의 수를 입력 받는다
        numbs = new int[N];

        for (int i = 0; i < N; i++) {
            numbs[i] = sc.nextInt();
        }

//        numbs = selectionSort(numbs);//선택 정렬
        numbs = insertSort(numbs); //삽입 정렬
	//quickSort(numbs, 0, N - 1); // 퀵 정렬

        for (int num : numbs) {
            System.out.println(num);
        }
    }


    /**
     * 선택 정렬은 선형 탐색을 진행하면서 '가장 작은 데이터'를 선택하고
     * 그것을 맨 앞 데이터와 교환하는 방식이다.
     */
    private static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min_index = i; //가장 작은 원소의 인덱스
            for (int j = i + 1; j < nums.length; j++) {
                //작은 데이터를 선택함
                if (nums[min_index] > nums[j]) {
                    min_index = j;
                }
            }

            //i번째 수와 min의 위치를 바꿈
            int temp = nums[i];
            nums[i] = nums[min_index];
            nums[min_index] = temp;
        }

        return nums;
    }

    /**
     * 삽입 정렬은 해당 숫자가 들어갈 적절한 위치를 찾아서 옮기는 것이다.
     * 해당 숫자가 좌측 숫자보다 작으면 좌측으로 옮기고, 크다면 가만히 있는다.
     */
    private static int[] insertSort(int[] numbs) {

        for (int i = 1; i < numbs.length ; i++) {
            for (int j = i; j > 0 ; j--) {
                if(numbs[j] < numbs[j-1]){
                    int temp = numbs[j];
                    numbs[j] = numbs[j-1];
                    numbs[j-1] = temp;
                }
                else break;
            }
        }

        return numbs;
    }

/**
     * 퀵 정렬은 다음과 같이 진행된다.
     * 1.기준이 되는 피벗을 정한다. (주로 첫 원소)
     * 2.피벗 다음 원소를 left로 맨 마지막 원소를 right로 지정한다.
     * 3.left는 피벗보다 '큰 수'를 만날때까지 우측으로 진행한다. right는 피벗보다 '작은 수'를 만날 때 까지 좌측으로 진행한다.
     * 4.정해졌다면 left 와 right의 위치를 교환한다.
     * 5.만약 left 와 right가 만난다면 left와 피벗의 위치를 교환한다.
     * 6.피벗 기준으로 좌,우로 나눠진 각각의 집합에 대해서 퀵 정렬을 재귀적으로 수행한다.
     */

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int pivot = start;
        int left = start + 1;
        int right = end;

        while (left <= right) {
            while (left <= end && arr[left] <= arr[pivot]) left++;
            while (right > start && arr[right] >= arr[pivot]) right--;

            // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교환
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            //엇갈렸다면 작은 데이터와 피벗을 교환
            else {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }
        }

        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }
}
