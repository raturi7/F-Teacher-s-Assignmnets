import pandas as pd;
import matplotlib.pyplot as plt;
import numpy as np;
#Reading the data.
data=pd.read_excel(r"C:\Users\harsh\OneDrive\Desktop\d_drive\UPES\Sem-3\Applied Stats\LAB\assn_1\Demo.xlsx");

data_type=["Nominal","Ratio","Interval","Ordinal","Ordinal"]

#central tendency for name
name=data["Name"].mode()
# print("Central tendency of name is (Nominal) Mode :",name)

data[['Marks']].plot(kind='hist',bins=[0,20,40,60,80,100],rwidth=0.8)
marks=data["Marks"].mean()
# print("Central tendency of marks is (Ratio) mean :",marks)

data[['CGPI']].plot(kind='hist',bins=[0,2,4,6,8,10],rwidth=0.8)
# plt.show()
cgpi=data["CGPI"].median()
# print("Central tendency of cgpi is (Interval) median :",cgpi)

qual={"Great":1,"Good":2,"Average":3,"Poor":4}
data["Qual"]=np.where(data["Quality of Assignment"]=="Great",1,np.where(data["Quality of Assignment"]=="Good",2,np.where(data["Quality of Assignment"]=="Average",3,np.where(data["Quality of Assignment"]=="Poor",4,5))))
qual=data["Qual"].median()
# print("Central tendency of qual is (ordinal) median :",qual)

#filling missing value
cgpi_mean=data["CGPI"].mean()
data["CGPI"].fillna(value=cgpi_mean,inplace=True)
# data.loc[len(data.index)]=data_type

# print(data)


# Asn2 code begins here:
# Finding Range Of Name
count_by_Name=data.groupby("Name")["Name"].count().max()-data.groupby("Name")["Name"].count().min()
res=data["Name"].value_counts()
res_nam=res[res==count_by_Name]
print("calculated range for Name is : ",count_by_Name)
print("These guys fall under the range of Name: \n",res_nam)

#Finding Interquartile of Quality of Assignment(Ordinal data)
def iqr(column):
    return column.quantile(0.75) - column.quantile(0.25)


Assignmnet_Quartile= data["Qual"].agg(iqr)
qual_max=data["Qual"].max()
qual_min=data["Qual"].min()
print("Inter Quartile of Quality of Assignment (Ordinal data) ",Assignmnet_Quartile)

#.data["Qual"]>=(int(qual_max)% int(Assignmnet_Quartile)) and data["Qual"]<=(int(qual_max)//int(Assignmnet_Quartile))
res_qual_val=data[data["Qual"].between((qual_max%Assignmnet_Quartile),(qual_max//Assignmnet_Quartile),inclusive=True)]
print("These guys come in between the range \n",res_qual_val)

#For ratio/scale data (Marks and CGPI .//standard deviation)
standard_dev=data.std()
print("standard deviation of the data :\n",standard_dev)

#for scale/ratio data (Variance)
varience=data.var()
print("varience of the data: \n",varience)

'''

Measures of dispersion of Nominal data should be Range: bcz we dont have any specific criteria to measure a 
nominal data so we can only find the spread by subtracting the highest number of occurence of the elements and lowest
of the occurence of them.

For the Ordinal data we can either use Range Or Inter Quartile Range 
Range is not very descriptive in comparision to Inter Quartile Range bcz 
range only means for two values of the data highest and the lowest not considering more of the elements of the data
whereas interquartile deals more with the the lower 25percentile and higher 75th percentile of the data
which gives a better undertanding of the data.

While the range gives you the spread of the whole data set, the interquartile range gives you the spread 
of the middle half of a data set.


'''


