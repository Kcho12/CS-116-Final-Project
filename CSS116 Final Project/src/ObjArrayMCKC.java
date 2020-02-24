	public class ObjArrayMCKC{//This is the list class.
		protected final int MAX_SIZE = 100;//constant for max size
		protected Object [] objArray;
		protected int index;   // (next empty slot),  
		protected int currPos; //iterator of list
		
			//default constructor, instantiates array to MAX size and assigns 0 to index
			public ObjArrayMCKC() {
				objArray = new Object[MAX_SIZE];
				index = 0;
				currPos = 0;
			}
			
			//nondefault constructor to instantiate an array to size, assigns 0 to index
			public ObjArrayMCKC(int size) {
				objArray = new Object[size];
				index = 0;
				currPos = 0;
			}
			
			//return a copy of the array, accessor
			//Instantiate another array (new memory location) and copy the data into this 
			//new array, return this array
			public Object[] getobjArray() {
				Object[] copyArray = new Object[objArray.length];
				for (int i=0; i< index; i++)	//copy valid data
				copyArray[i] = objArray[i];
				return copyArray;
			}
		
			//return # of actual data in array, accessor
			public int getIndex() {
				return index;
			}
				
			//return an object at given pos
			public Object getObject(int pos){  
				if (pos < objArray.length) 
					return objArray[pos];  
				else return -1;      
			}
			
			//return the string with contents of array, suggestion: use toString() from each element
			public String toString(){ 
				String temp = "";
					for (int i=0; i<index; i++)
					{		
						temp += "i= " + i + "\t" + objArray[i] + "\n";
					}
			return temp;
			}	
			
			//insert a new string into the next empty slot of the array if there is room, inc index
			public void add(Object anObj) {
				if(index <= MAX_SIZE) {
				objArray[index] = anObj;
				index++;
				}
			}
		
			//searches the list for an object and returns the index where that object 
			//has been found or -1 if not found
			public int isThere(Object anObj) {
				for(int i=0; i<index; i++) {
					if(anObj.equals(objArray[i])){
						return i;
					}
			}
				return -1;
			}
		
			//insert an object at particular index moving everything down
			public void insertObject(Object anObj, int pos) {
				index++;
				if(pos <index)
				{
					
					for(int i=0; i<(index-pos);i++) {
					objArray[index-i]= objArray[index-i-1];
				}
				objArray[pos] = anObj;
			}
			}
		
		//replace an object with another object
			public void setObject(Object anObj, int pos) {
				if(pos < index) {
					objArray[pos] = anObj;
				}
			}
		
		//delete object from the specified position, check if list is empty
			public void delete (int delIndex) {
				if(delIndex <index ) {
					for(int i =0; i<index-delIndex; i++){
						objArray[delIndex+i]= objArray[delIndex+i+1];
					}
				}
				index--;
			}
			
		//swaps the first and second elements of the array
			public void swap() {
				Object temp1 = objArray[0];
				Object temp2 = objArray[index-1];
				
				objArray[0] = temp2;
				objArray[index-1] = temp1;
			}
			
		//checks if list is full
			public boolean isFull() {
				if(index < MAX_SIZE) {
					return false;
				}
				else {
					return true;
				}
				
			}
			
			//checks if list is empty
			public boolean isEmpty() {
				if(index == 0) {
					return true;
					}
				else {
					return false;
				}
			}
		
			//clears all content of array
			public void clear() {
				for(int i=0; i<index ;i++) {
					objArray[i] = null;
				}
				index = 0;
			}
			
			//matches size of the list with the capacity
			public void trim() {
				Object[] trimmedArray = new Object[index];
				for(int i=0;i <index;i++) {
					trimmedArray[i] = objArray[i];
				}
				objArray = trimmedArray;//Sets original array equal to the trimmed array
				
			}
			
			//increases size of array if max size is reached
			public void moreCapacity() {
				if(index <= objArray.length) {
					Object[] biggerArray = new Object[objArray.length+10];
					for (int i=0; i<index; i++) {//Copies data
						biggerArray[i] = objArray[i];
					}
					objArray = biggerArray;
			}
				else {
					System.out.print("Array is not full");
				}
			}
			
			//sets iterator to 0
			public void reset() {
				currPos = 0;
			}
			
			//checks list for more content
			public boolean hasNext() {
				if(currPos < index) {
					return true;
				}
				else {
					return false;
				}
			}
			
			//returns object at current iterator position
			public Object getNext() {
				int pos = currPos;
				currPos++;
				return objArray[pos];
			}
			
			//returns the current iterator position
			public int getpointer() {
				return currPos;
			}
			
			//returns a DEEP copy of the array, assessor
			public Object[] getArray() {
				Object[] copyArray = new Object[objArray.length];
				for (int i=0; i< index; i++) {
					copyArray[i] = objArray[i];
				objArray = copyArray;
				}
				return  objArray;
			}
			
			public int getLength() {//returns the capacity of the object array
				return objArray.length;
			}
			
	}
