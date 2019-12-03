ans=[]
def permute(array):
	if(len(array)==2):
		x=[array[0],array[1]]
		y=[array[1],array[0]]
		z=x,y
		print(z)
	else:
		for i in range(0,len(array)-2):
			
			

permute(list([1,2,3]))

