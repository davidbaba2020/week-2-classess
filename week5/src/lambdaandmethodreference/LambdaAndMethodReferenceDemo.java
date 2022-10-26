package lambdaandmethodreference;

public class LambdaAndMethodReferenceDemo {

		public static void main(String[] args) {
			
			// ========== Lambda function demo ==========
			OrderManagement orderManagement = 
					new OrderManagement(new DefaultDistanceCalculator());
			
			orderManagement.setDistanceCalculator(new DistanceCalculatorInterface() {
				@Override
				public double calculateDistance(City city1, City city2) {
					// take into account interstate distance calculation
					return city1.getLogitude() - city2.getLogitude(); // some dummy calculations
				}
			});
			
			DistanceCalculatorInterface dCalculator = (city1, city2) -> city1.getLogitude() - city2.getLogitude();


			DistanceCalculatorInterface dCalculator2 = (city1, city2) -> {
				System.out.println("Text inside lambda function");
				return city1.getLogitude() - city2.getLogitude();
			};
			
			dCalculator2.calculateDistance(new City(), new City());
			
			orderManagement.setDistanceCalculator((city1, city2) -> city1.getLogitude() - city2.getLogitude());
			
			
			// ========== Method reference demo ==========
			
			orderManagement
				.setDistanceCalculator(GoogleDistanceCalculator::getDistanceBetweenCitiesStatic);
			
			GoogleDistanceCalculator gdc = new GoogleDistanceCalculator();
			orderManagement
				.setDistanceCalculator(gdc::getDistanceBetweenCities);
		
		}
	
}



class OrderManagement {
	
	private DistanceCalculatorInterface distanceCalculator;
	
	public OrderManagement(DistanceCalculatorInterface distanceCalculator) {
		this.distanceCalculator = distanceCalculator;
	}
	
	public void setDistanceCalculator(DistanceCalculatorInterface distanceCalculator) {
		this.distanceCalculator = distanceCalculator;
	}
}


class DefaultDistanceCalculator implements DistanceCalculatorInterface {

	@Override
	public double calculateDistance(City city1, City city2) {
		return 0;
	}
	
}

class GoogleDistanceCalculator {
	
	public double getDistanceBetweenCities(City city1, City city2) {
		return 1;
	}
	
	public static double getDistanceBetweenCitiesStatic(City city1, City city2) {
		return 1;
	}
}
