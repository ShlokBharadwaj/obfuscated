# obfuscated
Brainfuck, for recreational programming challenge ofcourse.

# Requirements
- java 8 or higher

## Running the Interpreter

1. Download the BrainFuckInterpreter.java file.
2. Open a terminal or command prompt.
3. Navigate to the directory where you saved the file.
4. Compile the code using the following command: `javac BrainFuckInterpreter.java`
5. Run the code using the following command: `java BrainFuckInterpreter`

## Modifying the Interpreter

To change the BrainFuck program that is being interpreted, you can modify the `exec` string in the `main` method of the `BrainFuckInterpreter` class. Simply replace the existing program with your own BrainFuck code and save the file.

## Notes

- The interpreter uses a simple `byte` array to store the data for the BrainFuck program. The size of this array is set to 30001 by default, but it can be adjusted if necessary.
- The interpreter does not include any error handling for invalid BrainFuck code, yet. If the program contains syntax errors or attempts to access invalid memory locations, it may produce unexpected results or crash.

## Troubleshooting

If you encounter any errors or issues when running the interpreter, try the following:

- Make sure you have the required version of Java installed on your system.
- Check that the exec string in the `main` method of the `BrainFuckInterpreter` class contains valid BrainFuck code.
- Check that the program string is properly formatted and that all brackets are properly balanced.
- If you are using a terminal or command prompt, make sure that you are in the correct directory and that you have the necessary permissions to run the program.

If you continue to have issues, feel free to reach out for assistance.
