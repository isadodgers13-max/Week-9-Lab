package com.example.polls;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class PollRepository {
    private Map<Integer, Poll> polls = new LinkedHashMap<>();
    private int nextId = 1;

    public List<Poll> findAll() {
        return new ArrayList<>(polls.values());
    }

    public Poll findById(int id) {
        return polls.get(id);
    }

    public Poll create(String question, boolean singleChoice) {
        Poll poll = new Poll(nextId++, question, singleChoice);
        polls.put(poll.getId(), poll);
        return poll;
    }
}
