class Solution {
    private void findSubset(int index, int[] arr, List<List<Integer>> ans, List<Integer> l1){
        if(index==arr.length){
            ans.add(new ArrayList<>(l1));
            return;
        }

        l1.add(arr[index]);
        findSubset(index+1,arr,ans,l1);
        l1.remove(l1.size()-1);
        findSubset(index+1,arr,ans,l1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findSubset(0,nums,ans,new ArrayList<>());
        return ans;
    }
}