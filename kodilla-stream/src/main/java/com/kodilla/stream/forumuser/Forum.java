package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumList = new ArrayList<>();

    public Forum() {
        theForumList.add(new ForumUser(1, "hans", 'M', LocalDate.of(2001, 1, 13), 9));
        theForumList.add(new ForumUser(2, "toto", 'M', LocalDate.of(1992, 1, 23), 6));
        theForumList.add(new ForumUser(3, "bobo", 'F', LocalDate.of(2017, 1, 3), 1));
        theForumList.add(new ForumUser(4, "dodo", 'F', LocalDate.of(2000, 1, 1), 3));
        theForumList.add(new ForumUser(5, "lolo", 'M', LocalDate.of(1995, 12, 13), 12));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumList);
    }
}
