   package com.company;

        public class Main {

            public static void main (String[] args) {
                // write your code here
                int yearOfBirthday = 1990;
                int monthOfBirthday = 5;
                int dayOfBirthday = 26;
                int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
                System.out.println("Сумма моего года, месяца и дня рождения:" + " " + sum);

                boolean monthBiggerDay = monthOfBirthday > dayOfBirthday;
                System.out.println("Месяц моего рождения больше даты рождения:" + monthBiggerDay);

                char [] myname = new char[8];
                myname [0] = 'В';
                myname [1] = 'и';
                myname [2] = 'к';
                myname [3] = 'т';
                myname [4] = 'о';
                myname [5] = 'р';
                myname [6] = 'и';
                myname [7] = 'я';
                System.out.println(myname);

                char[] myName = new char [] {'В','и','к','т','о','р','и','я'};
                System.out.println(myName);

                double myAge = 30;
                double partYear = 4.0/12.0;
                double res1 = myAge + partYear;
                System.out.println(res1);
            }
        }



