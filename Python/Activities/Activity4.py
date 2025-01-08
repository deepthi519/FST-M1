user1 = input("What is Player 1's name? ")
user2 = input("What is Player 2's name? ")
while True:
    val1 = input("enter one value from rock/paper/scissors:").lower()
    val2 = input("enter one value from rock/paper/scissors:").lower()
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
    repeat = input("Do you want to play another round? Yes/No: ").lower()
    if repeat=='yes':
        pass
    elif repeat=='no':
        raise SystemExit
    else :
        print("You entered an invalid option. Exiting now.")
        raise SystemExit

