using System;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    class MergeSort
    {
        public void main()
        {
            int[] arr = {6, 2,7,1,8,9,3,5};

            List<int> l = new List<int>(arr);

            List<int> output  = mergesort(l);

            foreach(int i in output)
            {
                Console.WriteLine(i + " ");
            }
        }

        public List<int> mergesort(List<int> m)
        {
            List<int> result = new List<int>();
            List<int> left = new List<int>();
            List<int> right = new List<int>();
            if (m.Count <= 1)
                return m;

            int middle = m.Count / 2;
            for (int i = 0; i < middle; i++)
                left.Add(m[i]);
            for (int i = middle; i < m.Count; i++)
                right.Add(m[i]);

            left = mergesort(left);
            right = mergesort(right);

            if (left[left.Count - 1] <= right[0])
                return append(left, right);

            result = merge(left, right);

            return result;
        }

        public List<int> append(List<int> a, List<int> b)
        {
            List<int> result = new List<int>(a);
            foreach (int x in b)
                result.Add(x);
            return result;
        }


        public List<int> merge(List<int> a, List<int> b)
        {
            List<int> s = new List<int>();
            while (a.Count > 0 && b.Count > 0)
            {

                if (a[0] < b[0])

                {
                    s.Add(a[0]);
                    a.RemoveAt(0);
                }
                else
                {
                    s.Add(b[0]);
                    b.RemoveAt(0);
                }
            }
            while (a.Count > 0)

            {
                s.Add(a[0]);

                a.RemoveAt(0);
            }

            while (b.Count > 0)

            {
                s.Add(b[0]);

                b.RemoveAt(0);
            }

            return s;
        }
    }
}
