package com.guessme.guessme.Math;

import com.guessme.guessme.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 19/08/2018.
 */

public class MathQuestions {

    //Expert
    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for Math Level 1
    private String Math1Questions [][]= {
            {"235 + 247","480", "482", "484","482"},
            {"367 + 123","490", "492", "494","490"},
            {"78 + 23","97", "99", "101"," 101"},
            {"567 + 215","782", "784", "786","782"},
            {"329 + 251","578", "580", "582","580"},
            {"347+124","471", "457", "414","471"},
            {"467+243","684", "751", "710"," 710"},
            {"134+410","546", "544", "564","544"},
            {"254+157","421", "411", "401","411"},
            {"50+540","600", "570", "590","590"}

    };

    public String getM1Questions(int a){
        String question = Math1Questions[a][0];
        return question;
    }

    public String getM1Choice1(int a){
        String choice1 = Math1Questions[a][1];
        return choice1;
    }

    public String getM1Choice2(int a){
        String choice2 = Math1Questions[a][2];
        return choice2;
    }

    public String getM1Choice3(int a){
        String choice3 = Math1Questions[a][3];
        return choice3;
    }

    public String getM1Answer(int a){
        String answer = Math1Questions[a][4];
        return answer;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for Math Level 2
    private String Math2Questions [][]= {
            {"897-699","187", "198", "202","198"}, //1
            {"554- 378","176", "174", "175","176"}, //2
            {"706-378","465", "465", "328","328"}, //3
            {"957 - 589","368", "347", "400","368"}, //4
            {"705 - 473","204", "324", "232","232"}, //5
            {"450-310","210", "140", "150","140"}, //6
            {"550-150","400", "450", "420","400"}, //7
            {"341-157","184", "187", "195","184"}, //8
            {"120-57","37", "75", "63","63"}, //9
            {"123-67","74", "56", "66","56"}, //10
            {"341-97","297", "147", "244","244"}, //11
            {"246-140","174", "140", "106","106"}, //12
            {"341-222","182", "171", "119","119"}, //13
            {"214-111","120", "103", "91","103"}, //14
            {"124-50","74", "47", "70","74"}, //15
//            {"24-15","7", "9", "11","9"}, //16
//            {"45-20","15", "25", "20","25"}, //17
//            {"100-48","58", "74", "52","52"}, //18
//            {"67-57","10", "14", "40","10"}, //19
//            {"59-17","25", "42", "10","42"}  //20

    };

    public String getM2Questions(int a){
        String question = Math2Questions[a][0];
        return question;
    }

    public String getM2Choice1(int a){
        String choice1 = Math2Questions[a][1];
        return choice1;
    }
    public String getM2Choice2(int a){
        String choice2 = Math2Questions[a][2];
        return choice2;
    }
    public String getM2Choice3(int a){
        String choice3 = Math2Questions[a][3];
        return choice3;
    }
    public String getM2Answer(int a){
        String answer = Math2Questions[a][4];
        return answer;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for Math Level 3
    private String Math3Questions [][]= {
            {"20x2","30", "40", "50","40"}, //1

            {"12x2","24", "30", "16","24"}, //2

            {"30x3","60", "90", "99","90"}, //3

            {"6x4","14", "24", "34","24"}, //4

            {"5x5","15", "25", "35","25"}, //5

            {"7x4","18", "28", "48","28"}, //6

            {"6x3","18", "26", "38","18"}, //7

            {"10x4","24", "40", "44","40"}, //8

            {"40x2","80", "60", "20","80"}, //9

            {"25x2","55", "45", "50","50"}, //10

            {"8x6","38", "68", "48","48"}, //11

            {"23x2","36", "46", "56","46"}, //12

            {"35x2","70", "80", "90","70"}, //13

            {"13x4","52", "44", "34","52"}, //14

            {"87x1","87", "78", "80","87"}, //15

            {"98x0","100", "0", "10","0"}, //16

            {"15x3","35", "25", "45","45"}, //17

            {"14x4","56", "46", "66","56"}, //18

            {"39x2","68", "78", "88","78"}, //19

            {"26x2","42", "52", "62","52"},  //20

//            {"8x8","44", "54", "64","64"}, //21
//
//            {"6x6","26", "36", "46","36"}, //22
//
//            {"7x7","29", "69", "49","49"}, //23
//
//            {"9x9","91", "89", "81","81"}, //24
//
//            {"70x2","130", "135", "140","140"}, //25
//
//            {"8x9","72", "62", "52","72"}, //26
//
//            {"21x4","74", "64", "84","84"}, //27
//
//            {"19x3","37", "47", "57","57"}, //28
//
//            {"4x4","16", "26", "6","16"}, //29
//
//            {"100x2","102", "200", "150","200"}  //30


    };

    public String getM3Questions(int a){
        String question = Math3Questions[a][0];
        return question;
    }
    public String getM3Choice1(int a){
        String choice1 = Math3Questions[a][1];
        return choice1;
    }
    public String getM3Choice2(int a){
        String choice2 = Math3Questions[a][2];
        return choice2;
    }
    public String getM3Choice3(int a){
        String choice3 = Math3Questions[a][3];
        return choice3;
    }
    public String getM3Answer(int a){
        String answer = Math3Questions[a][4];
        return answer;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for Math Level 4
    private String Math4Questions [][]= {
            {"12 ÷ 2","4", "8", "6","6"}, //1

            {"16 ÷ 4","6", "4", "12","4"}, //2

            {"10 ÷ 2","5", "2", "8","5"}, //3

            {"6÷3","12", "2", "6","2"}, //4

            {"8÷2","4", "16", "10","4"}, //5

            {"12÷6","6", "18", "2","2"}, //6

            {"15÷3","4", "3", "5","3"}, //7

            {"20÷5","4", "5", "7","4"}, //8

            {"6÷3","4", "3", "2","2"}, //9

            {"20÷2","10", "5", "4","10"}, //10

            {"18÷6","4", "3", "5","3"}, //11

            {"16÷2","8", "6", "4","8"}, //12

            {"6÷2","1", "3", "5","3"}, //13

            {"6÷6","2", "6", "1","1"}, //14

            {"8÷8","4", "8", "1","1"}, //15

            {"30÷5","10", "7", "6","6"}, //16

            {"20÷4","4", "5", "3","5"}, //17

            {"2÷2","1", "12", "4","1"}, //18

            {"16÷8","4", "2", "8","2"}, //19

            {"100÷50","20", "50", "2","2"},  //20

            {"30÷6","6", "5", "10","5"}, //21

            {"50÷5","6", "5", "10","10"}, //22

            {"25÷5","8", "7", "5","5"}, //23

            {"21÷7","5", "3", "4","3"}, //24

            {"30÷2","6", "15", "20","15"}, //25

//            {"50÷10","5", "8", "10","5"}, //26
//
//            {"60÷20","3", "5", "6","3"}, //27
//
//            {"45÷15","3", "4", "5","3"}, //28
//
//            {"50÷25","2", "3", "4","2"}, //29
//
//            {"40÷20","7", "5", "2","2"},  //30
//
//            {"30÷10","2", "3", "1","3"}, //31
//
//            {"20÷4","5", "4", "6","5"}, //32
//
//            {"30÷3","5", "10", "3","10"}, //33
//
//            {"30÷6","6", "5", "8","5"}, //34
//
//            {"40÷8","4", "8", "5","5"}, //35
//
//            {"66÷11","7", "5", "6","6"}, //36
//
//            {"35÷7","5", "8", "9","5"}, //37
//
//            {"40÷2","17", "15", "20","20"}, //38
//
//            {"36÷6","6", "7", "8","6"}, //39
//
//            {"80÷40","7", "2", "5","2"}, //40

    };

    public String getM4Questions(int a){
        String question = Math4Questions[a][0];
        return question;
    }
    public String getM4Choice1(int a){
        String choice1 = Math4Questions[a][1];
        return choice1;
    }
    public String getM4Choice2(int a){
        String choice2 = Math4Questions[a][2];
        return choice2;
    }
    public String getM4Choice3(int a){
        String choice3 = Math4Questions[a][3];
        return choice3;
    }
    public String getM4Answer(int a){
        String answer = Math4Questions[a][4];
        return answer;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for Math Level 5
    private String Math5Questions [][]= {
            {"75+46+78","210", "199", "179","199"}, //1

            {"764-742","12", "15", "22","2"}, //2

            {"33*5","165", "154", "175","165"}, //3

            {"50÷10","6", "5", "10","5"}, //4

            {"24+87+64","175", "170", "185","175"}, //5

            {"58-34","24", "17", "27","24"}, //6

            {"15*7","110", "115", "105","105"}, //7

            {"44÷22","2", "4", "8","2"}, //8

            {"243+274+102","641", "619", "678","619"}, //9

            {"741-412","329", "312", "334","329"}, //10

            {"25*7","175", "155", "150","175"}, //11

            {"75÷25","6", "3", "8","3"}, //12

            {"246+215+300","750", "745", "761","761"}, //13

            {"751-51","700", "650", "675","700"}, //14

            {"3*27","67", "81", "74","81"}, //15

            {"56÷8","6", "7", "8","7"}, //16

            {"421+342+57","820", "781", "971","820"}, //17

            {"78-78","0", "1", "2","0"}, //18

            {"971*1","1", "971", "0","971"}, //19

            {"79÷1","79", "0", "1","79"},  //20

            {"316+645+102","1063", "1054", "1003","1063"}, //21

            {"794-547","214", "247", "234","247"}, //22

            {"947*0","0", "1", "947","0"}, //23

            {"100÷5","5", "10", "20","20"}, //24

            {"164+154+451","769", "764", "749","769"}, //25

            {"254-150","130", "104", "102","104"}, //26

            {"15*10","150", "15", "105","150"}, //27

            {"99÷9","9", "10", "11","11"}, //28

            {"214+143+14","371", "341", "316","371"}, //29

            {"541-341","200", "150", "41","200"},  //30

//            {"100*7","700", "70", "7","700"}, //31
//
//            {"54÷6","7", "8", "10","8"}, //32
//
//            {"216+84+51","315", "351", "335","351"}, //33
//
//            {"312-150","162", "150", "124","162"}, //34
//
//            {"32*4","124", "128", "132","128"}, //35
//
//            {"55÷11","5", "100", "50","5"}, //36
//
//            {"231+651","871", "846", "882","882"}, //37
//
//            {"351-200","150", "151", "164","151"}, //38
//
//            {"36*5","180", "157", "197","180"}, //39
//
//            {"105÷5","25", "24", "15","25"}, //40
//
//            {"245+654+100","998", "999", "1000","999"}, //41
//
//            {"612-512","100", "101", "99","100"}, //42
//
//            {"23*4","90", "92", "94","92"}, //43
//
//            {"84÷7","15", "26", "12","12"}, //44
//
//            {"275+372+210","857", "846", "841","857"}, //45
//
//            {"321-213","150", "108", "123","108"}, //46
//
//            {"21*7","147", "165", "157","147"}, //47
//
//            {"160÷8","20", "80", "15","20"}, //48
//
//            {"123+321+213","654", "614", "657","657"}, //49
//
//            {"751-5420","209", "219", "290","209"}, //50

    };

    public String getM5Questions(int a){
        String question = Math5Questions[a][0];
        return question;
    }
    public String getM5Choice1(int a){
        String choice1 = Math5Questions[a][1];
        return choice1;
    }
    public String getM5Choice2(int a){
        String choice2 = Math5Questions[a][2];
        return choice2;
    }
    public String getM5Choice3(int a){
        String choice3 = Math5Questions[a][3];
        return choice3;
    }
    public String getM5Answer(int a){
        String answer = Math5Questions[a][4];
        return answer;
    }

//Beginner
    private List<Integer> M1G1Questions = Arrays.asList(
            R.drawable.mb1,
            R.drawable.mb2,
        R.drawable.mb3,
        R.drawable.mb4,
        R.drawable.mb5,
        R.drawable.mb6,
        R.drawable.mb7,
        R.drawable.mb11,
        R.drawable.mb12,
        R.drawable.mb13,
        R.drawable.mb14,
        R.drawable.mb15,
        R.drawable.mb16
        );

private String M1G1Choices [][]= {
        {"Two(2)", "Four(4)", "Six(6)", "Four(4)"},
        {"Ten(10)", "Five(5)", "Nine(9)", "Nine(9)"},
        {"Nine(9)", "One(1)", "Four(4)", "Four(4)"},
        {"Six(6)", "Three(3)", "Two(2)", "Six(6)"},
        {"Four(4)", "Six(6)", "One(1)", "Six(6)"},
        {"Two(2)", "Five(5)", "Seven(7)", "Five(5)"},
        {"Three(3)", "Four(4)", "Five(5)", "Three(3)"},
        {"Fourteen(14)", "Twelve(12)", "Ten(10)", "Twelve(12)"},
        {"Four(4)", "Two(2)", "Three(3)", "Three(3)"},
        {"One(1)", "Two(2)", "Ten(10)", "One(1)"},
        {"Fourteen(14)", "Twenty(20)", "Ten(10)", "Fourteen(14)"},
        {"Nine(9)", "Eight(8)", "Ten(10)", "Eight(8)"},
        {"Eleven(11)", "Sixteen(16)", "Ten(10)", "Eleven(11)"}

};


    public Integer getM1G1Questions(int a){
        Integer question = M1G1Questions.get(a);
        return question;
    }

    public String getM1G1Choice1(int a){
        String choice1 = M1G1Choices[a][0];
        return choice1;
    }

    public String getM1G1Choice2(int a){
        String choice2 = M1G1Choices[a][1];
        return choice2;
    }

    public String getM1G1Choice3(int a){
        String choice3 = M1G1Choices [a][2];
        return choice3;
    }

    public String getM1G1Answer(int a){
        String answer = M1G1Choices [a][3];
        return answer;
    }



    private String M2G1Questions [][]= {
            {"2 ___ 6 ","GREATER THAN(>)", "LESS THAN(<)", "LESS THAN(<)"}, //1

            {"8__2","GREATER THAN(>)", "LESS THAN(<)", "GREATER THAN(>)"}, //2

            {"5__3","GREATER THAN(>)", "LESS THAN(<)", "GREATER THAN(>)"},//3

            {"10___9","GREATER THAN(>)", "LESS THAN(<)", "GREATER THAN(>)"}, //4

            {"1___11 ","GREATER THAN(>)", "LESS THAN(<)", "LESS THAN(<)"}, //5

            {"4___8","GREATER THAN(>)", "LESS THAN(<)", "LESS THAN(<)"}, //6

            {"7___3","GREATER THAN(>)", "LESS THAN(<)", "GREATER THAN(>)"}, //7

            {"2___9","GREATER THAN(>)", "LESS THAN(<)", "LESS THAN(<)"}, //8

            {"6__2","GREATER THAN(>)", "LESS THAN(<)", "GREATER THAN(>)"}, //9

            {"3__6 ","GREATER THAN(>)", "LESS THAN(<)", "LESS THAN(<)"}, //10

            {"5___1 ","GREATER THAN(>)", "LESS THAN(<)", "GREATER THAN(>)"},//11

            {"1___6","GREATER THAN(>)", "LESS THAN(<)", "LESS THAN(<)"}, //12

            {"4__6","GREATER THAN(>)", "LESS THAN(<)", "LESS THAN(<)"}, //13

            {"10__25","GREATER THAN(>)", "LESS THAN(<)", "LESS THAN(<)"},

            {"13__15","GREATER THAN(>)", "LESS THAN(<)", "LESS THAN(<)"},

            {"4__16","GREATER THAN(>)", "LESS THAN(<)", "LESS THAN(<)"},

            {"19__26","GREATER THAN(>)", "LESS THAN(<)", "LESS THAN(<)"},

            {"11___5","GREATER THAN(>)", "LESS THAN(<)", "GREATER THAN(>)"},



    };

    public String getM2G1Questions(int a){
        String question = M2G1Questions[a][0];
        return question;
    }

    public String getM2G1Choice1(int a){
        String choice1 = M2G1Questions[a][1];
        return choice1;
    }
    public String getM2G1Choice2(int a){
        String choice2 = M2G1Questions[a][2];
        return choice2;
    }
    // public String getM2G1Choice3(int a){
    //    String choice3 = M2G1Questions[a][3];
    //     return choice3;
    //  }
    public String getM2G1Answer(int a){
        String answer = M2G1Questions[a][3];
        return answer;
    }

    private String M3G1Questions [][]= {
            {" 4+2="," SIX ", " FIVE "," TWO "," SIX ", }, //1

            {" 3+1", " THREE ", " FOUR "," TWO "," FOUR ",}, //2

            {"5+5", "Ten", "Nine","Three","Ten"}, //3

            {"8+3", " Eleven", " Ten"," TWO "," Eleven", }, //4

            {" 7+2", " NINE ", " FIVE "," TEN ", " NINE "},//5

            {"4+4", " seven ", " Eight "," One ", " Eight "}, //9

            {"7+5", " Twelve ", " Ten "," Nine ", " Twelve "}, //10

            {"5+3", " eight ", " Two "," Nine "," eight "}, //11

            {"8+3 ", " eleven ", " Four "," One ", " eleven " }, //12

            {"7+3 ", " Nine ", " Ten "," Eight ", " Ten "}, //13

            {"6+4", " Two ", " Ten "," Nine "," Ten "}, //14

            {"7+9", " Sixteen ", " twelve "," two ", " Sixteen " }, //15

            {"7+3", " Eight", " Ten "," two ", " Ten " }, //16

            {"5+2", " Fourteen ", " twelve "," Seven ", " Seven " }, //17

            {"3+8", " Five ", " twelve "," Eleven ", " Eleven " }, //18

            {"6+6", " Seventeen ", " twelve "," two ", " twelve " }, //19

            {"5+6", " Seventeen ", " twelve "," eleven ", " eleven " } ,//20

            {"15+5", " Twenty ", " twelve "," eleven ", " Twenty " },

            {"9+6", " Seventeen ", " Fifteen "," eleven ", " Fifteen " },

            {"9+5", " Eighteen ", " twelve "," Fourteen ", " Fourteen " },

            {"8+8", " Eighteen ", " Sixteen "," Fourteen ", " Sixteen " },

            {"9+8", " Eighteen ", " twelve "," Seventeen ", " Seventeen " },


    };

    public String getM3G1Questions(int a){
        String question = M3G1Questions[a][0];
        return question;
    }
    public String getM3G1Choice1(int a){
        String choice1 = M3G1Questions[a][1];
        return choice1;
    }
    public String getM3G1Choice2(int a){
        String choice2 = M3G1Questions[a][2];
        return choice2;
    }
    public String getM3G1Choice3(int a){
        String choice3 = M3G1Questions[a][3];
        return choice3;
    }
    public String getM3G1Answer(int a){
        String answer = M3G1Questions[a][4];
        return answer;
    }

    private String M4G1Questions [][]= {
            {"12+12"," 24 ", " 20", "32 "," 24 "}, //1

            {"10+8"," 15 ", " 18 ", " 19 "," 18 "}, //2

            {" 15+10"," 25 ", " 45 ", " 35"," 25 "}, //3
            {" 26+10"," 38 "," 36 ", " 10"," 36 "}, //4

            {"35+15 "," 50 "," 40 ", " 60"," 50 "}, //5

            {"29+17 ","45 ","46 ", "50 ","46 "}, //6

            {"45+5"," 19 ","45 ", " 50 "," 50 "}, //7

            {"80+ 20"," 90 ","100 ", " 78","100 "}, //8

            {"56+25","36 ","79 ", "81 ","81 "}, //9

            {"72+22 ","94 ","80 ", "27 ","94 "}, //10

            {"19+19 ","45 ","38 ", "100 ","38 "}, //11

            {"69+14","67 ","83 ", "98","83 "}, //12

            {"10+13","23 ","18 ", "67 ","23 "}, //13

            {"19+17","36 ","26 ", "57","36 "}, //14

            {"55+45 "," 99 "," 100 ", "90"," 100 "}, //15

            {"34+34 "," 68 "," 100 ", " 55"," 68 "}, //16

            {"88+10 ","98 ","68 ", "79","98 "}, //17

            {"54+37 ","78 ","91 ", "45 ","91 "}, //18

            {"93+5","100 ","96 ", "98 ","98 "}, //19

            {"44+22","74 ", "80 ", "66","66 "}, //20

            {"45+45","90 ", "80 ", "60","90 "}, //20

            {"22+23","74 ", "45 ", "43","74 "}, //20

            {"46+64","74 ", "110 ", "115","110 "}, //20

            {"11+29","40 ", "25 ", "60","40 "}, //20

            {"12+12","24 ", "25 ", "18","24 "}, //20

            {"21+47","68 ", "55 ", "46","68 "},

            {"41+4","64 ", "45 ", "48","45 "},

            {"21+32","53 ", "55 ", "51","53 "},

            {"10+24","34 ", "35 ", "38","34 "},
    };

    public String getM4G1Questions(int a){
        String question = M4G1Questions[a][0];
        return question;
    }
    public String getM4G1Choice1(int a){
        String choice1 = M4G1Questions[a][1];
        return choice1;
    }
    public String getM4G1Choice2(int a){
        String choice2 = M4G1Questions[a][2];
        return choice2;
    }
    public String getM4G1Choice3(int a){
        String choice3 = M4G1Questions[a][3];
        return choice3;
    }
    public String getM4G1Answer(int a){
        String answer = M4G1Questions[a][4];
        return answer;
    }



    private String M5G1Questions [][]= {
            {"879___779", "greater than(>)", "less than (<)"," ","greater than(>)"}, //1

            {"909___550","greater than(>)", "less than (<)"," ","greater than(>)"},  //2

            {"678_____980", "greater than(>)", "less than (<)"," ","less than (<)"}, //3

            {"998____179","greater than(>)", "less than (<)"," ","greater than(>)"}, //4

            {"99+68","167 ", "100 ", "185","167 "}, //5

            {"69+69","24", "138", "27","138"}, //6

            {"72+69","110", "115", "141","141"}, //7

            {"89+88","177 ", "87 ", "80"," 177 "}, //8

            {"76+45","111", "121", "131","121"}, //9

            {"45+74","129", "119", "134","119 "}, //10

            {"35+65","100", "155", "150","100"}, //11

            {"12_11","greater than(>)", "less than (<)"," ","greater than(>)"},  //12

            {"1_10","greater than(>)", "less than (<)"," ","greater than(>)"},  //13

            {"20_21","greater than(>)", "less than (<)"," ","less than (<)"},  //14

            {" 45_68","greater than(>)", "less than (<)"," ","less than (<)"},  //15

            {"54_67","greater than(>)", "less than (<)"," ","less than (<)"},  //16

            {"60_97","greater than(>)", "less than (<)"," ","less than (<)"},  //17

            {"11_10","greater than(>)", "less than (<)"," ","greater than(>)"},  //18

            {"67_97","greater than(>)", "less than (<)"," ","less than (<)"},  //19

            {"5_76","greater than(>)", "less than (<)"," ","less than (<)"},  //20

            {" 45+45","90", "80", "60","90"}, //21

            {"54+10","44", "64", "54","64"}, //22

            {"12+64","76", "86", "96","76"}, //23

            {"100+20","120", "210", "110","120"}, //24

            {"678+58","736", "764", "749","736"}, //25

            {"191+191","130", "382", "264 ","382"}, //26

            {"78+64","150", "142 ", "105","142 "}, //27

            {"46+39","80 ", "85", "91","85"}, //28

            {"190+99","289", "341", "283 ","289"}, //29

            {"58+55","200", "113", "150","113"} //30


    };

    public String getM5G1Questions(int a){
        String question = M5G1Questions[a][0];
        return question;
    }
    public String getM5G1Choice1(int a){
        String choice1 = M5G1Questions[a][1];
        return choice1;
    }
    public String getM5G1Choice2(int a){
        String choice2 = M5G1Questions[a][2];
        return choice2;
    }
    public String getM5G1Choice3(int a){
        String choice3 = M5G1Questions[a][3];
        return choice3;
    }
    public String getM5G1Answer(int a){
        String answer = M5G1Questions[a][4];
        return answer;
    }

    private String MathE1Questions [][]= {
            {"2,__,6,8,10","3", "4", "5","4"},
            {"1,__,5,7,9","2", "4", "3","3"},
            {"3,6,__,12,15", "9","8", "7", "9"},
            {"1,4,__,10,13","7", "4", "6","7"},
            {"3, _, 9, 10","11", "6", "2","6"},
            {"2,__,8,11,14","4", "5", "3","5"},
            {"__,6,9,12,15","2", "4", "3", "3"},
            {"2,4,6,__,10","7", "8", "5","8"},
            {"4,8,12,__,20","14", "16", "13","16"},
            {"_, 4, 6, 8, 10","2", "5", "3","2"}

    };

    public String getME1Questions(int a){
        String question = MathE1Questions[a][0];
        return question;
    }

    public String getME1Choice1(int a){
        String choice1 = MathE1Questions[a][1];
        return choice1;
    }

    public String getME1Choice2(int a){
        String choice2 = MathE1Questions[a][2];
        return choice2;
    }

    public String getME1Choice3(int a){
        String choice3 = MathE1Questions[a][3];
        return choice3;
    }

    public String getME1Answer(int a){
        String answer = MathE1Questions[a][4];
        return answer;
    }
    private List<Integer> ME2Questions = Arrays.asList(
            R.drawable.me21,
            R.drawable.me22,
            R.drawable.me23,
            R.drawable.me24,
            R.drawable.me25,
            R.drawable.me26,
            R.drawable.me27,
            R.drawable.me28,
            R.drawable.me29,
            R.drawable.me210,
            R.drawable.me211,
            R.drawable.me212,
            R.drawable.me213,
            R.drawable.me214,
            R.drawable.me215
    );

    private String ME2Choices [][]= {
            {"11:30", "10:30", "9:30", "11:30"}, //1
            {"10:30", "8:30", "9:30", "9:30"}, //2
            {"5:00", "6:00", "7:00", "6:00"}, //3
            {"1:00", "10:30", "2:00", "1:00"},  //4
            {"1:00", "11:00", "12:00", "11:00"}, //5
            {"2:30", "4:30", "3:30", "2:30"}, //6
            {"1:30", "2:30", "3:30", "11:30"}, //7
            {"7:00", "8:00", "9:00", "8:00"}, //8
            {"4:00", "3:00", "5:00", "4:00"}, //9
            {"3:40", "1:40", "2:40", "2:40"}, //10
            {"11:30", "11:45", "11:35", "11:45"}, //11
            {"3:30", "3:20", "3:25", "3:25"}, //12
            {"7:00", "8:00", "9:00", "9:00"}, //13
            {"1:30", "12:30", "2:30", "1:30"}, //14
            {"7:00", "5:00", "6:00", "5:00"}, //15





    };


    public Integer getME2Questions(int a){
        Integer question = ME2Questions.get(a);
        return question;
    }

    public String getME2Choice1(int a){
        String choice1 = ME2Choices[a][0];
        return choice1;
    }

    public String getME2Choice2(int a){
        String choice2 = ME2Choices[a][1];
        return choice2;
    }

    public String getME2Choice3(int a){
        String choice3 = ME2Choices [a][2];
        return choice3;
    }

    public String getME2Answer(int a){
        String answer = ME2Choices [a][3];
        return answer;
    }

    private String MathE3Questions [][]= {
            {"I","3", "1", "5","1"},
            {"II","2", "4", "3","2"},
            {"III", "3","8", "7", "3"},
            {"IV","3", "4", "6","4"},
            {"V","5", "6", "2","5"},
            {"VI","4", "5", "6","6"},
            {"VII","9", "4", "8", "7"},
            {"VIII","9", "4", "8", "8"},
            {"IX","7", "8", "5","9"},
            {"X","12", "10", "13","10"},
            {"XI","12", "15", "11","11"},
            {"XII","12", "15", "11","12"},
            {"XIII","12", "13", "11","13"},
            {"XIV","14", "15", "11","14"},
            {"XV","17", "15", "11","15"},
            {"XVI","12", "15", "16","16"},
            {"XVII","12", "17", "18","17"},
            {"XVIII","18", "19", "17","18"},
            {"XIX","18", "19", "21","19"},
            {"XX","23", "11", "20","20"},
    };

    public String getME3Questions(int a){
        String question = MathE3Questions[a][0];
        return question;
    }

    public String getME3Choice1(int a){
        String choice1 = MathE3Questions[a][1];
        return choice1;
    }

    public String getME3Choice2(int a){
        String choice2 = MathE3Questions[a][2];
        return choice2;
    }

    public String getME3Choice3(int a){
        String choice3 = MathE3Questions[a][3];
        return choice3;
    }

    public String getME3Answer(int a){
        String answer = MathE3Questions[a][4];
        return answer;
    }

    private String ME4Questions [][]= {

            {"1*3"," 4 ", " 2", "3 "," 3 "}, //1

            {"9 * 3"," 27 ", " 18 ", " 19 "," 27 "}, //2

            {" 15+14"," 25 ", " 29 ", " 35"," 29 "}, //3

            {" 26+10"," 38 "," 36 ", " 10"," 36 "}, //4

            {"35+15 "," 50 "," 40 ", " 60"," 50 "}, //5

            {"29+17 ","45 ","46 ", "50 ","46 "}, //6

            {"45+54"," 85 ","115 ", " 99 "," 99 "}, //7

            {"90+ 20"," 190 ","110 ", " 78","110 "}, //8

            {"25 * 25","365 ","548 ", "625 ","625 "}, //9

            {"82-14 ","68 ","54 ", "71 ","68 "}, //10

            {"190-84 ","95 ","106 ", "110 ","106 "}, //11

            {"69+14","67 ","83 ", "98","83 "}, //12

            {"10+15","23 ","18 ", "25 ","25 "}, //13

            {"28-13","15 ","13 ", "10","15 "}, //14

            {"_ * 10= 10 "," 1 "," 10 ", "2"," 1 "}, //15

            {"_ * 8= 8"," 3 "," 1 ", " 2"," 1 "}, //16

            {"_ * 13= 36","1 ","2 ", "4","2 "}, //17

            {"54+37 ","78 ","91 ", "45 ","91 "}, //18

            {"93+5","100 ","96 ", "98 ","98 "}, //19

            {"55-22","21 ", "23 ", "33 ","33 "}, //20

            {"45+45","90 ", "80 ", "60","90 "}, //21

            {"43-13","23 ", "30 ", "34","30 "}, //22

            {"46+64","74 ", "110 ", "115","110 "}, //23

            {"11*20","240 ", "220 ", "160","220 "}, //24

            {"12 * 10","124 ", "121 ", "120 ","120 "}, //25
    };

    public String getME4Questions(int a){
        String question = ME4Questions[a][0];
        return question;
    }

    public String getME4Choice1(int a){
        String choice1 = ME4Questions[a][1];
        return choice1;
    }
    public String getME4Choice2(int a){
        String choice2 = ME4Questions[a][2];
        return choice2;
    }
    public String getME4Choice3(int a){
        String choice3 = ME4Questions[a][3];
        return choice3;
    }
    public String getME4Answer(int a){
        String answer = ME4Questions[a][4];
        return answer;
    }
    private String ME5Questions [][]= {

            {"1*3"," 4 ", " 2", "3 "," 3 "}, //1

            {"9 * 3"," 27 ", " 18 ", " 19 "," 27 "}, //2

            {" 15+14"," 25 ", " 29 ", " 35"," 29 "}, //3

            {" 26+10"," 38 "," 36 ", " 10"," 36 "}, //4

            {"35+15 "," 50 "," 40 ", " 60"," 50 "}, //5

            {"29+17 ","45 ","46 ", "50 ","46 "}, //6

            {"45+54"," 85 ","115 ", " 99 "," 99 "}, //7

            {"90+ 20"," 190 ","110 ", " 78","110 "}, //8

            {"25 * 25","365 ","548 ", "625 ","625 "}, //9

            {"82-14 ","68 ","54 ", "71 ","68 "}, //10

            {"190-84 ","95 ","106 ", "110 ","106 "}, //11

            {"69+14","67 ","83 ", "98","83 "}, //12

            {"10+15","23 ","18 ", "25 ","25 "}, //13

            {"28-13","15 ","13 ", "10","15 "}, //14
            {"1,4,__,10,13","7", "4", "6","7"},

            {"3, _, 9, 10","11", "6", "2","6"},

            {"2,__,8,11,14","4", "5", "3","5"},

            {"54+37 ","78 ","91 ", "45 ","91 "}, //18

            {"93+5","100 ","96 ", "98 ","98 "}, //19

            {"55-22","21 ", "23 ", "33 ","33 "}, //20

            {"45+45","90 ", "80 ", "60","90 "}, //21

            {"43-13","23 ", "30 ", "34","30 "}, //22

            {"46+64","74 ", "110 ", "115","110 "}, //23

            {"11*20","240 ", "220 ", "160","220 "}, //24

            {"12 * 10","124 ", "121 ", "120 ","120 "}, //25
            {"78-78","0", "1", "2","0"}, //18

            {"971*1","1", "971", "0","971"}, //19

            {"79÷1","79", "0", "1","79"},  //20

            {"316+645+102","1063", "1054", "1003","1063"}, //21

            {"794-547","214", "247", "234","247"}, //22

            {"947*0","0", "1", "947","0"}, //23

            {"100÷5","5", "10", "20","20"}, //24

            {"164+154+451","769", "764", "749","769"}, //25

            {"254-150","130", "104", "102","104"}, //26

            {"15*10","150", "15", "105","150"}, //27

            {"99÷9","9", "10", "11","11"}, //28

            {"214+143+14","371", "341", "316","371"}, //29

            {"541-341","200", "150", "41","200"},  //30
    };

    public String getME5Questions(int a){
        String question = ME5Questions[a][0];
        return question;
    }

    public String getME5Choice1(int a){
        String choice1 = ME5Questions[a][1];
        return choice1;
    }
    public String getME5Choice2(int a){
        String choice2 = ME5Questions[a][2];
        return choice2;
    }
    public String getME5Choice3(int a){
        String choice3 = ME5Questions[a][3];
        return choice3;
    }
    public String getME5Answer(int a){
        String answer = ME5Questions[a][4];
        return answer;
    }


}
