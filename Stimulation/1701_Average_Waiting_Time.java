class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double cheffree = 0;
        double result = 0;
        for (int i = 0; i < n; i++) {
            double arrival = customers[i][0];
            double time = customers[i][1];
            double start = Math.max(arrival, cheffree);
            double finish = start + time;
            double waiting = finish - arrival;
            result += waiting;
            cheffree = finish;
        }
        return result / n;
    }
}
