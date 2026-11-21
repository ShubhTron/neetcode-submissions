class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] ans = new int[k];
        while(k > 0){
            int max = 0;
            int freq = 0;
            for(int key : map.keySet()){
                if (map.get(key) > freq){
                    freq = map.get(key);
                    max = key;
                }
            }
            ans[k-1] = max;
            map.remove(max);
            k--;
        }
        return ans;
    }
}
