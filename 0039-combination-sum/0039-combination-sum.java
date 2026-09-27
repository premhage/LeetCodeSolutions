class Solution {
    private void findCombinations(int index, int target, int[] arr, List<List<Integer>> ans, List<Integer> ds){
        if(index == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(target >= arr[index]){
            ds.add(arr[index]);
            findCombinations(index,target - arr[index],arr,ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(index+1,target,arr,ans,ds);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
}