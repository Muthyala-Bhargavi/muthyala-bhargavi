import java.util.Arrays;
import java.util.List;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Vector;
import java.util.TreeSet;

public class CollectionsDemo{
 public static void main(String[] args) {
 TreeSet<Employee> tsemp=new TreeSet<Employee>();
 tsemp.add(new Employee(101,"siri", "Intern",22));
 tsemp.add(new Employee(102,"Sri", "Intern",23));
 tsemp.add(new Employee(103,"Naaz", "Intern",22));
 tsemp.add(new Employee(104,"SRK", "Intern",21));
 tsemp.add(new Employee(105,"Siva", "Intern",20));
 
 tsemp.stream().forEach(t ->System.out.println(t));
 
 
 System.out.println("=========Name in descending order==============");
 
 //TreeSet<Employee> tsempByName().compareTo(o1.getEmployeename());
 
 TreeSet<Employee> tsempByName=new TreeSet<Employee>((Employee o1, Employee o2)->o2.getEmployeename().compareTo(o1.getEmployeename())); 

 tsempByName.add(new Employee(101,"siri", "Intern",22));
 tsempByName.add(new Employee(102,"Sri", "Intern",23));
 tsempByName.add(new Employee(103,"Naaz", "Intern",22));
 tsempByName.add(new Employee(104,"SRK", "Intern",21));
 tsempByName.add(new Employee(105,"Siva", "Intern",20));
 
 
tsempByName.stream().forEach(t ->System.out.println(t));
 
 System.out.println("==========Stream API methods===========");
List<String> names=Arrays.asList("siri","sri","srk","siva","naaz");
System.out.println("============Names starting with letter M============");

names.stream().filter(t ->t.startsWith("M"))
.forEach(t-> System.out.println(t));

System.out.println("=============Square of Unique Numbers=============");

List<Integer> num = Arrays.asList(2,3,4,5,6,4,9,5);

num.stream()
.distinct().map(x->x*x).forEach(x-> System.out.println(x));


num.stream()
.map(x->x*x).distinct().forEach(x-> System.out.println(x));

System.out.println("============= Unique Even elements=============");
num.stream().distinct()
.filter(t -> t%2==0).forEach(x->System.out.println(x));

System.out.println("List of employee age 22");

tsempByName.stream()
.filter(e->e.getEmployeeage()==22)
.map(Employee::getEmployeename)
.forEach(t->System.out.println(t));
/*.collect(Collectors.toList());

System.out.println(name22);*/
 }
}
