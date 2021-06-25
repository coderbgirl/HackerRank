using System;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    class MaintainMinInStack
    {
        private int[] arr;
        private int lastInd = -1;
        private Stack<int> minStack = new Stack<int>();
        private int min = Int32.MaxValue;
        public void main(int len)
        {
            arr = new int[len];

            Read();
            Push(5); Read();
            Push(6); Read();
            Push(3); Read();
            Peek(); Read();
            Push(7); Read();
            Push(6); Read();
            Pop(); Read();
            Pop(); Read();
            Pop(); Read();
            
        }
        
        public void Push(int val)
        {
            if (lastInd < arr.Length-1)
            {
                if(val < min)
                {
                    min = val;
                    minStack.Push(val);
                }
                
                lastInd++;
                arr[lastInd] = val;
                Console.WriteLine("Pushed " + Convert.ToString(val) + " Min Value: " + Convert.ToString(minStack.Peek()));
            }
            else
            {
                Console.WriteLine("Stack is full. Pop some vales.");
            }
        }

        public void Pop()
        {
          
            if (IsEmpty())
            {
                Console.WriteLine("Stack is Empty. You cannot pop.");
            }
            else
            {
                if(arr[lastInd] == min)
                {
                    minStack.Pop();
                }
                int val = arr[lastInd];
                arr[lastInd] = 0;
                lastInd--;
                Console.WriteLine("Poped " + Convert.ToString(val) + " Min Value: " + Convert.ToString(minStack.Peek()));
            }
        }

        public void Peek()
        {
            if (IsEmpty())
            {
                Console.WriteLine("Can not peek on empty stack");
            }
            else
            {
                Console.WriteLine("Peek: " + arr[lastInd]);
            }
        }

        public void Read()
        {
            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write(arr[i] + " ");
            }
            Console.WriteLine();
        }

        public void Size()
        {
            Console.WriteLine("Size: "+ lastInd);
        }

        public bool IsEmpty()
        {
            if(lastInd < 0)
                return true;
            return false;
        }

    }
}
