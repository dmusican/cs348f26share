from threading import Thread
import time

def countdown(n):
    while n > 0:
        n -= 1
        if n % 100 == 0:
            time.sleep(1)

COUNT = int(1000)

t1 = Thread(target=countdown, args=(COUNT, ))
t2 = Thread(target=countdown, args=(COUNT, ))
start = time.time()
t1.start()
t2.start()
t1.join()
t2.join()
end = time.time()
print(end-start)
