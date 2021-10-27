package com.jfo.patterns.creational.b_builder;

public interface QueryBuilder {

    void from(String from);

    void where(String where);

    Query getQuery();

}
