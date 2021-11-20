package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.BuyPredictor;

public class User {

    private final String name;
    protected SocialPublisher socialMediaType;

    public User (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String share() {
        return socialMediaType.share();
    }

//    public void setSocialMediaType(SocialPublisher newSocialMediaType) {
//        this.socialMediaType = newSocialMediaType;
//    }

    public void setSocialMediaType(SocialPublisher socialMediaType) {
        this.socialMediaType = socialMediaType;
    }

}
