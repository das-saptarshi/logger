package com.saptarshi.das.logger.repositories;

import com.saptarshi.das.logger.models.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {
}
