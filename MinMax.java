//Min and Max in array

int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        for(int j = 0; j < arr.length; j++){
            if(arr[j]< min){
                min = arr[j];
            }
        }
        return new Pair<>(min,max);
    }
