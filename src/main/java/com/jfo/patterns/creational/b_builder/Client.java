package com.jfo.patterns.creational.b_builder;

public class Client {

    public static void main(String[] args) {
        QueryBuilderDirector director = new QueryBuilderDirector();
        String from = "client table";
        String where = "client name = ....";

        QueryBuilder builder = new SqlDbQueryBuilder();
        Query query = director.buildQuery(from, where, builder);
        query.execute();

        builder = new MongoDbQueryBuilder();
        query = director.buildQuery(from, where, builder);
        query.execute();
    }
}
