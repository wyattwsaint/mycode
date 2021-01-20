#choice based cruise adventure story for Mandy
print("You're going on a cruise with your honey to Bermuda!  You have a choice of what type of cabin to sleep in: Interior of the ship with two separate beds, or a room on the side of the ship with a beautiful porthole window.")
print("Which do you choose?")

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


#my own program
blks=input("how many blocks to add?")
print("blocks present:3")
nblks=int(blks)+3
print(nblks)

#if conditional statements
y=input("enter number")
y2=int(y)
if y2>2:
    print("bigger than 2")
    print("still bigger")
if y2<2:
    print("smaller than 2")
    print("still smaller")
if y2==2:
    print("equal to")
    print("still equal to")

print("hello world")

#hourly rate exercize
xh = input("Hours:",)
xr = input("Rate:",)

try:
    xp = float(xh) * float(xr)

except:
    print("Error")
    quit()
print("Pay",xp)


