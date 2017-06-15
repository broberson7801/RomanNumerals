package labs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sun.javafx.collections.MappingChange.Map;

public class SetTestAgain {

	public static void main(String[] args) {

		List<String> songs = new ArrayList<>();

		// TreeSet-> ordered by ASCII
		// Linked Hash Set

		songs.add("Hotel California");
		songs.add("Stronger");
		songs.add("Billie Jean");
		songs.add("Buy Me a Boat");
		songs.add("1812 Overture");
		songs.add("the General");
		songs.add("The Flower Duet");
		songs.add("EvenFlow");

		Map<String, String> ourSongMap;
		//ourSongMap = new HashMap<>();
		//ourSongMap.put("moses", "stronger");
		
		
		
//		Map<Integer, List<String>> map = new HashMap<>();
//		List<String> studentScores = map.get(12345);
//		if(studentScores == null ) {
//			studentScores = new ArrayList<>();
//			map.put(12345, studentScores);
//		}
//		studentScores.add("A");
//		
//		List<String> theseGrades = map.get(12345);
//		String aGrade = theseGrades.get(0); //get first grade
//		
//		String grade = map.get(45678).get(0); //living dangerously
		
		
		List<Integer> age = new ArrayList<>();

		for (String s : songs) {
			// System.out.println(s);
			if ("The Flower Duet".equals("s"))
				;
			songs.remove(s);
			System.out.println(s);
		}

	}

}
