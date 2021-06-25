using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    class QueueUsingStacks
    {
        private Stack<int> stack = new Stack<int>();
        private Stack<int> stackBuffer = new Stack<int>();
        public void main()
        {
            Read();
            Enqueue(1); Read();
            Enqueue(2); Read();
            Enqueue(3); Read();
            Dequeue(); Read();
            Dequeue(); Read();
            Peek(); Read();
            Enqueue(4); Read();
            Enqueue(5); Read();
            Dequeue(); Read();
            Peek(); Read();
            Dequeue(); Read();
            Enqueue(6); Read();
            Dequeue(); Read();
            Dequeue(); Read();
            Dequeue(); Read();
        }

        public void Enqueue(int val)
        {
            stack.Push(val);
            Console.WriteLine("Pushed in a queue" + Convert.ToString(val));
            
        }

        public void Dequeue()
        {

            if (stack.Count == 0)
            {
                Console.WriteLine("Queue is Empty. You cannot pop.");
            }
            else
            {
                while(stack.Count > 0)
                {
                    stackBuffer.Push(stack.Pop());
                }
                int val = stackBuffer.Pop();

                while (stackBuffer.Count > 0)
                {
                    stack.Push(stackBuffer.Pop());
                }
                Console.WriteLine("Poped from queue: " + Convert.ToString(val));
            }
        }

        public void Peek()
        {
            if (stack.Count == 0)
            {
                Console.WriteLine("Can not peek on empty queue.");
            }
            else
            {
                Console.WriteLine("Peek: " + stack.Peek());
            }
        }

        public void Size()
        {
            Console.WriteLine("Size: " + stack.Count);
        }

        public bool IsEmpty()
        {
            if (stack.Count == 0)
                return true;
            return false;
        }

        public void Read()
        {
            IEnumerator em =  stack.GetEnumerator();
            while(em.MoveNext())
            {
                Console.Write(em.Current + " ");
            }
            Console.WriteLine();
        }
    }
}
