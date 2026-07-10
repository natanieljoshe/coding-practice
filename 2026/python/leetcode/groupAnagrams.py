class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        alphabetDict = {}
        res = []
        temp = []
        for x in strs:
            key = "".join(sorted(x))
            if key not in alphabetDict:
                alphabetDict[key] = [x]
            else:
                alphabetDict[key].append(x)
        
        for x in alphabetDict:
            res.append(alphabetDict[x])
        return res