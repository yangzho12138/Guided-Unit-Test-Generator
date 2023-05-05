package org.jsoup.branch;
public class Branch {
    // Method with no parameters and multiple if-else branches
    public void printWeather() {
        int temperature = 25;
        if (temperature >= 30) {
            System.out.println("It's very hot outside!");
        } else if (temperature >= 20) {
            System.out.println("It's a nice day outside.");
        } else if (temperature >= 10) {
            System.out.println("It's a bit chilly outside.");
        } else {
            System.out.println("It's freezing cold outside!");
        }
    }

    // Method with a single parameter and multiple if-else branches
    public void calculateDiscount(int purchaseAmount) {
        if (purchaseAmount >= 1000) {
            System.out.println("You get a 25% discount!");
        } else if (purchaseAmount >= 500) {
            System.out.println("You get a 10% discount!");
        } else {
            System.out.println("Sorry, no discount available.");
        }
    }

    // Method with multiple parameters and multiple if-else branches
    public void getGrade(int marks, int totalMarks) {
        int percentage = (marks * 100) / totalMarks;

        if (percentage >= 90) {
            System.out.println("You got an A grade!");
        } else if (percentage >= 80) {
            System.out.println("You got a B grade.");
        } else if (percentage >= 70) {
            System.out.println("You got a C grade.");
        } else if (percentage >= 60) {
            System.out.println("You got a D grade.");
        } else {
            System.out.println("You got an F grade. Better luck next time!");
        }
    }

    // Method with no parameters and nested if-else statements
    public void printCalendar() {
        int dayOfWeek = 3;
        int weekOfMonth = 2;

        if (dayOfWeek == 1) {
            System.out.println("Sunday");
        } else if (dayOfWeek == 2) {
            System.out.println("Monday");
        } else if (dayOfWeek == 3) {
            if (weekOfMonth == 1) {
                System.out.println("First Wednesday of the month");
            } else if (weekOfMonth == 2) {
                System.out.println("Second Wednesday of the month");
            } else if (weekOfMonth == 3) {
                System.out.println("Third Wednesday of the month");
            } else if (weekOfMonth == 4) {
                System.out.println("Fourth Wednesday of the month");
            } else {
                System.out.println("Invalid week of the month");
            }
        } else {
            System.out.println("Invalid day of the week");
        }
    }

    // Method with a single parameter and a switch statement
    public void printMonth(int month) {
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }

    // Method with no parameters and a nested switch statement
    public void printMenu() {
        int dayOfWeek = 1;

        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Regular menu");
                break;
            case 6:
                switch (getSpecialMenu()) {
                    case "BBQ Chicken":
                        System.out.println("Saturday special: BBQ Chicken");
                        break;
                    case "Spaghetti":
                        System.out.println("Saturday special: Spaghetti");
                        break;
                    default:
                        System.out.println("No special menu available");
                        break;
                }
                break;
            case 7:
                System.out.println("Sunday brunch menu");
                break;
            default:
                System.out.println("Invalid day of the week");
                break;
        }
    }

    // Helper method for printMenu() method
    private String getSpecialMenu() {
        return "BBQ Chicken";
    }

    // Method with no parameters and multiple if-else branches
    public void printTrafficLight() {
        String color = "red";

        if (color.equals("red")) {
            System.out.println("Stop!");
        } else if (color.equals("yellow")) {
            System.out.println("Get ready to go.");
        } else if (color.equals("green")) {
            System.out.println("Go!");
        } else {
            System.out.println("Invalid traffic light color");
        }
    }

    // Method with multiple parameters and multiple if-else branches
    public void calculateTax(int income, boolean isMarried) {
        if (isMarried) {
            if (income >= 80000) {
                System.out.println("Your tax rate is 25%");
            } else if (income >= 50000) {
                System.out.println("Your tax rate is 20%");
            } else {
                System.out.println("Your tax rate is 15%");
            }
        } else {
            if (income >= 60000) {
                System.out.println("Your tax rate is 20%");
            } else if (income >= 40000) {
                System.out.println("Your tax rate is 15%");
            } else {
                System.out.println("Your tax rate is 10%");
            }
        }
    }

    // Method with no parameters and multiple if-else branches
    public void printMessage() {
        int hour = 14;

        if (hour < 12) {
            System.out.println("Good morning!");
        } else if (hour < 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }
    }
}
