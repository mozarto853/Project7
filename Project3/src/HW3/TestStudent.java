package HW3;

public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setStName("Mozart");
		st1.setStID(777);
		st1.setStGrade('A');
		st1.setStDOB("01_01_1990");
		
		Student st2 = new Student();
		st2.setStName("Matiurrrr");
		st2.setStID(555);
		st2.setStGrade('W');
		st2.setStDOB("01_01_1995");
		
		
		System.out.println(st1.getStName() + " " + st1.getStID() + " " + st1.getStGrade() + " " + st1.getStDOB());
		System.out.println(st2.getStName() + " " + st2.getStID() + " " + st2.getStGrade() + " " + st2.getStDOB());

		Student st3= new Student("Karen",666,'F',"05-05-1885");
		System.out.println(st3.getStName() + " " + st3.getStID() + " " + st3.getStGrade() + " " + st3.getStDOB());
		
	}

}
