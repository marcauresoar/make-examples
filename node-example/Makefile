RM=rm

default: run_tests
	echo "Dependencies installed and tests executed!".

node_modules: package.json
	npm install
	touch node_modules

run_tests: node_modules
	npm test

clear:
	$(RM) -rf node_modules
