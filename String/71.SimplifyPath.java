public class Solution {
    public String simplifyPath(String path) {
        if (path.length() == 0) return path;
        String[] str = path.split("/");
        Stack<String> stack = new Stack<String>();
        for (String s : str) {
            if (s.length() == 0 || s.equals(".")) continue;
            else if (s.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(s);
            }
        }
        if (stack.isEmpty()) stack.push("");
        StringBuilder res = new StringBuilder();
        if (stack.isEmpty()) return "/";
        while (!stack.isEmpty()) {
            res.insert(0, stack.pop());
            res.insert(0, "/");
        }
        return res.toString();
    }
}