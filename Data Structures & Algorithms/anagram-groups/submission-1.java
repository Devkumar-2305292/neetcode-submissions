class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] strs2=new String[strs.length];
        for(int i=0;i<strs.length;i++){
            strs2[i]=strs[i];
        }

        for(int i=0;i<strs2.length;i++){
            char[] arr=strs2[i].toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            strs2[i]=sorted;

        }

        List<List<String>> list=new ArrayList<>();
        for(int i=0;i<strs2.length;i++){
            List<String> list2=new ArrayList<>();
            list2.add(strs[i]);

            if(strs2[i].equals("!")){
                continue;
            }
            
            for(int j=i+1;j<strs2.length;j++){
                if(strs2[j].equals(strs2[i]) && !strs2[j].equals("!")){
                    list2.add(strs[j]);
                    strs2[j]="!";
                }
            }

            list.add(list2);
        }

        return list;
    }
}
