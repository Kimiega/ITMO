import base
import dop1
import dop2
import dop3
import time
start_time = time.time()
for i in range(1000):
    base.main()
print("Основное задание занимает", time.time() - start_time, "с")
start_time = time.time()
for i in range(1000):
    dop1.main()
print("Задание с внешними библиотеками занимает", time.time() - start_time, "с")
start_time = time.time()
for i in range(1000):
    dop2.main()
print("Задание с регулярками занимает", time.time() - start_time, "с")
start_time = time.time()
for i in range(1000):
    dop3.main()
print("Задание с переводом в csv занимает", time.time() - start_time, "с")
