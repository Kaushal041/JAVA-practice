public class linear_search {
    public static void main(String[] args) {
        
    //----------------- Linear Search ----------------//
        int [] arraysearch  = {10,20,30,40,50,60,70,10,80,10,90,100};
        int target = 100;
        int count = 0;
        for(int i=0;i<arraysearch.length;i++){
        if (arraysearch[i] == target){
            System.out.println("Element found at index: " + i);
         count ++;
        }}
        if(count == 0){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Total occurrences of element " + target + ": " + count);
             
        }
    }
}
