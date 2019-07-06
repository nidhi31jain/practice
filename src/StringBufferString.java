public class StringBufferString {

    public static void main(String[] args){

        String fname = "nidhi";
        String lname = " jain";
        System.out.println(fname.hashCode());
         fname = fname.concat(lname);       //need to assign to a variable
        System.out.println(fname.hashCode());       //hashcode is diffrent for fname before and after concat
        System.out.println(fname);

        StringBuffer str1 = new StringBuffer("milky");
        StringBuffer str2 = new StringBuffer(" jain");
        System.out.println(str1.hashCode());
        str1.append(str2);                //no need of assigning to a variable
        System.out.println(str1);

        System.out.println(str1.hashCode());  //hashcode is same before and after concat



    }
}
