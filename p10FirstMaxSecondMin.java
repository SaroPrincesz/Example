public class p10FirstMaxSecondMin{
    public static void main(String[] args) {
//User Input
        int[] arr = {3, 1, 4, 2, 5};   //Expected output:  {4, 1, 3, 2}  {5, 1, 4, 2, 3}
//Selection sort
        int index = 0;
        int temp = 0;
            for(int i=0; i<arr.length; i++){
                index = i;
                for(int j = i+1; j< arr.length; j++){
                    if(arr[j] < arr[index]){
                        index = j;
                    }
                }
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
//Print the sorted Array
        for(int i: arr) System.out.print(i + " "); System.out.println();

            int[] outArr = new int[arr.length];
            int max=arr.length-1;
            int min = 0;
            for(int i=0; i<arr.length; i++){
                if(i%2==0){
                    outArr[i] = arr[max--];
                }else{
                    outArr[i] = arr[min++];
                }
            }


//Print the output Array
        for(int i: outArr) System.out.print(i + " "); System.out.println();

    }
}