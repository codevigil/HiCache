package codevigil.stella.domain;

import java.util.List;

/**
 * @author nitish-garg
 *
 * @param <K>
 */
public class CacheConfiguration<K> {

	/**
	 * 	
	 */
	private K cacheObject;
	private List<Index<K>> indexes;
	
	public K getCacheObject() {
		return cacheObject;
	}
	public void setCacheObject(K cacheObject) {
		this.cacheObject = cacheObject;
	}
	public List<Index<K>> getIndexes() {
		return indexes;
	}
	public void setIndexes(List<Index<K>> indexes) {
		this.indexes = indexes;
	}

}
