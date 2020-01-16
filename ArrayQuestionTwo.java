public class ArrayQuestionTwo {
    public static void main(String []args){
        System.out.println("Hello World");
        System.out.println(permutations("abcd","dabc"));
    }

    public static boolean permutations(String one, String two){

        //first off, the length of the two strings must equal
        //if not, exit
        if(one.length() != two.length()){
            return false;
        }

        //matches basically is a counter to test if a char in one
        //string exists in the other
        int matches = 0;

        //we use two loops here
        //the outer one goes through the first string
        for(int i = 0; i < one.length(); i++){

            //now our inner loop goes through the second string
            for(int j = 0; j < two.length(); j++){

                //now what we do is that we see if an char of the
                //first string is in the second string
                if(one.charAt(i) == two.charAt(j)){

                    //if we found a matching char, increment matches
                    matches++;
                }
            }
        }

        //now, if test the value of matches
        //if it equals the length of the list, we have a permutation
        if(matches == one.length()){
            return true;
        }
        else{
            return false;
        }
    }
}
