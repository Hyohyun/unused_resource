package ca.skennedy.androidunusedresources;

public class Loader {
	
    private Loader() {
        super();
    }

    public static final String writeFile = "/Users/davidback/Desktop/notUsedR.txt";
    
    public static void main(final String[] args) {
        ResourceScanner resourceScanner;
        
        resourceScanner = new ResourceScanner("/Users/davidback/Desktop/android_repository/neo_goodoc_android_studio/app/", false);
        
        resourceScanner.run();
    }
}
