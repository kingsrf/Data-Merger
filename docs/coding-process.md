
// pointers integer variables i, j, k

customerData1[101, 104, 107, 0,0,0]
customerData2[102, 105, 108]

i = 2
j = 2
k = 5

107 v 108 = 108

customerData1: [101, 104, 107, 0, 0, 108]

i (cd1) = 2
j (cd2) = 2 - 1
k (newCd1) = 5 - 1

107 v 105 = 107

customerData1: [101, 104, 107, 0, 107, 108]

i = 2 - 1
j = 1
k = 4 - 1

104 v 105 = 105

customerData1: [101, 104, 107, 105, 107, 108]

i = 1
j = 1 - 1
k = 3 - 1

104 v 102 = 104

customerData1: [101, 0, 104, 105, 107, 108]

i = 1 - 1
j = 0
k = 2 - 1

101 v 102 = 102

customerData1: [101, 102, 104, 105, 107, 108]


Final Output: [101, 102, 104, 105, 107, 108]




Time is O(m + n), each element from customerData1 & customerData2 is processed once.
	- So the algorithm runs in linear time relative to the total number of input elements.

Space is O(1) In-place merge, no extra storage.
	- Reusing the extra space already available in customerData1 and only using a constant number of variables.

