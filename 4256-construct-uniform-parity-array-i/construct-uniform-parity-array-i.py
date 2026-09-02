class Solution(object):
    def uniformArray(self, nums1):
        """
        :type nums1: List[int]
        :rtype: bool
        """
        odd_count = sum(1 for x in nums1 if x % 2 != 0)
        even_count = len(nums1) - odd_count

        # Case 1: Can we make all elements EVEN?
        # - If there are 0 odds, they are already all even.
        # - If there are >= 2 odds, each odd element can subtract a different odd element to become even.
        can_make_even = (odd_count == 0) or (odd_count >= 2)

        # Case 2: Can we make all elements ODD?
        # - Requires at least 1 odd number so that all even numbers can subtract it to become odd.
        can_make_odd = (odd_count >= 1)

        return can_make_even or can_make_odd
        