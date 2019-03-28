hello: main.o factorial.o hello.o
	$(CC) main.o factorial.o hello.o -o hello

functions.h:
	$(CC) functions.h

main.o: main.cpp functions.h
	$(CC) -c main.cpp

factorial.o: factorial.cpp functions.h
	$(CC) -c factorial.cpp

hello.o: hello.cpp functions.h
	$(CC) -c hello.cpp