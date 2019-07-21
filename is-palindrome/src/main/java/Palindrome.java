public class Palindrome {
    public boolean check(String sentence) {

        StringBuilder input = new StringBuilder();
        StringBuilder trimedSentence = input.append(sentence.replace(" ","").toLowerCase());

        StringBuilder input1 = new StringBuilder();
        StringBuilder reversedString = input1.append(trimedSentence).reverse();


        if (input.toString().equals(input1.toString()))
            return true;
        else
            return false;

    }
}
