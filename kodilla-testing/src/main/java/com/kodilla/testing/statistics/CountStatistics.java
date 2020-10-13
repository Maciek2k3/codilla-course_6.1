package com.kodilla.testing.statistics;

public class CountStatistics {
    private Statistics statistics;

    public CountStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    private int userCount;
    private int postCount;
    private int commentCount;
    private double averPostUser;
    private double averCommentUser;
    private double averCommentPost;

    public Statistics getStatistics() {
        return statistics;
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAverPostUser() {
        return averPostUser;
    }

    public double getAverCommentUser() {
        return averCommentUser;
    }

    public double getAverCommentPost() {
        return averCommentPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        averPostUser = calculateAverPostUser();
        averCommentUser = calculateAverCommentUser();
        averCommentPost = calculateAverCommentPost();

    }

    public double calculateAverPostUser() {
        if (userCount > 0) {
            return (double) postCount / userCount;
        } else {
            return 0;
        }
    }

    public double calculateAverCommentUser() {
        if (userCount > 0) {
            return (double) commentCount / userCount;
        } else {
            return 0;
        }
    }

    public double calculateAverCommentPost() {
        if (postCount > 0) {
            return (double) commentCount / postCount;
        } else {
            return 0;
        }
    }

    public void showStatistics() {
        System.out.println("User count" + userCount);
        System.out.println("Post count" + postCount);
        System.out.println("Comment count" + commentCount);
        System.out.println("Post user Averange" + averPostUser);
        System.out.println("comment user Averange" + averCommentUser);
        System.out.println("comment post Averange" + averCommentPost);

    }
}


