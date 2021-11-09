
public class Runner {

	public static void main(String[] args) {
		Cat cat = new Cat();
		
		
		//Getting the type of cat originally
		System.out.println(cat.getCatType());
		
		//Setting the cat type from Tabby to Lion
		cat.setCatType("Lion");
		
		//Getting the type of cat again, after being changed
		System.out.println(cat.getCatType());
	}
	
}
