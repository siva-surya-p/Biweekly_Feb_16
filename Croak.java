// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Croak {
    public static void main(String[] args) {
        System.out.println(minNumberOfFrogs("crcoakroak"));
    }

    public static int minNumberOfFrogs(String s) {
        int c = 0, r = 0, o = 0, a = 0, k = 0;
        int frogs = 0, result = -1;
        for (char ch : s.toCharArray()) {
            if (ch == 'c') {
                c++;
                frogs++;
            } 
            else if (ch == 'r') r++;
            else if (ch == 'o') o++;
            else if (ch == 'a') a++;
            else if (ch == 'k') {
                k++;
                frogs--;
            } 
            else {
                return -1;    
            }
            result = Math.max(result, frogs);
             if (c < r || r < o || o < a || a < k) return -1;
        }
        return frogs == 0 ? result : -1;
    }
}
