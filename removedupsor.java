//remove duplicates from sorted array
public class removedupsor {
    public static void main(String[] args) {
        int[] arr = {2,4,5,5,9,11,15,15,17,19,22,22,44,70,70};
        int length=removedup(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
       
    }

    public static int removedup(int[] arr){
        int index=0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[index]){
                index++;
                arr[index]=arr[i];
            }
        }

        return index +1;

    }
}
