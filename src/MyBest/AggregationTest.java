package MyBest;

public class AggregationTest {
	int eId;
	String eName;
	Aggregation aggregation;//This is the entity reference or Aggregation
	

	public AggregationTest(int eId, String eName, Aggregation aggregation) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.aggregation = aggregation;
	}
	public void display() {
		
		System.out.println(eId+"   " + eName +"   "+aggregation.street+"   "+aggregation.city+"  "+aggregation.state+"   "+aggregation.zip);
		System.out.println("====================================================================");
	}


	public static void main(String[] args) {
		Aggregation ag = new Aggregation("9335 Lee Hwy", "Fairfax", "VA", 22031);
		Aggregation ag1 = new Aggregation("9515 Blake lane", "Vienna", "VA", 22045);
		AggregationTest at = new AggregationTest(112, "Rajan Bhattarai", ag);
		AggregationTest at1 = new AggregationTest(143, "Shanti Ram Gautam", ag1);
		at.display();
		at1.display();
		
		
	
	
	
	
	
	}

}
