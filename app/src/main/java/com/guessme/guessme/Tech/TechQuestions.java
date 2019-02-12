package com.guessme.guessme.Tech;

import com.guessme.guessme.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 22/08/2018.
 */

public class TechQuestions {

    private String Tech1Questions [][]= {
            {"M_therb_ard","a-o", "o-o", "a-a","o-o"},
            {"C_ _","p-u", "p-a", "p-e","p-u"},
            {"K_ _ b_ard","e-t-o", "a-a-a", "e-y-o","e-y-o"},
            {"_ou_e","m-o", "m-t", "m-s","m-s"},
            {"P_in_er","r-t", "a-y", "z-h","r-t"},
            {"_o_it_r","m-n-o", "p-n-i", "t-r-e","m-n-o"},
            {"S_eake_s","p-r", "t-r", "w-r","p-r"},
            {"_can_er","s-n", "s-m", "s-c","s-n"},
            {"_ic_oph_ne","m-r-o", "m-t-e", "-a-g-a","m-r-o"},
            {"W_b _am_ra","e-c-e", "c-p-e", "e-e-e","e-c-e"}

    };

    public String getT1Questions(int a){
        String question = Tech1Questions[a][0];
        return question;
    }

    public String getT1Choice1(int a){
        String choice1 = Tech1Questions[a][1];
        return choice1;
    }

    public String getT1Choice2(int a){
        String choice2 = Tech1Questions[a][2];
        return choice2;
    }

    public String getT1Choice3(int a){
        String choice3 = Tech1Questions[a][3];
        return choice3;
    }

    public String getT1Answer(int a){
        String answer = Tech1Questions[a][4];
        return answer;
    }



    private String Tech2Questions [][]= {
            {"A networking hardware used to connect one network device to other network devices",
                    "Wifi", "LAN cable", "Monitor","LAN cable"}, //1

            {"An instrument for converting sound waves into electrical energy variations, which may then be amplified, transmitted, or recorded.",
                    "Microphone", "Speaker", "Recorder","Microphone"}, //2

            {"a surface for placing and moving a computer mouse.",
                    "Mouse", "Wood", "Mousepad","Mousepad"}, //3

            {"Used to differentiate between the computer itself and its peripheral devices, such as the keyboard, mouse and monitor.",
                    "System Unit", "Processor", "RAM","System Unit"}, //4

            {"A hardware device that connects to a computer to generate sound. ",
                    "Scanner", "Microphone", "Speaker","Speaker"}, //5
            {"A hand-held pointing device that detects two-dimensional motion relative to a surface.",
                    "Trackball", "Mouse", "Printer","Mouse"}, //6

            {"A typewriter-style device which uses an arrangement of buttons or keys to act as mechanical levers or electronic switches",
                    "Type writer", "Mouse", "Keyboard","Keyboard"}, //7

            {"An output device which displays information in pictorial form.",
                    "Monitor", "TV", "LED","Monitor"}, //8

            {"It holds together many of the crucial components of a computer",
                    "Hard drive", "Motherboard", "System Unit","Motherboard"}, //9

            {"A high-capacity, self-contained storage device containing a read-write mechanism",
                    "Hard drive", "Web cam", "Motherboard","Hard drive"}, //10

            {"A video camera that inputs to a computer connected to the Internet, so that its images can be viewed by Internet users.",
                    "Digital Camera", "DSLR", "Web camera","Web camera"}, //11

            {"a machine for printing text or pictures onto paper, especially one linked to a computer.",
                    "Scanner", "Printer", "Fax machine","Printer"}, //12

            {"a computer that is portable and suitable for use while traveling.",
                    "Desktop", "Mouse", "Laptop","Laptop"}, //13

            {"A computer input device in the form of a small panel containing different touch-sensitive areas.",
                    "Laser", "Mouse", "Touchpad","Touchpad"}, //14

            {"fans that draw cooler air into the case from the outside, expel warm air from inside, or move air across a heat sink to cool a particular component.",
                    "Electric fan", "Cooling fan", "Exhaust fan","Cooling fan"} //15

//            {"an electronic device that manipulates information, or data. It has the ability to store, retrieve, and process data",
//                    "Computer", "Cellphone", "Hard drive","Computer"}, //16
//
//            {"a compact disc used as a read-only optical memory device for a computer system.",
//                    "Trackball", "DVD", "CD-ROM","CD-ROM"}, //17
//
//            {"a plastic case containing a ball on the top that moves a computer cursor around on the screen. The user can move the ball with their thumb or fingers, and sensors inside the case detect which direction the ball is moving",
//                    "Basketball", "Track ball", "Mouse","Track ball"}, //18
//
//            {"a type of disk storage composed of a disk of thin and flexible magnetic storage medium, sealed in a rectangular plastic enclosure lined with fabric that removes dust particles.",
//                    "USB", "Floppy disk", "Flash drive","Floppy disk"}, //19
//
//            {"a pair of earphones typically joined by a band placed over the head, for listening to audio signals such as music or speech.",
//                    "Microphone", "Headphones", "Speaker","Headphones"}  //20

    };

    public String getT2Questions(int a){
        String question = Tech2Questions[a][0];
        return question;
    }

    public String getT2Choice1(int a){
        String choice1 = Tech2Questions[a][1];
        return choice1;
    }
    public String getT2Choice2(int a){
        String choice2 = Tech2Questions[a][2];
        return choice2;
    }
    public String getT2Choice3(int a){
        String choice3 = Tech2Questions[a][3];
        return choice3;
    }
    public String getT2Answer(int a){
        String answer = Tech2Questions[a][4];
        return answer;
    }

    private List<Integer> Tech3Questions = Arrays.asList(
            R.drawable.tech1,
            R.drawable.tech2,
            R.drawable.tech3,
            R.drawable.tech4,
            R.drawable.tech5,
            R.drawable.tech6,
            R.drawable.tech7,
            R.drawable.tech8,
            R.drawable.tech9,
            R.drawable.tech10,
            R.drawable.tech11,
            R.drawable.tech12,
            R.drawable.tech13,
            R.drawable.tech14,
            R.drawable.tech15,
            R.drawable.tech16,
            R.drawable.tech17,
            R.drawable.tech18,
            R.drawable.tech19,
            R.drawable.tech20);
//            R.drawable.tech21,
//            R.drawable.tech22,
//            R.drawable.tech23,
//            R.drawable.tech24,
//            R.drawable.tech25,
//            R.drawable.tech26,
//            R.drawable.tech27,
//            R.drawable.tech28,
//            R.drawable.tech29,
//            R.drawable.tech30);



