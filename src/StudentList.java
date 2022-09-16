public class StudentList {

	public static void main(String[] args)
	{
 		
	  Student s1 = new Student(1, "Urvi", 45, 49, 46);
	  Student s2 = new Student(2, "Ronak", 40, 46, 48);		 
	  Student s3 = new Student(3, "Montu", 42, 41, 47);
	  Student s4 = new Student(4, "Sonu", 40, 42, 49);
	  Student s5 = new Student(5, "Mahek", 41, 40, 47);
			  
		}
}

class Student 
{
	int rollNumber;
	String name;
	
	int english;
	int maths;
	int science;
	
	int total;
	
	public Student()
	{
	}
	
	public Student(int r, String n, int e, int m, int s)
	{
		rollNumber = r;
		name = n;
		english =e;
		maths = m;
		science = s;
		
		total = e+m+s;
		
				  
		System.out.println(toString());
	}

	
	public String toString()
	{
		return  "Student [rollNumber=" + rollNumber + ", name=" + name + ", english="  + english + ", maths=" +maths
				                  + ", science=" + science + ", total=" + total + "]";
		
		
	}
}