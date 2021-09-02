lit=["0 0","0 1","1 0","1 1"]
nlit=["0","1"]
a=0
b=0
def truth_or():
    print("or table")
    print("a","b","c",end="\t")
    print("")
    print("-----")
    for i in range(len(lit)):
        a,b=lit[i].split(" ")
        a,b=int(a),int(b)
        print(a,b,(a or b))
    a,b=0,0
    print("")

def truth_and():
    print("and table")
    print("a","b","c",end="\t")
    print("")
    print("-----")
    for i in range(len(lit)):
        a,b=lit[i].split(" ")
        a,b=int(a),int(b)
        print(a,b,(a and b))
    a,b=0,0
    print("")

def truth_negation():
    print("no table")
    print("a","c",end="\t")
    print("")
    print("-----")
    for i in range(len(nlit)):
        a=nlit[i]
        a=int(a)
        print(a,int(not a))
    a=0
    print("")
def truth_implication():
    print("implication table")
    print("a","b","c",end="\t")
    print("")
    print("-----")
    for i in range(len(lit)):
        a,b=lit[i].split(" ")
        a,b=int(a),int(b)
        print(a,b,int((not(a) or b)))
    a,b=0,0
    print("")

def truth_biconditional():
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

truth_or()
truth_and()
truth_negation()
truth_implication()
truth_biconditional()