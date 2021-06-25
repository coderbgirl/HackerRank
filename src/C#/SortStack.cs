using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    class SortStack
    {

        private Stack<int> stack = new Stack<int>();
        private Stack<int> stackBuffer = new Stack<int>();

        public void main()
        {
            stack.Push(3);
            stack.Push(7);
            stack.Push(1);
            stack.Push(8);
            stack.Push(5);
            stack.Push(12);
            stack.Push(4);

            IEnumerator em = stack.GetEnumerator();

            while (em.MoveNext())
            {
                Console.Write(em.Current + " ");
            }
            Console.WriteLine();

            sortStack();
            Read();
        }

        public void sortStack()
        {
            while (stack.Count > 0)
            {
                int temp = stack.Pop();

                while(stackBuffer.Count > 0 && stackBuffer.Peek() > temp)
                {
                    stack.Push(stackBuffer.Pop());
                }
                stackBuffer.Push(temp);
            }
        }


        public void Read()
        {
            IEnumerator em = stackBuffer.GetEnumerator();

            while (em.MoveNext())
            {
                Console.Write(em.Current + " ");
            }
            Console.WriteLine();
        }
    }
}
