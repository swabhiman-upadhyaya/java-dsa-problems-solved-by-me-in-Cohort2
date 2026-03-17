n = int(input(""))
on = n

sum = 0

while (n != 0):
  ld = n % 10
  sum += ld
  n //= 10

if (on % sum == 0):
  print("Harshad Number")