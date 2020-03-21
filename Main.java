public class Main {

    public String squares(){
        String response = "*** Output ***";

        for (int x=1; x<=10; x++){
            response +=  "\n" + x*x;
        }
        return response;
    }

    public static void main(String[] args){
        Main main = new Main();
        System.out.println(main.squares());

    }
}