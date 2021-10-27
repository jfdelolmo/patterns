package com.jfo.patterns.creational.b_builder;

public class QueryBuilderDirector {

    /**
     * Creates a query based on the 'from' and the 'where'
     * @param from
     * @param where
     * @param builder to define end result of the query or the representation of the query
     * @return
     */
    public Query buildQuery(String from, String where, QueryBuilder builder){
        builder.from(from);
        builder.where(where);
        return builder.getQuery();
    }
}
