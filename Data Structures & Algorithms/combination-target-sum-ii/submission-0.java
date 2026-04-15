class Solution {
    public void helper(int[] candidates, int target, int index, List<List<Integer>> list, List<Integer> temp){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            temp.add(candidates[i]);
            helper(candidates, target-candidates[i], i+1, list, temp);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(candidates, target, 0, list, temp);

        return list;
    }
}
