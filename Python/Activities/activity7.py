def sum_of_elements(user_list):
    return sum(user_list)

# Taking input from the user
user_input = input("Enter a list of numbers separated by spaces: ")
user_list = list(map(int, user_input.split()))

# Calculating the sum of the elements
result = sum_of_elements(user_list)

# Displaying the result
print(f"The sum of all the elements in the list is: {result}")
