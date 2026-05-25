class TimeMap {
    Map<String, List<List<Object>>> m;

    public TimeMap() {
        m = new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        m.putIfAbsent(key, new ArrayList<>());

        List<Object> temp = new ArrayList<>();
        temp.add(timestamp);
        temp.add(value);

        m.get(key).add(temp);
    }

    public String get(String key, int timestamp) {
        if (!m.containsKey(key)) {
            return "";
        }

        List<List<Object>> list = m.get(key);

        int left = 0;
        int right = list.size() - 1;

        String ans = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int time = (int) list.get(mid).get(0);

            if (time <= timestamp) {
                ans = (String) list.get(mid).get(1);
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
