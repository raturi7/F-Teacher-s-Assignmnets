'''Import the z table as a data structure in python.
Create some 5 demo examples to find the area under the curve and report the answer from the z-table. '''





import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import random 

data_z_table=pd.read_excel(r"z_table.xlsx")
data_z_table=data_z_table.set_index("z")



dataMean=5
dataDeviation=2
marks=np.random.normal(dataMean,dataDeviation,1000)
marks=list(marks)
data=pd.DataFrame(marks,columns=["Marks"])
plt.hist(data,alpha=0.5,density=True,label="Normal data")
print(data.head())
zmarks=[]
for i in marks:
    zmarks.append((i-dataMean)/dataDeviation)
zdata=pd.DataFrame(zmarks,columns=["Marks"])
print("Mean of Z normal distribution : ",zdata.mean())
print("Standard deviation of Z normal distribution : ",zdata.std())
print(zdata.head())
Num_of_checks=int(input("Number of test cases : "))

for i in range(Num_of_checks):
    first,second=input("Give index 1st and 2nd of data range numbers ").split(" ")
    first,second=int(first),int(second)
    print("first is : ",data.iloc[first])
    print("second is : ",data.iloc[second])

    temp_first=float(zdata.iloc[first])
    temp_second=float(zdata.iloc[second])
    result=0
    print("corresponding z value of first is",temp_first)
    print("corresponding z value of second is",temp_second)

    if temp_first<0 and temp_second<0:
        result=-1*(temp_second+temp_first)
    elif temp_first<0 and temp_second>0:
        result=(-1*(temp_first))+temp_second
    elif temp_first>0 and temp_second<0:
        result=(-1*(temp_second))+temp_first
    else:
        result=temp_first+temp_second
    print("Sum of corresponding first and second is ",result)
    result=str(result)
    row_part=result[0:3]
    col_part=result[3:4]

    
    row_part= float(row_part+"0")
    col_part=float("0.0"+col_part)
    
    
    final_res1=float(data_z_table.loc[row_part][col_part])-float(data_z_table.loc[0.00][0.00])
    print(final_res1)
    plt.hist(zdata,alpha=0.5,density=True,label="Standard Normal data")
    plt.legend(loc="upper right")
    plt.show()
    