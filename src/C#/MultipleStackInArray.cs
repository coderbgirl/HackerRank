using System;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    class MultipleStackInArray
    {
        private  int[] arr;
        private  int[] pointer = { -1, -1, -1 };
        public void main(int len)
        {
            int stackLen = len;
            arr = new int[stackLen * 3];

            Read();
            Push(1, 1); Read();
            Pop(3); Read();
            Push(2, 12); Read();
            Push(1, 5); Read();
            Peek(1); Read();
            Push(3, 2); Read();
            Push(3, 6); Read();
            Peek(2); Read();
            Pop(1); Read();
            Pop(1); Read();
            Peek(2); Read();
            Push(1, 7); Read();
            Pop(3); Read();
            Pop(2); Read();
            Peek(2);
            Push(2, 9); Read();
            Peek(1); Read();
            Push(1, 5); Read();
            Push(1, 5); Read();
            Push(1, 5); Read();
            Push(1, 5); Read();
            Push(1, 5); Read();
            Push(1, 5); Read();
        }

        public void Read()
        {
            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write(arr[i] + " ");
            }
            Console.WriteLine();
        }

        public void Push(int stackNo, int val)
        {
            int ind = -1;
            if (pointer[stackNo - 1] < (arr.Length / 3) - 1)
            {
                pointer[stackNo - 1] = pointer[stackNo - 1] + 1;
                ind = ((arr.Length / 3) * (stackNo - 1)) + pointer[stackNo - 1];
                arr[ind] = val;
                Console.WriteLine("Pushed " + Convert.ToString(val) + " at index " + Convert.ToString(ind));
            }
            else
            {
                Console.WriteLine("Stack is full. Pop some vales.");
            }
        }


        public void Pop(int stackNo)
        {
            int ind = -1;
            int val = -1;
            if (pointer[stackNo - 1] < 0)
            {
                Console.WriteLine("Stack is Empty. You cannot pop.");
            }
            else
            {

                ind = ((arr.Length / 3) * (stackNo - 1)) + pointer[stackNo - 1];
                val = arr[ind];
                arr[ind] = 0;
                pointer[stackNo - 1] = pointer[stackNo - 1] - 1;
                Console.WriteLine("Poped " + Convert.ToString(val) + " at index " + Convert.ToString(ind));
            }
        }

        public void Peek(int stackNo)
        {
            int ind = -1;
            int val = -1;
            if (pointer[stackNo - 1] < 0)
            {
                Console.WriteLine("Can not peek on empty stack");
            }
            else
            {

                ind = ((arr.Length / 3) * (stackNo - 1)) + pointer[stackNo - 1];
                val = arr[ind];
                Console.WriteLine("Peek: " + val);
            }
        }
    }
}
