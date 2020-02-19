//WAP to convert seconds into days, hours, minutes and seconds.
public class Ques7 {
    public static void main(String[] args){
        int n=129600;
        System.out.println(n + " seconds");
        int days= n/(24*3600);
        System.out.println("Days: "+days+" day(s)");
        n=n%(24*3600);
        int hour=n/3600;
        System.out.println("Hours: "+hour+ " hour(s)");
        n=n%3600;
        int min=n/60;
        System.out.println("Minutes: "+min+" min(s)");
        n=n%60;
        int sec=n;
        System.out.println("Seconds: "+sec+" sec(s)");

    }
}
