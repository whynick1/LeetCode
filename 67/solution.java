//easy to solve but difficult to avoid transfering binary to decimal
//genious solution by calculate binary number directly
//using a carry to store 进位，using a while loop to calculate from lower digit
//don't forget to call reverse() before call toString
public class Solution {
    public String addBinary(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(Math.max(aLength, bLength) > 0) {
          int aNum = aLength > 0 ? (a.charAt(aLength---1) - '0') : 0;
          int bNum = bLength > 0 ? (b.charAt(bLength---1) - '0') : 0;
          int cNum = aNum + bNum + carry;
          sb.append(cNum%2);
          carry = cNum / 2;
        }
        return (carry == 1)?sb.append(1).reverse().toString():sb.reverse().toString();
    }
}

  