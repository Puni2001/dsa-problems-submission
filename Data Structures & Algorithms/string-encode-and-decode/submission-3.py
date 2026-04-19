class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded = ''
        for s in strs:
            encoded += str(len(s))+"#"+s

        return encoded 

    def decode(self, s: List[str]) -> str:
        decoded = []

        i = 0
        while i < len(s):

            j = s.find("#",i)
            length = int(s[i:j])
            decoded.append(s[1+j:1+j+length])

            i = 1 + j + length

        return decoded 

