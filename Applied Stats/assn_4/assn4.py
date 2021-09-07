import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import random 

dataMean=5
dataDeviation=2
marks=np.random.normal(dataMean,dataDeviation,1000)
marks=list(marks)
data=pd.DataFrame(marks,columns=["Marks"])
# plt.figure()
# plt.subplot(1,2,1)
plt.hist(data,alpha=0.5,density=True,label="Normal data")
print("Mean of created normal distribution : ",data.mean())
print("Standard deviation of the created normal distribution : ",data.std())
print("head of Created data \n",data.head())


zmarks=[]
for i in marks:
    zmarks.append((i-dataMean)/dataDeviation)
zdata=pd.DataFrame(zmarks,columns=["Marks"])
print("Mean of Z normal distribution : ",zdata.mean())
print("Standard deviation of Z normal distribution : ",zdata.std())
print("head of Created zdata \n",zdata.head())
# plt.subplot(1,2,2)
plt.hist(zdata,alpha=0.5,density=True,label="Standard Normal data")
plt.legend(loc="upper right")
plt.show()