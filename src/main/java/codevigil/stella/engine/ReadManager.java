package codevigil.stella.engine;

import java.util.List;

import codevigil.stella.domain.SearchFilter;
import codevigil.stella.service.SearchStep;

public class ReadManager<K> {
	private List<SearchStep> searchSteps;
	
	public K search(SearchFilter filter) {
		return null;
	}

	public List<SearchStep> getSearchSteps() {
		return searchSteps;
	}

	public void setSearchSteps(List<SearchStep> searchSteps) {
		this.searchSteps = searchSteps;
	}

}
