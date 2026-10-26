import multiprocessing as mp
import time

def countdown(n):
    while n > 0:
        n -= 1

COUNT = int(2e8)

t1 = mp.Process(target=countdown, args=(COUNT, ))
t2 = mp.Process(target=countdown, args=(COUNT, ))
start = time.time()
t1.start()
t2.start()
t1.join()
t2.join()
end = time.time()
print(end-start)
