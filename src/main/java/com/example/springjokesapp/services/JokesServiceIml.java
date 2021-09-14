package com.example.springjokesapp.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class JokesServiceIml implements JokesService{

    private final Random RANDOM = new Random(System.currentTimeMillis());
    private final String[] JOKES = {
            "Jack was nimble, Jack was quick, but Jack still couldn't dodge Chuck Norris' roundhouse kick",
            "In the Beginning, there was nothing. Then Chuck Norris roundhouse kicked nothing and told it to get a job",
            "Chuck Norris once roundhouse kicked someone so hard that his foot broke the speed of light",
            "Since 1940, the year Chuck Norris was born, roundhouse kick related deaths have increased 13,000 percent",
            "Chuck Norris once roundhouse kicked a coal mine and turned it into a diamond mine",
            "Chuck Norris doesn't strike gold, gold is the byproduct of Chuck Norris roundhouse kicking rocks",
            "Mission Impossible was originally set in Chuck Norris’s house",
            "Chuck Norris uses pepper spray to season his meat",
            "Chuck Norris plays Jenga with Stonehenge",
            "When the Boogeyman goes to sleep every night he checks his closet for Chuck Norris",
            "The flu gets a Chuck Norris shot every year",
            "Chuck doesn't need to throw out the trash, it always throws itself out",
            "Chuck Norris is the reason that Wally is always hiding",
            "Chuck Norris doesn't worry about high gas prices. His vehicles run on fear",
            "When Chuck Norris plays dodgeball, the balls dodge him",
            "Chuck Norris beat the sun in a staring contest",
            "Chuck Norris does not get frostbite. Chuck Norris bites frost",
            "Chuck Norris can build a snowman out of rain"
    };

    @Override
    public String getJoke() {
        int randomIndex = RANDOM.nextInt(JOKES.length);
        return JOKES[randomIndex];
    }
}