    private String Tech3Choices [][]= {
            {"Microsoft Word","Microsoft Work", "Microsoft Wire",
                    "Microsoft Word"}, //1

            {"Microsoft power point", "Microsoft Excel", "Microsoft access",
                    "Microsoft Excel"}, //2

            {"Microsoft word", "Microsoft one note", "Microsoft powerpoint",
                    "Microsoft powerpoint"}, //3

            {"Microsoft one note", "Microsoft excel", "Microsoft access",
                    "Microsoft one note"}, //4

            {"Microsoft Access", "Microsoft Air", "Microsoft Art",
                    "Microsoft Access"}, //5

            {"Wifi", "Signal", "Cloud",
                    "Wifi"}, //6

            {"Shut down", "Airflow", "Power ON",
                    "Shut down"}, //7

            {"Turn off", "Restart", "Force close",
                    "restart"}, //8

            {"Windows", "Linux", "Mac",
                    "Windows"}, //9

            {"Windows", "Linux", "Mac",
                    "Linux"}, //10

            {"Windows", "Linux", "Mac",
                    "Mac"}, //11

            {"Trash can", "Recycle bin", "File transfer",
                    "Recycle bin"}, //12

            {"Settings", "Tools", "Properties",
                    "Settings"}, //13

            {"Screen ", "Volume", "Resolution",
                    "Volume"}, //14

            {"Facebook", "Friendster", "Twitter",
                    "Facebook"}, //15

            {"Facebook", "Twitter", "Friendster",
                    "Twitter"}, //16

            {"Firefox", "Chrome", "Explorer",
                    "Chrome"}, //17

            {"Firefox", "Chrome", "Explorer",
                    "Firefox"}, //18

            {"Firefox", "MS Edge", "Explorer",
                    "Explorer"}, //19

            {"MS Edge", "Chrome", "Explorer",
                    "MS Edge"},  //20
//
//            {"Compass", "Safari", "Map",
//                    "Safari"}, //21
//
//            {"bluetooth", "bluefish", "wifi",
//                    "bluetooth"}, //22
//
//            {"photo", "gallery", "Camera",
//                    "Camera"}, //23
//
//            {"Firewall", "Firebrick", "firesquare",
//                    "Firewall"}, //24
//
//            {"Lets play", "Youtube", "Videos",
//                    "Youtube"}, //25
//
//            {"Instagram", "Photography", "5Camera2",
//                    "Instagram"}, //26
//
//            {"Yahoo!", "Yes!", "Yappy!",
//                    "Yahoo!"}, //27
//
//            {"eMail", "Ymail", "Gmail",
//                    "Gmail"}, //28
//
//            {"Google map", "Google point", "Google location",
//                    "Google map"}, //29
//
//            {"Google storage", "Google drive", "Google diary",
//                    "Google drive"}  //30


    };

    public Integer getT3Questions(int a){
        Integer question = Tech3Questions.get(a);
        return question;
    }
    public String getT3Choice1(int a){
        String choice1 = Tech3Choices[a][0];
        return choice1;
    }
    public String getT3Choice2(int a){
        String choice2 = Tech3Choices[a][1];
        return choice2;
    }
    public String getT3Choice3(int a){
        String choice3 = Tech3Choices[a][2];
        return choice3;
    }
    public String getT3Answer(int a){
        String answer = Tech3Choices[a][3];
        return answer;
    }

    private String Tech4Questions [][]= {
            {"A word processor developed by Microsoft.",
                    "Microsoft Word", "Microsoft Work", "Microsoft Wire","Microsoft Word"}, //1

            {"A spreadsheet developed by Microsoft for Windows",
                    "Microsoft power point", "Microsoft Excel", "Microsoft access","Microsoft Excel"}, //2

            {"A presentation program developed by Microsoft",
                    "Microsoft word", "Microsoft one note", "Microsoft powerpoint","Microsoft powerpoint"}, //3

            {"A computer program for free-form information gathering and multi-user collaboration. It gathers users' notes, drawings, screen clippings and audio commentaries.",
                    "Microsoft one note","Microsoft excel", "Microsoft access","Microsoft one note"}, //4

            {"A database management system from Microsoft",
                    "Microsoft Access","Microsoft Air", "Microsoft Art","Microsoft Access"}, //5

            {"A wireless network that allows computers and other devices to be connected to the internet",
                    "Wifi","18", "2","2"}, //6

            {"A term used to describe the process of closing all software programs in preparation to turn off a computer's power",
                    "Shut down","Airflow", "Power ON","Shut down"}, //7

            {"computer goes through a complete shutdown process, then starts back up again.",
                    "turn off","restart", "force close","restart"}, //8

            {"A freeware web browser developed by Google",
                    "Firefox","Chrome", "Explorer","Chrome"}, //9

            {"A free and open-source web browser developed by Mozilla Foundation and its subsidiary.",
                    "Firefox","Chrome", "Explorer","Firefox"}, //10

            {"A series of graphical web browsers developed by Microsoft ",
                    "Firefox","Chrome", "Explorer","Explorer"}, //11

            {"A simple raster graphics editor that has been included with all versions of Microsoft Windows.",
                    "Paint","Photoshop", "Edit","Paint"}, //12

            {"Refers to the loudness or softness of a sound",
                    "Air","Volume", "Electric","Volume"}, //13

            {"A simple text editor for Microsoft Windows and a basic text-editing program which enables computer users to create documents.",
                    "Chrome","textword", "Notepad","Notepad"}, //14

            {"A temporary storage for files that have been deleted in a file manager by the user",
                    "Trash bin","Recycle bin", "Storage bin","Recycle bin"}, //15

            {"A free and open source cross-platform multimedia player and framework that plays most multimedia files as well as DVDs, Audio CDs, and VCDs",
                    "dvd player","Media player", "cd player","Media player"}, //16

            {"A web browser developed by Apple based on the WebKit engine. ",
                    "Safari","Chrome", "Firefox","Safari"}, //17

            {"A wireless technology standard for exchanging data over short distances from fixed and mobile devices",
                    "signal","Bluetooth", "wifi","Bluetooth"}, //18

            {"A graphical operating systems developed and marketed by Apple",
                    "MacOS","Windows", "Linux","MacOS"}, //19

            {"A free advertising-supported email service developed by Google.",
                    "Yahoo", "Gmail", "Messenger","Gmail"},  //20

            {"A file storage and synchronization service developed by Google.",
                    "Google storage","Google drive", "Google diary","Google drive"}, //21

            {"A network security system that monitors and controls incoming and outgoing network traffic based on predetermined security rules.",
                    "Firewall","Firebrick", "firesquare","Firewall"}, //22

            {"A web mapping service developed by Google",
                    "Google map","google point", "google location","Google map"}, //23

            {"A raster graphics editor developed and published by Adobe",
                    "Photoshop","notepad", "paint","Photoshop"}, //24

            {"A process for reproducing text and images using a master form or template.",
                    "Copy","Scan", "Print","Print"}, //25

//            {"A process that optically scans images, printed text, handwriting or an object and converts it to a digital image.",
//                    "Copy","Scan", "Print","Scan"}, //26
//
//            {"Removes the item from its current location and places it into the clipboard",
//                    "Cut", "Copy","Paste","Cut"}, //27
//
//            {"duplicating a section of a document and placing it in a clipboard",
//                    "Cut","Copy", "Paste","Copy"}, //28
//
//            {"A command that allows you to insert data from the clipboard into an application",
//                    "Cut","Copy", "Paste","Paste"}, //29
//
//            {"A telecommunications application software product that specializes in providing video chat and voice calls between computers.",
//                    "Skype","Message", "facebook","Skype"},  //30

//            {"An anti-malware component of Microsoft Windows.",
//                    "Windows","Windows defender", "Windows firewall","Windows defender"}, //31
//
//            {"a web-based suite of webmail, contacts, tasks, and calendaring services from Microsoft.",
//                    "MS Outlook","MS ONENOTE", "MS word","MS Outlook"}, //32
//
//            {"an entry-level desktop publishing application from Microsoft",
//                    "MS Outlook","MS ONENOTE", "MS Publisher","MS Publisher"}, //33
//
//            {"A vector graphics editor developed and marketed by Adobe Systems.",
//                    "Adobe Air","Adobe Illustrator", "Adobe Photoshop","Adobe Illustrator"}, //34
//
//            {"Viewing, organizing and editing large numbers of digital images.",
//                    "Adobe Air","Adobe Illustrator", "Adobe Lightroom","Adobe Lightroom"}, //35
//
//            {"View, create, manipulate, print and manage files in Portable Document Format. ",
//                    "Adobe illustrator","Adobe Lightroom", "Adobe Acrobat","Adobe Acrobat"}, //36
//
//            {"a digital visual effects, motion graphics, and compositing application developed by Adobe",
//                    "Adobe lightroom","Adobe After effects", "Adobe Photoshop","Adobe After effects"}, //37
//
//            {"A timeline-based video editing app developed by Adobe ",
//                    "Windows movie maker","VLC player", "Adobe Premiere pro","Adobe Premiere pro"}, //38
//
//            {"an integrated suite of storytelling applications for the mobile and web developed by Adobe Systems. ",
//                    "Adobe spark","Adobe lightroom", "Adobe illustrator","Adobe spark"}, //39
//
//            {"a multimedia authoring and computer animation program developed by Adobe ",
//                    "Adobe spark","Adobe Animate", "Adobe illustrator","Adobe Animate"}, //40

    };

