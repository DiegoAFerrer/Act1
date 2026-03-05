import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class App {


    public static String generateRank(){
        int q = (int)Math.floor(Math.random() * 3);

            String rank = "";

            switch (q) {
                case 0:
                    rank = "assistant";
                    break;
                case 1:
                    rank = "associate";
                    break;
                case 2:
                    rank = "full";
                    break;
                default:
                    rank = "error";
                    break;
            }

        return rank;
    }

    public static String generateSalary(String rank){
        double salary;

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);

        switch (rank) {
                case "assistant":
                    salary = (Math.random()*30000)+ 50000;
                    break;
                case "associate":
                    salary = (Math.random()*50000)+ 60000;
                    break;
                case "full":
                    salary = (Math.random()*55000)+ 75000;
                    break;
                default:
                    salary = 0;
                    break;
            }

        return df.format(salary);
    }

    public static String pickRandomArrayIndex(String[] names){
        int q = (int)Math.floor(Math.random() * names.length);

        return names[q];
    }

    public static void main(String[] args) throws IOException{

        String[] firstNames = {
            "Tracie",
            "Darlene",
            "Harrod",

            "Katrina",
            "Merlin",
            "Brad",

            "Bill",
            "Ian",
            "Marcy",

            "Maynard",
            "Julia",
            "Zoey",

            "Dorothea",
            "Pablo",
            "Joy",

            "Evangeline",
            "Anthony",
            "Frederic",

            "Kraig",
            "Trinidad",
            "Cristina",

            "Elvis",
            "Jewel",
            "Sofia",

            "Blanca",
            "Sam",
            "Dorsey",

            "Edwin",
            "Joel",
            "Katharine",

            "Laurie",
            "Ingrid",
            "Ivy",

            "Abbey" //34
        };

        String[] lastNames = {
            "Hill",
            "House",
            "Mckee",

            "Liu",
            "Melton",
            "Costa",

            "Arias",
            "Townsend",
            "Mata",

            "Graves",
            "Salazar",
            "Walker",

            "Dawson",
            "Lewis",
            "Banks",

            "Carney",
            "Simmons",
            "Estes",

            "Schultz",
            "Haynes",
            "Melendez",

            "Beltran",
            "Tyler",
            "Gallagher",

            "McMurray",
            "Pepper",
            "Churchill",

            "Dixon",
            "Sable",
            "Glenn",

            "Cobb",
            "Vasquez",
            "Jones",

            "May" //34
        };

        String listOfEmployees = "";

        for (int i = 1; i <= 1000; i++) {

            String rank = generateRank();
            String salary = generateSalary(rank);


            String firstName = pickRandomArrayIndex(firstNames);
            String lastName = pickRandomArrayIndex(lastNames);
            

            listOfEmployees += firstName + i + " " + lastName + i + " " + rank + " " + salary + "\n";
        }

        FileWriter out = null;
        StringReader in = null;

        try{
            out = new FileWriter("miembros_facultad.txt");
            in = new StringReader(listOfEmployees);
            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        } catch(IOException ex){
            System.out.println("Error! Was not possible to instance Object in");
            System.out.println(ex.getMessage());
            ex.getMessage();
            ex.printStackTrace();

        } finally{
            if ( in != null ){
                in.close(); 
            } 
            
            if ( out != null ){
                out.close(); 
            }
        }
    }
}
