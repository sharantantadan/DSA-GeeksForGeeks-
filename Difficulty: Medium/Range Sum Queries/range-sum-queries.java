class Sol {

    static void updateValue(int arr[], long st[], int n, int index, int val) {
        int diff = val - arr[index];
        arr[index] = val;
        updateUtil(st, 0, n - 1, index, diff, 0);
    }

    static void updateUtil(long st[], int ss, int se, int index, int diff, int si) {
        if (index < ss || index > se) return;

        st[si] += diff;

        if (ss != se) {
            int mid = (ss + se) / 2;
            updateUtil(st, ss, mid, index, diff, 2 * si + 1);
            updateUtil(st, mid + 1, se, index, diff, 2 * si + 2);
        }
    }

    public static long getSum(long st[], int n, int l, int r) {
        return getSumUtil(st, 0, n - 1, l, r, 0);
    }

    static long getSumUtil(long st[], int ss, int se, int qs, int qe, int si) {
        // total overlap
        if (qs <= ss && qe >= se)
            return st[si];

        // no overlap
        if (se < qs || ss > qe)
            return 0;

        int mid = (ss + se) / 2;

        return getSumUtil(st, ss, mid, qs, qe, 2 * si + 1) +
               getSumUtil(st, mid + 1, se, qs, qe, 2 * si + 2);
    }
}