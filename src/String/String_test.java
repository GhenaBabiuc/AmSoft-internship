package String;

public class String_test {
    public static void main(String[] args) {
        String welcome="welcome";
        String message=new String(" to Intwership!");
        System.out.println(welcome.concat(message));

        //isEmpty() isBlank()
        String empty=" ";
        System.out.println(empty.isEmpty());
        System.out.println(empty.isBlank());

        //lines()
        String text="sfre gregregrea greag reg re ger grea e\n"
                +"ergf er gerg re gergergreg reg re gre gre gre \n"
                +"erfaser fre fre htreh ytrhtrahe jrs thjyj tryhtr";

        //repeat
        text.lines().forEach(System.out::println);
        String goodjob="Good job!";
        System.out.println(goodjob.repeat(10));

        //Strip leading spaces
        String str="             Welcome!";
        System.out.println(str.strip());
    }
}
