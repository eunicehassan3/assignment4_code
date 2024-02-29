import java.util.Deque;
public class DequeProb {
    public int findInDeque(Deque<Integer> q, int y){
        int l = 0;
        int r = q.size() - 1;
        int index = 0;

        while(l < r) {
            if (q.peekFirst() == y) {
                return index;
            } else if (q.peekLast() == y) {
                return index + q.size() - 1;
            }
            l++;
            r--;
            index++;
            q.removeFirst();
            q.removeLast();

        }
        return -1;

    }


}
