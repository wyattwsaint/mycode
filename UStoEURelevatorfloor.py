#first program input-work-output
#convert elevator floors
#try-except
inp=input("Europe floor?")
try:
    inp1 = int(inp)
except:
    inp1 = -1
if inp1 > -1:
    usf = int(inp)+1
    print("US floor", usf)
else:
    print("not a number")
