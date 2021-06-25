using System;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    class FindBusiestPeriod
    {

        public void main()
        {
            int[,] data = {
                 { 1487799425, 14, 1},
                 { 1487799425, 4,  0},
                 { 1487799425, 2,  0},
                 { 1487800378, 10, 1},
                 { 1487801478, 18, 0},
                 { 1487801478, 18, 1},
                 { 1487901013, 1,  0},
                 { 1487901211, 7,  1},
                 { 1487901211, 7,  0},
            };

            int output = FindBusiestTimeWithoutDictionary(data);

            Console.WriteLine("FindBusiestTime: " + output);
        }

        public int FindBusiestTime(int[,] data)
        {
            Dictionary<int, int> d = new Dictionary<int, int>();
            int max = Int32.MinValue;
            int timestamp = 0;

            for (int i = 0; i < data.GetLength(0); i++)
            {
                int a = data[i, 0];
                if (d.ContainsKey(data[i, 0]))
                {

                    if (data[i, 2] == 1)
                    {
                        d[data[i, 0]] = d[data[i, 0]] + data[i, 1];
                    }
                    else
                    {
                        d[data[i, 0]] = d[data[i, 0]] - data[i, 1];
                    }
                }
                else
                {
                    if (data[i, 2] == 1)
                    {
                        d[data[i, 0]] = data[i, 1];
                    }
                    else
                    {
                        d[data[i, 0]] = data[i, 1] * (-1);
                    }
                }
            }

            foreach (int key in d.Keys)
            {
                if (d[key] > max) {
                    max = d[key];
                    timestamp = key;
                }


            }

            return timestamp;
        }

        public int FindBusiestTimeWithoutDictionary(int[,] data)
        {
            int count = 0;
            int lastTimestamp = data[0, 0];
            int max = Int32.MinValue;
            int output = 0;

            for (int i = 0; i < data.GetLength(0); i++)
            {
                if(lastTimestamp == data[i, 0])
                {
                    if (data[i, 2] == 1)
                    {
                        count = count + data[i, 1];
                    }
                    else
                    {
                        count = count - data[i, 1];
                    }
                }
                else
                {
                    if(max < count)
                    {
                        max = count;
                        output = lastTimestamp;
                    }
                    lastTimestamp = data[i, 0];
                    count = data[i, 2] == 1 ? (count + data[i, 1]) : (count - data[i, 1]);

                }
            }

            if (max < count)
            {
                output = lastTimestamp;
            }

            return output;
        }
    }
}
