package main;

import implementations.generic.Generic_GenericSub_Implementation;
import implementations.generic.Generic_Super_Implementation;
import implementations.non_generic.NonGenericSubImplementation;
import implementations.non_generic.NonGeneric_GenericSub_Implementation;
import implementations.non_generic.NonGeneric_Super_Implementation;

public class MainClass {
	
	public void choke() {
		new NonGenericSubImplementation().genericSuperMethod();
	}
	
	public void choke2() {
		new NonGenericSubImplementation().nonGenericSubMethod();
	}
	
	
	
	public void choke3() {
		new NonGeneric_GenericSub_Implementation().genericSuperMethod();
	}
	
	public void choke4() {
		new NonGeneric_GenericSub_Implementation().genericSubMethod();
	}
	
	
	
	public void choke5() {
		new Generic_GenericSub_Implementation<String>().genericSuperMethod();
	}
	
	public void choke6() {
		new Generic_GenericSub_Implementation<String>().genericSubMethod();
	}
	
	
	
	public void works() {
		new NonGeneric_Super_Implementation().genericSuperMethod();
	}
	
	public void works2() {
		new Generic_Super_Implementation<String>().genericSuperMethod();
	}
	
}
