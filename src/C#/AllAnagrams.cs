using System;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    class AllAnagrams
    {

        public void main(string s, string ans)
        {
            if(s.Length == 0)
            {
                Console.WriteLine(ans + " ");
                return;
            }

            for(int i = 0;  i < s.Length; i++)
            {
                string roc = s.Substring(0, i) + s.Substring(i + 1);
                main(roc, ans + s[i]);
            }
        }
    }
}
