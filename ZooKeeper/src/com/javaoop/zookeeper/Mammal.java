/**
 * 
 */
package com.javaoop.zookeeper;

/**
 * @author ccomstock
 *
 */
public class Mammal {
	protected int _energyLevel;
	
	public Mammal() {
		_energyLevel = 100;
	}
	
	public int displayEnergy() {
		System.out.println(_energyLevel);
		return _energyLevel;
	}
}