    public String getT4Questions(int a){
        String question = Tech4Questions[a][0];
        return question;
    }
    public String getT4Choice1(int a){
        String choice1 = Tech4Questions[a][1];
        return choice1;
    }
    public String getT4Choice2(int a){
        String choice2 = Tech4Questions[a][2];
        return choice2;
    }
    public String getT4Choice3(int a){
        String choice3 = Tech4Questions[a][3];
        return choice3;
    }
    public String getT4Answer(int a){
        String answer = Tech4Questions[a][4];
        return answer;
    }

    private String Tech5Questions [][]= {
            {"M_therb_ard","a-o", "o-o", "a-a","o-o"},
            {"C_ _","p-u", "p-a", "p-e","p-u"},
            {"K_ _ b_ard","e-t-o", "a-a-a", "e-y-o","e-y-o"},
            {"_ou_e","m-o", "m-t", "m-s","m-s"},
            {"P_in_er","r-t", "a-y", "z-h","r-t"},
            {"_o_it_r","m-n-o", "p-n-i", "t-r-e","m-n-o"},
            {"S_eake_s","p-r", "t-r", "w-r","p-r"},
            {"_can_er","s-n", "s-m", "s-c","s-n"},
            {"_ic_oph_ne","m-r-o", "m-t-e", "-a-g-a","m-r-o"},
            {"W_b _am_ra","e-c-e", "c-p-e", "e-e-e","e-c-e"},
            {"an electronic device that manipulates information, or data. It has the ability to store, retrieve, and process data",
                    "Computer", "Cellphone", "Hard drive","Computer"}, //16

            {"a compact disc used as a read-only optical memory device for a computer system.",
                    "Trackball", "DVD", "CD-ROM","CD-ROM"}, //17

            {"a plastic case containing a ball on the top that moves a computer cursor around on the screen. The user can move the ball with their thumb or fingers, and sensors inside the case detect which direction the ball is moving",
                    "Basketball", "Track ball", "Mouse","Track ball"}, //18

            {"a type of disk storage composed of a disk of thin and flexible magnetic storage medium, sealed in a rectangular plastic enclosure lined with fabric that removes dust particles.",
                    "USB", "Floppy disk", "Flash drive","Floppy disk"}, //19

            {"a pair of earphones typically joined by a band placed over the head, for listening to audio signals such as music or speech.",
                    "Microphone", "Headphones", "Speaker","Headphones"},  //20

            {"An anti-malware component of Microsoft Windows.",
                    "Windows","Windows defender", "Windows firewall","Windows defender"}, //31

            {"a web-based suite of webmail, contacts, tasks, and calendaring services from Microsoft.",
                    "MS Outlook","MS ONENOTE", "MS word","MS Outlook"}, //32

            {"an entry-level desktop publishing application from Microsoft",
                    "MS Outlook","MS ONENOTE", "MS Publisher","MS Publisher"}, //33

            {"A vector graphics editor developed and marketed by Adobe Systems.",
                    "Adobe Air","Adobe Illustrator", "Adobe Photoshop","Adobe Illustrator"}, //34

            {"Viewing, organizing and editing large numbers of digital images.",
                    "Adobe Air","Adobe Illustrator", "Adobe Lightroom","Adobe Lightroom"}, //35

            {"View, create, manipulate, print and manage files in Portable Document Format. ",
                    "Adobe illustrator","Adobe Lightroom", "Adobe Acrobat","Adobe Acrobat"}, //36

            {"a digital visual effects, motion graphics, and compositing application developed by Adobe",
                    "Adobe lightroom","Adobe After effects", "Adobe Photoshop","Adobe After effects"}, //37

            {"A timeline-based video editing app developed by Adobe ",
                    "Windows movie maker","VLC player", "Adobe Premiere pro","Adobe Premiere pro"}, //38

            {"an integrated suite of storytelling applications for the mobile and web developed by Adobe Systems. ",
                    "Adobe spark","Adobe lightroom", "Adobe illustrator","Adobe spark"}, //39

            {"a multimedia authoring and computer animation program developed by Adobe ",
                    "Adobe spark","Adobe Animate", "Adobe illustrator","Adobe Animate"}, //40

            {"A process that optically scans images, printed text, handwriting or an object and converts it to a digital image.",
                    "Copy","Scan", "Print","Scan"}, //26

            {"Removes the item from its current location and places it into the clipboard",
                    "Cut", "Copy","Paste","Cut"}, //27

            {"duplicating a section of a document and placing it in a clipboard",
                    "Cut","Copy", "Paste","Copy"}, //28

            {"A command that allows you to insert data from the clipboard into an application",
                    "Cut","Copy", "Paste","Paste"}, //29

            {"A telecommunications application software product that specializes in providing video chat and voice calls between computers.",
                    "Skype","Message", "facebook","Skype"},  //30
    };

