using System;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    class AllCombinationsOfString
    {

        public void main(string s) {

            for (int i = 0; i < s.Length; i++)
            {
                for (int j = 1; j <= s.Length -i; j++)
                {
                    Console.WriteLine(s.Substring(i, j) + " ");
                }
            }
    }
}
}
