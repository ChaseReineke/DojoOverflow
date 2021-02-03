package com.chase.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chase.main.models.Answer;
import com.chase.main.repositories.AnswerRepository;

@Service
public class AnswerService {
	private static AnswerRepository answerRepo;

	public AnswerService(AnswerRepository answerRepo) {
		this.answerRepo = answerRepo;
	}

	public Answer create(Answer newAnswer) {
		return answerRepo.save(newAnswer);
	}

	public List<Answer> getAnswers() {
		return (List<Answer>) answerRepo.findAll();
	}

	public Answer getAnswer(Long id) {
		Optional<Answer> answer = answerRepo.findById(id);
		return answer.isPresent() ? answer.get() : null;
	}

	public Answer saveAnswer(Answer answer) {
		return answerRepo.save(answer);
	}

}