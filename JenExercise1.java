//Jennifer Gaw
//Exercise 1
//Coding for Product

public class JenExercise1 {
	public static void main(String[] args){
		//created object array with 3 indexes, populate array
		Object[] array = new Object[3];
		//title and link added into array index 0
		array[0] = new List<String, String>("really, really, really long title that will be chopped off", "example.com");
		print(array);
	}
	//print title
	//shorten if string is greater than 50 characters
	public static String print(Object[] array){
		Object a = array[0];
		if (((String)(extracted(a).getKey())).length() > 50){
			System.out.print("<a href=" + extracted(a).getValue() + ">" + extracted(a).getKey().substring(0, 50) + "..." + "</a>");
		}
		else
			System.out.print("error");
		return null;
	}
	//extracted Object a in different method
	private static List<String, String> extracted(Object a) {
		return ((List<String, String>) a);
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
