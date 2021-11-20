package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.predictors.ConservativePredictor;

public class ZGeneration extends User{

    public ZGeneration(String name) {
        super(name);
        this.socialMediaType = new SnapchatPublisher();
    }
}
