import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeTest {

    Deque<Integer> deque = new Deque<>();

    @Test
    public void addFront_whenEmpty() {
        deque.addFront(1);

        assertEquals(1, deque.size());
        assertEquals(1, deque.innerStorage.get(0));
    }

    @Test
    public void addFront_whenSomeItems() {
        deque.addFront(1);
        deque.addFront(2);
        deque.addFront(3);

        assertEquals(3, deque.size());
        assertEquals(3, deque.innerStorage.get(0));
        assertEquals(2, deque.innerStorage.get(1));
        assertEquals(1, deque.innerStorage.get(2));
    }

    @Test
    public void addTail_whenEmpty() {
        deque.addTail(1);

        assertEquals(1, deque.size());
        assertEquals(1, deque.innerStorage.get(0));
    }

    @Test
    public void addTail_whenSomeItems() {
        deque.addTail(1);
        deque.addTail(2);
        deque.addTail(3);

        assertEquals(3, deque.size());
        assertEquals(1, deque.innerStorage.get(0));
        assertEquals(2, deque.innerStorage.get(1));
        assertEquals(3, deque.innerStorage.get(2));
    }

    @Test
    public void removeFront_whenEmpty() {
        assertNull(deque.removeFront());
    }

    @Test
    public void removeFront_whenSomeItems() {
        deque.addTail(1);
        deque.addTail(2);
        deque.addTail(3);

        assertEquals(3, deque.size());
        assertEquals(1, deque.removeFront());
        assertEquals(2, deque.innerStorage.get(0));
        assertEquals(2, deque.size());
    }

    @Test
    public void removeTail_whenEmpty() {
        assertNull(deque.removeTail());
    }

    @Test
    public void removeTail_whenSomeItems() {
        deque.addTail(1);
        deque.addTail(2);
        deque.addTail(3);

        assertEquals(3, deque.size());
        assertEquals(3, deque.removeTail());
        assertEquals(1, deque.innerStorage.get(0));
        assertEquals(2, deque.size());
    }

    @Test
    public void isPalindromeTest() {
        assertTrue(deque.isPalindrome("psttsp"));
        assertTrue(deque.isPalindrome("pststsp"));
        assertFalse(deque.isPalindrome("pstsitsp"));
        assertTrue(deque.isPalindrome(""));
        assertFalse(deque.isPalindrome(null));
    }
}