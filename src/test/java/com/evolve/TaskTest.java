package com.evolve;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskTest {
    Task task = new Task();

    @Test
    public void testReturnArg() {
        assertEquals(task.returnArg(5), 5);
    }
}
