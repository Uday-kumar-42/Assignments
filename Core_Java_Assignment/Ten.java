import java.util.ArrayList;
import java.util.List;

public class Ten {
    public static void main(String[] args) {
        List<Integer> commonFactors = getCommonFactors(4,12,124,196);
        System.out.println(commonFactors.toString());
    }

    static List<Integer> getCommonFactors(int... nums) {
        List<Integer> commonFactors = new ArrayList<>();
        int n = nums.length;

        // check whether a single element is passed
        // actual factors will be the common foctors of the number
        if (n == 1) {
            int num = nums[0];
            for(int i = 1;i <= (n/2);i++){
                if(num%i == 0){
                    commonFactors.add(i);
                }
            }
            return commonFactors;
        }

        int gcd = nums[0];
        for (int i = 0; i < n; i++) {
            gcd = findGCD(gcd, nums[i]);
            // if at any point the GCD becomes 1 i.e. there is no common factor for the
            // numbers until current number except "1"
            if (gcd == 1) {
                break;
            }
        }

        // after findind the GCD of the those numbers i.e. we got the Highest common
        // factor for those numbers.Therefore all common factors will be less than GCD
        for(int i = 1;i <= gcd;i++){
            boolean flag = true;
            for(int j = 0;j < n;j++){
                if(nums[j]%i != 0){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                commonFactors.add(i);
            }
        }

        return commonFactors;
    }

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
