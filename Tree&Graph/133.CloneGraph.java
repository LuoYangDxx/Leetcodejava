public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
			return null;
		}
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
        UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
		map.put(node, copy);
        queue.add(node);
        while(!queue.isEmpty())
        {
            UndirectedGraphNode newnode = queue.poll();
            for(int i=0;i<newnode.neighbors.size();i++)
            {
              if(!map.containsKey(newnode.neighbors.get(i)))
              {
                 copy = new UndirectedGraphNode(newnode.neighbors.get(i).label);
                 map.put(newnode.neighbors.get(i),copy);
                 queue.offer(newnode.neighbors.get(i));
              }  
              map.get(newnode).neighbors.add(map.get(newnode.neighbors.get(i)));
            }
        }
        return map.get(node);
    }
}