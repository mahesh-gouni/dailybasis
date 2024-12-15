package org.example.assignments;

public class PalindromOrNot {
    public static void main(String[] args) {
        String s1="e abccba";
      //  String rev ="";
//        for (int i=s1.length()-1;i>=0;i--){
//           rev+=s1.charAt(i);
//        }
        int m= s1.length()/2;
        boolean palidrome= true;
        for (int i =0;i<=m;i++){

          if (s1.charAt(i)!=s1.charAt(s1.length()-i-1))
            {
               palidrome =false;
            }
          else palidrome= true;
        }
      //  System.out.println((rev.equals(s1)?"palindrom":"not p"));
        System.out.println((palidrome)?"palindrom":"not a palindroam");
    }
}
