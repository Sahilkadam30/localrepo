public class primesum {
    public static void main(String[] args) {
      
        int sum=0;
        for (int i = 2; i <=20; i++) {
            if (isprime(i)) {
                sum=sum+i;
            }
        }
        System.out.println("sum of number is: "+sum);
    }

    static boolean isprime(int num){
        if (num<=1) {
            return false;
        }
        for (int j = 2; j <=Math.sqrt(num); j++) {
            if (num%j==0) {
                return false;
            }
        }
        return true;
    }

}
