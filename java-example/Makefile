JAVA_COMPILE=javac
JAVA_EXEC=java
RM_CMD=rm

default: Program.class
	cd 
	$(JAVA_EXEC) Program

Program.class: services/StockService.java services/StockServiceImpl.java Program.java
	$(JAVA_COMPILE) Program.java services/StockService.java services/StockServiceImpl.java

clear:
	$(RM_CMD) *.class
	$(RM_CMD) services/*.class