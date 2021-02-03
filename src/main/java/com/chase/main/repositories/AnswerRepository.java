package com.chase.main.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chase.main.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {

}