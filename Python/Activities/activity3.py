val1 = input( "enter one value from rock/paper/scissors:" )
val2 = input( "enter one value from rock/paper/scissors:" )
if val1==val2 :
    print('it is a tie')
elif val1 == 'rock':
    if val2 == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif val1 == 'scissors':
    if val2 == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif val1 == 'paper':
    if val2 == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
