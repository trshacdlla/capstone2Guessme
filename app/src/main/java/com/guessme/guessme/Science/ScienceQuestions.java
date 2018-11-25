package com.guessme.guessme.Science;

/**
 * Created by User on 19/08/2018.
 */

public class ScienceQuestions {

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for ScienceLevel 1
    private String Science1Questions [][]= {
            {" What is the largest planet in our solar system?"," Earth ", " Jupiter ", " Mars "," Jupiter "},
            {" What is the closest planet on the Sun? "," Mercury ", " Venus ", " Earth "," Mercury "},
            {" What is the hottest planet in our solar system?"," Mars ", " Venus ", " Earth "," Venus "},
            {" What is the fourth planet in our solar system?"," Mars ", " Jupiter ", " Saturn"," Mars "},
            {" Which planet has a 'ring' on it?"," Earth ", " Mars ", " Saturn "," Saturn "},
            {" What planet comes after Mercury?"," Venus ", " Earth ", " Mars "," Venus "},
            {" What planet comes before Mars?"," Pluto", " Earth ", " Mercury "," Earth "},
            {" What planet comes after Jupiter?"," Saturn ", " Mars ", " Uranus "," Saturn "},
            {" What planet comes after Earth?"," Jupiter ", " Mercury ", " Mars "," Mars "},
            {" What planet comes before Jupiter?"," Earth ", " Mars ", " Uranus "," Mars "}
    };

    public String getS1Questions(int a){
        String question = Science1Questions[a][0];
        return question;
    }

    public String getS1Choice1(int a){
        String choice1 = Science1Questions[a][1];
        return choice1;
    }

    public String getS1Choice2(int a){
        String choice2 = Science1Questions[a][2];
        return choice2;
    }

    public String getS1Choice3(int a){
        String choice3 = Science1Questions[a][3];
        return choice3;
    }

