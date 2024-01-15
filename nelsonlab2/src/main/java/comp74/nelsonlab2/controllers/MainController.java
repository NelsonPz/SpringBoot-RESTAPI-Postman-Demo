package comp74.nelsonlab2.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("profiles")
    public List<Profile> gItems()
    {
        return model.getProfiles();
    }

    @GetMapping("profiles/{profileId}")
    public Profile getProfileById(@PathVariable Integer id)
    {
        return model.getProfileById(id);
    }

    @GetMapping("profiles/{profileId}/postings")
    public List<Posting> getProfilePostings(@PathVariable Integer id)
    {
        Profile currentProfile = model.getProfileById(id);
        return currentProfile.getPostings();
    }

}
