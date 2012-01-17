public class Manager extends Employee{
	private String department;
	public Manager(String nama, double salary, String dep){
		super(nama, salary); // keyword ini digunakan unutk mengakses variable dan nilai dari super classnya, dalam hal ini employee
		department = dep;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public String getDetails(){
		return super.getDetails()+"\nDepartment : " + getDepartment(); // mengembalikan nilai yang akan menjadi nilai pada superclass-nya
	}
	
	public void cetak(){
		System.out.println("Coba di Manager");
	}
}
