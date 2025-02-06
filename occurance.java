public class occurance {
    public static void main(String[] args) {
        int[] arr={2,4,5,8,8,7,1,5,2,4,1,2,2};
        int target=2;
        search(arr,target);
    }

    static void search(int[] arr,int target){
       int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}
