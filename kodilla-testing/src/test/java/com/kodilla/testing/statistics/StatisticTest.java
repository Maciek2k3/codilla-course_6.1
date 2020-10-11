package com.kodilla.testing.statistics;

import com.kodilla.testing.library.Book;
import com.kodilla.testing.library.LibraryDatabase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class StatisticTest {
    private static int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Mock
    private Statistics StatisticsMock;

    @Test
    public void testWithPosts0() {
        //Given
        CountStatistics countStatistics = new CountStatistics(StatisticsMock);
        when(StatisticsMock.postsCount()).thenReturn(0);
        //When
        countStatistics.calculateAdvStatistics(StatisticsMock);
        //Then
        assertEquals(0, countStatistics.getPostCount());

    }

    @Test
    public void testWithPosts1000() {
        //Given
        CountStatistics countStatistics = new CountStatistics(StatisticsMock);
        when(StatisticsMock.postsCount()).thenReturn(1000);
        //When
        countStatistics.calculateAdvStatistics(StatisticsMock);
        //Then
        assertEquals(1000, countStatistics.getPostCount());
    }

    @Test
    public void testWithComments0() {
        //Given
        CountStatistics countStatistics = new CountStatistics(StatisticsMock);
        when(StatisticsMock.commentsCount()).thenReturn(0);
        //When
        countStatistics.calculateAdvStatistics(StatisticsMock);
        //Then
        assertEquals(0, countStatistics.getCommentCount());
    }

    @Test
    public void testWithCommentsLessPosts() {
        //Given
        CountStatistics countStatistics = new CountStatistics(StatisticsMock);
        when(StatisticsMock.commentsCount()).thenReturn(4);
        when(StatisticsMock.postsCount()).thenReturn(10);
        //When
        countStatistics.calculateAdvStatistics(StatisticsMock);
        //Then
        assertTrue(countStatistics.getCommentCount() < countStatistics.getPostCount());

    }

    @Test
    public void testWithCommentsGraterPosts() {
        //Given
        CountStatistics countStatistics = new CountStatistics(StatisticsMock);
        when(StatisticsMock.commentsCount()).thenReturn(10);
        when(StatisticsMock.postsCount()).thenReturn(4);
        //When
        countStatistics.calculateAdvStatistics(StatisticsMock);
        //Then
        assertTrue(countStatistics.getCommentCount() > countStatistics.getPostCount());
    }

    @Test
    public void testWithUsersCount0() {
        //Given
        List<String> userList = new ArrayList<>();
        CountStatistics countStatistics = new CountStatistics(StatisticsMock);
        when(StatisticsMock.usersNames()).thenReturn(userList);
        //When
        countStatistics.calculateAdvStatistics(StatisticsMock);
        //Then
        assertEquals(0, countStatistics.getUserCount());
    }

    @Test
    public void testWithUsersCount1000() {
        //Given
        List<String> userList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            userList.add("User1");
        }
        CountStatistics countStatistics = new CountStatistics(StatisticsMock);
        when(StatisticsMock.usersNames()).thenReturn(userList);
        //When
        countStatistics.calculateAdvStatistics(StatisticsMock);
        //Then
        assertEquals(1000, countStatistics.getUserCount());
    }
}
