public class Nine {
    public static void main(String[] args) {
        System.out.println("maximum value : " + maxElement(2, 3, 4, 5, 9, 10, 21, 32, 43, 45, 34, 23));
    }

    static int maxElement(int... nums) {
        int ans = Integer.MIN_VALUE;
        for (int num : nums) {
            ans = Math.max(ans, num);
        }
        return ans;
    }
}

