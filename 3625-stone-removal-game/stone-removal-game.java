class Solution {
    public boolean canAliceWin(int n) {

        int stone = 10;
        boolean aliceTurn = true;

        while (stone > 0) {

            if (n < stone) {
                return !aliceTurn;
            }

            n = n - stone;

            if (n == 0) {
                return aliceTurn;
            }

            stone--;

            aliceTurn = !aliceTurn;
        }

        return !aliceTurn;
    }
}