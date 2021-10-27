package com.jfo.patterns.creational.b_builder;

public class MongoDbQuery implements Query {

    private String from;
    private String where;

    @Override
    public void execute(){
        System.out.printf("Executing mongoDbQuery from: %s, where: %s%n", from, where);
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }
}
