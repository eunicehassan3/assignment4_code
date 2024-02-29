import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        balancedBrackets b = new balancedBrackets();
        DNA2RNA dr = new DNA2RNA();
        InfixToPostfix ip = new InfixToPostfix();
        DequeProb dp = new DequeProb();
        Deque<Integer> d = new LinkedList<>();
        d.add(6);
        d.add(7);
        d.add(0);
        d.add(9);
        d.add(2);

        System.out.println(dp.findInDeque(d,78));

        System.out.println(b.balancedBracket("{[()]}"));
        System.out.println(b.balancedBracket("{[(])}"));
        System.out.println(b.balancedBracket("{{[[(())]]}}"));
        System.out.println(ip.infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));

        System.out.println(dr.DNAConverter("AGCTGGGAAACGTAGGCCTA"));

    }
}