//Jennifer Gaw
//Exercise 2
//Coding for Product

public class JenExercise2 {
	public static void main(String[] args){
		//created object array with 3 indexes, populate array
		Object[] array = new Object[3];
		//title and link added into array index 0
		array[0] = new List<String, String>("Github", "github.com");
		array[1] = new List<String, String>("Google", "google.com");
		array[2] = new List<String, String>("really, really, really long title that will be chopped off", "example.com");
		print(array);
	}
	//print title
	//shorten if string is greater than 50 characters
	public static String print(Object[] array){
		//declare objects from array
		Object a = array[0];
		Object b = array[1];
		Object c = array[2];
		System.out.println("<a href=" + ((List<String, String>) a).getValue() + ">" + ((List<String, String>) a).getKey() + "</a>"); //print array[0]
		System.out.println("<a href=" + ((List<String, String>) b).getValue() + ">" + ((List<String, String>) b).getKey() + "</a>"); //print array[1]
		if (((String)(extracted(c).getKey())).length() > 50){
			System.out.print("<a href=" + extracted(c).getValue() + ">" + extracted(c).getKey().substring(0, 50) + "..." + "</a>"); //print array[2]
		}
		else
			System.out.print("error");
		return null;
	}
	//extracted Object a in different method
	private static List<String, String> extracted(Object c) {
		return ((List<String, String>) c);
	}
}//public class jenexercisetest bracket, dont delete

	//for object array
	//generics
	class List <title, link> {
		title key;
		link value;
		
		List(title key, link value) {
			this.key = key;
			this.value = value;
		}
		//getters and setters
		//title
		title getKey() {
			return key;
		}
		//link
		link getValue() {
			return value;
		}
	}
