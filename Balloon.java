package ca.utoronto.utm.balloonmvc;
import java.util.*;


/**
 * We capture a Balloon which can be inflated, deflated and popped.
 * A Balloon has an amount and capacity. At all times, 0<=amount<=capacity.
 * A Balloon can be inflated only if it is not popped.
 * 
 * @author arnold
 */
public class Balloon extends Observable {
	
	// See http://www.dofactory.com/net/observer-design-pattern
	// https://docs.oracle.com/javase/8/docs/api/
	private Random randomSource=new Random();
	private int diceValue1;
	private int diceValue2;
	public Balloon(){
		this.roll();
	}
	public void roll(){
		this.diceValue1=randomSource.nextInt(6)+1; // 0..5->1..6
		this.diceValue2=randomSource.nextInt(6)+1; // 0..5->1..6
		this.notifyObservers();
	}
	public int getDiceValue1(){
		return this.diceValue1;	
	}
	public int getDiceValue2(){
		return this.diceValue2;
	}

}

