lower,upper= input("enter lower and upper bound of the range. ").split(" ")
lower,upper=int(lower),int(upper)
s=""
if(lower>upper):
    print("lower range was greater than upper range")
else:
    for i in range(lower,upper+1):
        if(i%3==0):
            s="NEO"
            if(i%5==0):
                s=s+"NEW"
        elif(i%5==0):
            s="NEW"
        print(i,s)
        s=""
