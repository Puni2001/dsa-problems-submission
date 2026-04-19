class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded = ""
        for s in strs:
            encoded += str(len(s))+"#"+s
        return encoded

    def decode(self, s: str) -> List[str]:
        decoded = []
        i = 0 
        while i < len(s):
            j = s.find("#", i)
            length = int(s[i:j])  # Convert the length part to an integer
            # Extract the string using the length
            decoded.append(s[j+1:j+1+length])
            # Move to the next encoded segment
            i = j + 1 + length
        return decoded