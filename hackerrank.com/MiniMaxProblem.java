public class MiniMaxProblem{

public static void main(String ar[]){

int arr[] = new int[]{1,2,3,4,5};
long currSum = 0;
        long min = 0;
        long max = 0;
        long sumArr[] = new long[arr.length];
        for(int i=0;i<arr.length;i++){
            long temp = arr[i];
            for(int j=0;j<arr.length;j++){
                if(arr[j] != temp){
                    currSum = currSum + arr[j];
                }
            }
            sumArr[i] = currSum;
	currSum = 0;
        }
	long temp2 = 0;
        for(int i=0;i<sumArr.length;i++){
            for(int j=i+1;j<sumArr.length;j++){
	if(sumArr[i]>sumArr[j]){
                temp2= sumArr[i];
	     sumArr[i] = sumArr[j];
	     sumArr[j] = temp2;
            }
	}
        }
	min = sumArr[0];
        for(int i=0;i<sumArr.length;i++){
	for(int j=i+1;j<sumArr.length;j++){
	if(sumArr[i]<sumArr[j]){
                temp2 = sumArr[j];
	     sumArr[j] = sumArr[i];
	     sumArr[i] = temp2;
            }
	}
        }
max = sumArr[0];
        System.out.println(min+" "+max);

}
}