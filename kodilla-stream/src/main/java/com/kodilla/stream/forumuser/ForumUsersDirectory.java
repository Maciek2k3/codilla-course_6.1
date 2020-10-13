package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ForumUsersDirectory {
    public List<ForumUser> getUserList(){
        List<ForumUser> forumUserList=new ArrayList<>();
        forumUserList.add(new ForumUser(1,"John", 'M', LocalDate.of(1999,10,12),2));
        forumUserList.add(new ForumUser(2,"Mark", 'M',LocalDate.of(2000,9,12),1));
        forumUserList.add(new ForumUser(3,"Martha", 'F',LocalDate.of(2004,10,12),0));
        forumUserList.add(new ForumUser(4,"Jenny", 'F',LocalDate.of(1988,10,12),4));
        forumUserList.add(new ForumUser(5,"John", 'M',LocalDate.of(2005,10,12),5));
        forumUserList.add(new ForumUser(6,"John1", 'M',LocalDate.of(1978,10,12),0));
        forumUserList.add(new ForumUser(7,"Joei", 'F',LocalDate.of(1965,10,12),3));
        forumUserList.add(new ForumUser(8,"John4", 'M',LocalDate.of(1979,10,12),4));
        forumUserList.add(new ForumUser(9,"Johnan", 'M',LocalDate.of(1999,10,12),0));
        forumUserList.add(new ForumUser(10,"Tommy", 'M',LocalDate.of(2001,10,12),1));
        forumUserList.add(new ForumUser(11,"Jolie", 'F',LocalDate.of(1967,10,12),0));
        forumUserList.add(new ForumUser(12,"Nathan", 'M',LocalDate.of(1968,10,12),7));
        forumUserList.add(new ForumUser(13,"John5", 'M',LocalDate.of(2001,10,12),8));

        return forumUserList;
    }
}

