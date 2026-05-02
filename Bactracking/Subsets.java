public class Subsets{

    public static void FindSets(String str, String ans, int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // Yes
        FindSets(str, ans+str.charAt(i), i+1 );
        //No
        FindSets(str, ans , i+1);

        
    
    }
    public static void main(String[] args) {
        String str = "abc";
        FindSets(str, "", 0);           
    }
}