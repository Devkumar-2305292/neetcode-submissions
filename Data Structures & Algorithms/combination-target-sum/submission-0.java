class Solution {
    public void helper(int[] candidates, int target, int i, int currSum, List<List<Integer>> list, List<Integer> temp){
        if(currSum==target){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(currSum>target){
            return;
        }
        if(i==candidates.length){
            return;
        }

        //Pick:
        temp.add(candidates[i]);
        helper(candidates, target, i, currSum+candidates[i], list, temp);
        temp.remove(temp.size()-1);
        helper(candidates, target, i+1, currSum, list, temp);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(candidates, target, 0, 0, list, temp);

        return list;
    }
}