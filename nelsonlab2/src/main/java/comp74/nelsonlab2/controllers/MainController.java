package comp74.nelsonlab2.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comp74.nelsonlab2.model.Model;
import comp74.nelsonlab2.model.Posting;
import comp74.nelsonlab2.model.Profile;


@RestController
@RequestMapping("/api")
public class MainController {
    Model model;

    public MainController(Model model) {
        this.model = model;
    }

    @GetMapping("/test")
    public String test() {
        return "x";
    }


    @GetMapping("/profiles")
    public List<Profile> getAllProfiles() {
        return model.getProfiles();
    }

    @GetMapping("/profiles/{profileId}")
    public Profile getProfileById(@PathVariable Integer profileId)
    {
        return model.getProfileById(profileId);
    }

    @GetMapping("/profiles/{profileId}/postings")
    public List<Posting> getProfilePostings(@PathVariable Integer profileId)
    {
        Profile currentProfile = model.getProfileById(profileId);
        return currentProfile.getPostings();
    }

}
