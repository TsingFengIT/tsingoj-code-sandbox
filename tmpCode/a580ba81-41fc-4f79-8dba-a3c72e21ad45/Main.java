public class Main {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        int[] ints = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            ints[i - 1] = Integer.parseInt(args[i]);
        }
        System.out.println(new Main().maximumScore(ints, k));
    }

    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            while (!st.isEmpty() && x <= nums[st.peek()]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        int[] right = new int[n];
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            int x = nums[i];
            while (!st.isEmpty() && x <= nums[st.peek()]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int h = nums[i];
            int l = left[i];
            int r = right[i];
            if (l < k && k < r) {
                ans = Math.max(ans, h * (r - l - 1));
            }
        }
        return ans;
    }
}