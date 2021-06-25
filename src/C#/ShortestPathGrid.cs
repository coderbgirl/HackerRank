using System;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    class ShortestPathGrid
    {   
        private int[,] grid = {{'0', '*', '0', 's'},
                               {'*', '0', '*', '*'},
                               {'0', '*', '*', '*'},
                               {'d', '*', '*', '*'}};
        /*
        private int[,] grid =
        {
         {'0', '*', '0', 's'},
         {'*', '0', '*', '*'},
         {'0', '*', '*', '*'},
         {'d', '0', '0', '0'}
        };
        */
        private bool[,] visited = new bool[4, 4];
        private int[] rowInd2 = { 0, 0, -1, 1 };
        private int[] colInd2 = { -1, 1, 0, 0 };
        private int shortDist = Int32.MaxValue;

        public void ShortestPathBFS()
        {
            int output = -1;
            int[] rowInd = { 0, 0, -1, 1 };
            int[] colInd = { -1, 1, 0, 0 };

            Point node = new Point(0, 0, 0);

            for (int i = 0; i < grid.GetLength(0); i++)
            {
                for (int j = 0; j < grid.GetLength(0); j++)
                {

                    if (grid[i, j] == 's')
                    {
                        node.row = i;
                        node.col = j;
                        break;
                    }
                }
            }
                    
            Queue<Point> q = new Queue<Point>();
            q.Enqueue(node);
            visited[node.row, node.col] = true;

            while (q.Count > 0)
            {
                Point temp = q.Dequeue();
                if (grid[temp.row, temp.col] == 'd')
                {
                    output = temp.dist;
                    break;
                }
                int row = temp.row;
                int col = temp.col;

                for (int k = 0; k < 4; k++)
                {
                    if (IsSafe(row + rowInd[k], col + colInd[k]))
                    {
                        Point p = new Point(temp.dist +1, row + rowInd[k], col + colInd[k]);
                        q.Enqueue(p);
                        visited[row + rowInd[k], col + colInd[k]] = true;
                    }
                }
            }
            Console.WriteLine("Shortest Path: " + output);                        
        }

        public void ShortestPathDFS()
        {
            Point node = new Point(0, 0, 0);

            for (int i = 0; i < grid.GetLength(0); i++)
            {
                for (int j = 0; j < grid.GetLength(0); j++)
                {

                    if (grid[i, j] == 's')
                    {
                        node.row = i;
                        node.col = j;
                        break;
                    }
                }
            }
           
            visited[node.row, node.col] = true;

            DFS(node.row, node.col, 0);

            if (shortDist == Int32.MaxValue)
                shortDist = -1;

            Console.WriteLine("Shortest Path: " + shortDist);
        }

        public void DFS(int i, int j, int dist)
        {
            if(grid[i,j] == 'd')
            {
                shortDist = Math.Min(dist, shortDist);
                return;
            }
            for (int k = 0; k < 4; k++)
            {
                int row = i + rowInd2[k];
                int col = j + colInd2[k];
                if (IsSafe(row, col))
                {
                    visited[row, col] = true;
                    DFS(row, col, dist +1);
                }
            }
        }

        public bool IsSafe(int i, int j)
        {
            if (i >= 0 && i < grid.GetLength(0) && j >= 0 && j < grid.GetLength(1) && grid[i, j] != '0' && !visited[i, j])
                return true;
            return false;
        }
    }

    public class Point
    {
        public int dist;
        public int row;
        public int col;

        public Point(int d, int r, int c)
        {
            dist = d;
            row = r;
            col = c;
        }

    }
}
