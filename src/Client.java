import template.TemplateClass;
import template.TemplateImpl1;
import template.TemplateImpl2;

public class Client {
    public static void main(String[] args) {
        TemplateClass templateClass = new TemplateImpl1();
        System.out.println(templateClass.templateMethode());
        TemplateClass templateClass1 = new TemplateImpl2();
        System.out.println(templateClass1.templateMethode());
    }
}