package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().tasks.add("Run");
        board.getInProgressList().tasks.add("Write");
        board.getDoneList().tasks.add("Think");
        //Then
        Assert.assertEquals("Run", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Write", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Think", board.getDoneList().getTasks().get(0));
    }
}
