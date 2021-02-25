
public class Fairie extends Creature {
	public void type(){
		System.out.println("The "+this.getClass().getSimpleName()+" is familiar."); 
	}
	public void attack(){
		System.out.println("The "+this.getClass().getSimpleName()+" does a magical attack."); 
	}
	public void move(){
		System.out.println("The "+this.getClass().getSimpleName()+" flies."); 
	}
}
