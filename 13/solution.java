//1:I 5:V 10:X 50:L 100:C 500:D 1000:M
public class Solution {
  public int romanToInt(String s) {
      char lastLetter = '0';
      int number = 0;
      for (int i = 0; i < s.length(); i++)
      {
          switch(s.charAt(i))
          {
            case 'I':
            {
                number += 1;
                lastLetter = 'I';
                break;
            }   
            case 'V':
            {
                if (lastLetter == 'I')
                {
                    number += 3;
                }
                else
                    number += 5;
                lastLetter = 'V';
                break;
            }
            case 'X':
            {
                if (lastLetter == 'I')
                {
                    number += 8;
                }
                else
                    number += 10;
                lastLetter = 'X';
                break;
            }
            case 'L':
            {
                if (lastLetter == 'X')
                {
                    number += 30;
                }
                else
                    number += 50;
                lastLetter = 'L';
                break;
            }
            case 'C':
            {
                if (lastLetter == 'X')
                {
                    number += 80;
                }
                else
                    number += 100;
                lastLetter = 'C';
                break;
            }
            case 'D':
            {
                if (lastLetter == 'C')
                {
                    number += 300;
                }
                else
                    number += 500;
                lastLetter = 'D';
                break;
            }
            case 'M':
            {
                if (lastLetter == 'C')
                {
                    number += 800;
                }
                else
                    number += 1000;
                lastLetter = 'M';
                break;
            }
          }
      }
      return number;
  }
}