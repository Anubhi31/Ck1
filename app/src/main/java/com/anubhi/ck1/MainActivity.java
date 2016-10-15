package com.anubhi.ck1;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    static Button bin,bmap;
    static TextView code,lifetext;
    static Chronometer ch=null;
    ScrollView sv;
    static String[] codes;
    static String[] codes1={"If(! Facing  MANIT’s SBI)\n" +
            "\tReposition yourself and face its front door;\n" +
            "\n" +
            "If (Facing  MANIT’s SBI)\n" +
            "\tTake a right turn ;\n" +
            "\n" +
            "While(! Reached  a banyan tree)\n" +
            "\tContinue walking;\n" +
            "\n" +
            "If( building with trivial mail system spotted)\n" +
            "\tTake a right turn;\n" +
            "\n" +
            "int  step=0;\n" +
            "While(step!=8)\n" +
            "{\n" +
            "\tKeep moving  forward;\n" +
            "\tstep++\n" +
            "}\n" +
            "If(a gate found on left)\n" +
            "\tEnter into the gate;\n" +
            "\n" +
            "Take a left turn;\n" +
            "while (! A small lane is found)\n" +
            "\tContinue moving forward and look for it in all directions;\n" +
            "\n" +
            "if (A small lane is found)\n" +
            "\tEnter into it and keep walking till you come out;\n" +
            "\n" +
            "Take a right turn;\n" +
            "While ( !  A 24*7 banking  service  is found)\n" +
            "\tKeep walking in the same direction and search for it;\n" +
            "\n",/*2*/"If( !facing the ATM door)\n" +
            "　　Reach next to the ATM door and face it;\n" +
            "If(facing the ATM door)\n" +
            "　　Take a 180 degree turn; \t//no treasure inside the ATM don’t worry;\n" +
            "While(MANIT Map is not spotted)\n" +
            "　　Keep moving forward and look for it in all directions;\n" +
            "If(Gate is spotted nearby)\n" +
            "　　Enter into the gate;\n" +
            "While(!near the clock)\n" +
            "　　Walk forward;\n" +
            "Stay near the clock;\n" +
            "If(A white board with Rajbhasha written on it is spotted){\n" +
            "Face opposite to the board;\t//No turning back now \n" +
            "Enter the gate which is not in front of you;\n" +
            "}\n" +
            "Int count=0;\n" +
            "While(count!=13){\n" +
            "　　Keep walking forward;\n" +
            "　　If(gate is found on the left)\n" +
            "　　\t\tCount++;\n" +
            "}\n" +
            "Take 1st left;\n" +
            "Count=0;\n" +
            "While(count!=21){\n" +
            "　　If (red pillar on right is spotted)\t\n" +
            "　　\t\tCount++;\n" +
            "　　If(red pillar on left is spotted)\n" +
            "　　\t\tCount++;\n" +
            "}\n" +
            "Spot(The nearest asphalt)\n" +
            "If(!Standing against the channel gate)\n" +
            "　　\tUse the asphalt for moving forward;\n" +
            "Face the channel gate in front of you;\n" +
            "Count=0;\n" +
            "While(! Facing the biggest archive){\n" +
            "　　If(Hurdle is not reached)\n" +
            "　　\t\tMove forward;\n" +
            "　　While(count!=3){\n" +
            "　　\t\tIf(Grilled entrances are crossed)\n" +
            "　　\t\t\tCount++;\n" +
            "}\n" +
            "}\n" +
            "Get on the asphalt;\n" +
            "If(!obstacles found on the path)\n" +
            "　　Move forward;\n" +
            "While(crossroad not reached)\n" +
            "　　Move ahead;\n" +
            "look for a blue wall; \t\t//preferably a part of a building\n","#include<stdio.h>\n" +
            "void main()\n" +
            "{\n" +
            "int a;\n" +
            "if(barrier==visible)\n" +
            "\tsearch(white gate near parking);\n" +
            "\n" +
            "go inside;\n" +
            "search(an ac);\n" +
            "printf(\"note company of the ac\");\n" +
            "go straight;\n" +
            "search(4 red buckets);\n" +
            "go towards it;\n" +
            "if(bad-minton court==visible)\n" +
            "a=count(no. of brownish pillar surrounding it);\n" +
            "while(Board with Charu Parashar written!=visible)\n" +
            "\tgo straight;\n" +
            "keep watching red cylinders on wall;\n" +
            "while(a way to next level!=visible)\n" +
            "\tcount(no. of red cylinders);\n" +
            "\n" +
            "printf(\"note down specification on white paper on last cylinder\");\n" +
            "if(facing stairs)\n" +
            "\tsearch(clock in the area);\n" +
            "printf(\"note strings written on the clock\");\n" +
            "search(a 3D map);\n" +
            "go through the gate near it;\n" +
            "search(blue and red metallic statue);\n" +
            "if(facing blue and red metallic statue)\n" +
            "\tfor(i=0;i<3;i++)\n" +
            "rotate 90 deg. left;\n" +
            "search(vehicle with MANIT/MACT written on it);\n" +
            "printf(\"note vehicle's no.\");\n" +
            "go through road in direction opposite to barriers;\n" +
            "if(building on left==visible)\n" +
            "\tprintf(\"u have reached ur destination\");\n" +
            "}\n" +
            "\n","If(!facing ROLTA)\n" +
            "\tFace ROLTA;\n" +
            "If(facing ROLTA)\n" +
            "    turn left;           \n" +
            "printf(“ant\\r sun\\r pet\\b\\b on\\b rat\\b\\b ch”);   /*move to the printed place*/\n" +
            "Enter closest building;\n" +
            "do \n" +
            "{ \n" +
            "   walk straight;\n" +
            "}while(!frame of 1st educational minister)\n" +
            "a=get(mtricsehy) /*get -> Anagram Solver returns the decoded string*/\n" +
            " while(a)\t\t//while Area associated to a is not crossed.\n" +
            "   walk forward till u get a right way up;\n" +
            "\n" +
            "/*10 shows decimal no. and 2 shows binary no.*/\n" +
            "X in base 10 =  (010) in base 2;\n" +
            "Y in base 10  = (000) in base 2;\n" +
            "Z in base 10  = (110) in base 2;\n" +
            "merge(X,Y,Z);   //Eg: if X=5,Y=6,Z=7 merge result is 567\n" +
            "combine(A,merge);\t\t//Name of the destination.\n" +
            "\n" +
            "\n","if(!facing A-206)\n" +
            "\tface A-206;\n" +
            "if(facing A-206)\n" +
            "\tTake right;\n" +
            "while(!stairs spotted)\n" +
            "\tKeep walking forward;\n" +
            "\n" +
            "int x=5;\n" +
            "if(x=1)\n" +
            "\tGo down and turn right;\n" +
            "else\n" +
            "\tGo up and take left;\n" +
            "\n" +
            "Take the first left;\n" +
            "while(\"Spic Macay\" can't be seen anywhere)\n" +
            "\tMove forward and look for \"spic macay\" written somewhere;\n" +
            "\n" +
            "Move forward;\n" +
            "x=17%10;\n" +
            "if(!x==0)\n" +
            "\tTake the second left;\n" +
            "else\n" +
            "\tTake the first right;\n" +
            "\n" +
            "while(you can move forward in current direction)\t//you can always walk if a dead end is not reached\n" +
            "\tmove forward;\n" +
            "\n" +
            "\n" +
            "\n","if(facing counter no. 26)\n" +
            "{\n" +
            "solve the quadratic equation x2 -31x+84;\n" +
            "Goto counter no. R2 //R2 is that root of quadratic which is less than 17,face it;        \n" +
            "if(facing counter no. R2)\n" +
            "turn 180 deg.;\n" +
            "move ahead and search for FACULTY ROOM on left;\n" +
            "if(faculty room found)\n" +
            "  go there and face the door;\n" +
            "  turn 90 deg.  clockwise;\n" +
            "  count=0;\n" +
            "  while(count!=11)\n" +
            "\t{  \n" +
            "\t   move ahead;\n" +
            "\t   if(pillar on right)\n" +
            "\t\tcount++;\n" +
            "\t}\n" +
            "  turn 90 deg.  clockwise;\n" +
            "  follow the path having two switches which will lead you on a different level \n" +
            "  and move ahead till you face a blackboard;\n" +
            "  touch the blackboard;\n" +
            "  take right stairs;\n" +
            "  count=0;\n" +
            "  while(count!=7)\n" +
            "\t{\n" +
            "\t move ahead;\n" +
            "\t   if(a pillar on right spotted)\n" +
            "\t\t  count++;\n" +
            "\t}\n" +
            "  follow the masked faces;\n" +
            "  face the bridge;\n" +
            "  take 90 deg. clockwise;\n" +
            "  while(a pillar on left is not found)\n" +
            "\t move ahead;\n" +
            "  take a step down;\n" +
            "  turn right;\n" +
            "  while (first channel gate is not reached)\n" +
            "  move ahead;\n" +
            "  \n" +
            "  stop;\n" +
            "}\n" +
            "\n" +
            "\n","search for the portrait of a man playing drums.\n" +
            "if(facing the wall)\n" +
            " turn 180 deg. ;\n" +
            "\t \n" +
            "take the road to your right and move ahead;\n" +
            "\t   \n" +
            "if(corridor is reached)\n" +
            " take right;\n" +
            "\t    \n" +
            "if(an entrance to the main road on left is visible )\n" +
            " stop;\n","\n\n\n\n\n\n\n\n\n\n"};
    String codes2[]={"#include <stdio.h>\n" +
            "void main()\n" +
            "{\n" +
            "int a,r1,r2,a1[50],b,x,r,s;\n" +
            "if (facing SBI)\n" +
            "\tturn 270 deg. anti-clockwise;\n" +
            "go straight;\n" +
            "search(A mode with which your grandpa used to communicate with his relatives);\n" +
            "printf (“Note bigger array(int array) and store in a1[]”);\n" +
            "if (facing post office)\n" +
            "\tturn 540 deg. ;\n" +
            "search(Way to cross the wall on your face);\n" +
            "search(ac with two fans);\n" +
            "printf(“store test pressure of ac with two fans in variable a”);\n" +
            "search(movie dialogues wall);\n" +
            "printf(“note any 7 dialogues with their actor names && any two with movies name”);\n" +
            "search(a well in the area);\n" +
            "  r1= inner radius of well;\n" +
            "  r2=outer radius of well;\n" +
            "  calculate((r2^r2)-(r1^r1));\n" +
            "search(a way out to the area);\n" +
            "if(facing opposite to iron gate)\n" +
            "   rotate 270 deg. clockwise;\n" +
            "go straight;\n" +
            "swap(a1[1],a1[2]);\n" +
            "printf(“dustbin no. of dustbin 1 is d1=%d “,((a1[1]*10+a1[2])/2)*3);\n" +
            "search(dustbin 1);\n" +
            "printf(“store a 3 digit no. written on it in b”);\n" +
            "if(facing mid point of wooden benches)\n" +
            "   turn 30 deg. clockwise;\n" +
            "search(white iron gate);\n" +
            "go inside;\n" +
            "printf(“write names of sketches on left”);\n" +
            "search(a engine model with platform);\n" +
            "printf(“note colours in the engine”);\n" +
            "search(area with so many chairs);\n" +
            "start(from window of couner1);   /*let it be w1*/\n" +
            "x=odd number on w10;\n" +
            "while(b){\n" +
            "r=b%n;\n" +
            "\tb=b/10;\n" +
            "s=s+r;\n" +
            "}\n" +
            "printf(“your destination is %d on some window”,(a+x-s-1)/2);\n" +
            "}\n","if(facing counter no. 26)\n" +
            "{\n" +
            "   solve the quadratic equation x2 -31x+84;\n" +
            "   goto counter no. R2;//R2 is the root of quadratic which is less than 17,face it;        \n" +
            "}   \n" +
            "if(facing counter no. R2)\n" +
            "        turn 180;\n" +
            "   \n" +
            "move ahead until FACULTY ROOM on exact left is visible.\n" +
            "if(faculty room on left is visible)\n" +
            "\tturn right;\n" +
            "move ahead until black road is not reached;\n" +
            "        turn left;\n" +
            "count=0;\n" +
            "while(count!=12)\n" +
            "{\n" +
            "\tmove ahead;\n" +
            "        if(date tree on right)\n" +
            "\t\tcount++;\n" +
            "}    \t\n" +
            "move to the place where you cannot park your vehicle;\n","search for the portrait  of a man playing drums.\t\n" +
            "if(facing the wall)\n" +
            "\tturn 180 deg. ; \n" +
            "\n" +
            "take the road to your right and move ahead;\n" +
            "if(corridor is reached)\n" +
            "\t   take right;\n" +
            "\n" +
            "if(an entrance to the main road on left is visible )\n" +
            "\t   take left;\n" +
            "\n" +
            "turn left and reach the main road;\n" +
            "if(electrical pole on right spotted )\n" +
            "{\n" +
            "\tfollow the electrical wiring ;\n" +
            "\tif(a junction of wires is reached)\n" +
            "\t\tfollow the wiring with greater no. of wires;\n" +
            "\tmove ahead and search for giant shades;\n" +
            "}\n" +
            "\n" +
            "if(facing shades)\n" +
            "\tturn right;\n" +
            "\n" +
            "move ahead and take left;\n" +
            "search for black channel gate;\n" +
            "follow the path where you can do a limbo;\n" +
            "goto the place where you can find a real treasure;\n","If( !facing the ATM door)\n" +
            "\tReach next to the ATM door and face it;\n" +
            "If(facing the ATM door)\n" +
            "\tTake a 180 degree turn; \t//no treasure inside the ATM don’t worry;\n" +
            "While(MANIT Map is not spotted)\n" +
            "\tKeep moving forward and look for it in all directions;\n" +
            "If(Gate is spotted nearby)\n" +
            "\tEnter into the gate;\n" +
            "While(!near the clock)\n" +
            "\tWalk forward;\n" +
            "Stay near the clock;\n" +
            "If(A white board with Rajbhasha written on it is spotted){\n" +
            "\tFace opposite to the board;\t//No turning back now\n" +
            "\tEnter the gate which is not in front of you;\n" +
            "}\n" +
            "Int count=0;\n" +
            "While(count!=13){\n" +
            "\tKeep walking forward;\n" +
            "\tIf(gate is found on the left)\n" +
            "\tCount++;\n" +
            "}\n" +
            "Take 1st left;\n" +
            "Count=0;\n" +
            "While(count!=21){\n" +
            "\tIf (pillar on right is spotted)\n" +
            "\t\tCount++;\n" +
            "\tIf(pillar on left is spotted)\n" +
            "\t\tCount++;\n" +
            "}\n" +
            "Spot(The nearest asphalt){\n" +
            "\tIf(!Channel gate immediately in front)\n" +
            "\t\tUse it for moving forward;\n" +
            "}\n" +
            "Face the channel gate in front of you;\n" +
            "Count=0;\n" +
            "While(! Facing the biggest archive){If(Hurdle is not reached)\n" +
            "\t\tMove forward;\n" +
            "\tWhile(count!=3){If(Grilled entrances are crossed)\n" +
            "\t\tCount++;}}\n" +
            "Get on the asphalt;\n" +
            "If(!obstacles found on the path)\n" +
            "\tMove forward;\n" +
            "While(crossroad not reached)\n" +
            "\tMove ahead;\n" +
            "look for a blue wall, go there and stop; \t\t//preferably a part of a building\n","#include<stdio.h>\n" +
            "void main()\n" +
            "{\n" +
            "int a;\n" +
            "if(search(dustbin with  no.32)==1)\n" +
            "\ta=count(no. of blue - red benches);\n" +
            "search (sitting area covered with shed );\n" +
            "go to washroom;\n" +
            "while(\"washroom\" != visible)\n" +
            "             continue walking ;\n" +
            "search(a dustbin);\n" +
            "printf(\"note two numbers on dustbin , its color , written on it \");\n" +
            "if(facing dustbin)\n" +
            "\trotate 540 ;\n" +
            "\n" +
            "go to path available  ;\n" +
            "while (path in forward direction)\n" +
            "\tmove forward;\n" +
            "\n" +
            "turn right;\n" +
            "if(black road ==visible)\n" +
            "\tturn left ; \n" +
            "\n" +
            "search (board with text \"JUBILEE GATE\");\n" +
            "printf(\"take picture of the board or note its color ');\n" +
            "if (facing \"JUBILEE HALL \"board )\n" +
            "\tturn 180;\n" +
            "\n" +
            "go straight;\n" +
            "search(Red and blue coloured metallic statue);\n" +
            "if (search==1)\t//found the given thing\n" +
            "\tstand facing the statue;\n" +
            "turn right;\n" +
            "go straight;\n" +
            "search(vehicle no. 1899 in parking);\n" +
            "printf(\"note its model and color\");\n" +
            "continue moving on the road;\n" +
            "if(a building on left==visible)\n" +
            "printf(\"u have reached ur destination\");\n" +
            "}\n","If(facing ROLTA)\n" +
            "    turn left;\n" +
            "printf(“pen\\b\\boil\\rpot\\brun\\b\\bchoco\\b\\b\\b”); \\*go to the printed place*\\\n" +
            "\n" +
            "search(model of 650 acre area of manit campus);\n" +
            "\n" +
            "get(DIRECTion OR go to  OFFICE); /*answer lies within the argument*/\n" +
            "\n" +
            "int i = position of stairs;\n" +
            "\n" +
            "int j;\n" +
            "\n" +
            "if (i== (80<90))\n" +
            "{ \n" +
            "\tfor(j=position of floor; j=get;j++)\n" +
            "        \twalk up;\n" +
            "}\n" +
            "\n" +
            "go straight;\n","int x=10;\n" +
            "if(facing A 206)\n" +
            "\tturn right;\n" +
            "do{\n" +
            "       walk forward;\n" +
            "}while(! Walk over bridge) \n" +
            "\n" +
            "3x+2y=30; \\* a =x intercept ,b=y intercept*\\\n" +
            "m=a*b;\n" +
            "walk according to m; //1=right,0=left,5=walk ;\n" +
            "while(!divergence)\n" +
            "\tif(divergence)\n" +
            "\t\ttake a U-turn;// such that you get on a path that can change your level\n" +
            "\t\t\n" +
            "if(++x==11)\n" +
            "\tgo down;\n" +
            "else\n" +
            "\tretrace your path;\n",""};

    String codes3[]={"if(! Facing  MANIT’s SBI)\n" +
            "\tReposition yourself and face its front door;\n" +
            "\n" +
            "if (Facing  MANIT’s SBI)\n" +
            "\tTake a right turn ;\n" +
            "\n" +
            "while(! Reached  a banyan tree)\n" +
            "\tContinue walking;\n" +
            "\n" +
            "if( building with trivial mail system spotted)\n" +
            "\tTake a right turn;\n" +
            "\n" +
            "while(! A blocked entrance not found)\n" +
            "\tContinue walking;\n" +
            "\n" +
            "do limbo to cross the blocked entrance;\n" +
            "\t\n" +
            "while (!facing Blue and Red Metallic structure)\n" +
            "\tmove ahead;\n" +
            "\n" +
            "Take a right turn;\n" +
            "\t\n" +
            "while(!  A newly constructed building is found )\n" +
            "\tContinue walking and look for it in all directions;\n" +
            "\n" +
            "if(brand  new construction found )\n" +
            "\tstop;\n","if(!facing ROLTA)\n" +
            "\tface ROLTA;\n" +
            "if(facing ROLTA)\n" +
            "\tturn 270 degree clockwise;\n" +
            "\n" +
            "while(!divergence)\n" +
            "\tWalk straight;\n" +
            "\n" +
            "turn 90 degree clockwise ;\n" +
            "while(bridge is not found) \n" +
            "           walk forward ;\n" +
            "\n" +
            "turn (left);\n" +
            "i=position of stairs;\n" +
            "for(i=0;i<2;i++);\n" +
            "\tif(i==2)\n" +
            "\t\twalk up;\n" +
            "\telse\n" +
            "\t\twalk straight;\n" +
            "turn right;\n" +
            "take(2-3 steps);\n" +
            "x=sort(F,L,E,T);\n" +
            "turn x;\n" +
            "while(water cooler is not found)\n" +
            "\twalk straight;\n","if(facing water cooler )\n" +
            "\tTake left;\n" +
            "\n" +
            "walkForward();\n" +
            "\n" +
            "int x=5;\n" +
            "if(x=1)\n" +
            "\tGo down and turn 90 degrees clockwise;\n" +
            "else\n" +
            "\tGo up and take left;\n" +
            "\n" +
            "Move ahead and look for 'spic macay' written;\n" +
            "\n" +
            "do {\n" +
            "\tmove ahead and look in all directions for a picture of bridge;\n" +
            "}while(you don't see a picture of a bridge);\n" +
            "if(facing bridge)\n" +
            "\ttake a left;\n" +
            "\n" +
            "if(you see  \"art court\" written around you )\n" +
            "  if(facing the text ART COURT)\n" +
            "     turn left and move ahead until you reach a dead end;\n","if(!Facing counter no. 26)\n" +
            "\tFace counter no. 26;\n" +
            "solve the quadratic equation x^2 - 31x + 84;\n" +
            "goto counter no. R1 //R1 is that root of quadratic which is greater than 17\n" +
            "face the counter;        \n" +
            "turn 90 degrees anticlockwise;\n" +
            "while(wall with notice board is not reached)\n" +
            "\tmove ahead;\n" +
            "if(gate on right)\n" +
            "\tturn 90 degrees anticlockwise;\n" +
            "count=0;\n" +
            "while(count!=3){    \n" +
            "    move ahead;\n" +
            "    if(date tree on right)\n" +
            "       count++;\n" +
            "}\n" +
            "turn 90 degrees anticlockwise;\n" +
            "move ahead until you face a room with a board saying \"Faculty Room\",stand below the board;\n" +
            "turn 90 degrees clockwise;\n" +
            "count=0;\n" +
            "while(count!=12){  \n" +
            "\tmove ahead;\n" +
            "\tif(pillar on right)\n" +
            "\t\tcount++;\n" +
            "}\n" +
            "turn 90 degrees clockwise;\n" +
            "printf(\" are u thirsty??\");\n" +
            "scanf(\"%c\",&n);\t\t//what is your response to that question? yes or no?\n" +
            "if(n==yes)\n" +
            "{\n" +
            "\tgoto water cooler;\n" +
            "\tif(facing water cooler)\n" +
            "\t\tturn 180 degrees;\n" +
            "\tmove 7-8 steps forward;\n" +
            "\tturn 90 degrees anticlockwise;\n" +
            "\tcount=0;\n" +
            "\twhile(count!=3){\n" +
            "\t\tmove ahead;\n" +
            "\t\tif(notice board on left)\n" +
            "\t\tcount++;\n" +
            "\t}\n" +
            "\tmove 10-12 steps forward;\n" +
            "\tturn left;\n" +
            "\twhile(a pillar on left is not found/crossed)\n" +
            "\t\tmove ahead;\n" +
            "\ttake a step down;\n" +
            "\tturn right;\n" +
            "\twhile(first channel gate is not reached)\n" +
            "\t\tmove ahead;\n" +
            "}\n" +
            "else\n" +
            "{\n" +
            "    turn 90 degrees anticlockwise;\n" +
            "\twhile(a notice \"YOURS IS THE ONLY NIT IN THE STATE\" is not reached)\n" +
            "\t\tmove ahead;\n" +
            "\ttake a step down;\n" +
            "\tsearch for electrical wiring on ceiling, follow the wiring;\n" +
            "\tstop when end of wiring is reached;\n" +
            "\tcount=0;\n" +
            "\twhile(count!=8){\n" +
            "\t\tmove ahead;\n" +
            "\t\tif(pillar on right)\n" +
            "\t\t\tcount++;\n" +
            "\t}\n" +
            "\twhile(first channel gate is not reached)\n" +
            "\t\tmove ahead;\n" +
            "}\n","search for the portrait  of a man playing drums.\t\n" +
            "if(facing the wall)\n" +
            "\tturn 180 deg. ; \n" +
            "\n" +
            "take the road to your right and move ahead;\n" +
            "if(corridor is reached)\n" +
            "\t   take right;\n" +
            "\n" +
            "if(an entrance to the main road on left is visible )\n" +
            "\t   take left;\n" +
            "\n" +
            "turn left and reach the main road;\n" +
            "if(electrical pole on right spotted )\n" +
            "{\n" +
            "\tfollow the electrical wiring ;\n" +
            "\tif(a junction of wires is reached)\n" +
            "\t\tfollow the wiring with greater no. of wires;\n" +
            "\tmove ahead and search for giant shades;\n" +
            "}\n" +
            "\n" +
            "if(facing shades)\n" +
            "\tturn right;\n" +
            "\n" +
            "move ahead and take left;\n" +
            "search for black channel gate;\n" +
            "follow the path where you can do a limbo;\n" +
            "goto the place where you can find a real treasure;\n","If( !facing the ATM door)\n" +
            "\tReach next to the ATM door and face it;\n" +
            "If(facing the ATM door)\n" +
            "\tTake a 180 degree turn; \t//no treasure inside the ATM don’t worry;\n" +
            "While(MANIT Map is not spotted)\n" +
            "\tKeep moving forward and look for it in all directions;\n" +
            "Goto the map;\n" +
            "If(A big gate is spotted nearby)\n" +
            "\tEnter into the gate;\n" +
            "While(!near the clock)\n" +
            "\tWalk forward;\n" +
            "Stay near the clock;\n" +
            "\n" +
            "If(A white board with \"Rajbhasha\" written on it is spotted)\n" +
            "{\n" +
            "\tFace opposite to the board;\t//No turning back now\n" +
            "\tEnter the gate which is not in front of you;\n" +
            "}\n" +
            "Int count=0;\n" +
            "While(count!=8)\n" +
            "{\n" +
            "\tKeep walking forward;\n" +
            "\tIf(gate is found on the left)\n" +
            "\t\tcount++;\n" +
            "}\n" +
            "Take 1st right;\n" +
            "Take 1st left;\n" +
            "While(Gate on the road is not found)\n" +
            "\tKeep walking forward;\n" +
            "Goto the gate;\n" +
            "While(crossroad not reached)\n" +
            "\tMove ahead;\n" +
            "look for a blue wall, and go near it; \t\t//preferably a part of a building\n","#include<stdio.h>\n" +
            "void main()\n" +
            "{\n" +
            "char s1[100],s2[100],s3[100],z;\n" +
            "int x,a,b,r,s,c,i;\n" +
            "if(facing Nescafe){\n" +
            "\tsearch(barrier);\n" +
            "\tcross(barrier);\n" +
            "}\n" +
            "take left;\n" +
            "go to parking;\n" +
            "search(iron gate);\n" +
            "count(total no. of triangles that can be found in the iron gate);\n" +
            "printf(“enter through the gate”);\n" +
            "search(an ac in the area);  //successful search will return 1.\n" +
            "if(search==1)\n" +
            "\tprintf(“note  company of the ac found”);\n" +
            "else \n" +
            "\tcontinue search;\n" +
            "x=(age eligible for voting)+1;\n" +
            "search(dustbin with no. 2x);\n" +
            "printf(“take pic of the dustbin”);\n" +
            "if(facing dustbin 2x)\n" +
            "\trotate right && move 2-3 steps forward;\n" +
            "see left && search(a red cylinder/fire extinguisher);\n" +
            "search(a path ‘p1’ that takes you level up); /*HINT:level up step by step*/\n" +
            "follow p1;\n" +
            "if(level increased)\n" +
            "\ttake right;\n" +
            "if (a junction of 4 paths is there)\n" +
            "\ttake right;\n" +
            "\n" +
            "while(path==visible)\n" +
            "{\n" +
            "\tgo straight;\n" +
            "\tprintf(“note down no. of chairs present in this straight path”);\n" +
            "}\n" +
            "turn left;\n" +
            "go straight;\n" +
            "while(going straight){\n" +
            "\tlook down on right side;\n" +
            "\tprintf(“note colors of 2 kind of flowers visible”);\n" +
            "}\n" +
            "s1=first letter of colors in alphabetical order;\n" +
            "keep looking left wall also;\n" +
            "printf(“note the name of lab on 1st blue board and store in s2(eliminating -)”);\n" +
            "s4=Bhawana Shrivastava;\n" +
            "search(s4);\n" +
            "a=room no of text above;\t/* example: if room no is A206, then store 206 in a*/\n" +
            "find(which lab is in room D-207);\n" +
            "s3=common string in 2nd lab’s name of D-207;\n" +
            "search(path ‘p2’ that takes you to below level step by step);\n" +
            "follow p2;\n" +
            "if(level==down)\n" +
            "\tfor(i=65;i<71;i++)\n" +
            "\t{\n" +
            "\t}\n" +
            "while(a){\n" +
            "\tr=a%10;\n" +
            "\ta=a/10;\n" +
            "\ts=s+r;\n" +
            "}\n" +
            "c=s-(strlen(s4)-1)/6);\n" +
            "printf(“your destination is %c0%d”,i,c);\n" +
            "printf(“KRIEGER HAS FOUND OUT ROUTE TO THE NEXT LEVEL”);\n" +
            "}\n",""};
    static int[] output1={1,2,3,4,5,6,7};
    static int[] output2={1,2,3,4,5,6,7};
    static int[] output3={1,2,3,4,5,6,7};
    static int output[];
    static int i=0;
    static int lifes=2;
    int index = 0;
    String initials="00:30";
    static SharedPreferences settings;
    static Bundle b;
    static int set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        settings = getSharedPreferences("prefs",0);
        i = settings.getInt("index1",index);
        lifes = settings.getInt("lifes1",2);
        Intent in=this.getIntent();
        b=in.getExtras();

        if(i!=7 && lifes==0)
        {
            Intent y=new Intent(MainActivity.this,End.class);
            y.putExtras(b);
            startActivity(y);
            this.finish();
        }
        else if(i==7){
            Intent y=new Intent(MainActivity.this,Winner.class);
            b.putString("Time",settings.getString("Time","0"));
            y.putExtras(b);
            startActivity(y);
            this.finish();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        code=(TextView)findViewById(R.id.tv1);
        lifetext=(TextView)findViewById(R.id.lifetext);
        ch = (Chronometer)findViewById(R.id.chronometer);
        bin=(Button)findViewById(R.id.bin);
        bmap=(Button)findViewById(R.id.bmap);
        bin.setOnClickListener(this);
        bmap.setOnClickListener(this);
        lifetext.setText(String.valueOf(lifes));
        sv=(ScrollView)findViewById(R.id.scrollView);

        ch.setText(initials);
        boolean first=settings.getBoolean("firstOpen",true);
        if(first){
            SharedPreferences.Editor edit=settings.edit();
            edit.putBoolean("firstOpen",false);
            edit.putLong("starting",System.currentTimeMillis());
            edit.putInt("set",b.getInt("set"));
            edit.putInt("userId",b.getInt("userId"));
            edit.apply();
        }
        set=settings.getInt("set",1);
        switch(set){
            case 1:
                codes=codes1;
                output=output1;
                break;
            case 2:
                codes=codes2;
                output=output2;
                break;
            case 3:
                codes=codes3;
                output=output3;
                break;

        }
        code.setText(codes[i]);
        long starting = settings.getLong("starting",0);
        long elapsed = System.currentTimeMillis()-starting;
        ch.setBase(SystemClock.elapsedRealtime()-elapsed);
        ch.start();



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent in=new Intent(MainActivity.this,AboutUs.class);
            startActivity(in);
            return true;
        }
        else if(id==R.id.rules){
            Intent in=new Intent(MainActivity.this,Rules.class);
            startActivity(in);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.bin) {
            AlertDialog.Builder dbox = new AlertDialog.Builder(this);
            LayoutInflater inflater = getLayoutInflater();
            View dialogView = inflater.inflate(R.layout.dialog_box,null);
            dbox.setView(dialogView);
            final EditText ed=(EditText)dialogView.findViewById(R.id.inputText);
            dbox.setTitle("Location");
            dbox.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    try {
                        ed.setError("");
                        int input = Integer.parseInt(ed.getText().toString());
                        setCode(input);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "Invalid Entry", Toast.LENGTH_SHORT).show();

                    }

                }
            });
            dbox.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            dbox.show();


        }
        if(view.getId()==R.id.bmap)
        {
           Intent i=new Intent(this,MapActivity.class);
            startActivity(i);
        }
    }

    void setCode(int input)
    {

        if(input==output1[i] && lifes>0 ){
            i++;
            code.setText(codes[i]);
            sv.scrollTo(0,0);
            Toast.makeText(MainActivity.this,"Great Job!! Correct Answer :D",Toast.LENGTH_SHORT).show();
            lifes=2;
        }
        else{

            if(lifes<=1){
                Toast.makeText(this,"Game Over!!", LENGTH_LONG).show();
                Intent y = new Intent(MainActivity.this,End.class);
                startActivity(y);
                finish();
            }
            else
                Toast.makeText(MainActivity.this,"Only 1 try left", LENGTH_LONG).show();
            lifes--;
            if(lifes==0){
                Intent y = new Intent(MainActivity.this,End.class);
                startActivity(y);
                bin.setClickable(false);
                ch.stop();
            }
        }
        if(i==7){
            SharedPreferences.Editor edit=settings.edit();
            if(ch!=null)
            {edit.putString("Time",ch.getText().toString());
            edit.apply();}
            b.putString("Time",settings.getString("Time","0"));
            Intent y=new Intent(MainActivity.this,Winner.class);
            y.putExtras(b);
            startActivity(y);
            finish();

        }
        SharedPreferences settings = getSharedPreferences("prefs",0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("index1",i);
        editor.putInt("lifes1",lifes);
        editor.apply();
        lifetext.setText(String.valueOf(lifes));
    }

}
