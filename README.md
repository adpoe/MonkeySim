# MonkeySim
(deliberately inefficient) Monkey Simulator

## Authors
@adpoe - Anthony Poerio (adp59@pitt.edu)  
@brandhonhedges82 - Brandon Hedges (bjh6@pitt.edu)

## Made for
Project #4 in CS1632, Fall 2016

## To Grade Updated MonkeySim Version
Please CD into the directory marked "**UPDATED**".

This directory contains the updated code and tests.

From there, please run:

`javac MonkeySim.java`  
`time java MonkeySim 23`  

You will then see the timed output of our updated version of MonkeySim.

The methods updated were:  
1. Monkey.generateId()  
2. MonkeySim.stringifyResults()  
3. MonkeySim.getFirstMonkey()  

By checking code for each of these methods, within the UPDATED folder, you will see our revisions.

**After our updates, we were able to run the MonkeySim with seed value 23 in about 1/10th of a second.**

## To Grade the Test Suite
To simplify grading the test suite, we created a separate folder that contained all necessary items to state and dependencies (including .jar files)

Steps to grade are:
* CD into the directory marked "**TEST_SUITE**"
* Run the following shell script: `sh compileThenRun.sh`

The compileThenRun.sh shell script will first compile our tests with all .jar dependencies, and then it will run our TestRunner and display final output.

**The testing code is found in the file named:**
`/TEST_SUITE/MonkeyTester.java`

The test runner is found at:
`/TEST_SUITE/TestRunner.java`

The rest of the files in this folder are dependencies necessary for testing.

We did duplicate some of the files, but this decision was made for clarity, and to make grading easier. Thank you.



## Original Version
We have also kept a copy of the original MonkeySim version, only so that it is easy to compare the revised output vs. the original output.

To see how far our revisions have come, you can cd into the "**ORIGINAL**" folder, and then compile, run and time he MonkeySim.java file using the same commands as were used when running the revised version.

On our machines, using the input value 23, takes an average of about 13 seconds to run the original version, in total.


