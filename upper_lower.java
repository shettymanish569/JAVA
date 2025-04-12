public class upper_lower {
    public static void solve(String s){
        int upper=0;
        int lower=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                upper++;
            }else{
                lower++;
            }
        }
        if(upper>lower){
            System.out.println(s.toUpperCase());
        }else{
            System.out.println(s.toLowerCase());
        }
    }
    public static void main(String[] args) {
        String s=" maNIsH";
        solve(s);
    }
}
