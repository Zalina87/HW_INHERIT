package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void shouldMatchesSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "перезвонить маме");
        Assertions.assertTrue(simpleTask.matches("перезвонить"));
        Assertions.assertFalse(simpleTask.matches("123"));
    }

    @Test
    void shouldMatchesEpic() {
        String[] subtasks = {"купить молоко", "принести яйца", "нарезать хлеб"};
        Epic epic = new Epic(55, subtasks);
        Assertions.assertTrue(epic.matches("мол"));
        Assertions.assertFalse(epic.matches("кефир"));
    }

    @Test
    void shouldMatchesMeeting() {
        Meeting meeting = new Meeting(2, "обновления", "версия", "02.02.2025");
        Assertions.assertTrue(meeting.matches("обн"));
        Assertions.assertTrue(meeting.matches("версия"));
        Assertions.assertFalse(meeting.matches("03"));
    }
}