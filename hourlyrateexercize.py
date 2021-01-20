#hourly rate try/except exercize
xh = input("Hours:",)
xr = input("Rate:",)

try:
    xp = float(xh) * float(xr)

except:
    print("Error")
    quit()
print("Pay",xp)
