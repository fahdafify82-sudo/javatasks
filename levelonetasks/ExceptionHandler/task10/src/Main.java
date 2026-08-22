/*
هنا عمل ميثود ريد فايل وعملت ثرو للاكسبشن 
 */
void readFile() throws IOException
{
 FileReader reader = new FileReader("tasks.txt");
 reader.close();

}
void main() {
try {
readFile();
}
catch (IOException e)
{
    System.out.println("error in reading file");
}

}