    public String getT5Questions(int a){
        String question = Tech5Questions[a][0];
        return question;
    }
    public String getT5Choice1(int a){
        String choice1 = Tech5Questions[a][1];
        return choice1;
    }
    public String getT5Choice2(int a){
        String choice2 = Tech5Questions[a][2];
        return choice2;
    }
    public String getT5Choice3(int a){
        String choice3 = Tech5Questions[a][3];
        return choice3;
    }
    public String getT5Answer(int a){
        String answer = Tech5Questions[a][4];
        return answer;
    }


    private List<Integer> T1G1Question = Arrays.asList(
            R.drawable.t1g1,
            R.drawable.t2g1,
            R.drawable.t3g1,
            R.drawable.t4g1,
            R.drawable.t5g1,
            R.drawable.t6g1,
            R.drawable.t7g1,
            R.drawable.t8g1,
            R.drawable.t9g1,
            R.drawable.t10g1);

    private String T1G1Questions [][]= {
            {" Mouse ", " Monitor ", "Speaker"," Monitor "},
            {" Mouse ", " monitor ", " System Unit "," Mouse "},
            {" keyboard "," mouse ", "speaker", " keyboard "},
            {" System Unit "," mouse ", "speaker", " System Unit "},
            {" Speakers "," monitor ", " mouse ", " Speakers "},
            {" Printer "," monitor ", " System Unit ", " Printer "},
            {" LAPTOP "," MONITOR ", " MOUSE ", " LAPTOP "},
            {" Headphones "," mouse ", "speaker", " Headphones "},
            {" mouse pad "," mouse ", " Monitor ", " mouse pad "},
            {" Monitor "," computer AVR ", "speaker", " computer AVR "}


    };

    public Integer getT1G1Questions(int a){
        Integer question = T1G1Question.get(a);
        return question;
    }

    public String getT1G1Choice1(int a){
        String choice1 = T1G1Questions[a][0];
        return choice1;
    }

    public String getT1G1Choice2(int a){
        String choice2 = T1G1Questions[a][1];
        return choice2;
    }

    public String getT1G1Choice3(int a){
        String choice3 = T1G1Questions[a][2];
        return choice3;
    }

    public String getT1G1Answer(int a){
        String answer = T1G1Questions[a][3];
        return answer;
    }

    private String T2G1Questions [][]= {
            {" What computer equipment puts images and texts onto the paper?",
                    " Mouse ", " Printer ", "Monitor"," Printer "}, //1

            {" It is a colored fluid used by the printer?."," ink ", " ballpen ", " monitor "," ink "}, //2

            {" it displays the information on a screen ",
                    " monitor ", " mouse ", " speakers "," monitor "}, //3

            {"Used to differentiate between the computer itself and its peripheral devices, such as the keyboard, mouse and monitor.",
                    "System Unit", "Processor", "RAM","System Unit"}, //4

            {" it is a device used for typing letters, numbers, and symbols into the computer.",
                    " monitor ", " computer avr ", " keyboard "," keyboard "}, //5
            {" it is a hand-held device for moving a cursor around the screen..",
                    " microphone ", "Mouse", " monitor ","Mouse"}, //6

            {" it is used to play sounds(in the computer). ",
                    " speaker ", "Mouse", " System Unit "," speaker "}, //7

            {" It is used to point and click on icons, menus, command buttons or activates something on a computer.",
                    " mouse ", " monitor ", " speakers "," mouse "}, //8

            {" it is the brain of the computer ",
                    " mouse ", " System Unit ", " speakers "," System Unit "}, //9

            {" It is a hardware device used to maintain a voltage to electronic devices.",
                    " mouse ", " monitor ", " computer AVR "," computer AVR "}, //10

            {" it is a small electronic device that is used for storing and transferring files.",
                    " Flash drive ", " Monitor ", " Mouse "," Flash drive "}, //11

            {" it is a video camera that is connected to a computer and can record videos and capture photos",
                    " Web Camera ", " Monitor ", " Cellphone "," Web Camera "}, //12

            {" it is a small surface  that provides a better movement for your mouse ",
                    " keyboard ", "Mouse", " Mousepad "," Mousepad "}, //13

            {" it is a movable indicator on the computer screen ",
                    " Cursor ", "Mouse", "Touchpad"," Cursor "}, //14

            {" it is considered as the 'hands' of the computer ",
                    " Mouse ", " Keyboard ", " monitor "," Mouse "} //15

    };

    public String getT2G1Questions(int a){
        String question = T2G1Questions[a][0];
        return question;
    }

    public String getT2G1Choice1(int a){
        String choice1 = T2G1Questions[a][1];
        return choice1;
    }
    public String getT2G1Choice2(int a){
        String choice2 = T2G1Questions[a][2];
        return choice2;
    }
    public String getT2G1Choice3(int a){
        String choice3 = T2G1Questions[a][3];
        return choice3;
    }
    public String getT2G1Answer(int a){
        String answer = T2G1Questions[a][4];
        return answer;
    }

    private String T3G1Questions [][]= {
            {" Do not use the computer during a storm. "," True ", " False ", " True "}, //1
            {" Spray you computer with household cleanser to keep it clean. "," True ", " False ", " False "}, //2

            {" Spilling liquids on your computer won't hurt it.	 "," True ", " False ", " False "}, //3
            {" Keeping your computer dust-free can help it last longer. "," True ", " False ", " True "}, //4

            {" Your mouse should never need cleaning."," True ", " False ", " False "}, //5

            {" It won't hurt to eat a peanut butter sandwich while using your computer.  "," True ", " False ", " False "}, //6

            {" Install one program, then test your computer for problems before installing another program.	"," True ", " False ", " True "}, //7

            {" Downloading from Internet sites could expose your computer to dangerous viruses."," True ", " False ", " True "}, //8

            {" Surge protectors can help guard against lightning, but may not be complete protection."," True ", " False ", " True "}, //9
            {" You should remove the computer cover monthly to clean inside. "," True ", " False ", " False "}, //10

                    {" Opening an email attachment could download a virus into your computer system.	"," True ", " False ", " True "}, //11

                    {" Canned air can be used to clean your computer keyboard."," True ", " False ", " True "}, //12

                    {" Washing the monitor with soap is okay."," True ", " False ", " False "}, //13

                    {" Monthly scanning for virus is advised "," True ", " False ", " True "}, //14

                    {" Using mouse pad will help your mouse move more accurate "," True ", " False ", " True "}, //15

                    {" Using lotion on your keyboard will increase your typing speed. "," True ", " False ", " False "}, //16

                            {" Shutting down your computer before unplugging is a must"," True ", " False ", " True "}, //17

                                    {" You can leave your computer open for many days. "," True ", " False ", " False "}, //18

                                    {" You can take the keycaps out regularly "," True ", " False ", " False "}, //19
                                    {" you should wipe your mouse with a piece of cloth for cleaning "," True ", " False ", " True "}//20
                            };

