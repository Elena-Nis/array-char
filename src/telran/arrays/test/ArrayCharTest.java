package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.ArrayChar;


class ArrayCharTest {
 
  	@Test
 	void compareToTest() {
 		 char[] ar1 = {'1', '2', '3'};
 		 char[] ar2 = {'9'}; //a+b+c - возвращается а+в и к нему +с
 		 char[] ar3 = {'1', '2', '3'};
 		 char[] ar4 = {'1', '2', '3','4'};
 	     char[] ar5 = {'1', '2', '3'};
 		 //char[] ar6 = {'a','b','c'};
 		 //char[] ar7= {};
 		 ArrayChar arrayChar1 = new ArrayChar(ar1);
 		 ArrayChar arrayChar2 = new ArrayChar(ar2);
 		 ArrayChar arrayChar3 = new ArrayChar(ar3);
 		 ArrayChar arrayChar4 = new ArrayChar(ar4);
 		 ArrayChar arrayChar5 = new ArrayChar(ar5);
 		// ArrayChar arrayChar7 = new ArrayChar(ar7);
 		 assertEquals(8, arrayChar2.compareTo(arrayChar1));
 		 assertEquals(-8, arrayChar1.compareTo(arrayChar2));
 		 assertEquals(1, new ArrayChar(new char[] {'a', 'a'}).compareTo(
 new ArrayChar (new char[] {'a'})));
 		 assertEquals(-1, new ArrayChar(new char[] {'a'}).compareTo(
 				 new ArrayChar (new char[] {'a', 'a'})));
 		 assertEquals(0, arrayChar1.compareTo(arrayChar3));
 		 assertEquals(1, arrayChar4.compareTo(arrayChar5));
 		 assertEquals(-1, arrayChar5.compareTo(arrayChar4));
 		// assertEquals(-1, arrayChar1.compareTo(arrayChar7));
 		}
@Test
void indexOfTest() {
	char[] ar1 = {'1','2','3','2'};
	ArrayChar arrayChar1 = new ArrayChar(ar1);
	assertEquals(1, arrayChar1.indexOf('2'));
	assertEquals(-1, arrayChar1.indexOf('9'));
}
 @Test
 void lastIndexOfTest() {
 	char[] ar1 = {'1', '2', '3', '2'}; //"123"
 	ArrayChar arrayChar1 = new ArrayChar(ar1);
 	assertEquals(3, arrayChar1.lastIndexOf('2'));
 	assertEquals(-1, arrayChar1.lastIndexOf('9'));
 	
 }
 
 @Test
	void compareToIgnoreCaseTest() {
		 char[] ar1 = {'1', '2', '3'};
		 char[] ar2 = {'9'};  
		 char[] ar3 = {'A', 'b', 'c'};
		 char[] ar4 = {'a', 'b', 'c'};
		 char[] ar5 = {'a', 'B', 'c'};
		 char[] ar6 = {'a', 'b'};
		 ArrayChar arrayChar1 = new ArrayChar(ar1);
	     ArrayChar arrayChar2 = new ArrayChar(ar2);
	     ArrayChar arrayChar3 = new ArrayChar(ar3);
		 ArrayChar arrayChar4 = new ArrayChar(ar4);
		 ArrayChar arrayChar5 = new ArrayChar(ar5);
		 ArrayChar arrayChar6 = new ArrayChar(ar6);
	 	 assertEquals(8, arrayChar2.compareToIgnoreCase (arrayChar1));
		 assertEquals(-8, arrayChar1.compareToIgnoreCase(arrayChar2));
		 assertEquals(0, arrayChar3.compareToIgnoreCase(arrayChar4));
		 assertEquals(0, arrayChar4.compareToIgnoreCase(arrayChar3));
		 assertEquals(1, arrayChar5.compareToIgnoreCase(arrayChar6));
		 assertEquals(-1, arrayChar6.compareToIgnoreCase(arrayChar5));
		}
 @Test
	void equals() {
		 char[] ar1 = {'1', '2', '3'};
		 char[] ar2 = {'1', '2', '3'}; 
		 char[] ar3 = {'A', 'b'};
		 char[] ar4 = {'a', 'b', 'c'};
		 char[] ar5 = {'a', 'B', 'c'};
		 ArrayChar arrayChar1 = new ArrayChar(ar1);
	     ArrayChar arrayChar2 = new ArrayChar(ar2);
	     ArrayChar arrayChar3 = new ArrayChar(ar3);
		 ArrayChar arrayChar4 = new ArrayChar(ar4);
		 ArrayChar arrayChar5 = new ArrayChar(ar5);
	  	 assertTrue(arrayChar1.equals (arrayChar2));
	 	 assertTrue(arrayChar2.equals (arrayChar1));  
	 	 assertFalse(arrayChar3.equals (arrayChar4));  
	 	 assertFalse(arrayChar4.equals (arrayChar3)); 
	 	 assertFalse(arrayChar4.equals (arrayChar5)); 
		}
 
 @Test
	void containsTest() {
		char[] ar1 = {'a','b','c','d'};
		char character1 = 'c';
		char character2 = 'u';
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		assertTrue(arrayChar1.contains(character1));
		assertFalse(arrayChar1.contains(character2));
	}
 
 @Test
	void lengthArrTest() {
		char[] ar1 = {'a','b','c','d'};
		char[] ar2 = {'a'};
		char[] ar3 = {};
		ArrayChar arrayChar1 = new ArrayChar(ar1);
		ArrayChar arrayChar2 = new ArrayChar(ar2);
		ArrayChar arrayChar3 = new ArrayChar(ar3);
		assertEquals(4,arrayChar1.lengthArr(arrayChar1));
		assertEquals(1,arrayChar2.lengthArr(arrayChar2));
		assertEquals(0,arrayChar3.lengthArr(arrayChar3));
	}
 
//@Test
//void compareToIgnoreCaseTest() {
//	 String str1="Abc";
//	 String str2="abc";
// 	 assertEquals(0, str1.compareToIgnoreCase(str2));
	  
//}


}

