//https://leetcode.com/problems/h-index
//TC: n logn
//sc: o(1)
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int rPapers = citations.length;
        System.out.println(Arrays.toString(citations));
        for(int i=0; i< citations.length;i++){
            if(citations[i] >= rPapers){
                return rPapers;
            }
            rPapers--;
        }
        return 0;
    }
}

//TC: o(n)
//sc: o(n)
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int arr[] = new int[n + 1];
        for(int i=0; i<n; i++){
            if(citations[i] > n){
                arr[n]++;
            }else{
                arr[citations[i]]++;
            }
        }
        int sum = 0;
        for(int i=n; i >= 0; i--){
            sum += arr[i];
            if(sum >= i){
                return i;
            }
        }
        return 123;
    }
}
