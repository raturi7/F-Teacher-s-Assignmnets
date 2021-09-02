import pandas as pd

data = [{'sap': 500082340, 'name': "harshit", "sem":5 ,'subject': 4, "marks": 45, "percentage": 22},
        {'sap': 500082340, 'name': "Aakav", "sem":5 ,'subject': 4, "marks": 55, "percentage": 22},
        {'sap': 500082340, 'name': "Aakesh", "sem":5 ,'subject': 5, "marks": 65, "percentage": 22},
        {'sap': 500082340, 'name': "Aarav", "sem":5 ,'subject': 4, "marks": 75, "percentage": 22},
        {'sap': 500082340, 'name': "Advik", "sem":5 ,'subject': 5, "marks": 85, "percentage": 22},
        {'sap': 500082340, 'name': "Chaitanya", "sem":5 ,'subject': 4, "marks": 95, "percentage": 22},
        {'sap': 500082340, 'name': "Chandran", "sem":5 ,'subject': 5, "marks": 25, "percentage": 22},
        {'sap': 500082340, 'name': "Darsh", "sem":5 ,'subject': 4, "marks": 35, "percentage": 22},
        {'sap': 500082340, 'name': "Darpan", "sem":5 ,'subject': 5, "marks": 45, "percentage": 22},
        {'sap': 500082340, 'name': "Ekansh", "sem":5 ,'subject': 4, "marks": 55, "percentage": 22},
        {'sap': 500082340, 'name': "Evak", "sem":5 ,'subject': 4, "marks": 65, "percentage": 22},
        {'sap': 500082340, 'name': "Girik", "sem":5 ,'subject': 5, "marks": 75, "percentage": 22},
        {'sap': 500082340, 'name': "Hredhaan", "sem":5 ,'subject': 4, "marks": 85, "percentage": 22},
        {'sap': 500082340, 'name': "Hemang", "sem":5 ,'subject': 4, "marks": 95, "percentage": 22},
        {'sap': 500082340, 'name': "Inesh", "sem":5 ,'subject': 5, "marks": 25, "percentage": 22},
        {'sap': 500082340, 'name': "Ishaan", "sem":5 ,'subject': 4, "marks": 35, "percentage": 22},
        {'sap': 500082340, 'name': "Jairaj", "sem":5 ,'subject': 5, "marks": 85, "percentage": 22},
        {'sap': 500082340, 'name': "Jihan", "sem":5 ,'subject': 4, "marks": 75, "percentage": 22},
        {'sap': 500082340, 'name': "Lekh", "sem":5 ,'subject': 5, "marks": 95, "percentage": 22},
        {'sap': 500082340, 'name': "Lohit", "sem":5 ,'subject': 4, "marks": 45, "percentage": 22}
        ]

# Creates DataFrame.
df = pd.DataFrame(data)
#print(df)

#sorted_df = df.sort_values(["subject","marks"],ascending=[False,False])
#1st question
topper_df= df[df["marks"]>80]
topper_sub_df=topper_df.sort_values(by="subject",ascending=False)
topper_sub_df=topper_sub_df.head(5)
topper_sub_df.to_csv(r"C:\Users\harsh\OneDrive\Desktop\d_drive\UPES\Sem-3\AI\Assignment\file.csv",index=False)
#print(topper_sub_df)

#2nd question
topper2_df=topper_sub_df[topper_df["subject"]==5]
topper2_df=topper2_df.head(5)
topper2_df.to_csv(r"C:\Users\harsh\OneDrive\Desktop\d_drive\UPES\Sem-3\AI\Assignment\file2.csv",index=False)
#this can be skipped but as asked in question so it's being showned by creating a file.
#print(topper2_df)

#3rd question
topper_last=df[df["subject"]==5]
topper_last=topper_last.sort_values(by="marks",ascending=False)
topper_last=topper_last.head(5)
topper_last.to_csv(r"C:\Users\harsh\OneDrive\Desktop\d_drive\UPES\Sem-3\AI\Assignment\file3.csv",index=False)