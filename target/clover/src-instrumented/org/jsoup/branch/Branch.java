/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package org.jsoup.branch;
@java.lang.SuppressWarnings({"fallthrough"}) public class Branch {public static class __CLR4_4_11b41b4lh9yvgc3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u006f\u006e\u0067\u0078\u0069\u0070\u0065\u006e\u0067\u002f\u0044\u006f\u0077\u006e\u006c\u006f\u0061\u0064\u0073\u002f\u004d\u0050\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1683255515475L,8589935092L,1891,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Method with no parameters and multiple if-else branches
    public void printWeather() {try{__CLR4_4_11b41b4lh9yvgc3.R.inc(1696);
        __CLR4_4_11b41b4lh9yvgc3.R.inc(1697);int temperature = 25;
        __CLR4_4_11b41b4lh9yvgc3.R.inc(1698);if ((((temperature >= 30)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1699)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1700)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1701);System.out.println("It's very hot outside!");
        } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1702);if ((((temperature >= 20)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1703)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1704)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1705);System.out.println("It's a nice day outside.");
        } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1706);if ((((temperature >= 10)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1707)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1708)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1709);System.out.println("It's a bit chilly outside.");
        } }else {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1710);System.out.println("It's freezing cold outside!");
        }
    }}}}finally{__CLR4_4_11b41b4lh9yvgc3.R.flushNeeded();}}

    // Method with a single parameter and multiple if-else branches
    public void calculateDiscount(int purchaseAmount) {try{__CLR4_4_11b41b4lh9yvgc3.R.inc(1711);
        __CLR4_4_11b41b4lh9yvgc3.R.inc(1712);if ((((purchaseAmount >= 1000)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1713)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1714)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1715);System.out.println("You get a 25% discount!");
        } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1716);if ((((purchaseAmount >= 500)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1717)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1718)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1719);System.out.println("You get a 10% discount!");
        } }else {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1720);System.out.println("Sorry, no discount available.");
        }
    }}}finally{__CLR4_4_11b41b4lh9yvgc3.R.flushNeeded();}}

    // Method with multiple parameters and multiple if-else branches
    public void getGrade(int marks, int totalMarks) {try{__CLR4_4_11b41b4lh9yvgc3.R.inc(1721);
        __CLR4_4_11b41b4lh9yvgc3.R.inc(1722);int percentage = (marks * 100) / totalMarks;

        __CLR4_4_11b41b4lh9yvgc3.R.inc(1723);if ((((percentage >= 90)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1724)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1725)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1726);System.out.println("You got an A grade!");
        } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1727);if ((((percentage >= 80)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1728)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1729)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1730);System.out.println("You got a B grade.");
        } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1731);if ((((percentage >= 70)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1732)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1733)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1734);System.out.println("You got a C grade.");
        } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1735);if ((((percentage >= 60)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1736)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1737)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1738);System.out.println("You got a D grade.");
        } }else {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1739);System.out.println("You got an F grade. Better luck next time!");
        }
    }}}}}finally{__CLR4_4_11b41b4lh9yvgc3.R.flushNeeded();}}

    // Method with no parameters and nested if-else statements
    public void printCalendar() {try{__CLR4_4_11b41b4lh9yvgc3.R.inc(1740);
        __CLR4_4_11b41b4lh9yvgc3.R.inc(1741);int dayOfWeek = 3;
        __CLR4_4_11b41b4lh9yvgc3.R.inc(1742);int weekOfMonth = 2;

        __CLR4_4_11b41b4lh9yvgc3.R.inc(1743);if ((((dayOfWeek == 1)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1744)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1745)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1746);System.out.println("Sunday");
        } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1747);if ((((dayOfWeek == 2)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1748)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1749)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1750);System.out.println("Monday");
        } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1751);if ((((dayOfWeek == 3)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1752)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1753)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1754);if ((((weekOfMonth == 1)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1755)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1756)==0&false))) {{
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1757);System.out.println("First Wednesday of the month");
            } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1758);if ((((weekOfMonth == 2)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1759)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1760)==0&false))) {{
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1761);System.out.println("Second Wednesday of the month");
            } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1762);if ((((weekOfMonth == 3)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1763)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1764)==0&false))) {{
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1765);System.out.println("Third Wednesday of the month");
            } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1766);if ((((weekOfMonth == 4)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1767)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1768)==0&false))) {{
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1769);System.out.println("Fourth Wednesday of the month");
            } }else {{
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1770);System.out.println("Invalid week of the month");
            }
        }}}}} }else {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1771);System.out.println("Invalid day of the week");
        }
    }}}}finally{__CLR4_4_11b41b4lh9yvgc3.R.flushNeeded();}}

    // Method with a single parameter and a switch statement
    public void printMonth(int month) {try{__CLR4_4_11b41b4lh9yvgc3.R.inc(1772);
        boolean __CLB4_4_1_bool0=false;__CLR4_4_11b41b4lh9yvgc3.R.inc(1773);switch (month) {
            case 1:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1774);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1775);System.out.println("January");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1776);break;
            case 2:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1777);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1778);System.out.println("February");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1779);break;
            case 3:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1780);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1781);System.out.println("March");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1782);break;
            case 4:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1783);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1784);System.out.println("April");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1785);break;
            case 5:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1786);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1787);System.out.println("May");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1788);break;
            case 6:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1789);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1790);System.out.println("June");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1791);break;
            case 7:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1792);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1793);System.out.println("July");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1794);break;
            case 8:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1795);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1796);System.out.println("August");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1797);break;
            case 9:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1798);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1799);System.out.println("September");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1800);break;
            case 10:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1801);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1802);System.out.println("October");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1803);break;
            case 11:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1804);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1805);System.out.println("November");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1806);break;
            case 12:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1807);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1808);System.out.println("December");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1809);break;
            default:if (!__CLB4_4_1_bool0) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1810);__CLB4_4_1_bool0=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1811);System.out.println("Invalid month");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1812);break;
        }
    }finally{__CLR4_4_11b41b4lh9yvgc3.R.flushNeeded();}}

    // Method with no parameters and a nested switch statement
    public void printMenu() {try{__CLR4_4_11b41b4lh9yvgc3.R.inc(1813);
        __CLR4_4_11b41b4lh9yvgc3.R.inc(1814);int dayOfWeek = 1;

        boolean __CLB4_4_1_bool1=false;__CLR4_4_11b41b4lh9yvgc3.R.inc(1815);switch (dayOfWeek) {
            case 1:if (!__CLB4_4_1_bool1) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1816);__CLB4_4_1_bool1=true;}
            case 2:if (!__CLB4_4_1_bool1) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1817);__CLB4_4_1_bool1=true;}
            case 3:if (!__CLB4_4_1_bool1) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1818);__CLB4_4_1_bool1=true;}
            case 4:if (!__CLB4_4_1_bool1) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1819);__CLB4_4_1_bool1=true;}
            case 5:if (!__CLB4_4_1_bool1) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1820);__CLB4_4_1_bool1=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1821);System.out.println("Regular menu");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1822);break;
            case 6:if (!__CLB4_4_1_bool1) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1823);__CLB4_4_1_bool1=true;}
                boolean __CLB4_4_1_bool2=false;__CLR4_4_11b41b4lh9yvgc3.R.inc(1824);switch (getSpecialMenu()) {
                    case "BBQ Chicken":if (!__CLB4_4_1_bool2) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1825);__CLB4_4_1_bool2=true;}
                        __CLR4_4_11b41b4lh9yvgc3.R.inc(1826);System.out.println("Saturday special: BBQ Chicken");
                        __CLR4_4_11b41b4lh9yvgc3.R.inc(1827);break;
                    case "Spaghetti":if (!__CLB4_4_1_bool2) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1828);__CLB4_4_1_bool2=true;}
                        __CLR4_4_11b41b4lh9yvgc3.R.inc(1829);System.out.println("Saturday special: Spaghetti");
                        __CLR4_4_11b41b4lh9yvgc3.R.inc(1830);break;
                    default:if (!__CLB4_4_1_bool2) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1831);__CLB4_4_1_bool2=true;}
                        __CLR4_4_11b41b4lh9yvgc3.R.inc(1832);System.out.println("No special menu available");
                        __CLR4_4_11b41b4lh9yvgc3.R.inc(1833);break;
                }
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1834);break;
            case 7:if (!__CLB4_4_1_bool1) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1835);__CLB4_4_1_bool1=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1836);System.out.println("Sunday brunch menu");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1837);break;
            default:if (!__CLB4_4_1_bool1) {__CLR4_4_11b41b4lh9yvgc3.R.inc(1838);__CLB4_4_1_bool1=true;}
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1839);System.out.println("Invalid day of the week");
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1840);break;
        }
    }finally{__CLR4_4_11b41b4lh9yvgc3.R.flushNeeded();}}

    // Helper method for printMenu() method
    private String getSpecialMenu() {try{__CLR4_4_11b41b4lh9yvgc3.R.inc(1841);
        __CLR4_4_11b41b4lh9yvgc3.R.inc(1842);return "BBQ Chicken";
    }finally{__CLR4_4_11b41b4lh9yvgc3.R.flushNeeded();}}

    // Method with no parameters and multiple if-else branches
    public void printTrafficLight() {try{__CLR4_4_11b41b4lh9yvgc3.R.inc(1843);
        __CLR4_4_11b41b4lh9yvgc3.R.inc(1844);String color = "red";

        __CLR4_4_11b41b4lh9yvgc3.R.inc(1845);if ((((color.equals("red"))&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1846)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1847)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1848);System.out.println("Stop!");
        } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1849);if ((((color.equals("yellow"))&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1850)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1851)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1852);System.out.println("Get ready to go.");
        } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1853);if ((((color.equals("green"))&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1854)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1855)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1856);System.out.println("Go!");
        } }else {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1857);System.out.println("Invalid traffic light color");
        }
    }}}}finally{__CLR4_4_11b41b4lh9yvgc3.R.flushNeeded();}}

    // Method with multiple parameters and multiple if-else branches
    public void calculateTax(int income, boolean isMarried) {try{__CLR4_4_11b41b4lh9yvgc3.R.inc(1858);
        __CLR4_4_11b41b4lh9yvgc3.R.inc(1859);if ((((isMarried)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1860)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1861)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1862);if ((((income >= 80000)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1863)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1864)==0&false))) {{
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1865);System.out.println("Your tax rate is 25%");
            } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1866);if ((((income >= 50000)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1867)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1868)==0&false))) {{
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1869);System.out.println("Your tax rate is 20%");
            } }else {{
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1870);System.out.println("Your tax rate is 15%");
            }
        }}} }else {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1871);if ((((income >= 60000)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1872)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1873)==0&false))) {{
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1874);System.out.println("Your tax rate is 20%");
            } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1875);if ((((income >= 40000)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1876)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1877)==0&false))) {{
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1878);System.out.println("Your tax rate is 15%");
            } }else {{
                __CLR4_4_11b41b4lh9yvgc3.R.inc(1879);System.out.println("Your tax rate is 10%");
            }
        }}}
    }}finally{__CLR4_4_11b41b4lh9yvgc3.R.flushNeeded();}}

    // Method with no parameters and multiple if-else branches
    public void printMessage() {try{__CLR4_4_11b41b4lh9yvgc3.R.inc(1880);
        __CLR4_4_11b41b4lh9yvgc3.R.inc(1881);int hour = 14;

        __CLR4_4_11b41b4lh9yvgc3.R.inc(1882);if ((((hour < 12)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1883)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1884)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1885);System.out.println("Good morning!");
        } }else {__CLR4_4_11b41b4lh9yvgc3.R.inc(1886);if ((((hour < 18)&&(__CLR4_4_11b41b4lh9yvgc3.R.iget(1887)!=0|true))||(__CLR4_4_11b41b4lh9yvgc3.R.iget(1888)==0&false))) {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1889);System.out.println("Good afternoon!");
        } }else {{
            __CLR4_4_11b41b4lh9yvgc3.R.inc(1890);System.out.println("Good evening!");
        }
    }}}finally{__CLR4_4_11b41b4lh9yvgc3.R.flushNeeded();}}
}
