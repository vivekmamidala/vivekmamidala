public class QuickUnionImproved {
    public static void main(String[] args) {
        new QuickUnionImproved(10);
        }
         
        public QuickUnionImproved(int size){
    
            int[] arr = new int[size];
            for(int i=0; i<size; i++) arr[i]=i;
            print(arr);
        createUnion(arr, 3, 9);
        createUnion(arr, 5, 6);
        createUnion(arr, 3, 6);
        createUnion(arr, 1, 2);
        createUnion(arr, 7, 1);
        System.out.println(searchUnion(arr, 3,5));
        System.out.println(searchUnion(arr, 3,7));
        System.out.println(searchUnion(arr, 2,7));
         }
    
         private static void print(int[] arr) {
            for(int i : arr) System.out.print(i+",");
            System.out.println();
        }
    
         private int findRoot(int[] arr, int i) {
            while(i != arr[i]) i=arr[i];
            return i;
         }
    
         public boolean searchUnion(int[] arr, int i, int j) {
            return findRoot(arr, i) == findRoot(arr, j);
         }
    
         public void createUnion(int[] arr, int i, int j) {
            arr[findRoot(arr, i)] = j;
            print(arr);
         }
}
