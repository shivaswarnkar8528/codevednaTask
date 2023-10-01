import java.util.Arrays;
import java.util.Random;

public class SuffleArray {
    static void shuffleArr(int array[]){
        Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int randSwap = rand.nextInt(array.length);
			int temp = array[randSwap];
			array[randSwap] = array[i];
			array[i] = temp;
        }
    }

	public static void main(String args[]) {
		
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		shuffleArr(array);
		System.out.println(Arrays.toString(array));
	}
}