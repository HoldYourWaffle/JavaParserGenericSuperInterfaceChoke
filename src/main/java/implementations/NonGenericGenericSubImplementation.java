package implementations;

import interfaces.GenericSubInterface;

public class NonGenericGenericSubImplementation implements GenericSubInterface<String> {

	@Override
	public String genericSuperMethod() {
		return null;
	}

	@Override
	public String genericSubMethod() {
		return null;
	}
	
}
