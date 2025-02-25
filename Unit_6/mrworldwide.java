package Unit_6;

public class mrworldwide {
    public static void main(String[] args)
    {
        // 1. Declare 4 arrays and initialize them to the given values.
        // Countries: China, Egypt, France, Germany, India, Japan, Kenya, Mexico,
        // United Kingdom, United States
        // Capitals: Beijing, Cairo, Paris, Berlin, New Delhi, Tokyo, Nairobi,
        // Mexico City, London, Washington D.C.
        // Languages: Chinese, Arabic, French, German, Hindi, Japanese, Swahili,
        // Spanish, English, English
        // Filenames for map images: China.jpg, Egypt.jpg, France.jpg, Germany.jpg,
        // India.jpg, Japan.jpg, Kenya.jpg, Mexico.jpg, UK.jpg, US.jpg
        String[] Countries = {"China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico", "United Kingdom", "United States"};
        String[] Capitals = {"Beijing", "Cairo","Paris","Berlin","New Delhi","Tokyo","Nairobi","Mexico City", "London", "Washington D.C."};
        String[] Languages = {"Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish", "English", "English"};
        String[] Filenames = {"China.jpg", "Egypt.jpg" ,"France.jpg", "Germany.jpg","India.jpg","Japan.jpg","Kenya.jpg","Mexico.jpg","UK.jpg","US.jpg"};

        // 2. Pick a random number up to the length of one of the arrays and save
        // in the variable index
        int index = (int)(Math.random()* Countries.length-1);
        // 3. Print out the info in each array using the random index
        System.out.println("Country: " + Countries[index]);
        System.out.println("Capitals: " + Capitals[index]);
        System.out.println("Languages: " + Languages[index]);
        printHTMLimage(Filenames[index]);
        
                // Example of showing image files using an array called images (your array
                // name above may be different)
                // (this will only work in Active Code)
                // Countries obj = new Countries();
                // obj.printHTMLimage( images[index] );
        
            }
        
            // This method will just work in Active Code which interprets html
            public static void printHTMLimage(String filename)
    {
        String baseURL =
                "https://raw.githubusercontent.com/bhoffman0/CSAwesome/master/_sources/Unit6-Arrays/6-1-images/";
        System.out.print("<img src=" + baseURL + filename + " width=500px />");
    }
}
