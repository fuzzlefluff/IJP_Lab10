public class Lab10 {

	public static void main(String[] args) {
		//initializing our array with 5 data points
		int[] myArray = {1,2,3,4,5};
		//printing our header
		System.out.println("The Array before our method");
		//calling the method printArray which prints the contents of an array
		printArray(myArray);
		//print our separator
		System.out.println();
		System.out.println("---------------------------");
		//print our header
		System.out.println("The Array after our method");
		//call the doubleCapacity method which doubles the size of our array
		myArray = doubleCapacity(myArray);
		//print our array to prove it has been doubled
		printArray(myArray);
	}
	
	//a method that takes an int[] array and doubles it's capacity
	static int[] doubleCapacity (int[] list)
	{
		//we create a new array that is the size of our input's length and doubles it
		int[] rArray = new int[list.length *2];
		//a for loop that goes through the input array and copies all of its data
		for (int c=0; c<list.length; c++)
		{
			rArray[c] = list[c];
		}
		//we return our new array that has the same information and double the size
		return rArray;
	}
	
	//a simple method that prints all the contents of an int[] array
	static void printArray(int[] inputArray)
	{
		//the for loop goes through each data point and prints it
		System.out.print("{ ");
		for(int c = 0; c<inputArray.length; c++)
		{
			System.out.print(inputArray[c]+" ");
		}
		System.out.print("}");
}
}//fantastic end comment!