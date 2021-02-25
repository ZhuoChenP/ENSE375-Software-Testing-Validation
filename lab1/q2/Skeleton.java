
public class Skeleton extends Creature {
	public void type(){
		System.out.println("The "+this.getClass().getSimpleName()+" is undead."); 
	}
	public void attack(){
		System.out.println("The "+this.getClass().getSimpleName()+" does a physical attack."); 
	}
	public void move(){
		System.out.println("The "+this.getClass().getSimpleName()+" walks."); 
	}
}
