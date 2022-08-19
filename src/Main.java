public class Main {
    public static void main(String[] args) {
        //task  №1

        String  firstName = " Ivan ";
        String  lastName =  " Ivanov ";
        String  middleName = "Ivanovich";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);




        // task №2

        fullName = fullName.replace("Ivanovich", "IVANOVICH");
        fullName = fullName.replace("Ivanov", "IVANOV");
        fullName = fullName.replace("Ivan", "IVAN");
        System.out.println("Данные ФИО сотрудника для заполнения отчета —" + fullName);


        //task №3

        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName2);
        System.out.println(fullName2);
    }
}