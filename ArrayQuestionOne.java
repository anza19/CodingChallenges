public class ArrayQuestionOne{

     public static void main(String []args){
        System.out.println("Hello World");
        System.out.println(isUniqueChars("anza"));
     }
     
    public static boolean isUniqueChars(String str){
        
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                
                //compare the two characters
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
     }
}
