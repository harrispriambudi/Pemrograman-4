public class View{
	public static void main(String[] args){
		Employee e = new Employee("Ali", 1200000); // membentuk objek baru dengan properti khusus dari class employee
		Employee em = new Manager("Ali", 1200000, "Informatika"); /* membentuk objek baru dengan properti khusus dari class manager yang
		merupakan turunan dari class employee */
		
		System.out.println("Data employee :\n"+e.getDetails());
		System.out.println("Data manager  :\n"+em.getDetails());
		em.cetak();
	}
}
