# choice based cruise adventure story for Mandy
ubr_drvr = "Lyle"
lft_drvr = "Cliff"
print("This is my first program.")
print("Press 'Enter' to continue...")
input()
print("I wrote it for (and to) my wife, whom I love dearly.")
print("Press 'Enter' to continue...")
input()
print("I hope you have as much fun with this as I had writing it!")
print("Press 'Enter' to continue...")
input()
print("Please enter your name to begin:")
nam = input()
print("Hello,", nam)

ans = ""
while (ans != "y" and ans != "yes"):
    ans = input("Are you ready for the adventure of a lifetime??  type 'Y' for Yes, 'N' for No").lower()
    if ans == "y":
        print("Woohooo!!  Let's gooooo!!")
        print("Press 'Enter' to continue...")
        input()
    elif ans == "yes":
        print("Woohooo!!  Let's gooooo!!")
        print("Press 'Enter' to continue...")
        input()
    else:
        print(":(")
        print("TRY AGAIN")
        print("(Press ENTER)")
        input()
ans = ""
while (ans !="cruise"):
    ans = input("Your hubby comes to you one day and asks what you want to do for vacation.  'Babe, do you want to go to the beach for a week?  Or do you want to go on a cruise?'  Type 'cruise' for a Carnival Cruise, or 'beach' for some sandy fun-in-the-sun.").lower()
    if ans == "cruise":
        print("'Good choice on the cruise, honey!', your hubby says.")
        print("You both fly on American Airlines down to Mobile, AL.")
        print("This is where your ship is docked!")
        print("Press 'Enter' to continue...")
        input()
        print("You pack your bags and fly down to Mobile, AL!")
        print("Press 'Enter' to continue...")
    else:
        print("Your hubby's face drops a little.")
        print("'Bummer!'")
        print("TRY AGAIN")
        print("(Press ENTER)")
        input()
ans = ""
while (ans != "y" and ans != "yes"):
    ans = input("You arrive at your AirBnB the night before your cruise.  The next morning, you both walk over a mile to the dock in the sweltering heat.  You come to a BBQ place along the way.  Go inside?  Press 'y' for Yes or 'n' for No").lower()
    if ans == "y":
        print("You go inside.  It's nice and cool.")
        input()
    elif ans == "yes":
        print("You go inside.  It's nice and cool.")
        input()
    else:
        print("You pass on by, but really regret not going in.")
        print("THE END")
        input()
print("After that little break, you and Wyatt head to the port.")
input()
print("The ship looms in the distance.  You're so excited!")
input()
print("The line to check in was long, but you're finally on board.")
print("On the way to the room, you pass a food place where they serve drinks.  Do you stop for a beverage?")
ans = input()
if ans in ["y","yes"]:
    print("Hubby says, 'Maybe we should get to the room first.")
    input()
if ans in ["n","no"]:
    print("Hubby says, 'Probably a good choice, let's get to the room first.")
    input()
