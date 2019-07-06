public class Palindrome {

    public static void main(String[] args){
        String input = "-2013";
        boolean flag = true;
        char inputArray[]= new char[5];
        char reverseArray[]= new char[5];
        for(int i=0;i<=input.length()-1;i++){
            inputArray[i] = input.charAt(i);

        }

        for(int j=0;j<=input.length()-1;j++){
            reverseArray[input.length()-1-j] = input.charAt(j);
        }

        System.out.println(inputArray);
        System.out.println(reverseArray);

        for(int i=0;i<inputArray.length-1;i++)

                if(inputArray[i]==reverseArray[i]){
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }

                if( flag == true){
                    System.out.println("It is palendrom");
                }else {
                    System.out.println("it is not");
                }
    }
}
