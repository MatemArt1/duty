public class Main {
    /*
    public class Dinglemouse {
  public static boolean exit(char[][] h, int i0, int j0, int l1, int l2, int h1, int h2)
    {
    int si = i0;
    int sj = j0;
    int L = h[0].length;
    boolean E = false; // не нашёл выхода
    while (si == 0 || si == h.length || sj == 0 || sj == L)
      {
      for (int j = sj; j > ; j++)
     {

      }
    }
  }
  public static boolean allAlone(char[][] house) {
    // Your code here
   for (int i = 0; i < house.length; i = i + 2)
     {
     for (int j = 0; j < house[i].length; j++)
     {
     if (house[i][j] == 'o')
       {
       boolean [] B = {false, false, false, false};
        for (int k = j - 1; k >= 0; k--)
     {
          if (house[i][k] == '#')
            {
            int l1 = j - k - 1;
            B[0] = true;
            break;
          }
        }
          if (B[0] == false)
            continue;

       for (int k = j + 1; k < house[i].length; k++)
     {
          if (house[i][k] == '#')
            {
            int l2 = k - j - 1;
            B[1] = true;
            break;
          }
        }
          if (B[1] == false)
            continue;

       for (int k = i - 2; k >=0; k = k - 2)
         {
         if (house[k][j] == '#')
           {
           int h1 = i - k - 2;
           B[2] = true;
         }
       }
       if (B[2] == false)
            continue;

        for (int k = i + 2; k < house.length; k = k + 2)
         {
         if (house[k][j] == '#')
           {
           int h2 = k - i - 2;
           B[3] = true;
         }
       }
       if (B[0] = true && B[1] = true && B[2] = true && B[3] = true)
         return false;
       else
         {

       }
       }
   }
   }
    return true;
  }

}
     */


    /*
    public class Kata {
  public static String encode(String s) {
    String str = "";
    char [] sc  = s.toCharArray();
    str = str + sc[0];
    int l = s.length();
    int h = l/2;
    if (l == 1) return s;
    if (l%2 == 1)
      {
      String str1 = s.substring(0, h + 1);
      char [] sc1  = str1.toCharArray();
      String str2 = s.substring(h + 2);
      char [] sc2  = str2.toCharArray();
      int i = 1;
      while (i != h + 1)
        {
        str = str + sc2[l - i] + sc1[i];
        i++;
      }
      return str;
    }

    else
      {
      String str1 = s.substring(0, h);
      char [] sc1  = str1.toCharArray();
      String str2 = s.substring(h + 1);
      char [] sc2  = str2.toCharArray();
      int i = 1;
      while (i != h)
        {
        str = str + sc2[l - i] + sc1[i];
        i++;
      }
      str = str + sc[h];
      return str;
    }
  }
  public static String decode(String s) {
    String str = "";
    int l = s.length();
    char [] sc  = s.toCharArray();
    if (l == 1) return s;
    if (l%2 == 1)
      {
      for (int i = 0; i <= l - 1; i = i + 2)
        {
        str = str + sc[i];
      }
      for (int i = l - 2; i > 0; i = i - 2)
        {
        str = str + sc[i];
      }
    }

    else
      {
      for (int i = 0; i <= l - 2; i = i + 2)
        {
        str = str + sc[i];
      }
      for (int i = l - 1; i > 0; i = i - 2)
        {
        str = str + sc[i];
      }
    }
    return str;
  }
}
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}