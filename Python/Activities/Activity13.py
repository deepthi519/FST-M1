

def sum(numbers):
    sum=0
    for n in numbers:
        sum=sum+n
    return sum
user_input = input("Enter a list of numbers separated by spaces: ")
user_list = list(map(int, user_input.split()))
print(sum(user_list))