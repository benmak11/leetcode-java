# Problem solution walkthrough
We need to keep track of the size of the decoded string (let's call it size). This size will give us the total length of the decoded string till the present character while traversing the encoded string.

We first try building the decoded string in the forward direction till its size became equal to or larger than K.

However, doing so may result in extremely large strings as the input size increases, which might be inefficient due to space constraints.

So instead of actually constructing the string, we keep track of its length via size. If we come across a digit D, we multiply size with D; and for a letter increment size.

After we have the total length of the decoded string, we go backwards through our tape. Whenever K is a multiple of size, if the character at the K-th position in the string is a letter, that would be our answer. If not, we reduce the size accordingly and continue.

# Complexity

It's important to note that the problem is a decoding issue at its core, and we solved it by capturing the number of times for repeating patterns with numbers and tracking the alphabet content until that point. We then used a backward run against the run-length to find the exact position of our solution character.

We have to handle every character of the to-be-decoded string, so it's important to note that the time complexity of these solutions is O(n), ignoring the possible multiplication operation on the big integer with a specific digit. The space complexity also turns out to be O(n) as we don't store a complete decoded string but only the string length.