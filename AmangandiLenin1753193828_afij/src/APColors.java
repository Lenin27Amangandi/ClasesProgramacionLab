public class APColors {
    static String Black = "\u001b[30m";
    static String Red = "\u001b[31m";
    static String Green = "\u001b[32m";
    static String Yellow = "\u001b[33m";
    static String Blue = "\u001b[34m";
    static String Magenta = "\u001b[35m";
    static String Cyan = "\u001b[36m";
    static String White = "\u001b[37m";
    static String BrightBlack = "\u001b[30;1m";
    static String BrightRed = "\u001b[31;1m";
    static String BrightGreen = "\u001b[32;1m";
    static String BrightYellow = "\u001b[33;1m";
    static String BrightBlue = "\u001b[34;1m";
    static String BrightMagenta = "\u001b[35;1m";
    static String BrightCyan = "\u001b[36;1m";
    static String BrightWhite = "\u001b[37;1m";
    static String Purple_1 = "\u001b[38;5;139m";
    static String Cyan_2 = "\u001b[38;5;50m";
    static String Cyan_3 = "\u001b[38;5;48m";
    static String Purple_2 = "\u001b[38;5;5m";
    static String Pink = "\u001b[38;5;213m";
    static String Pink_1 = "\u001b[38;5;210m";
    static String Pink_2 = "\u001b[38;5;200m";
    static String Pink_3 = "\u001b[38;5;13m";
    static String Pink_4 = "\u001b[38;5;207m";
    static String Pink_5 = "\u001b[38;5;205m";
    static String Pink_6 = "\u001b[38;5;204m";
    static String Pink_7 = "\u001b[38;5;198m";
    static String Green_1 = "\u001b[38;5;28m";
    static String Green_2 = "\u001b[38;5;64m";
    static String Green_3 = "\u001b[38;5;100m";
    static String Green_4 = "\u001b[38;5;136m";
    static String Green_5 = "\u001b[38;5;178m";
    static String Green_6 = "\u001b[38;5;208m";
    static String Green_7 = "\u001b[38;5;40m";
    static String Green_8 = "\u001b[38;5;76m";
    static String Green_9 = "\u001b[38;5;112m";
    static String Green_10 = "\u001b[38;5;148m";
    static String Green_11 = "\u001b[38;5;184m";
    static String Green_12 = "\u001b[38;5;118m";
    static String Green_13 = "\u001b[38;5;154m";
    static String Green_14 = "\u001b[38;5;190m";
    static String Green_15 = "\u001b[38;5;226m";
    static String Blue_1 = "\u001b[38;5;27m";
    static String Blue_2 = "\u001b[38;5;63m";
    static String Blue_3 = "\u001b[38;5;99m";
    static String Blue_4 = "\u001b[38;5;135m";
    static String Blue_5 = "\u001b[38;5;171m";
    static String Blue_6 = "\u001b[38;5;207m";
    static String Cyan_4 = "\u001b[38;5;44m";
    static String Cyan_5 = "\u001b[38;5;80m";
    static String Cyan_6 = "\u001b[38;5;116m";
    static String Cyan_7 = "\u001b[38;5;152m";
    static String Cyan_8 = "\u001b[38;5;188m";
    static String Red_1 = "\u001b[38;5;124m";
    static String Red_2 = "\u001b[38;5;126m";
    static String Red_3 = "\u001b[38;5;128m";
    static String Yellow_1 = "\u001b[38;5;11m";
    static String Yellow_2 = "\u001b[38;5;178m";
    static String Yellow_3 = "\u001b[38;5;179m";
    static String Yellow_4 = "\u001b[38;5;180m";
    static String Yellow_5 = "\u001b[38;5;181m";
    static String Yellow_6 = "\u001b[38;5;182m";
    static String Yellow_7 = "\u001b[38;5;1m";
    static String mFP_1 = "\u001b[38;5;38m";
    static String mFP_2 = "\u001b[38;5;74m";
    static String mFP_3 = "\u001b[38;5;110m";
    static String mFP_4 = "\u001b[38;5;146m";
    static String mFP_5 = "\u001b[38;5;218m";
    static String Reset = "\u001b[0m";

    static String BackgroundCyan_1 = "\u001b[48;5;153m";
    static String BackgroundCyan_2 = "\u001b[48;5;152m";
    static String BackgroundGreen_6 = "\u001b[48;5;208m";
    static String BackgroundGreen_7 = "\u001b[48;5;102m";
    static String BackgroundGreen_8 = "\u001b[48;5;190m";
    static String BackgroundPink_1 = "\u001b[48;5;210m";
    static String BackgroundPink_2 = "\u001b[48;5;224m";
    static String BackgroundPink_3 = "\u001b[48;5;207m";
    static String BackgroundPurple = "\u001b[48;5;104m";
    static String BackgroundBlack = "\u001b[40m";
    static String BackgroundRed = "\u001b[41m";
    static String BackgroundGreen = "\u001b[42m";
    static String BackgroundYellow = "\u001b[43m";
    static String BackgroundBlue = "\u001b[44m";
    static String BackgroundMagenta = "\u001b[45m";
    static String BackgroundCyan = "\u001b[46m";
    static String BackgroundWhite = "\u001b[47m";
    static String BackgroundBrightBlack = "\u001b[40;1m";
    static String BackgroundBrightRed = "\u001b[41;1m";
    static String BackgroundBrightGreen = "\u001b[42;1m";
    static String BackgroundBrightYellow = "\u001b[43;1m";
    static String BackgroundBrightBlue = "\u001b[44;1m";
    static String BackgroundBrightMagenta = "\u001b[45;1m";
    static String BackgroundBrightCyan = "\u001b[46;1m";
    static String BackgroundBrightWhite = "\u001b[47;1m";

    public static void Spiner() {
        String charge[] = { "|", "/", "-", "\\", "|" };
        for (int i = 1; i <= 100; i++) {
            System.out.print("\r" + charge[i % 4] + " " + i + "%");
            try {
                Thread.sleep(150);
            } catch (InterruptedException ie) {
            }
        }
        System.out.println();
    }

}
