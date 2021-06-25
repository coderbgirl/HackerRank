using System;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    class ExtraStuff
    {
        public void Extra()
        {

            HashSet<char> set = new HashSet<char>();
            Dictionary<char, int> map = new Dictionary<char, int>();
            StringBuilder sb = new StringBuilder("abc");
            Stack<int> minStack = new Stack<int>();


        int[,] matrix = { { 1, 2, 34, 4 }, { 1, 0, 2, 5 }, { 5, 6, 7, 0 } };

            for (int i = 0; i < matrix.GetLength(0); i++)
            {
                for (int j = 0; j < matrix.GetLength(1); j++)
                {
                    Console.Write(matrix[i, j] + " ");
                }
                Console.WriteLine();
            }


            MultipleStackInArray obj = new MultipleStackInArray();
            obj.main(5);


            MaintainMinInStack obj2 = new MaintainMinInStack();
            obj2.main(10);

            /*
            if (result == false)
                Console.WriteLine("NO");
            else
                Console.WriteLine("YES");
            */
        }
    }
}
