/**
 * 
 */
package com.javaoop.zookeeper.gorilla;

import com.javaoop.zookeeper.mammal.Mammal;

/**
 * @author ccomstock
 *
 */
public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("<gorilla threw something>");
		_energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("<gorilla enjoyed a banana>");
		_energyLevel += 10;
	}
	public void climb() {
		System.out.println("<gorilla climed a tree>");
		_energyLevel -= 10;
	}
}
