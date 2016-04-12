# Cache Search & Filter Criteria Sepcification Discussion

##What are the options for expressing cache configuration and initialization?
For compile time checks via typed interface definitions, which can enforce key based validations to a certain degree. Having known classes representing a unit of work like search, filtering and classes for criteria sepcification.
Another option is to store it in XML format like Apache Solr schema.xml files and use them during initialization.

##How would you express the search and filter criteria over the cache?
Spring data(spring-data-elastisearch, spring-data-mongodb) and Hibernate projects use a fluid search criteria building syntax where SQL like query semantics are expressed using chainable methods like where, in , between having varargs constructor. 

##Is indexing on cache supported, how are composite keys supported?
Queries will express a criteria over key fields, but if the key is composite, then do we need to have indexes over eac combination of those fields, the answer is no, SQL Server and Mongo DB take an easier route called [index intersection](https://docs.mongodb.org/manual/core/index-intersection/) where you create index on each of the component of the composite key and then intersect these sets to get the data for a subset key search.

##Why can't we have annotation based search configuration as on option?
Annotations can be used as a configuration option but can never be the only way to determine cache configuration as you may not want to pollute your key domain class with cache configurations, or maybe even not have access to it directly in cases where you are building cache over third party provided domain objects.

##How will index intersection work?
You will need to have a unique hashCode or we will keep unique UUID's (generation of which may be a heavy process) for each entry in the cache, then during cache initialization, we make a map from each value of K1, where K1 is a subset of key K of each entry in the cache. Then we get a search filter with criteria K1=<some-value>, K2=<some-other-value> we will looup the K1 and K2 index and intersect them.

##How is aggregation and grouping supported on the cached data values?
The search criteria will be expressive enough to represent the same, implementing it would involve writing an aggregator layer, this too is already present in Hibernate query formats.

##What is the plan for flushing caches?
You can flush cache for a Search filter.


