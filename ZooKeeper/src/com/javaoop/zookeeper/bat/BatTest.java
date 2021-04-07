/**
 * 
 */
package com.javaoop.zookeeper.bat;

/**
 * @author ccomstock
 *
 */
public class BatTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bat b = new Bat();
		b.attackTown();
		b.attackTown();
		b.attackTown();
		b.eatHumans();
		b.eatHumans();
		b.fly();
		b.fly();
		b.displayEnergy();
	}
	
}
