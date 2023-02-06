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

    java Main \path\to\data\file


