package codevigil.stella.domain;

import java.util.List;

public abstract class Filter {
	
	private List<Constraint> constraints;

	public List<Constraint> getConstraints() {
		return constraints;
	}

	public void setConstraints(List<Constraint> constraints) {
		this.constraints = constraints;
	}

}
