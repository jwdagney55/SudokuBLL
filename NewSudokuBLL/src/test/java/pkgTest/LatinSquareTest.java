package pkgTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class LatinSquareTest {
	public LatinSquareTest() {
	}

	public static boolean hasDuplicates(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1])
				return true;
		}

		return false;
	}

	public void hasDuplicates_test1() {
		int[] arr1 = { 1, 2, 3, 4 };
		assertEquals(hasDuplicates(arr1), false);
	}

	public void hasDuplicates_test2() {
		int[] arr = { 1, 1, 2, 4 };
		assertEquals(hasDuplicates(arr), true);
	}
}
