class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        int i = 0;
        while (i < n-2) {
            int y3 = coordinates[i + 2][1];
            int x3 = coordinates[i + 2][0];

            int y2 = coordinates[i + 1][1];
            int x2 = coordinates[i + 1][0];

            int y1 = coordinates[i][1];
            int x1 = coordinates[i][0];

            if (((y2 - y1) * (x3 - x2)!=
                (y3 - y2) * (x2 - x1) ) ){
                return false;
            }
            i++;
        }
        return true;
    }
}
