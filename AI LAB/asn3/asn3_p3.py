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