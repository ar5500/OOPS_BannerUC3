public class OOPS_BannerUC3 {

    public static void main(String[] args) {

        String[][] banner = {
                {"   *****  ", "    *****  ", "  ****** ", "   *******  "},
                {" **     **", " **     **", " **     **", " **     "},
                {" **     **", " **     **", " **     **", " **       "},
                {" **     **", " **     **", " *******  ", "  *****   "},
                {" **     **", " **     **", " **       ", "       ** "},
                {" **     **", " **     **", " **       ", " **    **"},
                {"   *****  ", "    *****  ", " **       ", "  *****  "}
        };

        for (String[] line : banner) {
            for (String part : line) {
                System.out.print(part + " ");
            }
            System.out.println();
        }
    }
}


