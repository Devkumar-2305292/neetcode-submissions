class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i)).append('.');
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();

        int i=0;
        while(i<str.length()){
            StringBuilder sb=new StringBuilder();

            int j=i;
            while(str.charAt(j)!='.'){
                sb.append(str.charAt(j));
                j++;
            }
            list.add(sb.toString());
            i=j+1;
        }

        return list;
    }
}
