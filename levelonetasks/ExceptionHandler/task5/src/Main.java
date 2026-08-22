import javax.annotation.processing.Filer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    /*
    هنا عملن اوبجيكت فايل ريدر عشان اجيب التاسك واقرا ولو مش موجود امسكه يالكاتش
     */
    try {
        FileReader file = new FileReader("tasks.txt");
        int charac;
        while ((charac = file.read()) != -1) {
            System.out.print((char) charac);

        }
        file.close();
    } catch (FileNotFoundException e) {
        System.out.println("file not here");
    } catch (IOException e) {

        System.out.println("our");
    }
}