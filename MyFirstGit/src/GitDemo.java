
public class GitDemo {

	public static void main(String[] args) {
		
		
		//using lambda expression with return value and arguements
		Cabs c=(source,destination)->{
		System.out.println("Uber Booked from "+source+"Arriving soon at "+destination);
		return 850;
		};
		    int i=c.bookCab("bengaluru","bly");
		System.out.println("Total fare is:"+i);
		
		
		
	}
}
