package gamepac;

public class Player2 extends Player1 {
   private int health;
   private boolean armour;
   
   public Player2(String name, String weapon, int health, boolean amour) {
	   super(name, weapon, health);
	   this.health = health;
	   this.armour = armour;
   }

@Override
public void damagedByG1() {
	if (armour) {
		this.health -= 20;
		if (this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Armour is up. Got hit by G1 health reduced by 20 points. New health is " + this.health);	
	}
	if (!armour) {
		this.health -= 40;
		if (this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Armour is down. Got hit by G1 health reduced by 40 points. New health is " + this.health);	
	}
	if (this.health == 0) {
		System.out.println(getName() + "is eliminated");
	}
}

@Override
public void damagedByG2() {
	if (armour) {
		this.health -= 30;
		if (this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Armour is up. Got hit by G2 health reduced by 30 points. New health is " + this.health);	
	}
	if (!armour) {
		this.health -= 50;
		if (this.health <= 0) {
			this.health = 0;
		}
		System.out.println("Armour is down. Got hit by G2 health reduced by 50 points. New health is " + this.health);	
	}
	if (this.health == 0) {
		System.out.println(getName() + "is eliminated");
	}
}
   
   
   
}
