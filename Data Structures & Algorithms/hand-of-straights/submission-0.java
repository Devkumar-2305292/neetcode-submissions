class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < hand.length; i++) {
            map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
        }

        Arrays.sort(hand);

        for (int i = 0; i < hand.length; i++) {
            int count = groupSize;
            int curr = hand[i];

            if (map.get(hand[i]) == 0) {
                continue;
            }

            while (count != 0) {
                if (!map.containsKey(curr)) {
                    return false;
                }
                map.put(curr, map.get(curr) - 1);
                curr = curr + 1;
                count--;
            }
            // i = i + groupSize;
        }

        return true;
    }
}
