package com.anubhi.ck1;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    static Button bin,bmap;
    static TextView code,lifetext;
    static Chronometer ch;
    static String[] codes={"If(! Facing  MANIT’s SBI)\n" +
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
            "\n","If( !facing the ATM door)\n" +
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
            " stop;\n","Congratulations\n\n\n\n\n\n\n\n\n\n"};
    static int[] output1={1,2,3,4,5,6,7};
    static int i=0;
    static int input,lifes=2;
    int index = 0;
    static final long startstate=SystemClock.elapsedRealtime();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SharedPreferences settings = getSharedPreferences("prefs",0);
        i = settings.getInt("index1",index);
        lifes = settings.getInt("lifes1",2);
        //long timer=settings.getLong("timer",0);

        //ch.setBase(settings.getLong("Timer",0));
        //chstring = settings.getLong("Timer",);
        //ch.setBase(chstring);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tContentView(R.layout.fragment_mapfragment);
        code=(TextView)findViewById(R.id.tv1);
        lifetext=(TextView)findViewById(R.id.lifetext);
        ch = (Chronometer)findViewById(R.id.chronometer);
        bin=(Button)findViewById(R.id.bin);
        bmap=(Button)findViewById(R.id.bmap);
        bin.setOnClickListener(this);
        bmap.setOnClickListener(this);
        lifetext.setText(String.valueOf(lifes));
        code.setText(codes[i]);

        ch.setBase(settings.getLong("timer",0));
        ch.start();




    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.bin)
        {
            final EditText ed;
            final AlertDialog.Builder dbox= new AlertDialog.Builder(this);
            dbox.setTitle("Location");
            dbox.setMessage("Enter the location code according to map: ");
            LinearLayout layout = new LinearLayout(this);
            layout.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(400,30,400, 50);
            ed=new EditText(MainActivity.this);
            ed.setInputType(InputType.TYPE_CLASS_NUMBER);
            ed.setFilters(new InputFilter[] {new InputFilter.LengthFilter(2)});

            layout.addView(ed, params);
            dbox.setView(layout);
            dbox.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    try{
                        ed.setError("");
                        input=Integer.parseInt(ed.getText().toString());
                        setCode();
                    }
                    catch(Exception e)
                    {
                        Toast.makeText(MainActivity.this,"Invalid Entry",Toast.LENGTH_SHORT).show();

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
        //Fragment fragment = null;
        if(view.getId()==R.id.bmap)
        {
           Intent i=new Intent(this,MapActivity.class);
            startActivity(i);
        }
    }



    /*class MyListener implements DialogInterface.OnClickListener {

        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            if(i==-1)
            {
                Toast.makeText(MainActivity.this,"Ok pressed",Toast.LENGTH_LONG).show();
            }
        }
    }*/
    void setCode()
    {

        if(input==output1[i] && lifes>0 ){
            i++;
            code.setText(codes[i]);
            Toast.makeText(MainActivity.this,"Great Job!! Correct Answer :D",Toast.LENGTH_SHORT).show();
            lifes=2;
        }
        else{

            if(lifes<=1)
                Toast.makeText(this,"Game Over!!", LENGTH_LONG).show();
            else
                Toast.makeText(MainActivity.this,"Only 1 try left", LENGTH_LONG).show();
            lifes--;
            if(lifes==0){
                bin.setClickable(false);
                ch.stop();
            }
        }
        if(i==7){
            bin.setVisibility(Button.INVISIBLE);
            bmap.setVisibility(Button.INVISIBLE);
            code.setText(codes[i]);
            code.setTypeface(null, Typeface.BOLD_ITALIC);
            code.setTextSize(getResources().getDimension(R.dimen.size));
            ch.stop();
        }

        SharedPreferences settings = getSharedPreferences("prefs",0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt("index1",i);
        editor.putInt("lifes1",lifes);
        //long chronostore=ch.getBase();
        editor.putLong("timer",(SystemClock.elapsedRealtime()-startstate));
        //chstring = ch.getBase();
        //editor.putLong("Timer",chstring);
        editor.commit();
        lifetext.setText(String.valueOf(lifes));
    }

}
