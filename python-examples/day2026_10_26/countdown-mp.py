import multiprocessing as mp
import time

def countdown(n, queue):
    while n > 0:
        n -= 1
    queue.put(sum)

COUNT = int(2e8)

queue1 = mp.Queue()
queue2 = mp.Queue()
t1 = mp.Process(target=countdown,
                args=(COUNT, queue1))
t2 = mp.Process(target=countdown,
                args=(COUNT, queue2))
start = time.time()
t1.start()
t2.start()
t1.join()
t2.join()
print(queue1.get())
print(queue2.get())
end = time.time()
print(end-start)
