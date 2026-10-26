import time

def countdown(n):
    while n > 0:
        n -= 1
        if n % 100 == 0:
            time.sleep(1)

COUNT = int(1000)

start = time.time()
countdown(COUNT)
end = time.time()
print(end-start)
