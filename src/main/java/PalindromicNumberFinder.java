public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      int initial = num;
        while(true) {
          if(Integer.parseInt(reverseNum(num)) == num) {
            return (num) - initial;
          } else {
            num++;
          }
        }
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      if(reverseNum(num).equals(String.valueOf(num))) {
        return true;
      } else {
        return false;
      }
      

    }


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      // int reversed = 0; 
      //   while(num > 0) 
      //   { 
      //       reversed = reversed * 10 + num % 10; 
      //       num = num / 10; 
      //   } 
      //   return String.valueOf(reversed); 

      // String reversed = "";
      // String number = String.valueOf(num);
      // for(int i = number.length(); i > 1; i--) {
      //   reversed = reversed + number.charAt(i);
      //   System.out.println(reversed);
      // }
      // return reversed;

      String reversed = "";
      String number = String.valueOf(num);
      for(int i = number.length() - 1; i >= 0; i--) {
        reversed = reversed + number.charAt(i);
      } 
      return reversed;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
