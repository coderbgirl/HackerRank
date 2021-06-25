using System;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    public class NumberOflsand
    {
        private int[,] grid = {{1, 1, 0, 0, 0 },
                               {0, 1, 0, 0, 1},
                               {1, 0, 0, 1, 1},
                               {0, 0, 0, 0, 0},
                               {1, 0, 1, 0, 1}};
        private bool[,] visited = new bool[5,5];

        private int[] rowInd2 = { 0, 0, -1, 1, -1, -1, 1, 1 };
        private int[] colInd2 = { -1, 1, 0, 0, -1, 1, -1, 1 };
        private Stack<Node> s;
        private int subMin;

        public void CountNumberOflsandBFS()
        {
            int count = 0;
            int min = Int32.MaxValue;

            int[] rowInd = { 0, 0, -1, 1, -1, -1, 1, 1 };
            int[] colInd = { -1, 1, 0, 0, -1, 1, -1, 1 };

            for(int i = 0; i < grid.GetLength(0); i++)
            {
                for(int j = 0; j < grid.GetLength(0); j++)
                {
                    if(grid[i,j] == 1 && !visited[i, j])
                    {
                        visited[i, j] = true;

                        Queue<Node> q = new Queue<Node>();
                        Node node = new Node(i, j);

                        q.Enqueue(node);
                        int subCount = 1;

                        while(q.Count > 0)
                        {
                            Node temp = q.Dequeue();

                            int row = temp.row;
                            int col = temp.col;

                            for(int k = 0; k < 8; k++)
                            {
                                if(IsSafe(row+rowInd[k], col + colInd[k]))
                                {
                                    Node n = new Node(row + rowInd[k], col + colInd[k]);
                                    q.Enqueue(n);
                                    visited[row + rowInd[k], col + colInd[k]] = true;
                                    subCount++;
                                }
                            }
                        }
                        min = Math.Min(min, subCount);
                        count++;
                    }

                }
            }
            Console.WriteLine("Number of Island: " + count);
            Console.WriteLine("Smallest Island : " + min);
        }

        public void CountNumberOflsandDFS()
        {
            int count = 0;
            int min = Int32.MaxValue;

            for (int i = 0; i < grid.GetLength(0); i++)
            {
                for (int j = 0; j < grid.GetLength(0); j++)
                {
                    if (grid[i, j] == 1 && !visited[i, j])
                    {
                        visited[i, j] = true;

                        s = new Stack<Node>();
                        Node node = new Node(i, j);
                        s.Push(node);
                        subMin = 1;

                        while (s.Count > 0)
                        {
                            DFS(node.row, node.col);
                            min = Math.Min(min, subMin);

                        }
                        count++;
                    }

                }
            }
            Console.WriteLine("Number of Island: " + count);
            Console.WriteLine("Smallest Island : " + min);
        }

        public void DFS (int i, int j)
        {
            for (int k = 0; k < 8; k++)
            {
                int row = i + rowInd2[k];
                int col = j + colInd2[k];
                if (IsSafe(row, col))
                {
                    Node n = new Node(row, col);
                    s.Push(n);
                    visited[row, col] = true;
                    subMin++;
                    DFS(row, col);
                }
            }
            s.Pop();
        }

        public bool IsSafe(int i, int j)
        {
            if (i >= 0 && i < grid.GetLength(0) && j >= 0 && j < grid.GetLength(1) && grid[i,j] == 1 && !visited[i, j])
                return true;
            return false;
        }
    }

    public class Node
    {
        public int row;
        public int col;

        public Node(int r, int c)
        {
            row = r;
            col = c;
        }
     
    }
}
