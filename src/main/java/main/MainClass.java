package main;

import implementations.GenericGenericSubImplementation;
import implementations.GenericSuperImplementation;
import implementations.NonGenericGenericSubImplementation;
import implementations.NonGenericSubImplementation;

public class MainClass {
	
	public void choke() {
		new NonGenericSubImplementation().genericSuperMethod();
	}
	
	public void choke2() {
		new NonGenericSubImplementation().nonGenericSubMethod();
	}
	
	
	
	public void choke3() {
		new NonGenericGenericSubImplementation().genericSuperMethod();
	}
	
	public void choke4() {
		new NonGenericGenericSubImplementation().genericSubMethod();
	}
	
	
	
	public void choke5() {
		new GenericGenericSubImplementation<String>().genericSuperMethod();
	}
	
	public void choke6() {
		new GenericGenericSubImplementation<String>().genericSubMethod();
	}
	
	
	
	public void works() {
		new GenericSuperImplementation().genericSuperMethod();
	}
	
}
