//My solution will transfer binary to decimal,
//which is too complex
//A simple solution should use only bit operation
//Smart!
//Note: n<<will not change n; only n = n<< will change n;
//Note: << & <<< & >>> are the same(fill with 0), while >> will fill the left bit with highest bit
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rlt = 0; 

        for(int i = 32 ; i > 0 ; i--){
            rlt += (((n<<(i-1))>>>31)<<(i-1));
        }

        return rlt;
    }
}