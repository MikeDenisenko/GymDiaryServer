package com.mike.gymdiary.repos;

import com.mike.gymdiary.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {

   List<Message> findByTag(String tag);
}