    public String getT3G1Questions(int a){
        String question = T3G1Questions[a][0];
        return question;
    }
    public String getT3G1Choice1(int a){
        String choice1 = T3G1Questions[a][1];
        return choice1;
    }
    public String getT3G1Choice2(int a){
        String choice2 = T3G1Questions[a][2];
        return choice2;
    }
//    public String getT3G1Choice3(int a){
//        String choice3 = T3G1Questions[a][2];
//        return choice3;
//    }
    public String getT3G1Answer(int a){
        String answer = T3G1Questions[a][3];
        return answer;
    }

    private String T4G1Questions [][]= {
            {" S _ A _ E  _AR "," P-C-B ", " B-G-C ", " P-N-C "," P-C-B "}, //1

            {" NU_  __CK ", " M-L-O ", " L-O-L", " M-L-U "," M-L-O "}, //2

            {" SR_LL  L__K "," O-U-L ", " O-O-C ", " O-U-C"," O-O-C "}, //3

            {" W_ _ _OWS ", " A-O-N "," I-N-O ", " I-N-D "," I-N-D "}, //4

            {" I_S_R_", " A-R-T "," N-E-T ", " O-W-L "," N-E-T "}, //5

            {" S_ _ F _", "H-I-T","H-I-F", "H-I-C","H-I-T"}, //6

            {"A_L","L", "U","P","L"}, //7

            {"D_L_T_ ", " A-T-E "," E-A-R ", " E-E-E "," E-E-E "}, //8

            {" P_ _E U_",  " A-G-P "," A-G-E ", " U-R-E "," A-G-P "}, //9

            {"_A_E DOW_"," T-G-P "," P-G-N ", " P-G-T"," P-G-N "}, //10

            {" H_ _ _", " O-M-E "," O-N-E", " O-R-N "," O-M-E "}, //11

            {" F_N_T_ON "," U-C-I "," U-T-I ", " C-T-O "," U-C-I "}, //12

            {"_N_E_"," E-T-R "," E-N-T ", " O-E-T "," E-T-R "}, //13

            {" T_B ","A","E", "I","A"}, //14

            {"CO_TR_ _", " N-O-L "," B-O-L ", " H-O-P "," N-O-L "}, //15

            {" E_D ","N","D", "T","N"}, //16

            {" C_PS L_ _K "," A-O-C "," A-U-L", " A-O-L "," A-O-C "}, //17

            {" PR_N_ SC_EEN "," I-T-R "," A-O-R", " I-R-T"," I-T-R "}, //18

            {" PA_S_ B_EAK "," O-E-R "," U-S-E ", " U-E-R"," U-E-R"}, //19

            {" E_CA_ _"," S-P-E ", " S-P-O ", " C-P-E "," S-P-E "},  //20

            {" L_SS T_A_"," E-H-N "," E-H-A ", " O-U-T "," E-H-N "}, //21

            {" G_EAT_R TH_N "," U-G-H "," R-E-A ", " P-N-C "," R-E-A "}, //22

            {" E_U_ _L_"," G-U-P "," U-L-P ", " Q-A-S "," Q-A-S "}, //23

            {" P_US ","L","R", "P","L"}, //24

            {" S_L_C_"," E-E-T "," E-U-T ", " B-O-I"," E-E-T "} //25
    };

    public String getT4G1Questions(int a){
        String question = T4G1Questions[a][0];
        return question;
    }
    public String getT4G1Choice1(int a){
        String choice1 = T4G1Questions[a][1];
        return choice1;
    }
    public String getT4G1Choice2(int a){
        String choice2 = T4G1Questions[a][2];
        return choice2;
    }
    public String getT4G1Choice3(int a){
        String choice3 = T4G1Questions[a][3];
        return choice3;
    }
    public String getT4G1Answer(int a){
        String answer = T4G1Questions[a][4];
        return answer;
    }

    private List<Integer> T5G1Questions = Arrays.asList(
            R.drawable.tech1,
            R.drawable.tech2,
            R.drawable.tech3,
            R.drawable.tech4,
            R.drawable.tech5,
            R.drawable.tech6,
            R.drawable.tech7,
            R.drawable.tech8,
            R.drawable.tech9,
            R.drawable.tech10,
            R.drawable.tech11,
            R.drawable.tech12,
            R.drawable.tech13,
            R.drawable.tech14,
            R.drawable.tech15,
            R.drawable.tech16,
            R.drawable.tech17,
            R.drawable.tech18,
            R.drawable.tech19,
            R.drawable.tech20,
    R.drawable.tech21,
    R.drawable.tech22,
    R.drawable.tech23,
    R.drawable.tech24,
    R.drawable.tech25,
    R.drawable.tech26,
    R.drawable.tech27,
    R.drawable.tech28,
    R.drawable.tech29,
    R.drawable.tech30);



    private String T5G1Choices [][]= {
            {"Microsoft Word","Microsoft Work", "Microsoft Wire",
                    "Microsoft Word"}, //1

            {"Microsoft power point", "Microsoft Excel", "Microsoft access",
                    "Microsoft Excel"}, //2

            {"Microsoft word", "Microsoft one note", "Microsoft powerpoint",
                    "Microsoft powerpoint"}, //3

            {"Microsoft one note", "Microsoft excel", "Microsoft access",
                    "Microsoft one note"}, //4

            {"Microsoft Access", "Microsoft Air", "Microsoft Art",
                    "Microsoft Access"}, //5

            {"Wifi", "Signal", "Cloud",
                    "Wifi"}, //6

            {"Shut down", "Airflow", "Power ON",
                    "Shut down"}, //7

            {"Turn off", "Restart", "Force close",
                    "restart"}, //8

            {"Windows", "Linux", "Mac",
                    "Windows"}, //9

            {"Windows", "Linux", "Mac",
                    "Linux"}, //10

            {"Windows", "Linux", "Mac",
                    "Mac"}, //11

            {"Trash can", "Recycle bin", "File transfer",
                    "Recycle bin"}, //12

            {"Settings", "Tools", "Properties",
                    "Settings"}, //13

            {"Screen ", "Volume", "Resolution",
                    "Volume"}, //14

            {"Facebook", "Friendster", "Twitter",
                    "Facebook"}, //15

            {"Facebook", "Twitter", "Friendster",
                    "Twitter"}, //16

            {"Firefox", "Chrome", "Explorer",
                    "Chrome"}, //17

            {"Firefox", "Chrome", "Explorer",
                    "Firefox"}, //18

            {"Firefox", "MS Edge", "Explorer",
                    "Explorer"}, //19

            {"MS Edge", "Chrome", "Explorer",
                    "MS Edge"},  //20

            {"Compass", "Safari", "Map",
                    "Safari"}, //21

            {"bluetooth", "bluefish", "wifi",
                    "bluetooth"}, //22

            {"photo", "gallery", "Camera",
                    "Camera"}, //23

            {"Firewall", "Firebrick", "firesquare",
                    "Firewall"}, //24

            {"Lets play", "Youtube", "Videos",
                    "Youtube"}, //25

            {"Instagram", "Photography", "5Camera2",
                    "Instagram"}, //26

            {"Yahoo!", "Yes!", "Yappy!",
                    "Yahoo!"}, //27

            {"eMail", "Ymail", "Gmail",
                    "Gmail"}, //28

            {"Google map", "Google point", "Google location",
                    "Google map"}, //29

            {"Google storage", "Google drive", "Google diary",
                    "Google drive"}  //30


    };

