public class LinearSearch {

	public static void main(String[] args) {

		// 100 prime numbers
		int[] primeNum100 = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
					73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173,
					179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281,
					283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409,
					419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541};
		// Value of the argument
		int argNum = Integer.parseInt(args[0]);
		int result;

		result = LinearSearch.execute(primeNum100, argNum);

		if(result != -1) {
			System.out.println("Found !");
			System.out.println(argNum + " is No." + result + " prime number.");
		}
		else{
			System.out.println("Not Found.");
			System.out.println(argNum + " is not found in prime numbers up to the 100th.");
		}
	}

	public static int execute(int[] data, int target) {
		int notFound = -1;

		/**
		*
		* --- Linear Search Algorithm ---
		*
		* 1.Extracting elements from the top of the list.
		*
		* 2.Compares the value of a fetched element with the value of the element you want to find.
		*   ->If it matches, the search is complete.
		*   ->If it doesn't match, go back to 1. and retrieve the next element
		*
		*/
		for(int i = 0; i < data.length; i++) {
			if(data[i] == target) {
				return i;
			}
		}

		return notFound;
	}

}

//============================================
//               Output Sample
//============================================

// $ javac LinearSearch.java

// $ java LinearSearch 17
// Found !
// 17 is No.6 prime number.
// $ java LinearSearch 127
// Found !
// 127 is No.30 prime number.
// $ java LinearSearch 332
// Not Found.
// 332 is not found in prime numbers up to the 100th.
// $ java LinearSearch 1019
// Not Found.
// 1019 is not found in prime numbers up to the 100th.

//============================================
