class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l1=new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            l1.add(generateRow(i));
        }
        return l1;

    }
    private List<Integer> generateRow(int row){
        int ans=1;
        List<Integer> l1=new ArrayList<>();
        l1.add(1);

        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            l1.add(ans);
        }
        return l1;
    }
}