class Solution:
    def commonChars(self, A: List[str]) -> List[str]:
        array=A
        str1=array[0]
        array.remove(str1)
        ans=[]
        newarray=[]
        for character in str1:
            flag=1
            for string in array:
                if(str(character) not in string):
                    flag=0
                    break
            newarray=array
            if(flag==1):
                ans.append(character)
                newarray=[]
                for x in array:
                    newstr=x.replace(character,"",1)
                    newarray.append(newstr)
            array=newarray
        answer=[value for value in ans if value != ""]
        return answer

