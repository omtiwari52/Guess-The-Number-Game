import random 

def guess(x):
    randomm = random.randint(1,x)   
    guess = 0 
    counter = 1
    while guess != randomm:
        guess = int(input(f"please guess the value between 1 and {x} : "))
        if guess > randomm :
            print("Oops too high !!")
            counter += 1
        elif guess < randomm :
            print("Oops too low !!")
            counter += 1

    print(f"You found the number in {counter} steps")


guess_number = int(input("please tell me your upper range : "))
guess(guess_number)