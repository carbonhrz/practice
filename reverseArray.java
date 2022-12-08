public class reverseArray {

    public static void main (String[] args) {

        int[] arr = {1,2,3,4};
        reverseArray a = new reverseArray();
        a.reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

//returns the reversed array in place
public static void reverse(int[] numbers) {
    int memory;
    int endMarker = numbers.length - 1;
    for (int i = 0; i < numbers.length / 2; i++) {
        memory = numbers[endMarker];
        numbers[endMarker] = numbers[i];
        numbers[i] = memory;
        endMarker--;
    }
}

}
