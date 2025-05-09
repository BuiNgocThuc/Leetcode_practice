let twoSum = (nums, target) => {
    const map = new Map();
    for (let i = 0; i < nums.length; i++) {
        let remaining = target - nums[i];
        if(map.has(remaining)) {
            return [map.get(remaining), i];
        }
        map.set(nums[i], i);
    }
    return [];
}

const nums = [1, 2, 8, 7, 11, 15];
const target = 10;
const result = twoSum(nums, target);
console.log(`Indices: [${result[0]}, ${result[1]}]`);