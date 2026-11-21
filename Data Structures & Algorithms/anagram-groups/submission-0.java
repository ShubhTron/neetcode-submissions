class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();  
        for(int i = 0; i < strs.length; i++){
            char[] key = strs[i].toCharArray();
            Arrays.sort(key);

            String word = new String(key);

            if(map.containsKey(word)){
                List<String> idx = map.get(word);
                idx.add(strs[i]);
            }else{
                ArrayList<String> idx = new ArrayList<>();
                idx.add(strs[i]);
                map.put(word, idx);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        int k = 0;
        for(List<String> values : map.values()){
            ans.add(values);
        }
        return ans;
    }
}
