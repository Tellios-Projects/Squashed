package net.leafenzo;
// Doesn't Work
//public class TextureFileManager {
//    public static void main(String args[]) {
//        renameTextures("src/main/texture_identifiers.csv", "assets/squashed/textures/block");
//    }
//    public static void renameTextures(String names_csv_file, String target_folder)
//    {
//        Scanner sc = null;
//        try {
//            sc = new Scanner(new File(names_csv_file));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        sc.useDelimiter("\n");   //sets the delimiter pattern
//        int i = 0;
//        while (sc.hasNext())  //returns a boolean value
//        {
//            File file = new File(target_folder + "_" + i);
//            File rename = new File(target_folder + sc.next());
//            boolean flag = file.renameTo(rename);
//            if(flag == false) { throw new RuntimeException("File debug"); }
//
//            i++;
//        }
//        sc.close();  //closes the scanner
//    }
//}
