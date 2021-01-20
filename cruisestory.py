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
print("Hello,", nam)
print("Are you ready for the adventure of a lifetime??")
print("type 'Y' for Yes, 'N' for No")
ans = input()
if ans in ["y", "yes"]:
    print("Woohooo!!  Let's gooooo!!")
    print("Press 'Enter' to continue...")
    input()
else:
    print(":(")
    input()
print("Your hubby comes to you one day and asks what you want to do for vacation.")
print("'Babe, do you want to go to the beach for a week?'")
print("'Or do you want to go on a cruise?'")
print("Type 'cruise' for a Carnival Cruise, or 'beach' for some sandy fun-in-the-sun.")
ans = input()
if ans in ["cruise"]:
    print("'Good choice on the cruise, honey!', your hubby says.")
    print("You both fly on American Airlines down to Mobile, AL.")
    print("This is where your ship is docked!")
    print("Press 'Enter' to continue...")
    input()
if ans in ["beach"]:
    print("Your hubby's face drops a little.")
    print("'Are you suuuuure?', he asks.")


