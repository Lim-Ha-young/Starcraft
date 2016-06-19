package Model;

public class Unit {

	protected int hp;
	protected int hit;
	protected String name;
	
	public Unit(int hp,int hit, String name){
		this.hp=hp;
		this.hit=hit;
		this.name = name;
	}
	public void seeState(){
		System.out.println(hp);
		System.out.println(hit);
		System.out.println(name);
	}
}
