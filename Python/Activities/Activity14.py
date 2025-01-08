def Fibonacci(num):
    if num<=1:
        return 1
    else:
        return (Fibonacci(num-1)+Fibonacci(num-2))
    
user_input = int(input("Enter number of fibnocci numbers you want : "))
if user_input<=0:
    print("enter positive num")
else :
    for i in range(user_input):
        print(Fibonacci(i))