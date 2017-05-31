package topic5;

public class SchoolTest {

	public static void main(String[] args) {

		try {

			SchoolQueries schoolQueries = new SchoolQueries();

			schoolQueries.getTeacherAndStudentsOfACourse(1);
			schoolQueries.getFinalNotesOfAStudent(101);
			schoolQueries.getTeacherTimeLine(1);

		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
	}

}
