package topic5;

public class Key3Inserts {

	public static void main(String[] args) {
		try {
			ConnectToServer server = new ConnectToServer();
			QueryExecutor queryExecutor = new QueryExecutor(server.connectTo());

			String teacher1 = "INSERT INTO teacher (teacherId, firstName, lastName, dateOfBirth) VALUES (DEFAULT,'teacher1','teacher1',CURRENT_DATE)";
			String teacher2 = "INSERT INTO teacher (teacherId, firstName, lastName, dateOfBirth) VALUES (DEFAULT,'teacher2','teacher2',CURRENT_DATE)";
			String teacher3 = "INSERT INTO teacher (teacherId, firstName, lastName, dateOfBirth) VALUES (DEFAULT,'teacher3','teacher3',CURRENT_DATE)";

			queryExecutor.executeStatement(teacher1);
			queryExecutor.executeStatement(teacher2);
			queryExecutor.executeStatement(teacher3);

			String course1 = "INSERT INTO course (courseId, name,teacherId, hours) VALUES (DEFAULT,'course1',1,10)";
			String course2 = "INSERT INTO course (courseId, name,teacherId, hours) VALUES (DEFAULT,'course2',1,10)";
			String course3 = "INSERT INTO course (courseId, name,teacherId, hours) VALUES (DEFAULT,'course3',1,10)";
			String course4 = "INSERT INTO course (courseId, name,teacherId, hours) VALUES (DEFAULT,'course4',1,10)";
			String course5 = "INSERT INTO course (courseId, name,teacherId, hours) VALUES (DEFAULT,'course5',1,10)";

			queryExecutor.executeStatement(course1);
			queryExecutor.executeStatement(course2);
			queryExecutor.executeStatement(course3);
			queryExecutor.executeStatement(course4);
			queryExecutor.executeStatement(course5);

			String student1 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen1','student1',101,STR_TO_DATE('12-02-2000','%d-%m-%Y'))";
			String student2 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen2','student2',102,STR_TO_DATE('14-05-1988','%d-%m-%Y'))";
			String student3 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen3','student3',103,STR_TO_DATE('08-04-1990','%d-%m-%Y'))";
			String student4 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen4','student4',104,STR_TO_DATE('24-03-1991','%d-%m-%Y'))";
			String student5 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen5','student5',105,STR_TO_DATE('21-07-1890','%d-%m-%Y'))";
			String student6 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen6','student6',106,STR_TO_DATE('15-08-1941','%d-%m-%Y'))";
			String student7 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen7','student7',107,STR_TO_DATE('18-09-1970','%d-%m-%Y'))";
			String student8 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen8','student8',107,STR_TO_DATE('05-10-1988','%d-%m-%Y'))";
			String student9 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen9','student9',108,STR_TO_DATE('08-12-1970','%d-%m-%Y'))";
			String student10 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen10','student10',109,STR_TO_DATE('13-09-1978','%d-%m-%Y'))";
			String student11 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen11','student11',110,STR_TO_DATE('17-06-1995','%d-%m-%Y'))";
			String student12 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen12','student12',111,STR_TO_DATE('22-03-2012','%d-%m-%Y'))";
			String student13 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen13','student13',112,STR_TO_DATE('23-01-1950','%d-%m-%Y'))";
			String student14 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen14','student14',113,STR_TO_DATE('09-04-1899','%d-%m-%Y'))";
			String student15 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen15','student15',114,STR_TO_DATE('15-05-1998','%d-%m-%Y'))";
			String student16 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen16','student16',115,STR_TO_DATE('12-06-1955','%d-%m-%Y'))";
			String student17 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen17','student17',116,STR_TO_DATE('24-07-1977','%d-%m-%Y'))";
			String student18 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen18','student18',117,STR_TO_DATE('19-08-1989','%d-%m-%Y'))";
			String student19 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen19','student19',118,STR_TO_DATE('20-09-1975','%d-%m-%Y'))";
			String student20 = "INSERT INTO student (studentId, firstName, lastName, registrationNumber, dateOfBirth) VALUES (DEFAULT,'studen20','student20',119,STR_TO_DATE('12-02-1979','%d-%m-%Y'))";

			queryExecutor.executeStatement(student1);
			queryExecutor.executeStatement(student2);
			queryExecutor.executeStatement(student3);
			queryExecutor.executeStatement(student4);
			queryExecutor.executeStatement(student5);
			queryExecutor.executeStatement(student6);
			queryExecutor.executeStatement(student7);
			queryExecutor.executeStatement(student8);
			queryExecutor.executeStatement(student9);
			queryExecutor.executeStatement(student10);
			queryExecutor.executeStatement(student11);
			queryExecutor.executeStatement(student12);
			queryExecutor.executeStatement(student13);
			queryExecutor.executeStatement(student14);
			queryExecutor.executeStatement(student15);
			queryExecutor.executeStatement(student16);
			queryExecutor.executeStatement(student17);
			queryExecutor.executeStatement(student18);
			queryExecutor.executeStatement(student19);
			queryExecutor.executeStatement(student20);

			String evaluation1 = "INSERT INTO evaluation (evaluationId, courseId, studentId, firstPartialNote, secondPartialNote,thirdPartialNote,finalNote)VALUES(DEFAULT,1,1,6,6,6,6)"; 
			String evaluation2 = "INSERT INTO evaluation (evaluationId, courseId, studentId, firstPartialNote, secondPartialNote,thirdPartialNote,finalNote)VALUES(DEFAULT,1,2,2,2,2,2)"; 
			String evaluation3 = "INSERT INTO evaluation (evaluationId, courseId, studentId, firstPartialNote, secondPartialNote,thirdPartialNote,finalNote)VALUES(DEFAULT,1,3,10,4,3,2)";
			
			queryExecutor.executeStatement(evaluation1);
			queryExecutor.executeStatement(evaluation2);
			queryExecutor.executeStatement(evaluation3);

			String schedule1 = "INSERT INTO courseSchedule (courseScheduleId, courseId, day, hour) VALUES (DEFAULT,5,'monday',CURRENT_TIME)";
			String schedule2 = "INSERT INTO courseSchedule (courseScheduleId, courseId, day, hour) VALUES (DEFAULT,4,'monday',CURRENT_TIME)";
			String schedule3 = "INSERT INTO courseSchedule (courseScheduleId, courseId, day, hour) VALUES (DEFAULT,5,'friday',CURRENT_TIME)";
			
			queryExecutor.executeStatement(schedule1);
			queryExecutor.executeStatement(schedule2);
			queryExecutor.executeStatement(schedule3);
			
			server.disconnect();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
