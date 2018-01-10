public class Simulator {
	
	private Population populationA;
	private Population populationB;

	public Simulator() {
		populationA = new Population(100, 0.03);
		populationB = new Population(100, 0.01);
		populationA.setEnemy(populationB);
		populationB.setEnemy(populationA);
	}
	
	public void resultForTime(double time) {
		System.out.println("Population for time " + time + ": A(" + populationA.populationForTime(time) + ") - B(" + populationB.populationForTime(time) + ")");
	}
	
    public static void main(String[] args) {
		Simulator simulator = new Simulator();
		simulator.simulate();
    }
    
	public void simulate(){
		double interval = 0.5;
		double time = 0;
		while(populationA.populationForTime(time) > 0 && populationB.populationForTime(time) > 0) {
			this.resultForTime(time);
			time += interval;
		}
		
	}
	
}
