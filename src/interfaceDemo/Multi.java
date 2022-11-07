package interfaceDemo;

interface Continent{
	void continentName(); //abstract method
}

interface Country{
	void countryName(); //abstract method
}

interface City{
	void cityName(); //abstract method
}

public class Multi implements Continent, Country, City {
	
	@Override
	public void cityName() {
		System.out.println("Kuala Lumpur");
	}

	@Override
	public void countryName() {
		System.out.println("Malaysia");
	}

	@Override
	public void continentName() {
		System.out.println("Asia");
	}
	
	public static void main(String[] args) {
		Multi obj = new Multi();
		obj.cityName();
		obj.countryName();
		obj.continentName();
	}

	

}
