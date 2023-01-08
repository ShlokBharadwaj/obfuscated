import java.util.Scanner;

public class BrainFuckInterpreter {
    public static void main(String[] args) {

        // String to be interpreted
        String exec = "+++++++++++++[>+++++++++++[>++++++++++>+++>++++<<-]>+.>+[<]<-]>>++++.>+++++++[<++++++>-]<.>>>>[<+>-]<---.+++[<+++>-]<.<<<<.+++[<+++>-]<.>.+++[<++>-]<.++++++++++.";

        byte[] memory = new byte[30001];
        int pointer = 0;

        for (int i = 0; i < exec.length(); i++) {
            char c = exec.charAt(i);
            switch (c) {
                case '>':
                    pointer++;
                    break;
                case '<':
                    pointer--;
                    break;
                case '+':
                    memory[pointer]++;
                    break;
                case '-':
                    memory[pointer]--;
                    break;
                case '.':
                    System.out.print((char) memory[pointer]);
                    break;
                case ',':
                    Scanner scanner = new Scanner(System.in);
                    memory[pointer] = scanner.nextByte();
                    scanner.close();
                    break;
                case '[':
                    if (memory[pointer] == 0) {
                        int count = 1;
                        while (count > 0) {
                            i++;
                            char ch = exec.charAt(i);
                            if (ch == '[') {
                                count++;
                            } else if (ch == ']') {
                                count--;
                            }
                        }
                    }
                    break;
                case ']':
                    if (memory[pointer] != 0) {
                        int count = 1;
                        while (count > 0) {
                            i--;
                            char ch = exec.charAt(i);
                            if (ch == ']') {
                                count++;
                            } else if (ch == '[') {
                                count--;
                            }
                        }
                    }
                    break;
            }
        }
    }
}

/*
 * All 8 commands of BrainFuck for reference:
 * 
 * > Increment the pointer (to point to the next cell to the right).
 * < Decrement the pointer (to point to the next cell to the left).
 * + Increment the value at the pointer.
 * - Decrement the value at the pointer.
 * . Output the value at the pointer as a character.
 * , Input a character and store it at the pointer.
 * [ If the value at the pointer is zero, jump to the corresponding ]
 * ] If the value at the pointer is nonzero, jump back to the corresponding [
 * 
 */