// Reverse an array
//TC: o(N)

class Solution {
  public:
    void reverseArray(vector<int> &arr) {
        // code here
        int temp ;
        int i = 0;
        int j = arr.size() - 1;
        while( i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
};
