package comp74;

import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;

import comp74.nelsonlab2.model.Model;
import comp74.nelsonlab2.model.Posting;
import comp74.nelsonlab2.model.Profile;

@Component
public class Initializer implements CommandLineRunner{

    Model model;
    final Integer MIN_PROFILES = 2;
    final Integer MAX_PROFILES = 10;
    final Integer MIN_POSTS = 2;
    final Integer MAX_POSTS = 8;

    Lorem lorem = LoremIpsum.getInstance();

    public Initializer(Model model) {
        this.model = model;
    }

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
           
        Random random = new Random();
        
        Integer nProfiles = MIN_PROFILES + random.nextInt(MAX_PROFILES - MIN_PROFILES);


        for(int profileCount=0; profileCount< nProfiles; profileCount++)
        {
            Profile newProfile = new Profile(lorem.getName());
            Integer nPostings = MIN_POSTS + random.nextInt(MAX_POSTS - MIN_POSTS);
            for(int postCount=0; postCount< nPostings; postCount++ )
            {
                Posting newPost = new Posting();
                newPost.setUsername(newProfile.getUserName());
                Integer nWords = 10 + random.nextInt(MAX_POSTS - MIN_POSTS);
                newPost.setPostingText(lorem.getWords(nWords));
                model.addPost(newPost);
                newProfile.addPosting(newPost);
            }
            model.addProfile(newProfile);
        }
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }


    
}
