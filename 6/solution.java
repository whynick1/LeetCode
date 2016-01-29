//really hard, fail to solve the problem
//genious solution beat 88% without using a number of Strings to store char on each row
//In the second row, initially offset equals gap - row_index*2 = 6-1*2 = 4. The first element in the second row is s[1], the second one is s[1+offset] = s[5]. Then offset becomes gap-offset = 6-4 = 2. So the third element is s[5+offset] = s[7]. In fact, the offset for the next element is always equal to the gap - offset of the previous element.
//never use *2, use <<1 instead;
public class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int gap = (numRows-1)<<1;
        StringBuilder result = new StringBuilder();
        for(int i=0; i<numRows; i++) {
            int current = i;
            int offset = gap - (i<<1);
            while(current<s.length()) {
                if( offset != 0 ) { 
                    // avoid inserting duplicate elements
                    // in the first and the last row
                    result.append(s.charAt(current));
    
                    current += offset;
                }
                offset = gap-offset;
            }
        }
    
        return result.toString();
    }
}