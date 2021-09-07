
from scipy.stats import norm

'''
marks= np.random.normal(loc=5,scale=2,size=100)
data=pd.DataFrame(marks,columns=["Marks"])
plt.plot(data)
plt.show()

marks= np.arange(-5000,5000, 1)

data=pd.DataFrame(marks,columns=["Marks"])
print(data.std())

dataMean=5
dataDeviation=2
marksCustom=[]
for i in marks:
    marksCustom.append((i-dataMean)/dataDeviation)

dataCustom=pd.DataFrame(marksCustom,columns=["Marks"])
print(dataCustom.std())
plt.hist(dataCustom,30,density=True)
plt.show()

plt.plot(marks,norm.pdf(marksCustom,dataMean,dataDeviation))
plt.show()
'''
#here
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
import random 
mean = 5
std = 2
x = np.random.normal(loc=mean, scale=std, size = 10000000)
df = pd.DataFrame(x)
plt.hist(df, 30, density=True)
print(df.describe())
plt.show()
print(x)


