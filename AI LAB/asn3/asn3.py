
lit=["1 1","1 0","0 1","0 0"]
p=[1,1,0,0]
q=[1,0,1,0]
temp_p=[]
temp_q=[]
temp_imp=[]
temp_not_imp=[]


def not_p(a=p):
    print("not p table")
    print("a","c",end="\t")
    print("")
    print("-----")
    for i in range(len(p)):
        a=p[i]
        a=int(a)
        temp_p.append(int(not a))
        print(a,int(not a))
    a=0
    print("")
def not_q(a=q):
    print("not q table")
    print("a","c",end="\t")
    print("")
    print("-----")
    for i in range(len(q)):
        a=q[i]
        a=int(a)
        temp_q.append(int(not a))
        print(a,int(not a))
    a=0
    print("")

def truth_biconditional(a=p,b=q):
    print("biconditional table")
    print("a","b","c",end="\t")
    print("")
    print("-----")
    for i in range(len(lit)):
        a,b=lit[i].split(" ")
        a,b=int(a),int(b)
        print(a,b,int((a and b)or((not a) and (not b))))
    a,b=0,0
    print("")

def negimp_notp_notq(a=temp_p,b=temp_q):
    print("implication table")
    print("a","b","c",end="\t")
    print("")
    print("-----")
    for i in range(len(lit)):
        a,b=lit[i].split(" ")
        a,b=int(a),int(b)
        temp_not_imp.append(int((not(a) or b)))
        print(a,b,int((not(a) or b)))
    a,b=0,0
    print("")
def truth_implication(x,y):
    x=x
    y=y
    print("implication table")
    print("a","b","c",end="\t")
    print("")
    print("-----")
    for i in range(len(lit)):
        a,b=x[i],y[i]
        
        temp_imp.append(int((not(a) or b)))
        print(a,b,int((not(a) or b)))
    a,b=0,0
    print("")

def neg_biconditon(a=temp_imp,b=temp_not_imp):
    print("biconditional table")
    print("a","b","c",end="\t")
    print("")
    print("-----")
    for i in range(len(lit)):
        a,b=temp_imp[i],temp_not_imp[i]
        print(a,b,int((a and b)or((not a) and (not b))))
    a,b=0,0
    print("")


#last question
#for 1st
not_p()
not_q()
negimp_notp_notq()

#for 2nd
truth_implication(p,q)
print(p,q)
truth_implication(q,p)
