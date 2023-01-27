public class QuickFind {
 public static void main(String[] args) {
    int size=10;
    int[] arr = new int[size];
    for(int i=0; i < size; i++) {
        arr[i]=i;
    }
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

private static boolean searchUnion(int[] arr, int i, int j) {
    return arr[i]==arr[j];
}

private static void createUnion(int[] arr, int i, int j) {
    int target = arr[i];
    for(int k=0; k<arr.length; k++) {
        if(arr[k] == target) arr[k] = arr[j];
    }
    print(arr);
}


}