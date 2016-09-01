class WordNode
{
    String word;
    int numSteps;
    WordNode pre;
 
    public WordNode(String word, int numSteps, WordNode pre)
    {
        this.word = word;
        this.numSteps = numSteps;
        this.pre = pre;
    }
}
public class Solution 
{
    public List<List<String>> findLadders(String start, String end, Set<String> dict) 
    {
        List<List<String>> result = new ArrayList<List<String>>();
 
        LinkedList<WordNode> queue = new LinkedList<WordNode>();
        queue.add(new WordNode(start, 1, null));
 
        dict.add(end);
        int minStep = 0;
 
        HashSet<String> visited = new HashSet<String>(); // 加入了hashset 
        //HashSet<String> unvisited = new HashSet<String>();  
        //unvisited.addAll(dict);
 
        int preNumSteps = 0;
 
        while(!queue.isEmpty())
        {
            WordNode top = queue.remove();
            String word = top.word;
            int currNumSteps = top.numSteps;
 
            if(word.equals(end))  // if get the end
            {
                if(minStep == 0) {minStep = top.numSteps;}
                if(top.numSteps == minStep && minStep !=0)
                {
                    //nothing
                    ArrayList<String> t = new ArrayList<String>();
                    t.add(top.word);
                    while(top.pre !=null)
                    {
                        t.add(0, top.pre.word);
                        top = top.pre;
                    }
                    result.add(t);
                    continue;
                }
            }
            
            if(preNumSteps < currNumSteps)  {dict.removeAll(visited);}//if positives
            
            preNumSteps = currNumSteps;   // update
            char[] arr = word.toCharArray();
            for(int i=0; i<arr.length; i++) 
            {
                for(char c='a'; c<='z'; c++)
                {
                    char temp = arr[i];
                    if(arr[i]!=c){ arr[i]=c; }
                    String newWord = new String(arr); // creat a new word
                    if(dict.contains(newWord))
                    {
                        queue.add(new WordNode(newWord, top.numSteps+1, top)); // add new word
                        visited.add(newWord);
                    }
                    arr[i]=temp; // return back, change another word(because only can change one word)
                }
            }
        }
        return result;
    }
}