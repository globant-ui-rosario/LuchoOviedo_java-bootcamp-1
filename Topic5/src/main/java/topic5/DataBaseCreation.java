package topic5;

public class DataBaseCreation {

	public static void main(String[] args) {
		try {
			ConnectToServer server = new ConnectToServer();
			QueryExecutor queryExecutor = new QueryExecutor(server.connectTo());

			queryExecutor.createTable(
					"CREATE TABLE student (studentId INT NOT NULL AUTO_INCREMENT,firstName VARCHAR(20),lastName VARCHAR(20),registrationNumber INT,dateOfBirth DATE,PRIMARY KEY (studentId));");

			queryExecutor.createTable(
					"CREATE TABLE teacher (teacherId INT NOT NULL AUTO_INCREMENT,firstName VARCHAR(20),lastName VARCHAR(20),dateOfBirth DATE,PRIMARY KEY (teacherId));");

			queryExecutor.createTable(
					"CREATE TABLE course (courseId INT NOT NULL AUTO_INCREMENT,name VARCHAR(20),teacherId INT,hours INT,PRIMARY KEY (courseId));");

			queryExecutor.createTable(
					"CREATE TABLE evaluation (evaluationId INT NOT NULL AUTO_INCREMENT,courseId INT,studentId INT,firstPartialNote INT,secondPartialNote INT,thirdPartialNote INT,finalNote INT, PRIMARY KEY (evaluationId));");

			queryExecutor.createTable(
					"CREATE TABLE courseSchedule (courseScheduleId INT NOT NULL AUTO_INCREMENT,courseId INT,day VARCHAR(10),hour TIME,PRIMARY KEY (courseScheduleId));");

			server.disconnect();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
