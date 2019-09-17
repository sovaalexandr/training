package com.github.sovaalexandr.who_likes_it;

public class WhoLikesIt
{
    public String likes(String... names) {
        if (0 == names.length) return "no one likes this";
        if (1 == names.length) return names[0] + " likes this";
        if (2 == names.length) return names[0] + " and " + names[1] + " like this";
        if (3 == names.length) return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
    }
}
