//good job!
//beat 87% by myself
public class Solution {
    public String getHint(String secret, String guess) {
        int length = secret.length();
        //secr array store the secret in character
        int[] secr = new int[length];
        //table shows how many avilable elements which could be paired by guess character
        //each bull/cow will decrement secr[i] by 1
        int[] table = {0,0,0,0,0,0,0,0,0,0};
        int cow = 0;
        int bull = 0;
        for (int i = 0; i < length; i++)
        {
            int c1 = secret.charAt(i)-'0';
            secr[i] = c1;
            table[c1]++;
        }
        for (int j = 0; j < length; j++)
        {
            int c2 = guess.charAt(j)-'0';
            //mean there is avilable element which could be paired
            if (table[c2] != 0)
            {
                //means find bull
                if (secr[j] == c2)
                {
                    bull++;
                    table[c2]--;
                }
                //find cow
                else
                {
                    table[c2]--;
                    cow++;
                }
            }
            //no avilable element, but it is possible one more bull exist if cow--
            //easy to omit "1022" "1222" -> actually 3A0B not 2A1B
            else
            {
                //find bull
                if (secr[j] == c2)
                {
                    bull++;
                    cow--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bull + "A" + cow + "B");
        return sb.toString();
    }
}
