package implementations.non_generic;

import interfaces.GenericSubInterface;

public class NonGeneric_GenericSub_Implementation implements GenericSubInterface<String> {

	@Override
	public String genericSuperMethod() {
		return null;
	}

	@Override
	public String genericSubMethod() {
		return null;
	}
	
}
