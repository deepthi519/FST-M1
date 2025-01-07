def res(user_list):
    if user_list[0]==user_list[-1]:
        return True
    else:
        return False
# Taking input from the user
user_input = input("Enter a list of numbers separated by spaces: ")
user_list = list(map(int, user_input.split()))

# Calculating the sum of the elements
result = res(user_list)

# Displaying the result
print(result)
