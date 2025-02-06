public class reversearray {
    public static void main(String[] args) {
        int[] arr= {10,20,50,70,89,56,84,15,14};

        reversearrayx(arr);
        for (int num : arr) {
            System.out.println(num + " ");
        }

    }

    public static void reversearrayx(int[] arr){
        int start=0;
        int last=arr.length-1;
        int temp;
        while (start<last) {
            temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;
            last--;
        }
    }
}
