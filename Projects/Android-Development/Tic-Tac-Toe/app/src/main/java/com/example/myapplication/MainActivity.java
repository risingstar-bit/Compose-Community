package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int r=1,y=1;
    ArrayList<Integer>list=new ArrayList<>();
    int arr[][]=new int[3][3];
    boolean won=false;
    public void playAgain(View view){
        Button button=(Button) findViewById(R.id.button);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=0;
            }
        }
        ImageView imageView1=(ImageView) findViewById(R.id.imageView1);
        ImageView imageView2=(ImageView) findViewById(R.id.imageView2);
        ImageView imageView3=(ImageView) findViewById(R.id.imageView3);
        ImageView imageView4=(ImageView) findViewById(R.id.imageView4);
        ImageView imageView5=(ImageView) findViewById(R.id.imageView5);
        ImageView imageView6=(ImageView) findViewById(R.id.imageView6);
        ImageView imageView7=(ImageView) findViewById(R.id.imageView7);
        ImageView imageView8=(ImageView) findViewById(R.id.imageView8);
        ImageView imageView9=(ImageView) findViewById(R.id.imageView9);
        imageView1.setImageResource(android.R.color.transparent);
        imageView2.setImageResource(android.R.color.transparent);
        imageView3.setImageResource(android.R.color.transparent);
        imageView4.setImageResource(android.R.color.transparent);
        imageView5.setImageResource(android.R.color.transparent);
        imageView6.setImageResource(android.R.color.transparent);
        imageView7.setImageResource(android.R.color.transparent);
        imageView8.setImageResource(android.R.color.transparent);
        imageView9.setImageResource(android.R.color.transparent);
        won=false;
        list=new ArrayList<>();
        r=0;y=1;
    }
    public void click(View view){
        ImageView imageView=(ImageView) findViewById(view.getId());
        String uriR = "@drawable/redtoc";
        String uriY = "@drawable/yellowtic";
        if(r==1) {
            if (won)
                return;
            int tag=Integer.parseInt((String) imageView.getTag());
            if(list.contains(tag))
                return;
            list.add(tag);
            if(tag>=0 && tag<=2)
                arr[0][tag]=1;
            if(tag>=3 && tag<=5)
                arr[1][tag-3]=1;
            if(tag>=6 && tag<=8)
                arr[2][tag-6]=1;
            int imageResource = getResources().getIdentifier(uriR, null, getPackageName());
            Drawable res = getResources().getDrawable(imageResource);
            imageView.setImageDrawable(res);
            String wins=whoWonR(tag);
            if(wins.equals("Red Won")) {
                Toast.makeText(this, "Red Won The Match", Toast.LENGTH_SHORT).show();
                won = true;
            }
            if(wins.equals("Match Draws"))
                Toast.makeText(this, "Match Draw", Toast.LENGTH_SHORT).show();
            r=0;y=1;
            return;
        }
        else{
            if(won)
                return;
            int tag=Integer.parseInt((String) imageView.getTag());
            if(list.contains(tag))
                return;
            list.add(tag);
            if(tag>=0 && tag<=2)
                arr[0][tag]=-1;
            if(tag>=3 && tag<=5)
                arr[1][tag-3]=-1;
            if(tag>=6 && tag<=8)
                arr[2][tag-6]=-1;
            int imageResource = getResources().getIdentifier(uriY, null, getPackageName());
            Drawable res = getResources().getDrawable(imageResource);
            imageView.setImageDrawable(res);
            String wins=whoWonY(tag);
            if(wins.equals("Yellow Won")) {
                Toast.makeText(this, "Yellow Won The Match", Toast.LENGTH_SHORT).show();
                won = true;
            }
            if(wins.equals("Match Draws"))
                Toast.makeText(this, "Match Draw", Toast.LENGTH_SHORT).show();
            r=1;y=0;
            return;
        }
        }
        public String whoWonR(int tag){
        int count=0;
            if(arr[0][0]==1 && arr[1][1]==1&&arr[2][2]==1)
                return "Red Won";
            if(arr[0][2]==1 && arr[1][1]==1&&arr[2][0]==1)
                return "Red Won";
                if(tag>=0 && tag<=2){
                    int countR=0;
                    for (int i=0;i<3;i++)
                    {
                        if(arr[0][i]==1)
                            countR++;
                    }
                    if(countR==3)
                        return "Red Won";
                    countR=0;
                    for (int i=0;i<3;i++)
                    {
                        if(arr[i][tag]==1)
                            countR++;
                    }
                    if(countR==3)
                        return "Red Won";
                }
                if(tag>=3 && tag<=5){
                    int countR=0;
                    for (int i=0;i<3;i++)
                    {
                        if(arr[1][i]==1)
                            countR++;
                    }
                    if(countR==3)
                        return "Red Won";
                    countR=0;
                    for (int i=0;i<3;i++)
                    {
                        if(arr[i][tag-3]==1)
                            countR++;
                    }
                    if(countR==3)
                        return "Red Won";
                }
                if(tag>=6 && tag<=8){
                    int countR=0;
                    for (int i=0;i<3;i++)
                    {
                        if(arr[2][i]==1)
                            countR++;
                    }
                    if(countR==3)
                        return "Red Won";
                    countR=0;
                    for (int i=0;i<3;i++)
                    {
                        if(arr[i][tag-6]==1)
                            countR++;
                    }
                    if(countR==3)
                        return "Red Won";
                }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(arr[i][j]!=0)
                        count++;
                }
            }
            if(count==9)
                return "Match Draws";
            return "Invalid";
        }
    public String whoWonY(int tag){
        if(arr[0][0]==-1 && arr[1][1]==-1&&arr[2][2]==-1)
            return "Yellow Won";
        if(arr[0][2]==-1 && arr[1][1]==-1 &&arr[2][0]==-1)
            return "Yellow Won";
        if(tag>=0 && tag<=2){
            int countR=0;
            for (int i=0;i<3;i++)
            {
                if(arr[0][i]==-1)
                    countR++;
            }
            if(countR==3)
                return "Yellow Won";
            countR=0;
            for (int i=0;i<3;i++)
            {
                if(arr[i][tag]==-1)
                    countR++;
            }
            if(countR==3)
                return "Yellow Won";
        }
        if(tag>=3 && tag<=5){
            int countR=0;
            for (int i=0;i<3;i++)
            {
                if(arr[1][i]==-1)
                    countR++;
            }
            if(countR==3)
                return "yellow Won";
            countR=0;
            for (int i=0;i<3;i++)
            {
                if(arr[i][tag-3]==-1)
                    countR++;
            }
            if(countR==3)
                return "Yellow Won";
        }
        if(tag>=6 && tag<=8){
            int countR=0;
            for (int i=0;i<3;i++)
            {
                if(arr[2][i]==-1)
                    countR++;
            }
            if(countR==3)
                return "Yellow Won";
            countR=0;
            for (int i=0;i<3;i++)
            {
                if(arr[i][tag-6]==-1)
                    countR++;
            }
            if(countR==3)
                return "Yellow Won";
        }
        int count=0;
        for(int i=0;i<3;i++){
            if(arr[0][i]!=0)
                count++;
            if(arr[1][i]!=0)
                count++;
            if(arr[2][i]!=0)
                count++;
        }
        if(count==9)
            return "Match Draws";
        return "Invalid";
    }
