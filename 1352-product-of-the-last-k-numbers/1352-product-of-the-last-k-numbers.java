    //idea: store running product of all numbers we get in an array
        //when we want product of last k numbers, simply divide current running product by the running product up to the (n-k)th number
        //problem: zeroes will corrupt our long running product sequence, and it break after we encounter the first zero.
    //solution:
        //whenever we encounter a 0, restart the running product sequence from the next element onwards. Requires keeping track of most recent 0.
        //so something like this:
            //input: [1,2,3,4,0,6,7,8,9,0,10,10,10,10]
            //runningStream: [1,2,6,24,0,6,42,336,3024,0,10,100,1000,10000]
            //mostRecent0Index: [-1,-1,-1,-1,4,4,4,4,4,9,9,9,9,9]

        //so if our k stream (index n-k to index n-1 inclusive) doesn't include a 0 (with mostRecent0Index[n-1] < n-k), then return the following: runningStream[n-1]/runningStream[n-k-1], where runningStream[n-k-1] is the element prior to our k sequence
            //something to consider: if runningStream[n-k-1] == 0, then just return runningStream[n-1]
        //otherwise, if our k stream includes a 0, indicated by mostRecent0Index[n-1] >= n-k, then return 0.
    
    //optimization: we don't really need to keep track of an array for mostRecent0Index, as we don't need previous values of it ever. So replace with an integer.

class ProductOfNumbers {

    List<Integer> runningProduct; //stores run
    int mostRecentZeroIndex = 0;
    int size = 0;
    public ProductOfNumbers() {
        runningProduct = new ArrayList<>();
    }
    
    public void add(int num) {
        if(size == 0 || mostRecentZeroIndex == size-1) //if no elements, or last element added was a 0
            runningProduct.add(num);
        else
            runningProduct.add(num*runningProduct.get(size-1));  
        if(num == 0)
            mostRecentZeroIndex = size;
        else if(size == 0)
            mostRecentZeroIndex = -1;
        size++;
    }
    
    public int getProduct(int k) {
        int firstIndex = size-k;
        if(mostRecentZeroIndex < firstIndex){
            if(firstIndex-1 < 0 || runningProduct.get(firstIndex-1) == 0)
                return runningProduct.get(size-1);
            else
                return runningProduct.get(size-1)/runningProduct.get(size-k-1);
        }
        return 0;
    }
}