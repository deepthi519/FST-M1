def print_divisible_by_5(user_tuple):
     for num in user_tuple:
          if num % 5 == 0:
              print(num)

user_input = input("Enter a list of data separated by comas to tupples: ")
user_tuple = tuple(map(int, user_input.split(',')))

# Printing numbers divisible by 5
print("Numbers in the tuple divisible by 5 are:")
print_divisible_by_5(user_tuple)