//    boolean flag=true;
//    boolean redB=true;
//    boolean yellowB=true;
//    int [][]arr=new int[3][3];
//    public void playAgain(View view){
//        Button button=(Button) findViewById(R.id.button);
//        //fade all the images
//        //set all the 2-d array to its original  value
//        //set flag->true, redB=true,yellowB=true
//        fadeAll();
//    }
//    public void fadeAll(){
//        ImageView imageView1=(ImageView) findViewById(R.id.imageView1);
//        ImageView imageView2=(ImageView) findViewById(R.id.imageView2);
//        ImageView imageView3=(ImageView) findViewById(R.id.imageView3);
//        ImageView imageView4=(ImageView) findViewById(R.id.imageView4);
//        ImageView imageView5=(ImageView) findViewById(R.id.imageView5);
//        ImageView imageView6=(ImageView) findViewById(R.id.imageView6);
//        ImageView imageView7=(ImageView) findViewById(R.id.imageView7);
//        ImageView imageView8=(ImageView) findViewById(R.id.imageView8);
//        ImageView imageView9=(ImageView) findViewById(R.id.imageView9);
//        ImageView imageView10=(ImageView) findViewById(R.id.imageView10);
//        ImageView imageView11=(ImageView) findViewById(R.id.imageView11);
//        ImageView imageView12=(ImageView) findViewById(R.id.imageView12);
//        ImageView imageView13=(ImageView) findViewById(R.id.imageView13);
//        ImageView imageView14=(ImageView) findViewById(R.id.imageView14);
//        ImageView imageView15=(ImageView) findViewById(R.id.imageView15);
//        ImageView imageView16=(ImageView) findViewById(R.id.imageView16);
//        ImageView imageView17=(ImageView) findViewById(R.id.imageView17);
//        ImageView imageView18=(ImageView) findViewById(R.id.imageView18);
//        imageView1.animate().alpha(0).setDuration(1000);
//        imageView2.animate().alpha(0).setDuration(1000);
//        imageView3.animate().alpha(0).setDuration(1000);
//        imageView4.animate().alpha(0).setDuration(1000);
//        imageView5.animate().alpha(0).setDuration(1000);
//        imageView6.animate().alpha(0).setDuration(1000);
//        imageView7.animate().alpha(0).setDuration(1000);
//        imageView8.animate().alpha(0).setDuration(1000);
//        imageView9.animate().alpha(0).setDuration(1000);
//        imageView10.animate().alpha(0).setDuration(1000);
//        imageView11.animate().alpha(0).setDuration(1000);
//        imageView12.animate().alpha(0).setDuration(1000);
//        imageView13.animate().alpha(0).setDuration(1000);
//        imageView14.animate().alpha(0).setDuration(1000);
//        imageView15.animate().alpha(0).setDuration(1000);
//        imageView16.animate().alpha(0).setDuration(1000);
//        imageView17.animate().alpha(0).setDuration(1000);
//        imageView18.animate().alpha(0).setDuration(1000);
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                arr[i][j]=0;
//            }
//        }
//        flag=true;
//        redB=true;
//        yellowB=true;
//
//    }
//  public void click1(View view){
//      ImageView imageView1=(ImageView) findViewById(R.id.imageView1);
//      ImageView imageView10=(ImageView) findViewById(R.id.imageView10);
//      if(flag==true){
//          //Red's Chance
//          imageView1.animate().alpha(1).setDuration(1000);//red appears
//          int rc[]=getRC(imageView1);
//          int r=rc[0];int c=rc[1];
//          arr[r][c]=1;
//          //check for wins
//           String ans=wins(arr,r,c,"Red");
//           if(ans.equals("Red wins"))
//           {
//               Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//               return;
//           }
//           flag=false;
//           yellowB=true;
//           redB=false;
//           return;
//      }
//     else if(redB==true){
//          imageView1.animate().alpha(1).setDuration(1000);//red appears
//          int rc[]=getRC(imageView1);
//          int r=rc[0];int c=rc[1];
//          arr[r][c]=1;
//          //check for wins
//          String ans=wins(arr,r,c,"Red");
//          if(ans.equals("Red wins"))
//          {
//              Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//              return;
//          }
//          yellowB=true;
//          redB=false;
//          return;
//      }
//      else {
//          imageView10.animate().alpha(1).setDuration(1000);//yellow appears
//          int rc[]=getRC(imageView10);
//          int r=rc[0];int c=rc[1];
//          arr[r][c]=-1;
//          //check for wins
//          String ans=wins(arr,r,c,"Yellow");
//          if(ans.equals("Yellow wins"))
//          {
//              Toast.makeText(this, "Yellow wins", Toast.LENGTH_SHORT).show();
//              return;
//          }
//          yellowB=false;
//          redB=true;
//      }
//      return;
//  }
//    public void click2(View view){
//        ImageView imageView2=(ImageView) findViewById(R.id.imageView2);
//        ImageView imageView11=(ImageView) findViewById(R.id.imageView11);
//        if(flag==true){
//            //Red's Chance
//            imageView2.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView2);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            flag=false;
//            yellowB=true;
//            redB=false;
//            return;
//        }
//      else if(redB==true){
//            imageView2.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView2);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=true;
//            redB=false;
//            return;
//        }
//        else {
//            imageView11.animate().alpha(1).setDuration(1000);//yellow appears
//            int rc[]=getRC(imageView11);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=-1;
//            //check for wins
//            String ans=wins(arr,r,c,"Yellow");
//            if(ans.equals("Yellow wins"))
//            {
//                Toast.makeText(this, "Yellow wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=false;
//            redB=true;
//        }
//        return;
//    }
//    public void click3(View view){
//        ImageView imageView3=(ImageView) findViewById(R.id.imageView3);
//        ImageView imageView12=(ImageView) findViewById(R.id.imageView12);
//        if(flag==true){
//            //Red's Chance
//            imageView3.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView12);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            flag=false;
//            yellowB=true;
//            redB=false;
//            return;
//        }
//       else if(redB==true){
//            imageView3.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView3);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=true;
//            redB=false;
//            return;
//        }
//        else {
//            imageView12.animate().alpha(1).setDuration(1000);//yellow appears
//            int rc[]=getRC(imageView12);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=-1;
//            //check for wins
//            String ans=wins(arr,r,c,"Yellow");
//            if(ans.equals("Yellow wins"))
//            {
//                Toast.makeText(this, "Yellow wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=false;
//            redB=true;
//        }
//        return;
//    }
//    public void click4(View view){
//        ImageView imageView4=(ImageView) findViewById(R.id.imageView4);
//        ImageView imageView13=(ImageView) findViewById(R.id.imageView13);
//        if(flag==true){
//            //Red's Chance
//            imageView4.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView4);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            flag=false;
//            yellowB=true;
//            redB=false;
//        }
//       else if(redB==true){
//            imageView4.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView4);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=true;
//            redB=false;
//        }
//        else {
//            imageView13.animate().alpha(1).setDuration(1000);//yellow appears
//            int rc[]=getRC(imageView13);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=-1;
//            //check for wins
//            String ans=wins(arr,r,c,"Yellow");
//            if(ans.equals("Yellow wins"))
//            {
//                Toast.makeText(this, "Yellow wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=false;
//            redB=true;
//        }
//    }
//    public void click5(View view){
//        ImageView imageView5=(ImageView) findViewById(R.id.imageView5);
//        ImageView imageView14=(ImageView) findViewById(R.id.imageView14);
//        if(flag==true){
//            //Red's Chance
//            imageView5.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView5);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            flag=false;
//            yellowB=true;
//            redB=false;
//        }
//       else if(redB==true){
//            imageView5.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView5);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=true;
//            redB=false;
//        }
//        else {
//            imageView14.animate().alpha(1).setDuration(1000);//yellow appears
//            int rc[]=getRC(imageView14);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=-1;
//            //check for wins
//            String ans=wins(arr,r,c,"Yellow");
//            if(ans.equals("Yellow wins"))
//            {
//                Toast.makeText(this, "Yellow wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=false;
//            redB=true;
//        }
//    }
//    public void click6(View view){
//        ImageView imageView6=(ImageView) findViewById(R.id.imageView6);
//        ImageView imageView15=(ImageView) findViewById(R.id.imageView15);
//        if(flag==true){
//            //Red's Chance
//            imageView6.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView6);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            flag=false;
//            yellowB=true;
//            redB=false;
//        }
//       else if(redB==true){
//            imageView6.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView6);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=true;
//            redB=false;
//        }
//        else {
//            imageView15.animate().alpha(1).setDuration(1000);//yellow appears
//            int rc[]=getRC(imageView15);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=-1;
//            //check for wins
//            String ans=wins(arr,r,c,"Yellow");
//            if(ans.equals("Yellow wins"))
//            {
//                Toast.makeText(this, "Yellow wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=false;
//            redB=true;
//        }
//    }
//    public void click7(View view){
//        ImageView imageView7=(ImageView) findViewById(R.id.imageView7);
//        ImageView imageView16=(ImageView) findViewById(R.id.imageView16);
//        if(flag==true){
//            //Red's Chance
//            imageView7.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView7);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            flag=false;
//            yellowB=true;
//            redB=false;
//        }
//       else if(redB==true){
//            imageView7.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView7);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=true;
//            redB=false;
//        }
//        else {
//            imageView16.animate().alpha(1).setDuration(1000);//yellow appears
//            int rc[]=getRC(imageView16);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=-1;
//            //check for wins
//            String ans=wins(arr,r,c,"Yellow");
//            if(ans.equals("Yellow wins"))
//            {
//                Toast.makeText(this, "Yellow wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=false;
//            redB=true;
//        }
//    }
//    public void click8(View view){
//        ImageView imageView8=(ImageView) findViewById(R.id.imageView8);
//        ImageView imageView17=(ImageView) findViewById(R.id.imageView17);
//        if(flag==true){
//            //Red's Chance
//            imageView8.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView8);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            flag=false;
//            yellowB=true;
//            redB=false;
//        }
//       else if(redB==true){
//            imageView8.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView8);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=true;
//            redB=false;
//        }
//        else {
//            imageView17.animate().alpha(1).setDuration(1000);//yellow appears
//            int rc[]=getRC(imageView17);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=-1;
//            //check for wins
//            String ans=wins(arr,r,c,"Yellow");
//            if(ans.equals("Yellow wins"))
//            {
//                Toast.makeText(this, "Yellow wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=false;
//            redB=true;
//        }
//    }
//    public void click9(View view){
//        ImageView imageView9=(ImageView) findViewById(R.id.imageView9);
//        ImageView imageView18=(ImageView) findViewById(R.id.imageView18);
//        if(flag==true){
//            //Red's Chance
//            imageView9.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView9);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            flag=false;
//            yellowB=true;
//            redB=false;
//        }
//       else if(redB==true){
//            imageView9.animate().alpha(1).setDuration(1000);//red appears
//            int rc[]=getRC(imageView9);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=1;
//            //check for wins
//            String ans=wins(arr,r,c,"Red");
//            if(ans.equals("Red wins"))
//            {
//                Toast.makeText(this, "Red wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=true;
//            redB=false;
//        }
//        else {
//            imageView18.animate().alpha(1).setDuration(1000);//yellow appears
//            int rc[]=getRC(imageView18);
//            int r=rc[0];int c=rc[1];
//            arr[r][c]=-1;
//            //check for wins
//            String ans=wins(arr,r,c,"Yellow");
//            if(ans.equals("Yellow wins"))
//            {
//                Toast.makeText(this, "Yellow wins", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            yellowB=false;
//            redB=true;
//        }
//    }
//   public String wins(int arr[][], int r, int c, String wins){
//        int count=0;
//        if(wins.equals("Red")){
//            for (int j=0;j<3;j++){
//                if(arr[r][j]==1)
//                    count++;
//            }
//            if(count==3)
//            {
//                return "Red wins";
//            }
//            if(wins.equals("Red")){
//                count=0;
//                for (int j=0;j<3;j++){
//                    if(arr[j][c]==1)
//                        count++;
//                }
//                if(count==3) {
//                    return "Red wins";
//                }
//            }
//           if(arr[0][0]==1 && arr[1][1]==1 && arr[2][2]==1)
//                   return "Red wins";
//           if(arr[0][2]==1 && arr[1][1]==1 && arr[2][0]==1)
//                    return "Red wins";
//            }
//        if(wins.equals("Yellow")) {
//            for (int j=0;j<3;j++){
//                if(arr[r][j]==-1)
//                    count++;
//            }
//            if(count==3)
//            {
//                return "Yellow wins";
//            }
//             if(wins.equals("Yellow")){
//                count=0;
//                for (int j=0;j<3;j++){
//                    if(arr[j][c]==-1)
//                        count++;
//                }
//                if(count==3) {
//                    return "Yellow wins";
//                }
//            }
//            if(arr[0][0]==-1 && arr[1][1]==-1 && arr[2][2]==-1)
//                return "Yellow wins";
//            if(arr[0][2]==-1 && arr[1][1]==-1 && arr[2][0]==-1)
//                return "Yellow wins";
//        }
//        return "Invalid";
//    }
//   public int[] getRC(ImageView imageView){
//         if(imageView.getId()==R.id.imageView1)
//           return new int[]{0,0};
//       else if(imageView.getId()==R.id.imageView2)
//           return new int[]{0,1};
//       else if(imageView.getId()==R.id.imageView3)
//           return new int[]{0,2};
//         else if(imageView.getId()==R.id.imageView4)
//             return new int[]{1,0};
//         else if(imageView.getId()==R.id.imageView5)
//             return new int[]{1,1};
//      else if(imageView.getId()==R.id.imageView6)
//           return new int[]{1,2};
//       else if(imageView.getId()==R.id.imageView7)
//           return new int[]{2,0};
//       else if(imageView.getId()==R.id.imageView8)
//           return new int[]{2,1};
//       else if(imageView.getId()==R.id.imageView9)
//           return new int[]{2,2};
//       else if(imageView.getId()==R.id.imageView10)
//           return new int[]{0,0};
//       else if(imageView.getId()==R.id.imageView11)
//           return new int[]{0,1};
//       else if(imageView.getId()==R.id.imageView12)
//           return new int[]{0,2};
//       else if(imageView.getId()==R.id.imageView13)
//           return new int[]{1,0};
//       else if(imageView.getId()==R.id.imageView14)
//           return new int[]{1,1};
//       else if(imageView.getId()==R.id.imageView15)
//           return new int[]{1,2};
//       else if(imageView.getId()==R.id.imageView16)
//           return new int[]{2,0};
//       else if(imageView.getId()==R.id.imageView17)
//           return new int[]{2,1};
//       else
//           return new int[]{2,2};
//   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}