    public Integer getT5G1Questions(int a){
        Integer question = T5G1Questions.get(a);
        return question;
    }
    public String getT5G1Choice1(int a){
        String choice1 = T5G1Choices[a][0];
        return choice1;
    }
    public String getT5G1Choice2(int a){
        String choice2 = T5G1Choices[a][1];
        return choice2;
    }
    public String getT5G1Choice3(int a){
        String choice3 = T5G1Choices[a][2];
        return choice3;
    }
    public String getT5G1Answer(int a){
        String answer = T5G1Choices[a][3];
        return answer;
    }

    private List<Integer> TechEx1Questions = Arrays.asList(

            R.drawable.tech21,
            R.drawable.tech22,
            R.drawable.tech23,
            R.drawable.tech24,
            R.drawable.tech25,
            R.drawable.tech26,
            R.drawable.tech27,
            R.drawable.tech28,
            R.drawable.tech29,
            R.drawable.tech30);



    private String TechEx1Choices [][]= {
            {"Compass", "Safari", "Map", "Safari"}, //21

            {"bluetooth", "bluefish", "wifi", "bluetooth"}, //22

            {"photo", "gallery", "Camera", "Camera"}, //23

            {"Firewall", "Firebrick", "firesquare", "Firewall"}, //24

            {"Lets play", "Youtube", "Videos", "Youtube"}, //25

            {"Instagram", "Photography", "5Camera2", "Instagram"}, //26

            {"Yahoo!", "Yes!", "Yappy!", "Yahoo!"}, //27

            {"eMail", "Ymail", "Gmail", "Gmail"}, //28

            {"Google map", "Google point", "Google location", "Google map"}, //29

            {"Google storage", "Google drive", "Google diary", "Google drive"}  //30


            };

    public Integer getTex1Questions(int a){
        Integer question = TechEx1Questions.get(a);
        return question;
    }
    public String getTex1Choice1(int a){
        String choice1 = TechEx1Choices[a][0];
        return choice1;
    }
    public String getTex1Choice2(int a){
        String choice2 = TechEx1Choices[a][1];
        return choice2;
    }
    public String getTex1Choice3(int a){
        String choice3 = TechEx1Choices[a][2];
        return choice3;
    }
    public String getTex1Answer(int a){
        String answer = TechEx1Choices[a][3];
        return answer;
    }

    private String Techex2Questions [][]= {

            {"A hand-held pointing device that detects two-dimensional motion relative to a surface.",
                    "Trackball", "Mouse", "Printer","Mouse"}, //6

            {"A typewriter-style device which uses an arrangement of buttons or keys to act as mechanical levers or electronic switches",
                    "Type writer", "Mouse", "Keyboard","Keyboard"}, //7

            {"An output device which displays information in pictorial form.",
                    "Monitor", "TV", "LED","Monitor"}, //8

            {"It holds together many of the crucial components of a computer",
                    "Hard drive", "Motherboard", "System Unit","Motherboard"}, //9

            {"A high-capacity, self-contained storage device containing a read-write mechanism",
                    "Hard drive", "Web cam", "Motherboard","Hard drive"}, //10

            {"A video camera that inputs to a computer connected to the Internet, so that its images can be viewed by Internet users.",
                    "Digital Camera", "DSLR", "Web camera","Web camera"}, //11

            {"a machine for printing text or pictures onto paper, especially one linked to a computer.",
                    "Scanner", "Printer", "Fax machine","Printer"}, //12

            {"a computer that is portable and suitable for use while traveling.",
                    "Desktop", "Mouse", "Laptop","Laptop"}, //13

            {"A computer input device in the form of a small panel containing different touch-sensitive areas.",
                    "Laser", "Mouse", "Touchpad","Touchpad"}, //14

            {"fans that draw cooler air into the case from the outside, expel warm air from inside, or move air across a heat sink to cool a particular component.",
                    "Electric fan", "Cooling fan", "Exhaust fan","Cooling fan"}, //15

            {"an electronic device that manipulates information, or data. It has the ability to store, retrieve, and process data",
                    "Computer", "Cellphone", "Hard drive","Computer"}, //16

            {"a compact disc used as a read-only optical memory device for a computer system.",
                    "Trackball", "DVD", "CD-ROM","CD-ROM"}, //17

            {"a plastic case containing a ball on the top that moves a computer cursor around on the screen. The user can move the ball with their thumb or fingers, and sensors inside the case detect which direction the ball is moving",
                    "Basketball", "Track ball", "Mouse","Track ball"}, //18

            {"a type of disk storage composed of a disk of thin and flexible magnetic storage medium, sealed in a rectangular plastic enclosure lined with fabric that removes dust particles.",
                    "USB", "Floppy disk", "Flash drive","Floppy disk"}, //19

            {"a pair of earphones typically joined by a band placed over the head, for listening to audio signals such as music or speech.",
                    "Microphone", "Headphones", "Speaker","Headphones"}  //20

    };

    public String getTex2Questions(int a){
        String question = Techex2Questions[a][0];
        return question;
    }

