# obfuscated
Brainfuck, for recreational programming challenge ofcourse.

## Requirements
- java 8 or higher

## Running the Interpreter

1. Clone the repository:
```
git clone git@github.com:ShlokBharadwaj/obfuscated.git
```
2. Compile the code using the following command: `javac BrainFuckInterpreter.java`
3. Run the code using the following command: `java BrainFuckInterpreter`

## Modifying the Interpreter

To change the BrainFuck program that is being interpreted, you can modify the `string.bf` file with your BrainFuck code. Simply replace the existing program with your own BrainFuck code and save the file.

## Notes

- The interpreter uses a simple `byte` array to store the data for the BrainFuck program. The size of this array is set to 30001 by default, but it can be adjusted if necessary.
- ~~The interpreter does not include any error handling for invalid BrainFuck code, yet~~. If the program contains syntax errors or attempts to access invalid memory locations, it may produce unexpected results or crash.

## Troubleshooting

If you encounter any errors or issues when running the interpreter, try the following:

- Make sure you have the required version of Java installed on your system.
- Check that the `string.bf` file contains valid BrainFuck code.
- Check that the `string.bf` file is properly formatted and that all brackets are properly balanced.
- If you are using a terminal or command prompt, make sure that you are in the correct directory and that you have the necessary permissions to run the program.

If you continue to have issues, feel free to reach out for assistance.
