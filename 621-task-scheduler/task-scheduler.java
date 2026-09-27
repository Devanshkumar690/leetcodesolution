class Pair {
    int freq;
    char ch;

    public Pair(int freq, char ch) {
        this.freq = freq;
        this.ch = ch;
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> free = new HashMap<>();

        for (char c : tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            free.put(c, 1);
        }

        int seat = 1;

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> b.freq - a.freq
        );

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getValue(), entry.getKey()));
        }

        while (!pq.isEmpty()) {

            List<Pair> list = new ArrayList<>();

            while (!pq.isEmpty()) {

                Pair p = pq.poll();

                if (free.get(p.ch) <= seat) {

                    if (p.freq > 1) {
                        pq.add(new Pair(p.freq - 1, p.ch));

                        free.put(p.ch, seat + n + 1);
                    }

                    break;
                }
                else {
                    list.add(p);
                }
            }

            // Put unavailable tasks back
            for (Pair p : list) {
                pq.add(p);
            }

            seat++;
        }

        return seat - 1;
    }
}