    public String getTex2Choice1(int a){
        String choice1 = Tech2Questions[a][1];
        return choice1;
    }
    public String getTex2Choice2(int a){
        String choice2 = Tech2Questions[a][2];
        return choice2;
    }
    public String getTex2Choice3(int a){
        String choice3 = Techex2Questions[a][3];
        return choice3;
    }
    public String getTex2Answer(int a){
        String answer = Techex2Questions[a][4];
        return answer;
    }
    private String Techex3Questions [][]= {


            {"A series of graphical web browsers developed by Microsoft ",
                    "Firefox","Chrome", "Explorer","Explorer"}, //11

            {"A simple raster graphics editor that has been included with all versions of Microsoft Windows.",
                    "Paint","Photoshop", "Edit","Paint"}, //12

            {"Refers to the loudness or softness of a sound",
                    "Air","Volume", "Electric","Volume"}, //13

            {"A simple text editor for Microsoft Windows and a basic text-editing program which enables computer users to create documents.",
                    "Chrome","textword", "Notepad","Notepad"}, //14

            {"A temporary storage for files that have been deleted in a file manager by the user",
                    "Trash bin","Recycle bin", "Storage bin","Recycle bin"}, //15

            {"A free and open source cross-platform multimedia player and framework that plays most multimedia files as well as DVDs, Audio CDs, and VCDs",
                    "dvd player","Media player", "cd player","Media player"}, //16

            {"A web browser developed by Apple based on the WebKit engine. ",
                    "Safari","Chrome", "Firefox","Safari"}, //17

            {"A wireless technology standard for exchanging data over short distances from fixed and mobile devices",
                    "signal","Bluetooth", "wifi","Bluetooth"}, //18

            {"A graphical operating systems developed and marketed by Apple",
                    "MacOS","Windows", "Linux","MacOS"}, //19

            {"A free advertising-supported email service developed by Google.",
                    "Yahoo", "Gmail", "Messenger","Gmail"},  //20

            {"A file storage and synchronization service developed by Google.",
                    "Google storage","Google drive", "Google diary","Google drive"}, //21

            {"A network security system that monitors and controls incoming and outgoing network traffic based on predetermined security rules.",
                    "Firewall","Firebrick", "firesquare","Firewall"}, //22

            {"A web mapping service developed by Google",
                    "Google map","google point", "google location","Google map"}, //23

            {"A raster graphics editor developed and published by Adobe",
                    "Photoshop","notepad", "paint","Photoshop"}, //24

            {"A process for reproducing text and images using a master form or template.",
                    "Copy","Scan", "Print","Print"}, //25

            {"A process that optically scans images, printed text, handwriting or an object and converts it to a digital image.",
                    "Copy","Scan", "Print","Scan"}, //26

            {"Removes the item from its current location and places it into the clipboard",
                    "Cut", "Copy","Paste","Cut"}, //27

            {"duplicating a section of a document and placing it in a clipboard",
                    "Cut","Copy", "Paste","Copy"}, //28

            {"A command that allows you to insert data from the clipboard into an application",
                    "Cut","Copy", "Paste","Paste"}, //29

            {"A telecommunications application software product that specializes in providing video chat and voice calls between computers.",
                    "Skype","Message", "facebook","Skype"},  //30

            {"An anti-malware component of Microsoft Windows.",
                    "Windows","Windows defender", "Windows firewall","Windows defender"}, //31

            {"a web-based suite of webmail, contacts, tasks, and calendaring services from Microsoft.",
                    "MS Outlook","MS ONENOTE", "MS word","MS Outlook"}, //32

            {"an entry-level desktop publishing application from Microsoft",
                    "MS Outlook","MS ONENOTE", "MS Publisher","MS Publisher"}, //33

            {"A vector graphics editor developed and marketed by Adobe Systems.",
                    "Adobe Air","Adobe Illustrator", "Adobe Photoshop","Adobe Illustrator"}, //34

            {"Viewing, organizing and editing large numbers of digital images.",
                    "Adobe Air","Adobe Illustrator", "Adobe Lightroom","Adobe Lightroom"}, //35

            {"View, create, manipulate, print and manage files in Portable Document Format. ",
                    "Adobe illustrator","Adobe Lightroom", "Adobe Acrobat","Adobe Acrobat"}, //36

            {"a digital visual effects, motion graphics, and compositing application developed by Adobe",
                    "Adobe lightroom","Adobe After effects", "Adobe Photoshop","Adobe After effects"}, //37

            {"A timeline-based video editing app developed by Adobe ",
                    "Windows movie maker","VLC player", "Adobe Premiere pro","Adobe Premiere pro"}, //38

            {"an integrated suite of storytelling applications for the mobile and web developed by Adobe Systems. ",
                    "Adobe spark","Adobe lightroom", "Adobe illustrator","Adobe spark"}, //39

            {"a multimedia authoring and computer animation program developed by Adobe ",
                    "Adobe spark","Adobe Animate", "Adobe illustrator","Adobe Animate"}, //40

    };

    public String getTex3Questions(int a){
        String question = Techex3Questions[a][0];
        return question;
    }
    public String getTex3Choice1(int a){
        String choice1 = Techex3Questions[a][1];
        return choice1;
    }
    public String getTex3Choice2(int a){
        String choice2 = Techex3Questions[a][2];
        return choice2;
    }
    public String getTex3Choice3(int a){
        String choice3 = Techex3Questions[a][3];
        return choice3;
    }
    public String getTex3Answer(int a){
        String answer = Techex3Questions[a][4];
        return answer;
    }

    private String Techex4Questions [][]= {


            {"A series of graphical web browsers developed by Microsoft ",
                    "Firefox","Chrome", "Explorer","Explorer"}, //11

            {" It is a hardware device used to maintain a voltage to electronic devices.",
                    " mouse ", " monitor ", " computer AVR "," computer AVR "}, //10

            {" it is a small electronic device that is used for storing and transferring files.",
                    " Flash drive ", " Monitor ", " Mouse "," Flash drive "}, //11

            {" it is a video camera that is connected to a computer and can record videos and capture photos",
                    " Web Camera ", " Monitor ", " Cellphone "," Web Camera "}, //12

            {" it is a small surface  that provides a better movement for your mouse ",
                    " keyboard ", "Mouse", " Mousepad "," Mousepad "}, //13
            {"A web browser developed by Apple based on the WebKit engine. ",
                    "Safari","Chrome", "Firefox","Safari"}, //17

            {"A wireless technology standard for exchanging data over short distances from fixed and mobile devices",
                    "signal","Bluetooth", "wifi","Bluetooth"}, //18

            {"A graphical operating systems developed and marketed by Apple",
                    "MacOS","Windows", "Linux","MacOS"}, //19

            {"A free advertising-supported email service developed by Google.",
                    "Yahoo", "Gmail", "Messenger","Gmail"},  //20

            {"A file storage and synchronization service developed by Google.",
                    "Google storage","Google drive", "Google diary","Google drive"}, //21

            {"A network security system that monitors and controls incoming and outgoing network traffic based on predetermined security rules.",
                    "Firewall","Firebrick", "firesquare","Firewall"}, //22

            {"A web mapping service developed by Google",
                    "Google map","google point", "google location","Google map"}, //23

            {"A raster graphics editor developed and published by Adobe",
                    "Photoshop","notepad", "paint","Photoshop"}, //24

            {"A process for reproducing text and images using a master form or template.",
                    "Copy","Scan", "Print","Print"}, //25

            {"A process that optically scans images, printed text, handwriting or an object and converts it to a digital image.",
                    "Copy","Scan", "Print","Scan"}, //26

            {"Removes the item from its current location and places it into the clipboard",
                    "Cut", "Copy","Paste","Cut"}, //27

            {"duplicating a section of a document and placing it in a clipboard",
                    "Cut","Copy", "Paste","Copy"}, //28

            {"A command that allows you to insert data from the clipboard into an application",
                    "Cut","Copy", "Paste","Paste"}, //29

            {"A telecommunications application software product that specializes in providing video chat and voice calls between computers.",
                    "Skype","Message", "facebook","Skype"},  //30

            {"An anti-malware component of Microsoft Windows.",
                    "Windows","Windows defender", "Windows firewall","Windows defender"}, //31

            {"a web-based suite of webmail, contacts, tasks, and calendaring services from Microsoft.",
                    "MS Outlook","MS ONENOTE", "MS word","MS Outlook"}, //32

            {"an entry-level desktop publishing application from Microsoft",
                    "MS Outlook","MS ONENOTE", "MS Publisher","MS Publisher"}, //33

            {"A vector graphics editor developed and marketed by Adobe Systems.",
                    "Adobe Air","Adobe Illustrator", "Adobe Photoshop","Adobe Illustrator"}, //34

            {"Viewing, organizing and editing large numbers of digital images.",
                    "Adobe Air","Adobe Illustrator", "Adobe Lightroom","Adobe Lightroom"}, //35

            {"View, create, manipulate, print and manage files in Portable Document Format. ",
                    "Adobe illustrator","Adobe Lightroom", "Adobe Acrobat","Adobe Acrobat"}, //36

            {"a digital visual effects, motion graphics, and compositing application developed by Adobe",
                    "Adobe lightroom","Adobe After effects", "Adobe Photoshop","Adobe After effects"}, //37

            {"A timeline-based video editing app developed by Adobe ",
                    "Windows movie maker","VLC player", "Adobe Premiere pro","Adobe Premiere pro"}, //38

            {"an integrated suite of storytelling applications for the mobile and web developed by Adobe Systems. ",
                    "Adobe spark","Adobe lightroom", "Adobe illustrator","Adobe spark"}, //39

            {"a multimedia authoring and computer animation program developed by Adobe ",
                    "Adobe spark","Adobe Animate", "Adobe illustrator","Adobe Animate"}, //40

    };

