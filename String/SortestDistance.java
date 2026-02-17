public class SortestDistance {
    public static float Distance(String string) {
        int y = 0;
        int x = 0;
        for (int i = 0; i < string.length(); i++) {

            char dir = string.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'S') {
                y--;
            } else {
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
       
        return (float) Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {
        String word = "WNEENESENNN";
       System.out.println( Distance(word));
        
    }
}
