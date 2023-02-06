# KWIC (Key Word in Context)

In his paper of 1972, Parnas proposed the following problem:

    The KWIC [Key Word in Context] index system accepts an ordered set of 
    lines, each line is an ordered set of words, and each word is an ordered
    set of characters. Any line may be ``circularly shifted'' by repeatedly
    removing the first word and appending it at the end of the line. The
    KWIC index system outputs a listing of all circular shifts of all lines in
    alphabetical order.

There are various styles to implement the KWIC, like:

* Main procedure with sub-procedures with shared memory
* Object-oriented
* Event-based system
* Pipes and filters

In this project, we implemented the KWIC system using the **Main procedure with sub-procedures with shared memory**.

### Build

Go to the _src_ folder and open cmd.

Run the following command:

    javac Main.java

### Run

To Run the code, we need a .txt file with the data we want to index.

Go to the _src_ folder and open command line and run the following:

    java Main "\path\to\data\file"


### Run example

From the project _src_ directory, open command line and run:

    java Main "../example/data.txt"

Input:

```
Department of Computer Science
Key Word in Context
```

Output:

```
[Department of Computer Science, Key Word in Context]
Computer Science Department of                  line: 0
Context Key Word in                     line: 1
Department of Computer Science                  line: 0
Key Word in Context                     line: 1
Science Department of Computer                  line: 0
Word in Context Key                     line: 1
in Context Key Word                     line: 1
of Computer Science Department                  line: 0

```