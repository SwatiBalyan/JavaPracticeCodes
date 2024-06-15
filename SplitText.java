// The main method must be in a class named "Main".
class Main {

    public static String[] Solution(String s){
        //splits a string with regex: space
        String result[];
        result=s.split(" ");

        return result;
    }



    public static void main(String[] args) {

        System.out.println("Main class!");

        //Predefined string accepted
        String s = "I am a new java programmer!";

        //storing each word in an array element
        String result[]=Solution(s);

        //iteration through array
        for(String x: result){
        System.out.println(x);
        }
    }
}
