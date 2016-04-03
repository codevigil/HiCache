# Stella
Distributed Cache Manager on Statistical Data -WIP

What is Hi Cache?
Hi Cache lets you build a cache over frequently accessed data, where data has a hierarchial key, general query patterns include querying for statistics which are dervied by grouping and aggregation of data present in caches.

How will edits work?
You can flush data out using subset key matching.

How does the distributed-ness implemented?
Using active-active in-memory grid with multiple readers and single writer.
