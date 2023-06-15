package com.teachercrm.neetcode;

import java.util.*;

public class Twitter {

    private Map<Integer, Set<Integer>> userFollows;
    private Map<Integer, Set<Post>> usersPosts;

    private Map<Long, Integer> timestampToTweetId;

    public Twitter() {

        this.userFollows = new HashMap<>();
        this.usersPosts = new HashMap<>();
        this.timestampToTweetId = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {

        if(!usersPosts.containsKey(userId)) {
            usersPosts.put(userId,new HashSet<>());
        }
        Post post = new Post(System.currentTimeMillis(),tweetId);
        usersPosts.get(userId).add(post);
        timestampToTweetId.put(post.timestamp, post.tweetId);
    }

    public List<Integer> getNewsFeed(int userId) {

        Set<Post> totalTweets = new HashSet<>();

        if(usersPosts.containsKey(userId))
        {
            totalTweets.addAll(usersPosts.get(userId));
        }

        if(userFollows.containsKey(userId))
        {
            for(Integer followeeId : userFollows.get(userId))
            {
                totalTweets.addAll(usersPosts.get(followeeId));
            }
        }

        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(Post tweet:totalTweets)
        {
            maxHeap.add(tweet.timestamp);
            if(maxHeap.size() > 10)
            {
                maxHeap.poll();
            }
        }

        List<Integer> results = new ArrayList<>();
        while(!maxHeap.isEmpty())
        {
            results.add(timestampToTweetId.get(maxHeap.poll()));
        }

        return results;
    }

    public void follow(int followerId, int followeeId) {

        if(!userFollows.containsKey(followerId)) {
            userFollows.put(followerId,new HashSet<>());
        }
        userFollows.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {

        if(userFollows.containsKey(followerId)) {
            userFollows.get(followerId).remove(followeeId);
        }
    }



    class Post
    {
        public long timestamp;
        public int tweetId;

        public Post(long timestamp, int tweetId) {
            this.timestamp = timestamp;
            this.tweetId = tweetId;
        }
    }

}
