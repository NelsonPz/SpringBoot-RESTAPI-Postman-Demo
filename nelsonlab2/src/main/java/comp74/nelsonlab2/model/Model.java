package comp74.nelsonlab2.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Model {
    
    HashMap<Integer,Profile> profiles;
    HashMap<Integer,Posting> postings;
    private static Integer nextProfileId = 100;
    private static Integer nextPostId = 100;

    public Model()
    {
        super();
        profiles = new HashMap<>();
        postings = new HashMap<>();
    }

    public Profile addProfile(Profile newProfile)
    {
        newProfile.setProfileId(nextProfileId++);
        profiles.put(newProfile.getProfileId(), newProfile);
        return newProfile;
    }

    public Posting addPost(Posting newPosting)
    {
        newPosting.setPostingId(nextPostId++);
        newPosting.setDateAndTime(LocalDateTime.now());
        postings.put(newPosting.getPostingId(), newPosting);
        return newPosting;
    }

    public List<Profile> getProfiles()
    {
        List<Profile> profileList = new ArrayList<>(profiles.values());
        return profileList;
    }

    public List<Posting> getPostings()
    {
        List<Posting> postingList = new ArrayList<>(postings.values());
        return postingList;
    }

    public Profile getProfileById(Integer id)
    {
        return profiles.get(id);
    }
    //get all
    public Posting gePostingById(Integer id)
    {
        return postings.get(id);
    }
}
