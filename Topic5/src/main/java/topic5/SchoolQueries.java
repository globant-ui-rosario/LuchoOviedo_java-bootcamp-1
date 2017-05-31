package topic5;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SchoolQueries {

	private QueryExecutor queryExecutor;

	public SchoolQueries() throws Exception {

		ConnectToServer server = new ConnectToServer();
		this.queryExecutor = new QueryExecutor(server.connectTo());

	}

	public void getTeacherAndStudentsOfACourse(int courseId) throws Exception {

		String order = "select c.name, t.firstName, s.lastName from student s ,teacher t, course c where c.courseId=? and c.teacherId=t.teacherId and t.teacherId=c.teacherId order by c.name,t.firstName,s.firstName";

		PreparedStatement preparedStatement = (PreparedStatement) queryExecutor.getConnection().prepareStatement(order);

		preparedStatement.setInt(1, courseId);

		ResultSet resultSet = preparedStatement.executeQuery();

		boolean firstTime = true;

		while (resultSet.next()) {

			if (firstTime) {

				System.out.println(" Course: " + resultSet.getString("name"));
				System.out.println(" Course: " + resultSet.getString("firstName"));
				System.out.println(" Students:");
				firstTime = false;
			}

			System.out.println("          " + resultSet.getString("lastName"));
		}

	}

	public void getFinalNotesOfAStudent(int registrationNumber) throws SQLException {

		String order = "select c.name, e.finalNote from student s inner join evaluation e on e.studentId=s.studentId inner join course c on c.courseId=e.courseId where s.registrationNumber=? order by e.finalNote desc, c.name";

		PreparedStatement preparedStatement = (PreparedStatement) queryExecutor.getConnection().prepareStatement(order);

		preparedStatement.setInt(1, registrationNumber);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			System.out.print("Registration number of the student : " + registrationNumber);
			System.out.print(" Name of the course: " + resultSet.getString("name"));
			System.out.print(" Final Note of Course: " + resultSet.getString("finalNote"));
			System.out.println();

		}

	}

	public void getTeacherTimeLine(int teacherId) throws SQLException {

		String order = "select t.firstName, t.lastName, cs.day, cs.hour, c.name from teacher t, course c, courseSchedule cs where c.teacherId=t.teacherId and c.courseId=cs.courseId and t.teacherId=? order by day ";

		PreparedStatement preparedStatement = (PreparedStatement) queryExecutor.getConnection().prepareStatement(order);

		preparedStatement.setInt(1, teacherId);

		ResultSet resultSet = preparedStatement.executeQuery();

		boolean firstTime = true;

		while (resultSet.next()) {

			if (firstTime) {

				System.out.println(
						" Teacher: " + resultSet.getString("firstName") + ", " + resultSet.getString("lastName"));
				System.out.println(" Schedule: ");
				firstTime = false;
			}

			System.out.println("  " + resultSet.getString("day") + " " + resultSet.getString("hour") + " "
					+ resultSet.getString("name"));
		}
	}

	public void disconnect() throws SQLException {
		queryExecutor.disconnect();
	}

}
