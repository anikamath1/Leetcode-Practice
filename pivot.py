class Solution:    
    def solve(self,nums,target,l,h):
        print("Considering range from",l," to ",h)
        if(l>=h):
            return -1
        mid=int((l+h)/2)
        if(target==nums[mid]):
            return mid
        if(nums[l]<nums[mid]):
            if(target>=nums[l] and target<=nums[mid]):
                return self.solve(nums,target,l,mid-1)
            return self.solve(nums,target,mid+1,h)
    	if(target>=nums[mid] and target<=nums[h]):
            return self.solve(nums,target,mid+1,h)
        return self.solve(nums,target,l,mid-1)
    def search(self, nums, target):
        return(self.solve(nums, target, 0, len(nums)))
s=Solution()
nums=list(map(int,input().split(",")))
ans=s.search(nums,3)
print(ans," is the index")
