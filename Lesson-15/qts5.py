def count_digit(num):
  count = 0
  while(num != 0):
    count += 1
    num //= 10
  return count

def armstrong_checking(num, power):
  sum = 0
  while(num != 0):
    ld = num % 10
    each_power = ld ** power
    sum += each_power
    num //= 10
  return sum


n = int(input())

sum_digit = count_digit(n)

arm = armstrong_checking(n, sum_digit)

if (arm == n):
  print("Armstrong")
else:
  print("Not Armstrong")