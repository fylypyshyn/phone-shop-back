package com.phone.shop.config;

import com.github.mongobee.Mongobee;
import com.mongodb.MongoClient;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.phone.shop.repository")
public class ApplicationConfiguration {

    @Bean
    public Mongobee mongobee(final MongoClient mongoClient, final MongoTemplate mongoTemplate,
                             final MongoProperties mongoProperties) {
        final Mongobee mongobee = new Mongobee(mongoClient);
        mongobee.setDbName(mongoProperties.getMongoClientDatabase());
        mongobee.setMongoTemplate(mongoTemplate);
        // package to scan for migrations
        mongobee.setChangeLogsScanPackage("com.phone.shop.config.dbmigrations");
        mongobee.setEnabled(true);
        return mongobee;
    }
}
