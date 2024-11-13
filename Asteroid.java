// We are provided with a string consisting of asteroids(*).
// When we receive an asteroid it destroys itself along with it's previous character. 
// We need to return the final string after all the asteroids are destroyed.
// Example: 
// Input : aa*bbb**c
// Output : abc
// Explanation : 
// The first (*) destroys itself along with previous character 'a' leaving abbb**c
// The second (*) destroys itself along with previous character 'b' leaving abb*c
// The third (*) destroys itself along with previous character 'b' leaving abc
// And thus final result : abc


//My approcah:
class Asteroid {
    static String function(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                str=str.substring(0,i-1)+str.substring(i+1,str.length());
                i=0;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String str = "he*elll*oo*o* worrr**ldd*!";
        System.out.println(function(str));
    }
}

// Optimal approach:
// class Asteroid {
//     static String function(String str) {
//         StringBuilder result = new StringBuilder();
//         for (char c : str.toCharArray()) {
//             if (c == '*') {
//                 if (result.length() > 0) {
//                     result.deleteCharAt(result.length() - 1); // Pop the last character
//                 }
//             } else {
//                 result.append(c); // Push current character
//             }
//         }
        
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String str = "he*elll*oo*o* worrr**ldd*!";
//         System.out.println(function(str));
//     }
// }
