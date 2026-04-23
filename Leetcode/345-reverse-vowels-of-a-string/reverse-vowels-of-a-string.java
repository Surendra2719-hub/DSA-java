class Solution {

    private boolean vowel(char[] arr, int i){
       if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||
       arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
         return true;
        } 
        return false; 
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i=0, j=n-1;

        while(i < j){
            if(!vowel(arr, i)){
                i++;
                continue;
            }
            if(!vowel(arr, j)){
                j--;
                continue;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }  



return new String(arr);
    }
}