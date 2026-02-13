import java.util.ArrayList;
import java.util.Scanner;

public class App{

    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Candidate> candidates = new ArrayList<>();
       
        boolean on = true;
        int option = 0;
        do {
            System.out.println("1. Add candidate");
            System.out.println("2. Vote");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Input the name of the candidate");
                    String name = scanner.nextLine();
                    Candidate candidate = new Candidate(name);
                    candidates.add(candidate);
                    System.out.println("New candidate added as: " + candidate.getId() + " - " + candidate.getName());
                    break;
                case 2:
                    ArrayList<Integer> urn = new ArrayList<>();
                    int votedCandidate = 0; 
                    
                    System.out.println("Input the candidate's Id as you pull each vote out of the ballot: ");
                    System.out.println("Candidates: ");
                    for (Candidate c : candidates) {
                        System.out.println(c.getId() + " - " + c.getName());
                    }

                    System.out.println("Input the votes Now: ");
                    while (votedCandidate != 0) {
                        votedCandidate = scanner.nextInt();
                        
                    }
                    
                    int amountOfVotes = urn.size();

                    for (Integer candidateId : urn) {
                        int numberOfVotes = 0;
                        for (Integer i : urn) {
                            if (i == candidateId) {
                                numberOfVotes++;
                            }
                        }
                    }

                    

                    

                    
                default:
                    break;
            }
        } while (on);
    } 
}