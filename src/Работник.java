public class Работник extends Человек {
    public Работник(String ФИО, int ГодРождения, int РазмЗарплаты) {
        this.ФИО = ФИО;
        this.ГодРождения = ГодРождения;
        this.РазмЗарплаты = РазмЗарплаты;
    }
    public void display1() {
        System.out.println(ФИО);
    }
    public void display2() {
        System.out.println(ГодРождения);
    }

    public void display3() {
        System.out.println(РазмЗарплаты);
    }
}
