package com.edu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Woker woker = new Woker("李白", 2000);
        Manager manager = new Manager("赵云",4000,9000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnal(woker);

    }

    //用于获取任何员工的工资信息
    public void showEmpAnnal(Employee e){
        System.out.println( e.getName() + e.getSalary() + e.getAnnual());
    }


}
