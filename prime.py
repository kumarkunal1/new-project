
# Online Python - IDE, Editor, Compiler, Interpreter

num1 = int(input ("Enter the First Number:"))  
num2 = int(input ("Enter the Second Number:"))  
      
print ("The Prime Numbers between\n",num1," and ",num2," are: ")  
for i in range (num1, num2 + 1):  
    if i > 1:  
        for j in range (2, i):  
            if (i % j) == 0:  
                break  
        else:  
                print (i) 
