package com.example.polls;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PollController {
    private final PollRepository pollRepo;

    public PollController(PollRepository pollRepo) {
        this.pollRepo = pollRepo;
    }

    // Main page: list all polls
    @GetMapping("/")
    public String listPolls(Model model) {
        model.add("polls", pollRepo.findAll());
        return "index";
    }

    // View a specific poll
    @GetMapping("/poll/{id}")
    public String viewPoll(@PathVariable int id, Model model) {
        Poll poll = pollRepo.findById(id);
        model.add("poll", poll);
        return "view_poll";
    }

    // Add answers page
    @GetMapping("/poll/{id}/add")
    public String addAnswersPage(@PathVariable int id, Model model) {
        Poll poll = pollRepo.findById(id);
        model.add("poll", poll);
        return "add_answers";
    }

    // Handle adding new answers
    @PostMapping("/poll/{id}/add")
    public String addAnswer(@PathVariable int id, @RequestParam String answer) {
        Poll poll = pollRepo.findById(id);
        poll.addAnswer(answer);
        return "redirect:/poll/" + id + "/add";
    }

    // Create poll form
    @GetMapping("/create")
    public String createPollForm() {
        return "create_poll";
    }

    // Handle creating new poll
    @PostMapping("/create")
    public String createPoll(@RequestParam String question,
                             @RequestParam(required = false) boolean singleChoice) {
        Poll poll = pollRepo.create(question, singleChoice);
        return "redirect:/poll/" + poll.getId() + "/add";
    }
}
