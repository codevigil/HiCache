package codevigil.stella.domain;

import java.util.Map;

/**
 * 
 * @author nitish-garg
 *
 * @param <K>
 */
public class Data<K> {
	
	/**
	 * 
	 */
	private MetaData<K> metaData;
	private CacheConfiguration<K> cacheConfiguration;
	private Map<Comparable<?>, K> cachedData;
	
	public Response searchObject(Filter searchFilter){
		return null;
	}
	
	public void setMetaData(MetaData<K> metaData) {
		this.metaData = metaData;
	}

	public void setCacheConfiguration(CacheConfiguration<K> cacheConfiguration) {
		this.cacheConfiguration = cacheConfiguration;
	}
}
