class Solution {
    public static int nCr(int n, int r) {
        long res = 1;
        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }
    public List<Integer> getRow(int rowIndex) {
        rowIndex+=1;
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=rowIndex; i++){
            list.add(nCr(rowIndex-1, i-1));
        }
        return list;
    }
}