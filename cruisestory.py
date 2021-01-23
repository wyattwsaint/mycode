# choice based cruise adventure story for Mandy
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
print("Hello,", nam + "!")
ans = ""
while ans != "y" and ans != "yes" and ans != "n" and ans != "no":
    ans = input("Are you ready for the adventure of a lifetime??  type 'y' for Yes, 'n' for No").lower()
    if ans == "y":
        print("Woohooo!!  Let's gooooo!!")
        print("Press 'Enter' to continue...")
        input()
    elif ans == "yes":
        print("Woohooo!!  Let's gooooo!!")
        print("Press 'Enter' to continue...")
        input()
    elif ans == "n":
        print(":(")
        print("TRY AGAIN")
        print("(Press ENTER)")
        print("Press 'Enter' to continue...")
        input()
    elif ans == "no":
        print(":(")
        print("TRY AGAIN")
        print("(Press ENTER)")
        print("Press 'Enter' to continue...")
        input()
    else:
        print("Um, spelling matters...")
ans = ""
while ans != "cruise":
    ans = input("Your hubby comes to you one day and asks what you want to do for vacation.  'Babe, do you want to go to the beach for a week?  Or do you want to go on a cruise?'  Type 'cruise' for a Carnival Cruise, or 'beach' for some sandy fun-in-the-sun.").lower()
    if ans == "cruise":
        print("'Good choice on the cruise, honey!', your hubby says.")
        print("Press 'Enter' to continue...")
        input()
        print("You both fly on American Airlines down to Mobile, AL.")
        print("Press 'Enter' to continue...")
        input()
        print("This is where your ship is docked!")
        print("Press 'Enter' to continue...")
        input()
        print("You pack your bags and fly down to Mobile, AL!")
        print("Press 'Enter' to continue...")
    else:
        print("Your hubby's face drops a little.")
        print("'Bummer!'")
        print("TRY AGAIN")
        print("Press 'Enter' to continue...")
        input()
ans = ""
while ans != "y" and ans != "yes" and ans != "n" and ans != "no":
    ans = input("You arrive at your AirBnB the night before your cruise.  The next morning, you both walk over a mile to the dock in the sweltering heat.  You come to a BBQ place along the way.  Go inside?  Press 'y' for Yes or 'n' for No").lower()
    if ans == "y":
        print("You go inside.  It's nice and cool.")
        print("Press 'Enter' to continue...")
        input()
    elif ans == "yes":
        print("You go inside.  It's nice and cool.")
        print("Press 'Enter' to continue...")
        input()
    elif ans == "n":
        print("You pass on by, but really regret not going in.")
        print("THE END")
        print("Press 'Enter' to continue...")
        input()
    elif ans == "no":
        print("You pass on by, but really regret not going in.")
        print("THE END")
        print("Press 'Enter' to continue...")
        input()
    else:
        print("Um, spelling matters...")
        continue
print("After that little break, you and Wyatt head to the port.")
print("Press 'Enter' to continue...")
input()
print("The ship looms in the distance.  You're so excited!")
print("Press 'Enter' to continue...")
input()
print("The line to check in was long, but you're finally on board.")
print("Press 'Enter' to continue...")
input()
print("On the way to the room, you pass a food place where they serve drinks.  Do you stop for a beverage?  type 'y' for Yes, 'n' for No")
ans = ""
while (ans != "y" and ans != "yes" and ans != "n" and ans != "no"):
    if ans in ["y","yes"]:
        print("Hubby says, 'Maybe we should get to the room first.")
        input()
    elif ans in ["n","no"]:
        print("Hubby says, 'Probably a good choice, let's get to the room first.")
        input()
    else:
        print("Um, spelling matters...")
        continue
print("The cruise is awesome!  There's 24-hour food, lounges, and things to do.")
print("Press 'Enter' to continue...")
input()
print("At one point, you and Wyatt are walking along the 3rd floor on the side of the ship")
print("Press 'Enter' to continue...")
input()
print("There's a live band playing Motown and they're really good!")
print("Press 'Enter' to continue...")
input()
print("All of a sudden, there's a ton of people jamming with the band and a dance floor opens up!")
print("Press 'Enter' to continue...")
input()
ans = ""
while (ans != "y" and ans != "yes" and ans != "n" and ans != "no"):
    ans = input("Your hubby starts to get jiggy with it.  He sees that you desperately want to dance too!  'C'mon babe, let's dance!'  Press 'y' for Yes or 'n' for No").lower()
    if ans == "y":
        print("You both go into the middle of the dance floor.  You're the first ones because no one else was brave enough!")
        print("Press 'Enter' to continue...")
        input()
        print("Because you did this, the dance floor immediately fills up.  You dance the night away!")
        print("Press 'Enter' to continue...")
        input()
        print("You're exhausted.  You head back to the room to find champaign and cheesecake waiting for you with a note from the band leader thanking you for starting the dance floor.  Well done!")
        print("Press 'Enter' to continue...")
        input()
    elif ans == "yes":
        print("You both go into the middle of the dance floor.  You're the first ones because no one else was brave enough!")
        print("Press 'Enter' to continue...")
        input()
        print("Because you did this, the dance floor immediately fills up.  You dance the night away!")
        print("Press 'Enter' to continue...")
        input()
        print("You're exhausted.  You head back to the room to find champaign and cheesecake waiting for you with a note from the band leader thanking you for starting the dance floor.  Well done!")
        print("Press 'Enter' to continue...")
        input()
    elif ans == "n":
        print("Who are you and what have you done with my wife??")
        print("Press 'Enter to go back...")
        input()
    elif ans == "no":
        print("Who are you and what have you done with my wife??")
        print("Press 'Enter to go back...")
        input()
    else:
        print("Um, spelling matters...")
print("This cruise has been amazing.  It's your first one, and you've made so many memories!  But now it's time to head back home.")
print("Press 'Enter' to continue...")
input()
print("You can't wait until the next cruise!  You say this out loud.  Your hubby looks at his wallet with a pained expression.")
print("Press 'Enter' to continue...")
input()
print("THE END")
input()