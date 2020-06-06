public class BinarySearch {

	public static void main(String[] args) {

		// 100 prime numbers
		int[] primeNum100 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
					73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173,
					179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281,
					283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409,
					419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541};
		// Value of the argument
		int argNum = Integer.parseInt(args[0]);
		boolean result;

		result = BinarySearch.execute(primeNum100, argNum);

		if(result) {
			System.out.println("Found !");
			System.out.println(argNum + " found in the prime number, up to the 100th.");
		}
		else{
			System.out.println("Not Found.");
			System.out.println(argNum + " is not found in prime numbers up to the 100th.");
		}
	}

	public static boolean execute(int[] data, int target) {

		int low = 0;
		int high = data.length - 1;

		/**
		*
		* --- Binary Search Algorithm ---
		*
		* 1. Sorting the array.
		*
		* 2. Examine the element in the center of the array.
		*
		* 3-a. If the center element is not the desired value, and the desired data is larger than the center value.
		*       -> Examine the second half than the center.
		*
		* 3-b. If the center element is not the desired value, and the desired data is less than the center value.
		*       -> Examine the first half than the center.
		*
		* 4. Back to 2.
		*
		*/
		while (low <= high) {

			// 1 to the right, bit shift --> 1/2
			int middle = (low + high) >>> 1;

			if (data[middle] == target) {
				return true;
			}
			else if (data[middle] < target) {
				low = middle + 1;
			}
			else{
				high = middle - 1;
			}
		}

		return false;

	}

}

//============================================
//               Output Sample
//============================================

// $ javac BinarySearch.java 

// $ java BinarySearch 17
// Found !
// 17 found in the prime number, up to the 100th.
// $ java BinarySearch 127
// Found !
// 127 found in the prime number, up to the 100th.
// $ java BinarySearch 332
// Not Found.
// 332 is not found in prime numbers up to the 100th.
// $ java BinarySearch 1019
// Not Found.
// 1019 is not found in prime numbers up to the 100th.

//============================================
