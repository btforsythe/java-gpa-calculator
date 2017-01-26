
public class GpaCalculatorTest {

	public static void main(String[] args) {

		// if we know all of the elements when we create it:
		int[] array1 = { 42, 87, 95, 23, 8 };
		System.out.println("The element at index 3 is " + array1[3]);

		for (int index = 0; index < array1.length; index++) {
			System.out.println("The element at index " + index + " is " + array1[index]);
		}

		// if we don't know all of the elements, but we (must) know the size:
		int[] array2 = new int[5];
		array2[0] = 42;
		array2[1] = 87;
		array2[2] = 95;
		array2[3] = 23;
		array2[4] = 8;

		for (int index = 0; index < array2.length; index++) {
			System.out.println("The element at index " + index + " of second array is " + array2[index]);
		}
}
}
