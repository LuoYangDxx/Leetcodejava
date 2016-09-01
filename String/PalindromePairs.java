public class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {  
        List<List<Integer>> res = new ArrayList<List<Integer>>();  
        Map<String, Integer> dic = new HashMap<String, Integer>();  
        List<Integer> pld = new ArrayList<Integer>();  
      
        for (int i = 0; i < words.length; i++) {  
            dic.put(words[i], i);  
            if (!words[i].equals("") && isPalindrome(words[i])) //保存words中非空的回文word的下标  
                pld.add(i);  
        }  
      
        for (int i = 0; i < words.length; i++) {  
      
            if (words[i].equals("")) { //如果存在空串，则空串和words中任意回文串组合都构成回文串  
                for (int idx : pld) {  
                    List<Integer> list = new ArrayList<Integer>();  
                    list.add(idx);  
                    list.add(i);  
                    res.add(list);  
                    List<Integer> list2 = new ArrayList<Integer>();  
                    list2.add(i);  
                    list2.add(idx);  
                    res.add(list2);  
                }  
            }  
      
            for (int j = 0; j < words[i].length(); j++) {  
      
                String firstPart = words[i].substring(0, j);  
                String secondPart = words[i].substring(j, words[i].length());  
                String reFirstPart = reverse(firstPart);  
                String reSecondPart = reverse(secondPart);  
      
                if (isPalindrome(firstPart) && dic.containsKey(reSecondPart) && !reSecondPart.equals("")) { //first是回文,second非空串，防止重复  
                    List<Integer> list = new ArrayList<Integer>();  
                    if (dic.get(reSecondPart) != i) {  
                        list.add(dic.get(reSecondPart));  
                        list.add(i);  
                        res.add(list);  
                    }  
                }  
                if (isPalindrome(secondPart) && dic.containsKey(reFirstPart) && !reFirstPart.equals("")) {  
                    List<Integer> list = new ArrayList<Integer>();  
                    if (dic.get(reFirstPart) != i) {  
                        list.add(i);  
                        list.add(dic.get(reFirstPart));  
                        res.add(list);  
                    }  
                }  
            }  
        }  
        return res;  
    }  
      
    public String reverse(String word) {  
        StringBuilder sb = new StringBuilder(word);  
        return sb.reverse().toString();  
    }  
      
    public boolean isPalindrome(String word) {  
        for (int i = 0, j = word.length() - 1; i < j; i++, j--) {  
            if (word.charAt(i) != word.charAt(j)) {  
                return false;  
            }  
        }  
        return true;  
    }  
}