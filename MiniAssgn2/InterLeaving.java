public class InterLeaving
{
        public void isInterleaving(String one, String two, String text)
        {
            int a = one.length() - 1;
            int b = two.length() - 1;
            int c = text.length() - 1;
            // Result indicator
            int result = 1;
            while (c >= 0 && result == 1)
            {
                if (a >= 0 && one.charAt(a) == text.charAt(c))
                {
                    a--;
                }
                else if (b >= 0 && two.charAt(b) == text.charAt(c))
                {
                    b--;
                }
                else
                {
                    result = 0;
                }
                c--;
            }
            if (result == 1)
            {
                System.out.print("\n " + text + " is interleaving of " + one + " " + two);
            }
            else
            {
                System.out.print("\n " + text + " is not interleaving of " + one + " " + two);
            }
        }
        public static void main(String[] args)
        {
            InterLeaving task = new InterLeaving();
            String one = "abc";
            String two = "def";
            String text = "dabecf";
            task.isInterleaving(one, two, text);
            String s1 = "gid";
            String s2 = "Hash";
            String s3 = "Hgasidh";
            task.isInterleaving(s1, s2, s3);
            String s4 = "Hgaidhs";
            task.isInterleaving(s1, s2, s4);

        }
    }

