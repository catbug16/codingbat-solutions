public boolean makeBricks(int small, int big, int goal) {
    int maxBig = Math.min(goal / 5, big);
    int Goal = goal - (maxBig * 5);
    return Goal <= small;
}

