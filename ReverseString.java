// We are provided with a string that consists of alphabets along with '@', '#' and '_'.
// We need to reverse the string without changing the locations of special characters.
// Example:
// Input : a@b#c_
// Output : c@b#a_

class ReverseString {
    static String function(String str){
        char[] arr=str.toCharArray();
        int left=0,right=str.length()-1;
        while(left<=right){
            if(arr[left]=='@' || arr[left]=='#' || arr[left]=='_'){
                left++;
                continue;
            }
            if(arr[right]=='@' || arr[right]=='#' || arr[right]=='_'){
                right--;
                continue;
            }
            char ch=str.charAt(left);
            arr[left]=arr[right];
            arr[right]=ch;
            left++;
            right--;   
        }
        String res=new String();
        for(char ch:arr){
            res+=ch;
        } 
        return res;
    }
    public static void main(String[] args) {
        String str = "a@b#c_";
        System.out.println(function(str));
    }
}