    public String getTex4Questions(int a){
        String question = Techex4Questions[a][0];
        return question;
    }
    public String getTex4Choice1(int a){
        String choice1 = Techex4Questions[a][1];
        return choice1;
    }
    public String getTex4Choice2(int a){
        String choice2 = Techex4Questions[a][2];
        return choice2;
    }
    public String getTex4Choice3(int a){
        String choice3 = Techex4Questions[a][3];
        return choice3;
    }
    public String getTex4Answer(int a){
        String answer = Techex4Questions[a][4];
        return answer;
    }


    private String Techex5Questions [][]= {


            {"A series of graphical web browsers developed by Microsoft ",
                    "Firefox","Chrome", "Explorer","Explorer"}, //1

            {" It is a hardware device used to maintain a voltage to electronic devices.",
                    " mouse ", " monitor ", " computer AVR "," computer AVR "}, //2

            {" it is a small electronic device that is used for storing and transferring files.",
                    " Flash drive ", " Monitor ", " Mouse "," Flash drive "}, //3

            {" it is a video camera that is connected to a computer and can record videos and capture photos",
                    " Web Camera ", " Monitor ", " Cellphone "," Web Camera "}, //4

            {" it is a small surface  that provides a better movement for your mouse ",
                    " keyboard ", "Mouse", " Mousepad "," Mousepad "}, //5
            {"A web browser developed by Apple based on the WebKit engine. ",
                    "Safari","Chrome", "Firefox","Safari"}, //6

            {"A wireless technology standard for exchanging data over short distances from fixed and mobile devices",
                    "signal","Bluetooth", "wifi","Bluetooth"}, //7

            {"A graphical operating systems developed and marketed by Apple",
                    "MacOS","Windows", "Linux","MacOS"}, //8

            {"A free advertising-supported email service developed by Google.",
                    "Yahoo", "Gmail", "Messenger","Gmail"},  //9

            {"A file storage and synchronization service developed by Google.",
                    "Google storage","Google drive", "Google diary","Google drive"}, //10

            {"A network security system that monitors and controls incoming and outgoing network traffic based on predetermined security rules.",
                    "Firewall","Firebrick", "firesquare","Firewall"}, //11

            {"A web mapping service developed by Google",
                    "Google map","google point", "google location","Google map"}, //12

            {"A raster graphics editor developed and published by Adobe",
                    "Photoshop","notepad", "paint","Photoshop"}, //13

            {"A process for reproducing text and images using a master form or template.",
                    "Copy","Scan", "Print","Print"}, //14

            {"A process that optically scans images, printed text, handwriting or an object and converts it to a digital image.",
                    "Copy","Scan", "Print","Scan"}, //15

            {"Removes the item from its current location and places it into the clipboard",
                    "Cut", "Copy","Paste","Cut"}, //16

            {" C_PS L_ _K "," A-O-C "," A-U-L", " A-O-L "," A-O-C "}, //17

            {" PR_N_ SC_EEN "," I-T-R "," A-O-R", " I-R-T"," I-T-R "}, //18

            {" PA_S_ B_EAK "," O-E-R "," U-S-E ", " U-E-R"," U-E-R"}, //19

            {" E_CA_ _"," S-P-E ", " S-P-O ", " C-P-E "," S-P-E "},  //20

            {" L_SS T_A_"," E-H-N "," E-H-A ", " O-U-T "," E-H-N "}, //21

            {" G_EAT_R TH_N "," U-G-H "," R-E-A ", " P-N-C "," R-E-A "}, //22

            {" E_U_ _L_"," G-U-P "," U-L-P ", " Q-A-S "," Q-A-S "}, //23

            {" P_US ","L","R", "P","L"}, //24

            {" S_L_C_"," E-E-T "," E-U-T ", " B-O-I"," E-E-T "}, //25
            {"A vector graphics editor developed and marketed by Adobe Systems.",
                    "Adobe Air","Adobe Illustrator", "Adobe Photoshop","Adobe Illustrator"}, //26

            {"Viewing, organizing and editing large numbers of digital images.",
                    "Adobe Air","Adobe Illustrator", "Adobe Lightroom","Adobe Lightroom"}, //27

            {"View, create, manipulate, print and manage files in Portable Document Format. ",
                    "Adobe illustrator","Adobe Lightroom", "Adobe Acrobat","Adobe Acrobat"}, //28
            {"a surface for placing and moving a computer mouse.",
                    "Mouse", "Wood", "Mousepad","Mousepad"}, //29

            {"Used to differentiate between the computer itself and its peripheral devices, such as the keyboard, mouse and monitor.",
                    "System Unit", "Processor", "RAM","System Unit"}, //4

            {"A hardware device that connects to a computer to generate sound. ",
                    "Scanner", "Microphone", "Speaker","Speaker"}, //5
            {"A hand-held pointing device that detects two-dimensional motion relative to a surface.",
                    "Trackball", "Mouse", "Printer","Mouse"}, //6

    };

    public String getTex5Questions(int a){
        String question = Techex5Questions[a][0];
        return question;
    }
    public String getTex5Choice1(int a){
        String choice1 = Techex5Questions[a][1];
        return choice1;
    }
    public String getTex5Choice2(int a){
        String choice2 = Techex5Questions[a][2];
        return choice2;
    }
    public String getTex5Choice3(int a){
        String choice3 = Techex5Questions[a][3];
        return choice3;
    }
    public String getTex5Answer(int a){
        String answer = Techex5Questions[a][4];
        return answer;
    }
    }
