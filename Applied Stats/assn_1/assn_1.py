import pandas as pd;
import matplotlib.pyplot as plt;
import numpy as np;
#Reading the data.
data=pd.read_excel(r"C:\Users\harsh\OneDrive\Desktop\d_drive\UPES\Sem-3\Applied Stats\LAB\assn_1\Demo.xlsx");

data_type=["Nominal","Ratio","Interval","Ordinal","Ordinal"]

#central tendency for name
name=data["Name"].mode()
print("Central tendency of name is (Nominal) Mode :",name)

data[['Marks']].plot(kind='hist',bins=[0,20,40,60,80,100],rwidth=0.8)
marks=data["Marks"].mean()
print("Central tendency of marks is (Ratio) mean :",marks)

data[['CGPI']].plot(kind='hist',bins=[0,2,4,6,8,10],rwidth=0.8)
plt.show()
cgpi=data["CGPI"].median()
print("Central tendency of cgpi is (Interval) median :",cgpi)

qual={"Great":1,"Good":2,"Average":3,"Poor":4}
data["Qual"]=np.where(data["Quality of Assignment"]=="Great",1,np.where(data["Quality of Assignment"]=="Good",2,np.where(data["Quality of Assignment"]=="Average",3,np.where(data["Quality of Assignment"]=="Poor",4,5))))
qual=data["Qual"].median()
print("Central tendency of qual is (ordinal) median :",qual)

#filling missing value
cgpi_mean=data["CGPI"].mean()
data["CGPI"].fillna(value=cgpi_mean,inplace=True)
data.loc[len(data.index)]=data_type
print(data)
