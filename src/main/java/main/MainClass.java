package main;

import implementations.GenericSubImplementation;
import implementations.GenericSuperImplementation;
import implementations.NonGenericSubImplementation;

public class MainClass {
	
	public void choke() {
		new NonGenericSubImplementation().genericSuperMethod();
	}
	
	public void choke2() {
		new NonGenericSubImplementation().nonGenericSubMethod();
	}
	
	
	
	public void choke3() {
		new GenericSubImplementation().genericSuperMethod();
	}
	
	public void choke4() {
		new GenericSubImplementation().genericSubMethod();
	}
	
	
	
	public void works() {
		new GenericSuperImplementation().genericSuperMethod();
	}
	
}
