package co.g2academy.array;

public class ArrayResizing {

    public int[] resize(int[] initialArray, int n) {
        //create new array
        int[] resizedArray = new int[n];
        //copy old array to new array
//        for (int i = 0; i < initialArray.length; i++){
//            resizedArray[i] = initialArray[i]
//        }
        System.arraycopy(initialArray, 0,
                resizedArray, 0,
                initialArray.length);
        return resizedArray;
    }
}
