public class DrinkArrayMCKC extends ObjArrayMCKC {//This list file contains the specific list methods unique to our objects.
	
	//default constructor, instantiates array to MAX size and assigns 0 to index
			public DrinkArrayMCKC() {
				super();
			}
			
			//nondefault constructor to instantiate an array to size, assigns 0 to index
			public DrinkArrayMCKC(int size) {
				super(size);
			}
			
			public int sequentialSearch(String name) {//Searches by the user input name of drink
				for(int i=0; i<index; i++) {
					if(((DrinkMCKC)objArray[i]).getName().equalsIgnoreCase(name)) {
						return i;
					}
				}
				return -1;
			}
			
			public int binarySearch(String name) {//Gets userinput of name and compares it to name of object drink
				int first = 0; 
				int last = index-1;
				int middle; 
				while(last>= first){	
					middle =(first+last)/2;
					if(name.compareTo((((DrinkMCKC)objArray[middle]).getName()))==0) {
							return middle;
					}
					else if(name.compareTo((((DrinkMCKC)objArray[middle]).getName()))<0)
						last = middle-1;
					else first = middle +1;
						
			}
				return -1;
		
			}
			
			public void selectSort() { //Sorts by comparing name of drinks alphabetically
				Object temp;
				int i;
				int j;
				int minIndex;
				
				for(i =0; i< index; i++) {
					minIndex = i;
						for(j=0; j<index; j++) {
							if(((DrinkMCKC)objArray[j]).compareTo(((DrinkMCKC)objArray[minIndex])) <0) {
									minIndex = j;
							}
							temp = objArray[minIndex];
							objArray[minIndex] = objArray[i];
							objArray[i] = temp;
						}
				}
			}
}

