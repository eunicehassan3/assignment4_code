import java.util.LinkedList;
import java.util.Queue;
public class RNA2Protein {
    public String RNAConverter(String rna){
        String protein = "";
        Queue<Character> queue = new LinkedList<>();

        for(char c: rna.toCharArray()) {
            queue.add(c);
            if(queue.size() == 3){
                protein += (getProtein(queue));
                queue.clear();
            }

        }

        if(!queue.isEmpty()){
            protein += '.';
        }
        return protein;
    }

    public char getProtein(Queue<Character> rna){
        String rnaString = "";
        for(int i = 0; i < 3; i++){
            rnaString += rna.remove();
        }

        char protein;
        switch(rnaString){
            case "UUU":
            case "UUC":
                protein = 'F';
                break;
            case "UUA":
            case "UUG":
            case "CUU":
            case "CUC":
            case "CUA":
            case "CUG":
                protein = 'L';
                break;
            case "AUU":
            case "AUC":
            case "AUA":
                protein = 'I';
                break;
            case "AUG":
                protein = 'M';
                break;
            case "GUU":
            case "GUC":
            case "GUA":
            case "GUG":
                protein = 'V';
                break;
            case "UCU":
            case "UCC":
            case "UCA":
            case "UCG":
            case "AGU":
            case "AGC":
                protein = 'S';
                break;
            case "CCU":
            case "CCC":
            case "CCA":
            case "CCG":
                protein = 'P';
                break;
            case "ACU":
            case "ACC":
            case "ACA":
            case "ACG":
                protein = 'T';
                break;
            case "GCU":
            case "GCC":
            case "GCA":
            case "GCG":
                protein = 'A';
                break;
            case "UAU":
            case "UAC":
                protein = 'Y';
                break;
            case "CAU":
            case "CAC":
                protein = 'H';
                break;
            case "CAA":
            case "CAG":
                protein = 'Q';
                break;
            case "AAU":
            case "AAC":
                protein = 'N';
                break;
            case "AAA":
            case "AAG":
                protein = 'K';
                break;
            case "GAU":
            case "GAC":
                protein = 'D';
                break;
            case "GAA":
            case "GAG":
                protein = 'E';
                break;
            case "UGU":
            case "UGC":
                protein = 'C';
                break;
            case "UGG":
                protein = 'W';
                break;
            case "CGU":
            case "CGC":
            case "CGA":
            case "CGG":
            case "AGA":
            case "AGG":
                protein = 'R';
                break;
            case "GGU":
            case "GGC":
            case "GGA":
            case "GGG":
                protein = 'G';
                break;
            case "UAA":
            case "UAG":
            case "UGA":
                protein = '.';
                break;
            default:
                protein = '.';
        }

        return protein;

    }
}
