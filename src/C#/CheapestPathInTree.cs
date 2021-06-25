using System;
using System.Collections.Generic;
using System.Text;

namespace Practise
{
    class CheapestPathInTree
    {
        //This is multi children(nodes) tree.
        public static int getCheapestCost(TreeNode rootNode)
        {
            int output = getCost(rootNode, rootNode.cost);

            return output;
        }

        public static int getCost(TreeNode root, int val)
        {
            if (root.children.Length == 0)
            {
                return val;
            }

            TreeNode[] ch = root.children;

            int submin = Int32.MaxValue;
            for (int i = 0; i < ch.Length; i++)
            {
                int output = getCost(ch[i], (val + ch[i].cost));
                submin = Math.Min(output, submin);
            }
            return submin;
        }
    }
    public class TreeNode
    {
        public int cost;
        public TreeNode[] children;
    }


    /*
     Node root = new Node(0);

    Node level1_5 = new Node(5);
    Node level1_3 = new Node(3);
    Node level1_6 = new Node(6);


    Node level2_4 = new Node(4);
    Node level2_2 = new Node(2);
    Node level2_0 = new Node(0);
    Node level2_1 = new Node(1);
    Node level2_5 = new Node(5);

    Node level3_1 = new Node(1);
    Node level3_10 = new Node(10);

    Node level4_1 = new Node(1);


    root.children = { level1_5, level1_3, level1_6};

    level1_5.children = { level2_4 };
    level1_3.children = { level2_2, level2_0 };
    level1_6.children = { level2_1, level2_5 };

    level2_2.children = { level3_1 };
    level2_0.children = { level3_10 };

    level3_1.children = { level4_1 };
     */
}
