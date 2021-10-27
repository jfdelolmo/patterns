package com.jfo.patterns.creational.b_builder;

public class SqlDbQueryBuilder implements QueryBuilder {

    private SqlDbQuery query = new SqlDbQuery();

    @Override
    public void from(String from){
        query.setFrom(from);
    }

    @Override
    public void where(String where){
        query.setWhere(where);
    }

    @Override
    public Query getQuery(){
        return query;
    }
}
