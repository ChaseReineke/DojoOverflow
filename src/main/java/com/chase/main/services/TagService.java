package com.chase.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chase.main.models.Tag;
import com.chase.main.repositories.TagRepository;

@Service
public class TagService {
	private static TagRepository tagRepo;

	public TagService(TagRepository tagRepo) {
		this.tagRepo = tagRepo;
	}

	public Tag create(Tag newTag) {
		return tagRepo.save(newTag);
	}

	public List<Tag> getTags() {
		return (List<Tag>) tagRepo.findAll();
	}

	public Tag getTag(Long id) {
		Optional<Tag> tag = tagRepo.findById(id);
		return tag.isPresent() ? tag.get() : null;
	}

	public Tag saveTag(Tag tag) {
		return tagRepo.save(tag);
	}

}