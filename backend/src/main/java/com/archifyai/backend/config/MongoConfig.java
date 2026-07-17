package com.archifyai.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@Configuration
public class MongoConfig {

    @Bean
    public MappingMongoConverter mappingMongoConverter(
            MongoDatabaseFactory mongoDatabaseFactory,
            MongoCustomConversions mongoCustomConversions,
            MongoMappingContext mongoMappingContext
    ) {
        DbRefResolver dbRefResolver = new DefaultDbRefResolver(mongoDatabaseFactory);
        MappingMongoConverter converter = new MappingMongoConverter(dbRefResolver, mongoMappingContext);
        converter.setCustomConversions(mongoCustomConversions);
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
        converter.afterPropertiesSet();
        return converter;
    }
}
// This class is a configuration class for MongoDB in the Archify AI backend.
//  It defines a bean for the MappingMongoConverter, which is responsible for converting between Java objects and MongoDB documents.
//  The converter is configured to use a DefaultDbRefResolver, which resolves DBRef references in MongoDB, and a DefaultMongoTypeMapper with a null type key,
//  which prevents the addition of the _class field to MongoDB documents. This configuration allows for cleaner MongoDB documents without the extra type information, while still enabling the use of custom conversions if needed.