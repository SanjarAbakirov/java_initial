class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        return permuteRecursive(nums, 0);
    }

    private List<List<Integer>> permuteRecursive(int[] nums, int start) {
        List<List<Integer>> result = new ArrayList<>();

        // Базовый случай: только один элемент
        if (start == nums.length - 1) {
            List<Integer> single = new ArrayList<>();
            single.add(nums[start]);
            result.add(single);
            return result;
        }

        // Рекурсивно получаем все перестановки для подмассива [start+1 ... end]
        List<List<Integer>> subPermutations = permuteRecursive(nums, start + 1);

        // Вставляем текущий элемент nums[start] во все возможные позиции каждой
        // перестановки
        for (List<Integer> perm : subPermutations) {
            for (int i = 0; i <= perm.size(); i++) {
                List<Integer> newPerm = new ArrayList<>(perm);
                newPerm.add(i, nums[start]);
                result.add(newPerm);
            }
        }
        return result;
    }
}