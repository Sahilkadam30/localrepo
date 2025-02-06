public class averageofarray {
    public static void main(String[] args) {
        int[] arr={10,7,65,2,84,15,2,8,9,78,19,1};
        int count=0;
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            count++;
        }

        int result=sum/count;
        System.out.println(result);

    }
}
