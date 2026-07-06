class Solution {
    public boolean isCyclic(int i, int[][] prerequisites, int[] state) {
        if (state[i] == 1)
            return true;
        if (state[i] == 2)
            return false;

        state[i] = 1;

        for (int[] pre : prerequisites) {
            if (pre[0] == i) {
                if (isCyclic(pre[1], prerequisites, state)) {
                    return true;
                }
            }
        }

        state[i] = 2;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] state = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (isCyclic(i, prerequisites, state)) {
                return false;
            }
        }

        return true;
    }
}
