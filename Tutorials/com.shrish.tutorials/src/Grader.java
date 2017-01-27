package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Grader {

    static ArrayList<Integer> sample_scores;
    static String grade_arr[];

    public static void main(String[] args) {
        boolean be_generous = true;
        //initialization
        int division_steps = 5;
        int[] gradeSize = new int[5];
        //grade names
        grade_arr = new String[division_steps];
        grade_arr[0] = "A";
        grade_arr[1] = "B";
        grade_arr[2] = "C";
        grade_arr[3] = "D";
        grade_arr[4] = "F";
        //stores the sample scores
        sample_scores = new ArrayList<>();

        HashMap<Integer,String> gradeMap = new HashMap<Integer,String>();

        //add sample scores by code
        int[] scores = { 99, 92, 91, 91, 89, 85, 83, 82, 80, 79, 78, 78, 77, 76, 75, 74, 62, 55, 43, 20};
        for(int value: scores)
        {
            sample_scores.add(value);
        }
        /*or get sample scores from user
        System.out.println("Enter the scores one after the other / enter \"q\" to finish taking inputs: ");
        while(true){
            int score = get_input_score();
            if(score == -1){
                if(sample_scores.size() < 5)
                    System.out.println("Please enter atleast 5 scores.. (" + (5-sample_scores.size()) + " more entry(s) required)");
                else
                    break;
            }else
                sample_scores.add(score);
        }*/

        //sort the array list
        Collections.sort(Grader.sample_scores);
        Collections.reverse(Grader.sample_scores);
        System.out.println("\nSample used to grade (sorted): " + Grader.sample_scores.toString());

        //core logic here
        ArrayList<String> grades = new ArrayList<>();

        //if be_generous = true, then favour more A grade students. else the opposite
        // int average_count_per_grade = be_generous ? sample_scores.size()/division_steps : (sample_scores.size()%division_steps!=0 ? sample_scores.size()/division_steps+1 : sample_scores.size()/division_steps);
        int average_count_per_grade = sample_scores.size() / 5;
        int remaining_scores = sample_scores.size() % 5;
        System.out.println("average number of scores per grade is: "+ average_count_per_grade);
        System.out.println("Remaining Scores to be allocated is: "+ remaining_scores);
        for(int i=0; i< gradeSize.length;i++)
        {
            gradeSize[i]= average_count_per_grade;
        }

        int grade_padding_pointer = 0;
        //for(int i =0 ; i < remaining_scores;i++)
        while(remaining_scores>0)
        {
            gradeSize[grade_padding_pointer] = average_count_per_grade + 1;
            grade_padding_pointer++;
            remaining_scores--;
        }

        System.out.println("Size of each grade");

        for(int i : gradeSize)
        {
            System.out.print(i+" ");
        }

        //CORE LOGIC HERE: ASSIGN GRADES, CHECK IF SCORE ALREADY EXISTS if so ASSIGN SAME GRADE
        int gradeSizePointer = 0;
        int grade_arr_pointer=0;
        int sample_scores_pointer =0;
        while(sample_scores_pointer<sample_scores.size())
        {
            while(gradeSize[gradeSizePointer] > 0)
            {
                gradeMap.put(sample_scores.get(sample_scores_pointer), grade_arr[grade_arr_pointer]);
                gradeSize[gradeSizePointer]--;
                sample_scores_pointer++;
                continue;

            }

            if(gradeSizePointer<5)
            {
                gradeSizePointer++;
            }
            grade_arr_pointer++;


        }

        sample_scores_pointer =0;
        for(int i=0; i<sample_scores.size();i++)
        {
            if(gradeMap.containsKey(sample_scores.get(i)))
            {
                continue;
            }
            else
            {
                grades.add(gradeMap.get(sample_scores.get(i)));
            }
        }

        /*int grade_index = 0;
        int decrementer = average_count_per_grade;

        for(int i = 1; i <= sample_scores.size(); i++){
            if(decrementer == 0){
                //dont exceed the size of array
                grade_index = ((grade_index + 1) >= grade_arr.length) ? grade_index : grade_index + 1;
                //reset decrementer
                decrementer = average_count_per_grade;
            }
            grades.add(grade_arr[grade_index]);

            decrementer--;
        }
        */
        System.out.println("\nScore : Grade"
                + "\n====  ====");
        for(int i = 0; i < sample_scores.size(); i++){
            System.out.println(sample_scores.get(i) + " : " + grades.get(i));
        }
    }

    public static int get_input_score(){

        int input_score = -1;

        //fail-safe code
        while(true){
            try{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String input_string = br.readLine();
                //end input session
                if(input_string.equals("q"))
                    return -1;
                //get the input score from user
                input_score = Integer.parseInt(input_string);
                //only allow possitive scores
                if(input_score > -1)
                    break;

            }catch(NumberFormatException | IOException E){
                //incase you want to debug, uncomment this
                //E.printStackTrace(System.out);
            }

            System.out.println("Please enter a valid score or \"q\" to finish: ");
        }

        return input_score;
    }

}