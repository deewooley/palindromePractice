public class PalinTwist {

    //1) To qualify for a loan, a person must make at least $80,000;
    //And must have been working at the company for 3 years or more
    //Write a program that asks a user for their salary and how long they have been employed at the company
    //If they  qualify for a loan print out yay..you qualify
    //Else print out ..how much money they have left to make (salary) to qualify for a loan

    public static void main(String[] args) {
        loanRequest(7000,2);

    }
    public static void loanRequest(int Salary, int YearsAtCompany){

        if(Salary>=80000 && YearsAtCompany>=3){
            System.out.println("Yay, you qualify");
        }
        else{

                    int salRemaining = 80000-Salary;
                    int timeRemaining = 3-YearsAtCompany;
            System.out.println("You still need to earn "+ salRemaining + " more dollars and you need to work at your job for " +timeRemaining +" more years");

        }

    }
}
