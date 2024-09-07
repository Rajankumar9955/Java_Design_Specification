package design.specification1;

public class MyUtility {
   public static int VowelCount(UserName userName)
   {
      int vowel=0;
      char[] FullName=userName.FULLNAME().toCharArray();
      for(char c:FullName)
      {
         if(c=='a'||c=='e'||c=='i'
                 ||c=='o'||c=='u'
                 ||c=='A'||c=='E'
                 ||c=='I'||c=='O'||c=='U'){
            vowel++;
         }
      }
      return vowel;
   }
   }
