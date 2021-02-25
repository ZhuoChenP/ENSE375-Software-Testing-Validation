
public class Ghost extends Creature {
	public void type(){
		System.out.println("The "+this.getClass().getSimpleName()+" is undead."); 
	}
	public void attack(){
		System.out.println("The "+this.getClass().getSimpleName()+" does a magical attack."); 
	}
	public void move(){
		System.out.println("The "+this.getClass().getSimpleName()+" teleport."); 
	}
}