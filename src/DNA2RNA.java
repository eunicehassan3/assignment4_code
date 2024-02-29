public class DNA2RNA {
    public String DNAConverter(String s){
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'T'){
                res += 'U';
            }
            else{
                res += s.charAt(i);
            }
        }
        return res;
    }
}
