package codevigil.stella.engine;

import java.util.List;

import codevigil.stella.domain.CacheConfiguration;
import codevigil.stella.domain.SearchFilter;

/**
 * 
 * @author nitish-garg
 *
 */
public class Cache<K> {
	
	/**
	 * 
	 */
	private CacheConfiguration<K> cacheConfiguration;
	private WriteManager<K> writeManager;
	private ReadManager<K> readManager;
	
	public Cache(CacheConfiguration<K> cacheConfiguration) {
		super();
		this.cacheConfiguration = cacheConfiguration;
	}

	public void initialize(List<K> objects){
		writeManager.initialize(objects);
	}
	
	public K searchObject(SearchFilter filter){
		return readManager.search(filter);
	}
	
	
	public CacheConfiguration<K> getCacheConfiguration() {
		return cacheConfiguration;
	}

	public WriteManager<K> getWriteManager() {
		return writeManager;
	}

	public void setWriteManager(WriteManager<K> writeManager) {
		this.writeManager = writeManager;
	}

	public ReadManager<K> getReadManager() {
		return readManager;
	}

	public void setReadManager(ReadManager<K> readManager) {
		this.readManager = readManager;
	}
	
}
