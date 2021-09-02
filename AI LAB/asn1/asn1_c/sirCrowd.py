import pandas as pd
import statistics
import math
actual_candies=375
data=pd.read_excel(r"C:\Users\harsh\OneDrive\Desktop\d_drive\UPES\Sem-3\Intro To AI\LAB\asn1\crowd computing.xlsx")
#list=[]
#list=data['Person Value']
#print(list)
number_list=list(data['Person Value'])
print(number_list)
print(len(number_list))
number_list.sort()
print(number_list)
mean=statistics.mean(number_list)
print("mean is",mean)
diff1=mean-actual_candies
median= statistics.median(number_list)
print("median is",median)
diff2=median-actual_candies
mode= statistics.mode(number_list)
print("mode is",mode)
diff3=mode-actual_candies
"""------------------------"""
trim= math.floor(len(number_list)*0.1)
print(trim)
trimlist=number_list[trim:len(number_list)-trim]
print(trimlist)
print(len(trimlist))
"""-----------------"""
mean=statistics.mean(trimlist)
print("mean is",mean)
diff1=mean-actual_candies
median= statistics.median(trimlist)
print("median is",median)
diff2=median-actual_candies
mode= statistics.mode(trimlist)
print("mode is",mode)
diff3=mode-actual_candies
#trimmean=statistics.mean(trimlist)
#print(“Trim mean={:2f}”.format(trimmean))