package com.guessme.guessme.English;

/**
 * Created by User on 23/08/2018.
 */

public class EnglishQuestions {

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for English Level 1
    private String English1Questions [][]= {
            {" Clara ___ my best friend ","is", "am", "are","is"},
            {" I ___ an honest boy ","is", "am", "are","am"},
            {" My toy robots ___ in the box ","is", "am", "are","are"},
            {" We ___ from China ","is", "am", "are","are"},
            {" Our dog ___ two years old ","is", "am", "are","is"},
            {" You ___ tall and strong.","is", "am", "are","are"},
            {" My father ___ a doctor ","is", "am", "are","is"},
            {" They ___ my parents ","is", "am", "are","are"},
            {" Joey and I ___ good students","is", "am", "are","are"},
            {" My dog ___ so big. ","is", "am", "are","is"}
    };

    public String getE1Questions(int a){
        String question = English1Questions[a][0];
        return question;
    }

    public String getE1Choice1(int a){
        String choice1 = English1Questions[a][1];
        return choice1;
    }

    public String getE1Choice2(int a){
        String choice2 = English1Questions[a][2];
        return choice2;
    }

    public String getE1Choice3(int a){
        String choice3 = English1Questions[a][3];
        return choice3;
    }

    public String getE1Answer(int a){
        String answer = English1Questions[a][4];
        return answer;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for English Level 2
    private String English2Questions [][]= {
            {" Dog - Cat ","Yes", "No","No"}, //1
            {" Bat - Cat ","Yes", "No","Yes"}, //2
            {" Cold - Bark ","Yes", "No","No"}, //3
            {" Shark - Spark ","Yes", "No","Yes"}, //4
            {" Love - Dove","Yes", "No","Yes"}, //5
            {" Pitcher - Throw ","Yes", "No","No"}, //6
            {" Honey - Money ","Yes", "No","Yes"}, //7
            {" Mouse - House ","Yes", "No","Yes"}, //8
            {" Chef - cook ","Yes", "No","No"}, //9
            {" Fish - bear ","Yes", "No","No"}, //10
            {" Run - fun ","Yes", "No","Yes"}, //11
            {" Dig - pig ","Yes", "No","Yes"}, //12
            {" Walk - run ","Yes", "No","No"}, //13
            {" Top - rope ","Yes", "No","No"}, //14
            {" Chip - dip ","Yes", "No","Yes"} //15
//            {" Potato - Tomato ","Yes", "No","Yes"}, //16
//            {" Time - Shine ","Yes", "No","Yes"}, //17
//            {" Key - Free ","Yes", "No","Yes"}, //18
//            {" Fast - dust ","Yes", "No","Yes"}, //19
//            {" Hair - bear ","Yes", "No","Yes"} //20

    };

    public String getE2Questions(int a){
        String question = English2Questions[a][0];
        return question;
    }
    // 2 lang yng pagpipilian
    public String getE2Choice1(int a){
        String choice1 = English2Questions[a][1];
        return choice1;
    }
    public String getE2Choice2(int a){
        String choice2 = English2Questions[a][2];
        return choice2;
    }
    public String getE2Answer(int a){
        String answer = English2Questions[a][3];
        return answer;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for English Level 3
    private String English3Questions [][]= {
            {" Dogs "," Singular ", " Plural ", " Plural "}, //1

            {" Cat "," Singular ", " Plural ", " Singular "}, //2

            {" Women "," Singular ", " Plural ", " Plural "}, //3

            {" Children "," Singular ", " Plural ", " Plural "}, //4

            {" Goose "," Singular ", " Plural ", " Singular "}, //5

            {" Knives "," Singular ", " Plural ", " Plural "}, //6

            {" Potatoes "," Singular ", " Plural ", " Plural "}, //7

            {" Baby "," Singular ", " Plural ", " Singular "}, //8

            {" Body "," Singular ", " Plural ", " Singular "}, //9

            {" Fishes "," Singular ", " Plural ", " Plural "}, //10

            {" Carrot "," Singular ", " Plural ", " Singular "}, //11

            {" Pennies "," Singular ", " Plural ", " Plural "}, //12

            {" Calves "," Singular ", " Plural ", " Plural "}, //13

            {" Loaves "," Singular ", " Plural ", " Plural "}, //14

            {" Bread "," Singular ", " Plural ", " Singular "}, //15

            {" Jelly "," Singular ", " Plural ", " Singular "}, //16

            {" Planet "," Singular ", " Plural ", " Singular "}, //17

            {" Teeth "," Singular ", " Plural ", " Plural "}, //18

            {" Men "," Singular ", " Plural ", " Plural "}, //19

            {" Boy "," Singular ", " Plural ", " Singular "} //20

//            {" Fork "," Singular ", " Plural ", " Singular "}, //21
//
//            {" Corn "," Singular ", " Plural ", " Singular "}, //22
//
//            {" Ladies "," Singular ", " Plural ", " Plural "}, //23
//
//            {" Races "," Singular ", " Plural ", " Plural "}, //24
//
//            {" Months "," Singular ", " Plural ", " Plural "}, //25
//
//            {" Fairies "," Singular ", " Plural ", " Plural "}, //26
//
//            {" Flower "," Singular ", " Plural ", " Singular "}, //27
//
//            {" Fans "," Singular ", " Plural ", " Plural "}, //28
//
//            {" Glasses "," Singular ", " Plural ", " Plural "}, //29
//
//            {" Scissors "," Singular ", " Plural ", " Plural "} //30


    };
    //2 lang yng pagpipilian
    public String getE3Questions(int a){
        String question = English3Questions[a][0];
        return question;
    }
    public String getE3Choice1(int a){
        String choice1 = English3Questions[a][1];
        return choice1;
    }
    public String getE3Choice2(int a){
        String choice2 = English3Questions[a][2];
        return choice2;
    }
    public String getE3Answer(int a){
        String answer = English3Questions[a][3];
        return answer;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for English Level 4
    private String English4Questions [][]= {
            {" A ___ dog was chewing on a bone."," Big ", " Tasty ", " Big "}, //1

            {" Chris rose to school in a ___ bus."," High  ", " Yellow ", " Yellow "}, //2

            {" It was a very ___ day"," Cold ", " dented ", " Cold "}, //3

            {" Mark asked a ___ man to open her bottle "," Blue ", " Strong "," Strong "}, //4

            {" Brad left his ___ jump rope on the playground "," warm "," purple "," purple "}, //5

            {" Jay hurt his mouth on a ___ piece of pizza."," hot  ", " sticky ", " hot  "}, //6

            {" Dan had to fix his ___ glasses "," Slippery ", " broken "," broken "}, //7

            {" Aaron was excited to see  the ___ elephant  at the zoo "," Cold ", " Huge "," Huge "}, //8

            {" Noah was very shy around the ___ girl "," beautiful ", " left "," beautiful "}, //9

            {" The Empire state building is a very ___ building "," flat ", " tall "," tall "}, //10

            {" The steak that Dan cooked is ___ "," green ", " Delicious "," Delicious "}, //11

            {" This is an ___ castle in Britain "," High  ",  " old "," old "}, //12

            {" She jumped over a ___ puddle "," huge ", " easy ", " huge "}, //13

            {" She waved to her ___ friends "," beautiful ", " green ", " beautiful "}, //14

            {" Bill opened his ___ umbrella "," sweet ", " colorful ", " colorful "}, //15

            {" There candles are very ___ "," big ", " tasty "," big "}, //16

            {" Carlos is a very ___ man "," rich ", " dry "," rich "}, //17

            {" Australia is a ___ country "," Large ", " delicious ", " Large "}, //18

            {" I bought a ___ red shirt "," new  ", " young "," new  "}, //19

            {" He is a very ___ soldier "," rare ", " brave "," brave "},  //20

            {" This car is ___ "," Fast  ", " yummy ", " Fast  "}, //21

            {" The Architect designed the ___ house "," beautiful ", " fast ", " beautiful "}, //22

            {" I saw a ___ bear "," cold ", " large ", " large "}, //23

            {" I saw ___ stars "," Many ", " full ", " Many "}, //24

            {" An ___ man posts a letter "," cold ", " old ", " old "} //25

//            {" Bella bakes ___ cakes."," yummy ", " icy ", " yummy "}, //26
//
//            {" Look at that ___ dress."," pretty ", " sharp ", " pretty "}, //27
//
//            {" Mr. Sam is an ___ member of the club "," old ", " clean ", " old "}, //28
//
//            {" Mercury is the ___ planet"," smallest  ", " smart ", " smallest  "}, //29
//
//            {" These candies are very ___ "," sweet  ", " hot ", " sweet  "},  //30
//
//            {" I like to eat a ___ banana "," delicious ", " red ", " delicious "}, //31
//
//            {" See my ___ toy "," gentle ", " new "," new "}, //32
//
//            {" Grandma makes pies with ___ crusts "," funny ", " Flaky "," Flaky "}, //33
//
//            {" The stars are ___ in nighttime "," bright ", " delicious ", " bright "}, //34
//
//            {" Mom is always ___ when I am riding my bike "," worried ", " small ", " worried "}, //35
//
//            {" I think the flower garden is ___ "," fast ", " beautiful ", " beautiful "}, //36
//
//            {" My stomach is always ___ after I eat pizza."," full ", " narrow ", " full "}, //37
//
//            {" The ___ horse won the race."," small ", " Fast ", " Fast "}, //38
//
//            {" We like to laugh at ___ jokes "," Funny ", " Yummy ", " Funny "}, //39
//
//            {" My friend like swimming in ___ water "," fast ", " warm ", " warm "}, //40

    };
    //2 lang yng pagpipilian
    public String getE4Questions(int a){
        String question = English4Questions[a][0];
        return question;
    }
    public String getE4Choice1(int a){
        String choice1 = English4Questions[a][1];
        return choice1;
    }
    public String getE4Choice2(int a){
        String choice2 = English4Questions[a][2];
        return choice2;
    }
    public String getE4Answer(int a){
        String answer = English4Questions[a][3];
        return answer;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for English Level 5
    private String English5Questions [][]= {
            {" She ___ best student in our class."," is ", " am ", " are "," is "}, //1

            {" They ___ always playing outside"," is ", " am ", " are "," are "}, //2

            {" I ___ always paying attention to the teacher in class "," is ", " am ", " are "," am "}, //3

            {" Coco ___ swimming in the pool."," is ", " am ", " are "," is "}, //4

            {" The school bell ___ ringing."," is ", " am ", " are "," is "}, //5

            {" The ships ___ sailing in the sea."," is ", " am ", " are "," are "}, //6

            {" I ___ not a rabbit."," is ", " am ", " are "," am "}, //7

            {" Liam and Bobby ___ friends."," is ", " am ", " are "," are "}, //8

            {" We ___ happy."," is ", " am ", " are "," are "}, //9

            {" This ___ a lotus flower."," is ", " am ", " are "," is "}, //10

            {" Jot - Cat","Yes", "No", " None of the above ","Yes"}, //11

            {" Pot - Cat ","Yes", "No", " None of the above ","Yes"}, //12

            {" Cold - Asked ","Yes", "No", " None of the above "," No "}, //13

            {" Bark - Spark ","Yes", "No", " None of the above "," Yes "}, //14

            {" Dog - Dove ","Yes", "No", " None of the above "," No "}, //15

            {" Pitcher - Throw ","Yes", "No", " None of the above "," No "}, //16

            {" Funny - Money ","Yes", "No", " None of the above "," Yes "}, //17

            {" Ghost - House ","Yes", "No", " None of the above "," No "}, //18

            {" Juke- cook","Yes", "No", " None of the above "," Yes "}, //19

            {" Care - bear ","Yes", "No", " None of the above "," Yes "}, //20

            {" Heroes "," Singular ", " Plural ", " None of the above "," Plural "}, //21

            {" People "," Singular ", " Plural ", " None of the above "," Plural "}, //22

            {" Cacti "," Singular ", " Plural ", " None of the above "," Plural "}, //23

            {" Mouse "," Singular ", " Plural ", " None of the above "," Singular "}, //24

            {" Oxen "," Singular ", " Plural ", " None of the above "," Plural "}, //25

            {" Feet "," Singular ", " Plural ", " None of the above "," Plural "}, //26

            {" Children "," Singular ", " Plural ", " None of the above "," Plural "}, //27

            {" Child "," Singular ", " Plural ", " None of the above "," Singular "}, //28

            {" Pig "," Singular ", " Plural ", " None of the above "," Singular "}, //29

            {" Blade "," Singular ", " Plural ", " None of the above "," Singular "} //30

//            {"There was a big pumpkin on the porch","Pumpkin", "Porch ", "Big","Big"}, //31
//
//            {"Laura's costume was scary","Laura", "Scary", "Costume","Scary"}, //32
//
//            {"I played a game on my new computer","I ", "New", "computer","New"}, //33
//
//            {"The pizza we ate yesterday was delicious","Pizza", "Ate", "Delicious","Delicious"}, //34
//
//            {"Is that your messy paper on the floor?"," Messy", "Paper", "Floor"," Messy "}, //35
//
//            {" The airplane made a loud noise as it took off "," Airplane ", " loud ", " noise "," loud "}, //36
//
//            {" The player with the basketball is tall. "," Player ", " Basketball ", " Tall "," Tall "}, //37
//
//            {" We had a great trip to the zoo "," We ", " Great ", " Zoo "," Great "}, //38
//
//            {" Marvin's hands were sticky after she ate the candy "," Marvin ", " Sticky ", " Candy "," Sticky "}, //39
//
//            {" The children were happy when it was time for recess "," Children ", " Happy ", " Recess "," Happy "}, //40
//
//            {" I need a pencil to write a letter. ","I ","Need", " Write "," Write "}, //41
//
//                    {" Dan asked for a ham and sandwich for lunch "," Dan ", " Asked ", " Lunch "," Asked "}, //42
//
//                    {" The leaves fell from the trees. "," Leaves ", " Fell ", " Trees "," Fell "}, //43
//
//                    {" We can feel the hot sun on our backs. "," we ", " feel ", " sun "," feel "}, //44
//
//                    {" My dog sat still while waiting for a treat "," Dog ", " Waiting ", " treat "," Waiting "}, //45
//
//                    {" Steve works hard  building a sand castle "," Steve ", " Building ", " Sand castle "," Building "}, //46
//
//                    {" The baker cut the cake into six pieces "," Baker ", " Cut ", " Cake "," Cut "}, //47
//
//                    {" Barney picked a purple notebook "," Barney ", " Notebook ", " Picked "," Picked "}, //48
//
//                    {" I like to catch fish for dinner ","I", " catch ", " fish "," catch "}, //49
//
//                    {" Our volleyball team won the game "," Volleyball ", " team ", " won "," won "}, //50

            };

    public String getE5Questions(int a){
        String question = English5Questions[a][0];
        return question;
    }
    public String getE5Choice1(int a){
        String choice1 = English5Questions[a][1];
        return choice1;
    }
    public String getE5Choice2(int a){
        String choice2 = English5Questions[a][2];
        return choice2;
    }
    public String getE5Choice3(int a){
        String choice3 = English5Questions[a][3];
        return choice3;
    }
    public String getE5Answer(int a){
        String answer = English5Questions[a][4];
        return answer;
    }



}