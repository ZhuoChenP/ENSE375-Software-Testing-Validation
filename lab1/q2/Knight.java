
public class Knight extends Creature {
	public void type(){
		System.out.println("The "+this.getClass().getSimpleName()+" is humanoid."); 
	}
	public void attack(){
		System.out.println("The "+this.getClass().getSimpleName()+" does a physical attack."); 
	}
	public void move(){
		System.out.println("The "+this.getClass().getSimpleName()+" walks."); 
	}
}
