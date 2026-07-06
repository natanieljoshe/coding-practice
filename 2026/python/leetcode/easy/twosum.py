class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMapUdhCek = {} #key= nilai angka , value = index dari array

        for i, n in enumerate(nums):
            selisih = target - n
            if selisih in hashMapUdhCek:
                return [hashMapUdhCek[selisih],i]
            hashMapUdhCek[n] = i