    public String getS1Answer(int a){
        String answer = Science1Questions[a][4];
        return answer;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for Science Level 2
    private String Science2Questions [][]= {
            {" Wind "," Solid ", " Liquid "," Gas "," Gas "}, //1
            {" Air "," Solid ", " Liquid "," Gas "," Gas "}, //2
            {"Smoke"," Solid ", " Liquid "," Gas "," Gas "}, //3
            {" Rain "," Solid ", " Liquid "," Gas "," Liquid "}, //4
            {" River "," Solid ", " Liquid "," Gas "," Liquid "}, //5
            {" Ball "," Solid ", " Liquid "," Gas "," Solid "}, //6
            {" Water "," Solid ", " Liquid "," Gas "," Liquid "},  //7
            {" Log "," Solid ", " Liquid "," Gas "," Solid "}, //8
            {" Ice "," Solid ", " Liquid "," Gas "," Solid "}, //9
            {" Water vapor "," Solid ", " Liquid "," Gas "," Gas "}, //10
            {" Sand "," Solid ", " Liquid "," Gas "," Solid "}, //11
            {" Book "," Solid ", " Liquid "," Gas "," Solid "}, //12
            {" Juice "," Solid ", " Liquid "," Gas "," Liquid"}, //13
            {" Milk "," Solid ", " Liquid "," Gas "," Liquid"}, //14
            {" Pencil "," Solid ", " Liquid "," Gas "," Solid "}, //15
            {" Soft drinks "," Solid ", " Liquid "," Gas "," Liquid"}, //16
            {" Beach water "," Solid ", " Liquid "," Gas "," Liquid"}, //17
            {" Vinegar "," Solid ", " Liquid "," Gas "," Liquid"}, //18
            {" Soy Sauce"," Solid ", " Liquid "," Gas "," Liquid"}, //19
            {" Steam "," Solid ", " Liquid "," Gas "," Gas "}, //20

    };

    public String getS2Questions(int a){
        String question =Science2Questions[a][0];
        return question;
    }
    public String getS2Choice1(int a){
        String choice1 = Science2Questions[a][1];
        return choice1;
    }
    public String getS2Choice2(int a){
        String choice2 = Science2Questions[a][2];
        return choice2;
    }
    public String getS2Choice3(int a){
        String choice3 = Science2Questions[a][3];
        return choice3;
    }

    public String getS2Answer(int a){
        String answer = Science2Questions[a][4];
        return answer;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for Science Level 3
    private String Science3Questions [][]= {
            {" Dog "," Living ", " Non-living ", " Living "}, //1

            {" Children "," Living ", " Non-living ", " Living "}, //2

            {" Human "," Living ", " Non-living ", " Living "}, //3

            {" Goat "," Living ", " Non-living ", " Living "}, //4

            {" Turtle "," Living ", " Non-living ", " Living "}, //5

            {" Tree "," Living ", " Non-living ", " Living "}, //6

            {" Snake "," Living ", " Non-living ", " Living "}, //7

            {" Pig "," Living ", " Non-living ", " Living "}, //8

            {" Carabao "," Living ", " Non-living ", " Living "}, //9

            {" Teacher "," Living ", " Non-living ", " Living "}, //10

            {" Cat "," Living ", " Non-living ", " Living "}, //11

            {" Worms "," Living ", " Non-living ", " Living "}, //12

            {" Flower "," Living ", " Non-living ", " Living "}, //13

            {" Mouse "," Living ", " Non-living ", " Living "}, //14

            {" Cockroach "," Living ", " Non-living ", " Living "}, //15

            {" Ball "," Living ", " Non-living ", " Non-living "}, //16

            {" Chair "," Living ", " Non-living ", " Non-living "}, //17

            {" Stuffed toy "," Living ", " Non-living ", " Non-living "}, //18

            {" Toy  "," Living ", " Non-living ", " Non-living "}, //19

            {" Cellphone "," Living ", " Non-living ", " Non-living "}, //20

            {" Blackboard "," Living ", " Non-living ", " Non-living "}, //21

            {" Fan "," Living ", " Non-living ", " Non-living "}, //22

            {" House "," Living ", " Non-living ", " Non-living "}, //23

            {" Microwave "," Living ", " Non-living ", " Non-living "}, //24

            {" Bag Microwave "," Living ", " Non-living ", " Non-living "}, //25

            {" Notebook "," Living ", " Non-living ", " Non-living "}, //26

            {" Pencil "," Living ", " Non-living ", " Non-living "},  //27

            {" Eraser "," Living ", " Non-living ", " Non-living "}, //28

            {" picture frame "," Living ", " Non-living ", " Non-living "}, //29

            {" Shirt "," Living ", " Non-living ", " Non-living "}//30

//2 lang yng pagpipilian
    };
    public String getS3Questions(int a){
        String question = Science3Questions[a][0];
        return question;
    }
    public String getS3Choice1(int a){
        String choice1 = Science3Questions[a][1];
        return choice1;
    }
    public String getS3Choice2(int a){
        String choice2 = Science3Questions[a][2];
        return choice2;
    }
    public String getS3Answer(int a){
        String answer = Science3Questions[a][3];
        return answer;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for Science Level 4
    private String Science4Questions [][]= {
            {" Shark"," Terrestrial ", " Aquatic ", " Aerial ", " Aquatic "}, //1

            {" Panda "," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "},//2

            {" Dog "," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "},//3

            {" Cat "," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "},//4

            {" Eagle  "," Terrestrial ", " Aquatic ", " Aerial ", " Aerial "},//5

            {" Monkey"," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "},//6

            {" Whale"," Terrestrial ", " Aquatic ", " Aerial ", " Aquatic "},//7

            {" Lion "," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "},//8

            {" Tiger"," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "},//9

            {" Mouse"," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "},//10

            {" Hamster"," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "},//11

            {" Dove"," Terrestrial ", " Aquatic ", " Aerial ", " Aerial "},//12

            {" Dolphin"," Terrestrial ", " Aquatic ", " Aerial ", " Aquatic "},//13

            {" Squid "," Terrestrial ", " Aquatic ", " Aerial ", " Aquatic "},//14

            {" Parrot"," Terrestrial ", " Aquatic ", " Aerial ", " Aerial "}, //15

            {" Jellyfish "," Terrestrial ", " Aquatic ", " Aerial ", " Aquatic "}, //16

            {" Seahorse "," Terrestrial ", " Aquatic ", " Aerial ", " Aquatic "}, //17

            {" Horse"," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //18

            {" Rabbit "," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //19

            {" Carabao"," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //20

            {" Ant"," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //21

            {" Deerhouse "," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //22

            {" Milk Fish"," Terrestrial ", " Aquatic ", " Aerial ", " Aquatic "}, //23

            {" Chicken "," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //24

            {" Iguana"," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //25

            {"Elephant"," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //26

            {"Cheetah "," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //27

            {"Butterfly"," Terrestrial ", " Aquatic ", " Aerial ", " Aerial "}, //28

            {" Fly "," Terrestrial ", " Aquatic ", " Aerial ", " Aerial "}, //29

            {" Firefly"," Terrestrial ", " Aquatic ", " Aerial ", " Aerial "}, //30

            {" Dragonfly"," Terrestrial ", " Aquatic ", " Aerial ", " Aerial "}, //31

            {" Mosquito"," Terrestrial ", " Aquatic ", " Aerial ", " Aerial "}, //32

            {" Zebra"," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //33

            {" Giraffe "," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //34

            {" Ostrich"," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //35

            {" Camel"," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "}, //36

            {"Pelican"," Terrestrial ", " Aquatic ", " Aerial ", " Aerial "}, //37

            {" Swordfish "," Terrestrial ", " Aquatic ", " Aerial ", " Aerial "}, //38

            {" Prawn"," Terrestrial ", " Aquatic ", " Aerial ", " Aquatic "}, //39

            {" Pig "," Terrestrial ", " Aquatic ", " Aerial ", " Terrestrial "} //40

    };
    public String getS4Questions(int a){
        String question = Science4Questions[a][0];
        return question;
    }
    public String getS4Choice1(int a){
        String choice1 = Science4Questions[a][1];
        return choice1;
    }
    public String getS4Choice2(int a){
        String choice2 = Science4Questions[a][2];
        return choice2;
    }
    public String getS4Choice3(int a){
        String choice3 = Science4Questions[a][3];
        return choice3;
    }

    public String getS4Answer(int a){
        String answer = Science4Questions[a][4];
        return answer;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Questions for Science Level 5
    private String Science5Questions [][]= {
        {" What is the 1st planet on our solar system. "," Mercury ", " Venus ", " Earth "," Mercury "}, //1

        {" What is the 2nd planet on our solar system.", "Mercury ", " Venus ", " Earth "," Venus "}, //2

        {" What is the 3rd planet on our solar system. "," Mercury ", " Venus ", " Earth "," Earth "}, //3

        {" What is the 4th planet on our solar system. "," Earth ", " Mars ", " Jupiter "," Mars "}, //4

        {" What is the 5th planet on our solar system. "," Jupiter ", " Saturn ", " Uranus "," Jupiter "}, //5

        {" What is the 6th planet on our solar system. "," Jupiter ", " Saturn ", " Uranus "," Saturn "}, //6

        {" What is the 7th planet on our solar system. "," Jupiter ", " Saturn ", " Uranus "," Uranus "}, //7

        {" What is the 8th planet on our solar system. "," Saturn ", " Uranus ", " Neptune "," Neptune"}, //8

        {" What is the smallest planet on our planet. "," Pluto ", " Mercury ", " Earth "," Pluto "}, //9

        {" Which planet is the hottest "," Mercury ", " Venus ", " Earth "," Venus "}, //10

        {" What is the biggest planet on our solar system. "," Jupiter ", " Neptune ", " Saturn "," Jupiter "}, //11

        {" What is the only planet that has a living organism."," Mars ", " Earth ", " Jupiter "," Earth "}, //12

        {" Rain "," Solid ", " Liquid ", "Gas "," Liquid "}, //13

        {" River "," Solid ", " Liquid ", "Gas "," Liquid "}, //14

        {" Tears"," Solid ", " Liquid ", "Gas "," Liquid "}, //15

        {" Ocean"," Solid ", " Liquid ", "Gas "," Liquid "}, //16

        {" Chair"," Solid ", " Liquid ", "Gas "," Solid "}, //17

        {" Shoes "," Solid ", " Liquid ", "Gas "," Solid "}, //18

        {" Paper "," Solid ", " Liquid ", "Gas "," Solid "}, //19

        {" Glass "," Solid ", " Liquid ","Gas "," Solid "}, //20

        {" Smoke"," Solid ", " Liquid ", "Gas "," Gas "}, //21

        {" Fire "," Solid ", " Liquid ", "Gas "," Gas "}, //22

        {" Vapor "," Solid ", " Liquid ", "Gas "," Gas "}, //23

        {" Air"," Solid ", " Liquid ", "Gas "," Gas "}, //24

        {" Pig"," Living", " Non-living", " None of the above "," Living "}, //25

        {" Worm "," Living ", " Non-living ", " None of the above "," Living "}, //26

        {" Bacteria "," Living ", " Non-living ", " None of the above "," Living "}, //27

        {" Tree "," Living ", " Non-living ", " None of the above "," Living "}, //28

        {" Flower "," Living ", " Non-living ", " None of the above "," Living "}, //29

        {" Children "," Living ", " Non-living ", " None of the above "," Living "}, //30

        {" Stick "," Living ", " Non-living ", " None of the above "," Non-living "}, //31

        {" Watch"," Living ", " Non-living ", " None of the above "," Non-living "}, //32

        {"Computer"," Living ", " Non-living ", " None of the above "," Non-living "},  //33

        {"Light"," Living ", " Non-living ", " None of the above "," Non-living "},  //34

        {"Picture"," Living ", " Non-living ", " None of the above "," Non-living "}, //35

        {" Bag "," Living ", " Non-living ", " None of the above "," Non-living "}, //36

        {" Cotton "," Living ", " Non-living ", " None of the above "," Non-living "}, //37

        {" Boar "," Terrestrial ", " Aerial ", " Aquatic"," Terrestrial "}, //38

        {" Guinea Pig"," Terrestrial ", " Aerial ", " Aquatic"," Terrestrial "}, //39

        {" Caterpillar "," Terrestrial ", " Aerial ", " Aquatic"," Terrestrial "},//40

        {" Wolf"," Terrestrial ", " Aerial ", " Aquatic"," Terrestrial "},//41

        {" Shrimp "," Terrestrial ", " Aerial ", " Aquatic"," Aquatic "},//42

        {" Seal "," Terrestrial ", " Aerial ", " Aquatic"," Aquatic "}, //43

        {"Lobster "," Terrestrial ", " Aerial ", " Aquatic"," Aquatic "}, //44

        {" Clown fish "," Terrestrial ", " Aerial ", " Aquatic"," Aquatic "}, //45

        {" People "," Terrestrial ", " Aerial ", " Aquatic"," Terrestrial "}, //46

        {" Vulture "," Terrestrial ", " Aerial ", " Aquatic"," Aerial "}, //47

        {" Condor "," Terrestrial ", " Aerial ", " Aquatic"," Aerial "}, //48

        {" Owl"," Terrestrial ", " Aerial ", " Aquatic"," Aerial "}, //49

        {" Cockatoo"," Terrestrial ", " Aerial ", " Aquatic"," Aerial "}//50

        };

         public String getS5Questions(int a){
         String question = Science5Questions[a][0];
         return question;
         }

         public String getS5Choice1(int a){
         String choice1 = Science5Questions[a][1];
         return choice1;
         }

         public String getS5Choice2(int a){
         String choice2 = Science5Questions[a][2];
         return choice2;
         }

         public String getS5Choice3(int a){
         String choice3 = Science5Questions[a][3];
         return choice3;
         }

         public String getS5Answer(int a){
         String answer = Science5Questions[a][4];
         return answer;
         }



    private String   S1G1Questions[][]= {
            {" We hear with our ___.", " Eyes", " Ears", " Skin"," Ears"},
            {"We see with our ___.", " Eyes", " Ears", " Skin"," Eyes"},
            {" We feel things with our ___. ",  " Eyes", " Ears", " Skin"," Skin"},
            {" We taste with our ___. ", " Eyes", " Ears", " Tongue"," Tongue"},
            {"We smell with our ___. ", " Eyes", " Nose", " Tongue"," Nose"},
            {"I can ___ the radio from my room", "Hear", " Nose", " Tongue","Hear"},
            {" Did you ___ that sweet candy ", "Hear", " Taste", " Tongue"," Taste"},
            {"I can ___ the mountain from here.", "Hear", "See ","Smell ", "See "},
            {". I think I ___ a dog. ", "Hear", "See ","Smell ", "See "},
            {"I ___ my classmates shouting", "Hear", " Nose", " Tongue","Hear"}

    };

    public String getS1G1Questions(int a){
        String question = S1G1Questions[a][0];
        return question;
    }

    public String getS1G1Choice1(int a){
        String choice1 = S1G1Questions[a][1];
        return choice1;
    }

    public String getS1G1Choice2(int a){
        String choice2 = S1G1Questions[a][2];
        return choice2;
    }

    public String getS1G1Choice3(int a){
        String choice3 = S1G1Questions[a][3];
        return choice3;
    }

    public String getS1G1Answer(int a){
        String answer = S1G1Questions[a][4];
        return answer;
    }



    private String S2G1Questions [][]= {
            {" What should a person use when they have a bad breath. "," Deodorant", " Cologne", " Mouthwash"," Mouthwash"}, //1

            {"What can you use to fix a chipped fingernail"," Tie", "nail cutter", " brush","nail cutter"},//2

            {"What does a kid who's been playing in the mud need?", " scolding", "wax", "bath","bath"},//3

            {"what should you use to wash your hands beside water?", " lotion", "soap", "mouthwash","soap"},//4

            {"what should a person use to get chocolate off their teeth? "," comb", "toothbrush", "dental floss", "toothbrush"}, //5

            {"what should a woman dry hands put on them?"," cologne", "lotion", "sunscreen", "lotion"}, //6

            {"what should a person with dry lips use?"," toothpaste  ", "wax", "lip-balm", "lip-balm"}, //7

            {"what can people use to get out the food stuck between their teeth."," floss", "toothpaste", "braces"," floss"}, //8

            {"what can people use to keep their hair out of their face?"," clipper ", "razor", "tie", "tie"}, //9

            {"what does a man with hairy armpits need to do? ","lotion", "get a fashion consultant", "shave", "shave"}, //10

            {"what does a man with hairy back need to get?"," a file", "a wax", "a tissue", "a wax"},//11

            {"what should people use to clean their dirty hair?"," shampoo", "soap", "lotion"," shampoo"}, //12

            {"what should a person use on a very long fingernails to shorten them?"," razor", "tweezers", "clipper", "clipper"}, //13

            {"What should a person use to clear their ears?"," cotton buds ", " tweezers ", " comb "," cotton buds "}, //14

            {"what do you to do if you are sick?"," play outside ", "take medicine", "take a bath", "take medicine"} //15


    };

    public String getS2G1Questions(int a){
        String question = S2G1Questions[a][0];
        return question;
    }

    public String getS2G1Choice1(int a){
        String choice1 = S2G1Questions[a][1];
        return choice1;
    }
    public String getS2G1Choice2(int a){
        String choice2 = S2G1Questions[a][2];
        return choice2;
    }
    public String getS2G1Choice3(int a){
        String choice3 = S2G1Questions[a][3];
        return choice3;
    }
    public String getS2G1Answer(int a){
        String answer = S2G1Questions[a][4];
        return answer;
    }

    private String S3G1Questions [][]= {
            {" Dog", "Living" ,  "Non-living" , "Living" }, //1

            {" Human","Living" ,  "Non-living" , "Living" }, //2

            {"Children","Living" ,  "Non-living" , "Living" }, //3

            {"Goat","Living" ,  "Non-living" , "Living" }, //4

            {"Turtle","Living" ,  "Non-living" , "Living" }, //5

            {"Tree","Living" ,  "Non-living" , "Living" }, //6

            {"Snake","Living" ,  "Non-living" , "Living" }, //7

            {"Pig","Living" ,  "Non-living" , "Living" }, //8

            {"Carabao","Living" ,  "Non-living" , "Living" }, //9

            {"Teacher","Living" ,  "Non-living" , "Living" }, //10

            {"Cat","Living" ,  "Non-living" , "Living" }, //11

            {"Worms ","Living" ,  "Non-living" , "Living" }, //12

            {"Flower ","Living" ,  "Non-living" , "Living" }, //13

            {"Cockroach","Living" ,  "Non-living" , "Living" }, //14

            {"Mouse","Living" ,  "Non-living" , "Living" }, //15

            {"Notebook","Living" ,  "Non-living" , "Non-living" }, //16

            {"Pencil","Living" ,  "Non-living" , "Non-living"  }, //17

            {"Eraser","Living" ,  "Non-living" , "Non-living"  }, //18

            {"picture frame","Living" ,  "Non-living" , "Non-living"  }, ///19

            {"Shirt","Living" ,  "Non-living" , "Non-living"  } //20
    };

    public String getS3G1Questions(int a){
        String question = S3G1Questions[a][0];
        return question;
    }
    public String getS3G1Choice1(int a){
        String choice1 = S3G1Questions[a][1];
        return choice1;
    }
    public String getS3G1Choice2(int a){
        String choice2 = S3G1Questions[a][2];
        return choice2;
    }
    //    public String get M3G1Choice3(int a){
//      String choice3 = M3G1Choices[a][2];
//        return choice3;
//    }
    public String getS3G1Answer(int a){
        String answer = S3G1Questions[a][3];
        return answer;
    }


    private String S4G1Questions [][]= {
            {" Hyena"," Carnivore", " Omnivore", " Herbivore"," Carnivore"}, //1
            {" Seal"," Carnivore", " Omnivore", " Herbivore"," Carnivore"}, //2

            {" Dolphin"," Carnivore", " Omnivore", " Herbivore"," Carnivore"}, //3
            {" Whales"," Carnivore", " Omnivore", " Herbivore"," Carnivore"}, //4

            {"Snake"," Carnivore", " Omnivore", " Herbivore"," Carnivore"}, //5

            {"Hawks"," Carnivore", " Omnivore", " Herbivore"," Carnivore"}, //6

            {"Spiders"," Carnivore", " Omnivore", " Herbivore"," Carnivore"}, //7

            {"Snake"," Carnivore", " Omnivore", " Herbivore"," Carnivore"}, //8

            {"Goat","Carnivore","Omnivore", "Herbivore","Herbivore"}, //9

            {"Cows","Carnivore","Omnivore", "Herbivore","Herbivore"},//10

            {"Deer","Carnivore","Omnivore", "Herbivore","Herbivore"},//11

            {"Monkey","Carnivore","Omnivore", "Herbivore","Herbivore"},//12

            {"Panda","Carnivore","Omnivore", "Herbivore","Herbivore"},//13

            {"koala","Carnivore","Omnivore", "Herbivore","Herbivore"}, //14

            {"Rabbit","Carnivore","Omnivore", "Herbivore","Herbivore"},//15

            {"Horse","Carnivore","Omnivore", "Herbivore","Herbivore"},//16

            {"Duck","Carnivore","Omnivore", "Herbivore","Omnivore"}, //17

            {"Swan","Carnivore","Omnivore", "Herbivore","Omnivore"}, //18

            {"Rat","Carnivore","Omnivore", "Herbivore","Omnivore"}, //19

            {"Mice","Carnivore","Omnivore", "Herbivore","Omnivore"}, //20

            {"Sloth","Carnivore","Omnivore", "Herbivore","Omnivore"}, //21

            {"Pig","Carnivore","Omnivore", "Herbivore","Omnivore"}, //22

            {"Flamingo","Carnivore","Omnivore", "Herbivore","Omnivore"}, //23

            {"Raccoon ","Carnivore","Omnivore", "Herbivore","Omnivore"}, //24

            {"Shark","Carnivore","Omnivore", "Herbivore","Omnivore"}, //25


    };

    public String getS4G1Questions(int a){
        String question = S4G1Questions[a][0];
        return question;
    }
    public String getS4G1Choice1(int a){
        String choice1 = S4G1Questions[a][1];
        return choice1;
    }
    public String getS4G1Choice2(int a){
        String choice2 = S4G1Questions[a][2];
        return choice2;
    }
    public String getS4G1Choice3(int a){
        String choice3 = S4G1Questions[a][3];
        return choice3;
    }
    public String getS4G1Answer(int a){
        String answer = S4G1Questions[a][4];
        return answer;
    }



    private String S5G1Questions [][]= {
            {"Wind", "Solid", "Liquid","Gas","Gas"}, //1

            {"Air ", "Solid", "Liquid","Gas","Gas"}, //2

            {"Smoke", "Solid", "Liquid","Gas","Gas"}, //3

            {"Rain", "Solid", "Liquid","Gas","Liquid"}, //4

            {" River ", "Solid", "Liquid","Gas","Liquid"}, //5

            {"Ball", "Solid", "Liquid","Gas","Solid"}, //6

            {" Water ", "Solid", "Liquid","Gas","Liquid"}, //7

            {"Log", "Solid", "Liquid","Gas","Solid"}, //8

            {"Ice", "Solid", "Liquid","Gas","Solid"}, //9

            {"Water vapor", "Solid", "Liquid","Gas","Gas"}, //10

            {"Sand", "Solid", "Liquid","Gas","Solid"}, //11

            {"Book", "Solid", "Liquid","Gas","Solid"}, //12

            {"Juice", "Solid", "Liquid","Gas","Liquid"}, //13

            {"Milk", "Solid", "Liquid","Gas","Liquid"}, //14

            {"Pencil", "Solid", "Liquid","Gas","Solid"}, //15

            {"Soft drinks", "Solid", "Liquid","Gas","Liquid"}, //16

            {"Beach water", "Solid", "Liquid","Gas","Liquid"}, //17

            {"Vinegar", "Solid", "Liquid","Gas","Liquid"}, //18

            {"Soy Sauce", "Solid", "Liquid","Gas","Liquid"}, //19

            {"Steam", "Solid", "Liquid","Gas","Gas"}, //20

            {"Rain", "Solid", "Liquid","Gas","Liquid"}, //21

            {"River", "Solid", "Liquid","Gas","Liquid"}, //22

            {"Tears", "Solid", "Liquid","Gas","Liquid"}, //23

            {"Ocean", "Solid", "Liquid","Gas","Liquid"}, //24

            {"Chair", "Solid", "Liquid","Gas","Solid"}, //25

            {"Shoes", "Solid", "Liquid","Gas","Solid"},  //26

            {"Paper", "Solid", "Liquid","Gas","Solid"}, //27

            {"Glass", "Solid", "Liquid","Gas","Solid"}, //28

            {"Smoke", "Solid", "Liquid","Gas","Gas"}, //29

            {"Fire", "Solid", "Liquid","Gas","Gas"}//30
    };

    public String getS5G1Questions(int a){
        String question = S5G1Questions[a][0];
        return question;
    }
    public String getS5G1Choice1(int a){
        String choice1 = S5G1Questions[a][1];
        return choice1;
    }
    public String getS5G1Choice2(int a){
        String choice2 = S5G1Questions[a][2];
        return choice2;
    }
    public String getS5G1Choice3(int a){
        String choice3 = S5G1Questions[a][3];
        return choice3;
    }
    public String getS5G1Answer(int a){
        String answer = S5G1Questions[a][4];
        return answer;
    }


    private String  S1G2Questions [][]= {
            {"Water ", "S(Solid)", "L(Liquid)", "G(Gas)","L(Liquid)"},
            {"Smoke from a car ", "S(Solid)", "L(Liquid)", "G(Gas)","G(Gas)"},
            {" Bowling ball ", "S(Solid)", "L(Liquid)", "G(Gas)","S(Solid)"},
            {"Bond paper ", "S(Solid)", "L(Liquid)", "G(Gas)","S(Solid)"},
            {" Steam from hot coffee ", "S(Solid)", "L(Liquid)", "G(Gas)","G(Gas)"},
            {" Mango juice ", "S(Solid)", "L(Liquid)", "G(Gas)","L(Liquid)"},
            {" Hollow blocks ", "S(Solid)", "L(Liquid)", "G(Gas)","S(Solid)"},
            {" Door knob  ", "S(Solid)", "L(Liquid)", "G(Gas)","S(Solid)"},
            {" Saltwater ", "S(Solid)", "L(Liquid)", "G(Gas)","L(Liquid)"},
            {" Air ", "S(Solid)", "L(Liquid)", "G(Gas)","G(Gas)"}

    };


    public String getS1G2Questions(int a){
        String question = S1G2Questions[a][0];
        return question;
    }

    public String getS1G2Choice1(int a){
        String choice1 = S1G2Questions[a][1];
        return choice1;
    }

    public String getS1G2Choice2(int a){
        String choice2 = S1G2Questions[a][2];
        return choice2;
    }

    public String getS1G2Choice3(int a){
        String choice3 = S1G2Questions[a][3];
        return choice3;
    }

    public String getS1G2Answer(int a){
        String answer = S1G2Questions[a][4];
        return answer;
    }



    private String S2G2Questions [][]= {
            {" which of the following is an example of a solid state of matter? "," Air ", "Juice", "Rocks","Rocks"}, //1

            {" Which of the following has the highest ease of flow?"," Gas", " Liquid", " Solid"," Gas"},//2

            {" Which state of matter takes up a different amount of space when put into a different container?", " Gas", " Liquid", " Liquid and Gas"," Liquid and Gas"},//3

            {" what property of matter measures how tightly packed is an object?", " MASS", " Density", " Weight"," MASS"},//4

            {" What property of matter measures how heavy an object is due to pull of gravity?"," Mass", "Weight", " Volume", "Weight"}, //5

            {" What property of matter describes the hotness and coldness of an object? "," Density ", "Temperature", " Mass ", "Temperature"}, //6

            {"How are liquids and solids are different?"," Liquid takes the shape of its container, solid do not change shape.", " Liquids do not change shape, but solids. ", " Liquids do not melt, while solids melt. ", " Liquid takes the shape of its container, solid do not change shape."}, //7

            { "What does it mean something is toxic?."," It is harmful and deadly to your health. ", " It can be eaten ", " It is good for you. "," It is harmful and deadly to your health. "}, //8

    {" If an object flows on a water, it shows which property of matter? "," Volume ", " Buoyancy ", " Weight ", " Buoyancy "}, //9

    {" What property of matter does a balance scale measure? "," Weight ", " Density ", " Volume ", " Weight "}, //10

    {" In ____ molecules are closely packed. "," SOLID ", " Liquid ", " Volume ", " SOLID "},//11

    {" A ___ is a nearly incompressible fluid that conforms to the shape of its container "," Mass ", " Density ", " LIQUID "," LIQUID "}, //12

    {" A __ is a measure of mass per unit of volume. "," Mass", "Liquid", "Density", "Density"}, //13

    {" The ___ of an object is the gravitational force between the object and the Earth."," Weight ", " Buoyancy ", " Liquid "," Weight "}, //14

        {" It is a systematic knowledge of the physical or material world gained through observation and experimentation "," Math ", " Science ", " English ", " Science "} //15


    };

    public String getS2G2Questions(int a){
        String question = S2G2Questions[a][0];
        return question;
    }

    public String getS2G2Choice1(int a){
        String choice1 = S2G2Questions[a][1];
        return choice1;
    }
    public String getS2G2Choice2(int a){
        String choice2 = S2G2Questions[a][2];
        return choice2;
    }
    public String getS2G2Choice3(int a){
        String choice3 = S2G2Questions[a][3];
        return choice3;
    }
    public String getS2G2Answer(int a){
        String answer = S2G2Questions[a][4];
        return answer;
    }

    private String S3G2P1Questions [][]= {
            {" Amphibians can both live in terrestrial and aquatic habitats ", " True " ,  " False ", " " , " True " }, //1

            {" Monkeys are considered to be aerial animals.", " True " ,  " False " , " ", " False " }, //2

            {" Animals should be handled forcefully to tame them.", " True " ,  " False ", " " , " False " }, //3

            {" Reptiles are warm-blooded animals", " True " ,  " False " , " ", " False " }, //4

            {" Mammals produce milk to feed their live young ", " True " ,  " False ", " " , " True " },//5

            {" Goat"," Milk" ,  " Coat " , " Eggs" ," Milk"}, //6

            {"Chicken","Coat" ,  " Eggs " , "Ham",  " Eggs " }, //7

            {"Horse","Eggs" ,  " Ham " , "Leather Shoes", "Leather Shoes" }, //8

            {"Pig","Ham" ,  "Leather shoes " , "Milk","Ham" }, //9

            {"Sheep","Coat " ,  " Eggs " , "Ham" ,"Coat "}, //10

            {" Which of the following is NOT considered as a habitat?"," Aquatic" ,  " Aerial " , " Forestrial", " Forestrial" }, //11

            {"Lisa found a lost puppy. How should she approach the animal?"," Run towards the animal because it might run away" ,  " Slowly walk towards the animal and quickly grab its tail " , "Calmly approach the puppy and call it using a soft voice"  , "Calmly approach the puppy and call it using a soft voice" }, //12

            {"Which of the following is a characteristic of a reptile"," It is cold-blooded" ,  "It is warm-blooded " , "It gives birth to live young" ," It is cold-blooded" }, //13

            {"Which of the following is NOT a characteristic of a mammal?", " It is cold-blooded" ,  "It is warm-blooded " , "It is able to produce milk to feed live young" ," It is cold-blooded" }, //14

            {"Which of the following is a terrestrial habitat?"," Estuary" ,  "Grassland" , "Ocean",  "Grassland" }, //15

            {"Which of the following animals are used as livestock","Cats" ,  "Cows" , " Dogs " ,  "Cows" }, //16

            {"Which habitat do you commonly find birds belong","Aerial " ,  " Aquatic " , "Terrestrial","Aerial "  }, //17

            {"Which of the following is NOT an aquatic animal?"," Cat" ,  " Jellyfish " , "Shark"," Cat"   }, //18

            {" Which of the following is proper handling of a pet?"," Kick your pet " ,  " Shout at your pet " , "Handle your pet gently not forcefully" , "Handle your pet gently not forcefully" }, ///19

            {"Which characteristics will help Howie identify a bird","It should have a beak, feather and wings" ,  " It should have fur and legs " , " It should have teeth and scales" ,"It should have a beak, feather and wings" } //20

    };

    public String getS3G2P1Questions(int a){
        String question = S3G2P1Questions[a][0];
        return question;
    }
    public String getS3G2P1Choice1(int a){
        String choice1 =  S3G2P1Questions[a][1];
        return choice1;
    }
    public String getS3G2P1Choice2(int a){
        String choice2 = S3G2P1Questions[a][2];
        return choice2;
    }
    public String getS3G1P1Choice3(int a){
      String choice3 = S3G2P1Questions[a][3];
        return choice3;
    }
    public String getS3G2P1Answer(int a){
        String answer = S3G2P1Questions[a][4];
        return answer;
    }



    private String S3G2P2Questions[][]= {
            {" Goat"," Milk" ,  " Coat " , " Eggs" ," Milk"}, //6

            {"Chicken","Coat" ,  " Eggs " , "Ham",  " Eggs " }, //7

            {"Horse","Eggs" ,  " Ham " , "Leather Shoes", "Leather Shoes" }, //8

            {"Pig","Ham" ,  "Leather shoes " , "Milk","Ham" }, //9

            {"Sheep","Coat " ,  " Eggs " , "Ham" ,"Coat "} //10
    };
    public String getS3G2P2Questions(int a){
        String question = S3G2P2Questions[a][0];
        return question;
    }
    public String getS3G2P2Choice1(int a){
        String choice1 =  S3G2P2Questions[a][0];
        return choice1;
    }
    public String getS3G2P2Choice2(int a){
        String choice2 = S3G2P2Questions[a][1];
        return choice2;
    }
    public String getS3G2P2Choice3(int a){
        String choice3 = S3G2P2Questions[a][2];
        return choice3;
    }
    public String getS3G2P2Answer(int a){
        String answer = S3G2P2Questions[a][3];
        return answer;
    }

    private String S3G2P3Questions[][]= {

            {" Which of the following is NOT considered as a habitat?"," Aquatic" ,  " Aerial " , " Forestrial", " Forestrial" }, //11

            {"Lisa found a lost puppy. How should she approach the animal?"," Run towards the animal because it might run away" ,  " Slowly walk towards the animal and quickly grab its tail " , "Calmly approach the puppy and call it using a soft voice"  , "Calmly approach the puppy and call it using a soft voice" }, //12

            {"Which of the following is a characteristic of a reptile"," It is cold-blooded" ,  "It is warm-blooded " , "It gives birth to live young" ," It is cold-blooded" }, //13

            {"Which of the following is NOT a characteristic of a mammal?", " It is cold-blooded" ,  "It is warm-blooded " , "It is able to produce milk to feed live young" ," It is cold-blooded" }, //14

            {"Which of the following is a terrestrial habitat?"," Estuary" ,  "Grassland" , "Ocean",  "Grassland" }, //15

            {"Which of the following animals are used as livestock","Cats" ,  "Cows" , " Dogs " ,  "Cows" }, //16

            {"Which habitat do you commonly find birds belong","Aerial " ,  " Aquatic " , "Terrestrial","Aerial "  }, //17

            {"Which of the following is NOT an aquatic animal?"," Cat" ,  " Jellyfish " , "Shark"," Cat"   }, //18

            {" Which of the following is proper handling of a pet?"," Kick your pet " ,  " Shout at your pet " , "Handle your pet gently not forcefully" , "Handle your pet gently not forcefully" }, ///19

            {"Which characteristics will help Howie identify a bird","It should have a beak, feather and wings" ,  " It should have fur and legs " , " It should have teeth and scales" ,"It should have a beak, feather and wings" } //20
    };
    public String getS3G2P3Questions(int a){
        String question = S3G2P3Questions[a][0];
        return question;
    }
    public String getS3G2P3Choice1(int a){
        String choice1 =  S3G2P3Questions[a][0];
        return choice1;
    }
    public String getS3G2P3Choice2(int a){
        String choice2 = S3G2P3Questions[a][1];
        return choice2;
    }
    public String getS3G2P3Choice3(int a){
        String choice3 = S3G2P3Questions[a][2];
        return choice3;
    }
    public String getS3G2P3Answer(int a){
        String answer = S3G2P3Questions[a][3];
        return answer;
    }



    private String S4G2Questions [][]= {
            {" Plants can only reproduce asexually ","True", " False", " False"}, //1

            {" Tall and green pine trees reproduce through seeds","True", " False", "True"},//2

            {" Non flowering plants like ferns and moss plants reproduce from spores ","True", " False", "True"},//3

            {" A flower is pollinated when a grain of pollen falls on the stigma ","True", " False", "True"},//4

            {" The stamens are the male reproductive parts of the flower "," True", " False", " True"},//5

            {" Nectar, a sugar rich food is located deep inside the flower "," True", " False", " True"},//6

            {" If the pollen falls on the stigm of a similar plant, fertilization may not occur "," True", " False", " False"}, //7

            {" Plants both flowering and non flowering reproduce through fertilization or sexual fertilization "," True", " False", " True"}, //8

            {" Pistils, stamen, petals, and sepals are considered parts of the flower "," True", " False", " True"}, //9

            {" Non flowering plants such as moss and ferns grow from their seeds "," True", " False", " False"},//10

            {" Plant life cycles can be divided into two parts"," True", " False", " True"},//11

            {" It is believed that brown algae are the early ancestors of plants "," True", " False", " False"},//12

            {" More than 260,000 plants species "," True", " False", " True"},//13

            {" Vascular plants depends on diffusion and osmosic to obtain and move nutrients and water around the plant "," True", " False", " True"}, //14

            {" Because the lack of vessels non vascular plants are small in size"," True", " False", " True"},//15

            {" Vascular plants can be almost any size because the vessels can transport materials around the plant "," True", " False", " True"},//16

            {" Plans without seeds are divided into two groups"," True", " False", " False"},//17

            {" Mosses and liverworts don’t have a true roots, stems, or leaves but they do have similar structure to carry out some activities "," True", " False", " True"}, //18

            {" Liverworts and mosses are usually the last organism to inhabit a new environment, "," True", " False", " False"},//19

            {" Since ferns, horsetails, and club mosses are nonvascular, some of the early species were quite tall"," True", " False", " False"}, //20

            {" Seedless plants produce seeds, structure that protects and nourish young sporophytes "," True", " False", " True"}, //21

            {" The female gamete of seeds plants do not need water to travel to the female gametes, they develop inside tiny structures that can be transported by wind or animals "," True", " False", " False"},//22

            {" Gymnosperms are divided into two classes"," True", " False", " False"}, //23

            {" There are two types of roots "," True", " False", " True"}, //24

            {" The main function of the roots is to get food for the plant "," True", " False", " False"}, //25

    };

    public String getS4G2Questions(int a){
        String question = S4G2Questions[a][0];
        return question;
    }
    public String getS4G2Choice1(int a){
        String choice1 = S4G2Questions[a][1];
        return choice1;
    }
    public String getS4G2Choice2(int a){
        String choice2 = S4G2Questions[a][2];
        return choice2;
    }
//    public String getS4G2Choice3(int a){
//        String choice3 = S4G2Questions[a][3];
//        return choice3;
//    }
    public String getS4G2Answer(int a){
        String answer = S4G2Questions[a][3];
        return answer;
    }

    private String S5G2P1Questions [][]= {
            {" The moon revolves around the earth ", " True", " False"," "," True"}, //1

            {"The sun is a big ball of hot glowing asses ", " True", " False"," "," True"}, //2

            {"There are 7 planets in the solar system. ", " True", " False"," "," False"}, //3

            {" The moon reflects the light of the sun at night. ", " True", " False"," "," True"}, //4

            {" The sun revolves around the earth. ", " True", " False"," "," False"}, //5

            {" The sun and moon are some of the natural objects seen in the sky. ", " True", " False"," "," True"},//6

            {" Climate change is the average weather condition in a particular place. ", " True", " False"," "," False"},//7

            {" Stormy weather does not bring typhoon. ", " True", " False"," "," False"},//8

            {" Freshwater covers most of the earth's surface. ", " True", " False"," "," False"},//9

            {" Wind is known as a moving air. ", " True", " False"," "," True"},//10

            {" The highest mountain on a planet in the solar system is on Mars. ", " True", " False"," "," True"},//11

            {" On Mercury, the temperature never reaches freezing point ", " True", " False"," "," True"},//12

            {" Only two men walked on the moon ", " True", " False"," "," False"},//13

            {" Pluto is smaller than our moon ", " True", " False"," "," True"},//14

            {" On Venus a day is longer than a year ", " True", " False"," "," True"},//15

            {" The surface of Venus is almost flat ", " True", " False"," "," False"},//16

            {" The largest planet in the solar system is Jupiter ", " True", " False"," "," True"},//17

            {" Our solar system is almost at the center of milky way ", " True", " False"," "," False"},//18

            {" The rings of Saturn are an optical illusion ", " True", " False"," "," False"},//19

            {" Light takes 4 seconds to travel from the Earth to Moon. ", " True", " False"," "," False"},//20

            {" Which of the following is true about the sun? ", " It revolves around the earth", " It is the nearest star to the earth. "," It is smaller than the earth. ", " It revolves around the earth"}, //21

            {"Which is likely to happen if a part of the earth is not facing the sun? ", " That side of the earth will remain day time. ", " The sun will stop from moving. "," The sun will melt. ", " That side of the earth will remain day time. "}, //22

            {"Which of the following is not a planet of the solar planet? ", " Luna ", " Jupiter "," Mars ", " Luna "}, //23

            {"Which is not true about a star?  ", " It can be seen in the earth's sky during night time", " It is a ball of hot, glowing gasses"," It gives off heat and light. ", " It is a ball of hot, glowing gasses"}, //24

            {" Which of the following is not true to prevent heat damage? ", " Playing outside at 12 noon. ", " Putting on sunscreen. "," Wearing a hat ", " Playing outside at 12 noon. "}, //25

            {" Which natural object in the sky serves as a guide for explorers?. ", " Stars ", " Planets "," Clouds ", " Stars "},//26

            {" Which is not true about earth's moon? ", " It gives off its natural light", " It causes falling and rising of tides "," It revovles around the earth. ", " It causes falling and rising of tides "},//27

            {" Which of the following is a harmful effect of the sun? ", " It can cause skin damage. ", " It can dry and destroy objects. "," All of the above "," All of the above "},//28

            {"Which of the following should you do to protect your eyes from the sun's damaging effect's? ", " Put on sunscreen ", " Wear glasses "," Observe the sun directly ", " Put on sunscreen "},//29

            {"Which of the following is a helpful interaction of the moon and the earth?  ", " It cures a sunburned skin", " It gives energy to plants"," It causes daylight." , " It gives energy to plants"}//30

    };
    public String getS5G2P1Questions(int a){
        String question = S5G2P1Questions[a][0];
        return question;
    }
    public String getS5G2P1Choice1(int a){
        String choice1 = S5G2P1Questions[a][1];
        return choice1;
    }
    public String getS5G2P1Choice2(int a){
        String choice2 = S5G2P1Questions[a][2];
        return choice2;
    }
        public String getS5G2P1Choice3(int a){
       String choice3 = S5G1Questions[a][3];
        return choice3;
    }
    public String getS5G2P1Answer(int a){
        String answer = S5G2P1Questions[a][4];
        return answer;
    }

    private String S5G2P2Questions [][]= {
            {" Which of the following is true about the sun? ", " It revolves around the earth", " It is the nearest star to the earth. "," It is smaller than the earth. ", " It revolves around the earth"}, //21

            {"Which is likely to happen if a part of the earth is not facing the sun? ", " That side of the earth will remain day time. ", " The sun will stop from moving. "," The sun will melt. ", " That side of the earth will remain day time. "}, //22

            {"Which of the following is not a planet of the solar planet? ", " Luna ", " Jupiter "," Mars ", " Luna "}, //23

            {"Which is not true about a star?  ", " It can be seen in the earth's sky during night time", " It is a ball of hot, glowing gasses"," It gives off heat and light. ", " It is a ball of hot, glowing gasses"}, //24

            {" Which of the following is not true to prevent heat damage? ", " Playing outside at 12 noon. ", " Putting on sunscreen. "," Wearing a hat ", " Playing outside at 12 noon. "}, //25

            {" Which natural object in the sky serves as a guide for explorers?. ", " Stars ", " Planets "," Clouds ", " Stars "},//26

            {" Which is not true about earth's moon? ", " It gives off its natural light", " It causes falling and rising of tides "," It revovles around the earth. ", " It causes falling and rising of tides "},//27

            {" Which of the following is a harmful effect of the sun? ", " It can cause skin damage. ", " It can dry and destroy objects. "," All of the above "," All of the above "},//28

            {"Which of the following should you do to protect your eyes from the sun's damaging effect's? ", " Put on sunscreen ", " Wear glasses "," Observe the sun directly ", " Put on sunscreen "},//29

            {"Which of the following is a helpful interaction of the moon and the earth?  ", " It cures a sunburned skin", " It gives energy to plants"," It causes daylight." , " It gives energy to plants"}//30
    };
    public String getS5G2P2Questions(int a){
        String question = S5G2P2Questions[a][0];
        return question;
    }
    public String getS5G2P2Choice1(int a){
        String choice1 = S5G2P2Questions[a][1];
        return choice1;
    }
    public String getS5G2P2Choice2(int a){
        String choice2 = S5G2P2Questions[a][2];
        return choice2;
    }
    public String getS5G2P2Choice3(int a){
        String choice3 = S5G2P2Questions[a][3];
        return choice3;
    }
    public String getS5G2P2Answer(int a){
        String answer = S5G2P2Questions[a][4];
        return answer;
    }

}