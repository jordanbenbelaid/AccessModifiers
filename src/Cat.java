
public class Cat {

	
	//For the demo purpose, default values have been given
	private String catType = "Tabby";
	private int age = 4;
	private String foodType = "cat food";
	
	//Default access modifier (none specified means it has a default access modifier)
	boolean hasPaws;
	
	//Default constructor
	public Cat() {
		
	}
	
	// Private Constructor
	
	private Cat(int age) {
		this.age = age;
	}
	
	//Public Constructor
	public Cat(String catType, int age, String foodType) {
		this(age);
		this.catType = catType;
		this.foodType = foodType;
	}

	//GETTER
	public String getCatType() {
		return this.catType;
	}
	
	//SETTER
	public void setCatType(String catType) {
		this.catType = catType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	
}
