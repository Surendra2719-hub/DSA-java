class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> rMap = new HashMap<>();
        HashMap<Character, Integer> mMap = new HashMap<>();

        for(char c : ransomNote.toCharArray()){
            rMap.put(c, rMap.getOrDefault(c, 0) + 1);
        }

        for(char c : magazine.toCharArray()){
            mMap.put(c, mMap.getOrDefault(c, 0) + 1);
        }

        for(char c : rMap.keySet()){
            if(mMap.getOrDefault(c, 0) < rMap.get(c)){
                return false;
            }
        }
        return true;
    }
}