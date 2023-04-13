import java.util.*;

public class Deque<T> {

    LinkedList<T> innerStorage;
    public Deque()
    {
        innerStorage = new LinkedList<>();
    }

    public void addFront(T item)
    {
        innerStorage.addFirst(item);
    }

    public void addTail(T item)
    {
        innerStorage.addLast(item);
    }

    public T removeFront()
    {
        return size() == 0 ? null : innerStorage.removeFirst();
    }

    public T removeTail()
    {
        return size() == 0 ? null : innerStorage.removeLast();
    }

    public int size()
    {
        return innerStorage.size();
    }

    public boolean isPalindrome(String value) {
        if (value == null)
            return false;
        Deque<String> deque = new Deque<>();

        for (String s: value.split("")) {
            deque.addFront(s);
        }

        while (deque.size() > 1) {
            if (!deque.removeFront().equals(deque.removeTail()))
                return false;
        }
        return true;
    }
}