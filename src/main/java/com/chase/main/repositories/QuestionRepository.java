package com.chase.main.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chase.main.models.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

}