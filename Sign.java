public class Sign {
    private String line;
    private int totallines;
    private int width;

    public Sign(String line, int width) {
        this.line = line;
        this.width = width;
        int extraline = 0;
        if (line.length()%width != 0) extraline = 1;
        totallines = line.length()/width + extraline;
    }

    public int NumberOfLines() {
        return totallines;
    }

    public String getLines() {
        String ogline = line;
        String sign = "";
        for (int i=0; i<line.length()/width; i++) {
            for (int o=0; o<width; o++) {
                sign += ogline.substring(o,o+1);
            }
            ogline = ogline.substring(width,ogline.length());
            sign += ";";
        }
        sign += ogline;
        return sign;
    }
}