public class App2 {


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

    public static String pickRandomArrayIndex(String[] names){
        int q = (int)Math.floor(Math.random() * names.length);

        return names[q];
    }


    public static void main(String[] args) {

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
            "Jamel",

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
            "Mcpherson",
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


        for (int i = 1; i <= 1000; i++) {

            String rank = generateRank();

            String firstName = pickRandomArrayIndex(firstNames);
            String lastName = pickRandomArrayIndex(lastNames);
            
            System.out.print(firstName + i + " " + lastName + i + " " + rank + "\n");
        }
    }
}
