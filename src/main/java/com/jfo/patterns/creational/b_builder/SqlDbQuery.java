package com.jfo.patterns.creational.b_builder;

public class SqlDbQuery implements Query {

    private String from;
    private String where;

    @Override
    public void execute(){
        System.out.printf("Executing SqlDbQuery from: %s, where: %s%n", from, where);
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }
}
