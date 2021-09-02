import pandas as pd

data_frame = pd.read_excel (r"C:\Users\harsh\OneDrive\Desktop\d_drive\UPES\Sem-3\Intro To AI\LAB\asn1\crowd computing.xlsx")
#print(data) #it's working fine but i used upper dataframe where i typed myself.

#result means median here
data=data_frame["Person Value"]
df=pd.DataFrame(data)
print(df)
'''
df_sorted=df.sort_values(by=data,ascending=True)
print(df_sorted)

mean2=df_sorted.mean(axis=0)
print("mean2",mean2)
result2 = df_sorted.median(skipna = True)
print("result",result2)
length=len(df_sorted)
print("lenght",length)
df_trim=df_sorted[5:63]
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
'''


