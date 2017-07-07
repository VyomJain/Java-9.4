//Program to print the duplicate values in an array list.
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 
class ArrayDuplicatePrint 
{ 
public static void main(String[] args) { 
ArrayList<String> letters = new ArrayList<String>(); 
HashMap<String, Integer> duplicateLetters = new HashMap<String, Integer>(); 
ArrayList<String> newLetters = new ArrayList<String>(); 

letters.add("a"); 
letters.add("b"); 
letters.add("a"); 
letters.add("c"); 
letters.add("d"); 
letters.add("a"); 
letters.add("c");

Iterator<String> iterator = letters.iterator(); 
while (iterator.hasNext()) { 
String next = iterator.next(); 
if (newLetters.contains(next)) { 
Integer value = duplicateLetters.get(next); 
if (value == null) { 
duplicateLetters.put(next, 1); 
} 
else { 
duplicateLetters.put(next, value + 1); 
} 
} 
else { 
newLetters.add(next); 
} 
} 

letters = newLetters; 

System.out.println("Duplicate Letters:"); 
for (Map.Entry<String, Integer> entry : duplicateLetters.entrySet()) { 
System.out.println(entry.getKey()); 
} 
} 
}