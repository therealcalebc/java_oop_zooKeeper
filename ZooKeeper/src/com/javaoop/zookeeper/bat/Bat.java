/**
 * 
 */
package com.javaoop.zookeeper.bat;

import com.javaoop.zookeeper.mammal.Mammal;

/**
 * @author ccomstock
 *
 */
public class Bat extends Mammal {
	/**
	 * 
	 */
	public Bat() {
		_energyLevel = 300;
	}
	
	public void attackTown() {
		System.out.println("<giant bat attacks town>");
		_energyLevel -= 100;
	}
	public void eatHumans() {
		System.out.println("<giant bat enjoys tasty human beans>");
		_energyLevel += 25;
	}
	public void fly() {
		System.out.println("<giant bat takes off>");
		_energyLevel -= 50;
	}
}
