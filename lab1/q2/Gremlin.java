
public class Gremlin extends Creature {
	public void type(){
		System.out.println("The "+this.getClass().getSimpleName()+" is familiar."); 
	}
	public void attack(){
		System.out.println("The "+this.getClass().getSimpleName()+" does a physical attack."); 
	}
	public void move(){
		System.out.println("The "+this.getClass().getSimpleName()+" flies."); 
	}
}