package HomeWork12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {

        String text = """
                Email для связи: support@techinnov.com, sales@techinnov.com.
                Документы: лицензия 4521-7896-23, сертификат 7896-4521-36.
                Телефон отдела продаж: +(25)9876543, техническая поддержка: +(29)1234567.
                
                Клиент Иван Петров оставил заявку 15.05.2023. Его контакты:
                Email: ivan.petrov@mail.ru, резервный email petrov.i@gmail.com.
                Номер договора: 1234-5678-90. Телефон: +(33)7654321.
                
                Дополнительная информация:
                Бухгалтерия работает с 9:00 до 18:00. Документы: акт 4567-1234-78, счет-фактура 9012-3456-12.
                """;

        String emailRegex = "\\b[\\w.-]+@[\\w.-]+\\.\\w{2,}\\b";
        String docNumberRegex = "\\b(\\d{4}-){2}\\d{2}\\b";
        String phoneRegex = "\\+\\(\\d{2}\\)\\d{7}\\b";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(text);
        while (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
        }

        Pattern docPattern = Pattern.compile(docNumberRegex);
        Matcher docMatcher = docPattern.matcher(text);
        while (docMatcher.find()) {
            System.out.println("document number: " + docMatcher.group());
        }

        Pattern phonePattern = Pattern.compile(phoneRegex);
        Matcher phoneMatcher = phonePattern.matcher(text);
        while (phoneMatcher.find()) {
            System.out.println("phone number: " + phoneMatcher.group());
        }
    }
}
