import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

       String str = "(Nidhi is name my)";
       int countI =0;
       for(int index = 0; index< str.length(); index++){
           if(str.charAt(index) == 'i'){
               countI++;
           }
       }
       System.out.println("Count I = "+countI);

      //---------------------------------
       System.out.println(str.length());
        int count =0;
        for(int i=0;i<str.length();i++){
            if((str.substring(i,i+1)).equals("i")){
                count = count+1;
            }
        }

        System.out.println("i occurs: "+ count);
        int inddex = str.indexOf('(');
        String ind0 = str.substring(inddex,inddex+1);

        int inddexLast = str.indexOf(')');

        String indL = str.substring(inddexLast);

        String subString = str.substring(inddex+1,inddexLast);
        String[] array;

       array = subString.split(" ");
       for(int i=array.length-1;i>=0;i--){
           if (i==3){
              array[i]=ind0.concat(array[i]);
           }else if (i==0){
               array[i]=array[i].concat(indL);
           }
           System.out.print(array[i]+" ");


       }


    }
}
