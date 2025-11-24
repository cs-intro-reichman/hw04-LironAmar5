public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[] arr = new boolean[ n + 1];
        for (int i = 2; i < n + 1; i++) {
            arr[i] = true;
        }
        int i = 2;
        while (i <= Math.sqrt(n)){
            for (int j = i + 1; j < arr.length; j++) {
                if( j % i == 0)
                    {
                        arr[j] = false;
                    }
            }
             i++;
        }
        int count = 0;
        System.out.println("Prime numbers up to " + n +":");
        for (int k = 2; k < arr.length; k++) {
            if( arr[k] == true)
                {
                    System.out.println( k );
                    count++;
                }
        }
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (int)(((double)count / (double)n) * 100) + "% are primes)");
    }

    public static int bindex(boolean[] a, int from){
        for (int i = from; i < a.length; i++) {
            if(a[i] == true)
                {
                    return i;
                }
        }
        return -1;
    }
}