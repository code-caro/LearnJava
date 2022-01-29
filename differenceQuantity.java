import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
			
		int[] a = new int[] {1, 2, 2, 2, 3};
		int[] b = new int[] {2};
		
		int[] c = arrayDiff(a, b);
		//Test how the result looks like		
		System.out.println(Arrays.toString(c));

	}
  
  // difference function, which substracts one list from another and returns the result
  public static int[] arrayDiff(int[] a, int[] b) {
    //convert int Arrays to ArrayLists
		ArrayList<Integer> listA = (ArrayList<Integer>) Arrays.stream(a).boxed().collect(Collectors.toList());
		ArrayList<Integer> listB = (ArrayList<Integer>) Arrays.stream(b).boxed().collect(Collectors.toList());
    // if a value is present in b, all of its occurrences must be removed from a
		listA.removeAll(listB);  
    //convert ArrayList to int Array
		int[] intArray = new int[listA.size()];
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = listA.get(i);
		}
		//return result
		return intArray;
		
	}
	
}
