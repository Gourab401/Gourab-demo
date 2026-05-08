
class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int size : asteroids) {

            boolean collide = false;

            // Check collisions
            while (!stack.isEmpty() && stack.peek() > 0 && size < 0) {

                // Current asteroid is bigger
                if (Math.abs(size) > stack.peek()) {
                    stack.pop();
                    continue;
                }

                // Both are equal
                else if (Math.abs(size) == stack.peek()) {
                    stack.pop();
                }

                // Current asteroid destroyed
                collide = true;
                break;
            }

            // If survives, push into stack
            if (!collide) {
                stack.push(size);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];

        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
