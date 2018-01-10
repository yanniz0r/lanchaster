public class Population {

	private int population;
	private double strength;
	private Population enemy;
	
	public Population(int population, double strength) {
		this.population = population;
		this.strength = strength;
	}
	
	public void setEnemy(Population enemy) {
		this.enemy = enemy;
	}
	
	public double getStrength() {
		return this.strength;
	}
	
	public double getPopulation() {
		return this.population;
	}
	
	public double populationForTime(double time) {
		double e = Math.E;
		return (getPopulation() - enemy.getStrength() / getStrength() * enemy.getPopulation()) / 2 * Math.pow(e, getStrength() * time) + (getPopulation() + enemy.getStrength() / getStrength() * enemy.getPopulation()) / 2 * Math.pow(e, -getStrength() * time);
	}
	
}
