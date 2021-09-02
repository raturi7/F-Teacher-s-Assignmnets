import pandas as pd
import math
data={"data":[92,
120,
123,
123,
130,
112,
111,
189,
190,
193,
200,
201,
201,
210,
214,
218,
223,
223,
232,
234,
234,
238,
243,
247,
250,
261,
273,
280,
289,
290,
300,
311,
321,
321,
321,
334,
340,
340,
342,
345,
345,
356,
376,
380,
390,
392,
400,
450,
455,
456,
456,
459,
480,
497,
500,
500,
564,
567,
567,
567,
667,
670,
928,
1000]
}

#data = pd.read_excel (r"C:\Users\harsh\OneDrive\Desktop\d_drive\UPES\Sem-3\Intro To AI\LAB\asn1\crowd computing.xlsx")
#print(df2) #it's working fine but i used upper dataframe where i typed myself.

#result means median here

df=pd.DataFrame(data)
df_sorted=df.sort_values(by="data",ascending=True)
print(df_sorted)
mean2=df_sorted.mean(axis=0)
print("mean2",mean2)
result2 = df_sorted.median(skipna = True)
print("result",result2)
length=len(df_sorted)
print("lenght",length)
trim= math.floor(len(data)*0.1)
df_trim=df_sorted[trim:len(data)-trim]
mean=df_trim.mean(axis=0)
print("mean trimed",mean)
result = df_trim.median(skipna = True)
print("median trimed",result)

mean2_diff=375-mean2
print("unsorted difference of mean",mean2_diff)

mean_diff=375-mean
print("sorted difference of mean",mean_diff)

result_diff=375-result2
print("unsorted difference of median",result_diff)

result2_diff=375-mean2
print("sorted difference of median",result2_diff)



