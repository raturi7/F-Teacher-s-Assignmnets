lit=[1,0]
not_lit=[]
contradiction=[]
def not_lits():
    for i in lit:
        not_lit.append(int(not(i)))
        # print(not(i))
def contra():
   for i in range(len(lit)):
       a,b=lit[i],not_lit[i]
       contradiction.append(a and b)
       print(a and b)
not_lits()
contra()
print(contradiction)