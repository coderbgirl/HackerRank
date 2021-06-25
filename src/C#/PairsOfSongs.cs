using System;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    class PairsOfSongs
    {
        public void main()
        {
            int[] arr = { 30, 20, 150, 100, 40 ,13 };
            //int[] arr = { 60,60,60 };
            int result = numPairsDivisibleBy60ByArray(arr);
            Console.WriteLine("OUTPUT: " + result);
        }

        public int numPairsDivisibleBy60(int[] time)
        {

            int count = 0;
            Dictionary<int, int> map = new Dictionary<int, int>();

            for (int i = 0; i < time.Length; i++)
            {
                if(map.ContainsKey(time[i] % 60))
                {
                    map[time[i] % 60] = map[time[i] % 60] + 1;
                }
                else
                {
                    map[time[i] % 60] = 1;
                }
            }

            List<int> keys = new List<int>(map.Keys);

            foreach (int key in keys)
            {
                if (key == 30 || key == 0)
                {
                    int num = (map[key] * (map[key] - 1)) / 2;
                    count = count + num;
                }
                else
                {
                    count = count + (map[key] * map[60 - key]);
                }
                map[key] = 0;
            }
            return count;

        }

        public int numPairsDivisibleBy60ByArray(int[] time)
        {

            int count = 0;
            int[] map = new int[60];

            for (int i = 0; i < time.Length; i++)
            {
                map[time[i] % 60]++;
            }


            for(int i = 0; i < map.Length; i++)
            {
                if (i == 30 || i == 0)
                {
                    int num = (map[i] * (map[i] - 1)) / 2;
                    count = count + num;
                }
                else
                {
                    count = count + (map[i] * map[60 - i]);
                }
                map[i] = 0;
            }
            return count;

        }
    }
}
