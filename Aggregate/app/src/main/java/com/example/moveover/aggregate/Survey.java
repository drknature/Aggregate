package com.example.moveover.aggregate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Richard Dong on 9/24/2016.
 */

public class Survey {

    private String code;
    private String date;

    private int stress;
    private int anxiety;
    private int worried_future;
    private int depressed;
    ///private int overworked;
        private int hours_work;
    //private int tired;
        private int hours_sleep;
        private int asleep_class;
        private int all_nighters;
    //private int exercise;
        private int hours_exercise;
        private int intensity_exercise;
    //private int nutrition;
        private int nutrition_consistent;
    //private int weight_gain;
        private int gain_increase;
    //private int weight_loss;
        private int loss_decrease;
    //private int relationship_issues;
        private int relationship_stability;
    private int hanging_time;
    private int hobbies_time;
    private int class_interest;
    private int learning_importance;
    //private int learning_struggle;
        private int class_difficulty;
        private int class_speed;
    private int hours_per_week;

    public Survey() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
        date = sdf.format(new Date());
    }
        public void setCode(String x) {
            code = x;
        }
        public void set_stress(int x) {
            stress = x;
        }
        public void set_anxiety(int x) {
            anxiety = x;
        }
        public void set_worried_future(int x){
            worried_future = x;
        }
        public void set_depressed(int x){
            depressed = x;
        }
      /*  public void set_overworked(int x){
            overworked = x;
        } */
        public void set_hours_work(int x){
            hours_work= x;
        }
       /* public void set_tired(int x){
            tired = x;
        }*/
        public void set_hours_sleep(int x){
            hours_sleep = x;
        }
        public void set_asleep_class(int x){
            asleep_class = x;
        }
        public void set_all_nighters(int x){
            all_nighters = x;
        }

        /*public void set_exercise(int x) {
            exercise = x;
        }*/
        public void set_hours_exercise(int x) {
            hours_exercise = x;
        }
        public void set_intensity_exercise(int x){
            intensity_exercise = x;
        }
        /*public void set_nutrition(int x){
            nutrition = x;
        }*/
        public void set_nutrition_consistent(int x){
            nutrition_consistent= x;
        }
        /*public void set_weight_gain(int x){
            weight_gain = x;
        }*/
        public void set_gain_increase(int x){
            gain_increase = x;
        }
        /*public void set_weight_loss(int x){
            weight_loss = x;
        }*/
        public void set_loss_decrease(int x){
            loss_decrease = x;
        }
        /*public void set_relationship_issues(int x) {
            relationship_issues= x;
        }*/
        public void set_relationship_stability(int x){
            relationship_stability= x;
        }
        public void set_hanging_time(int x){
            hanging_time= x;
        }
        public void set_hobbies_time(int x){
            hobbies_time= x;
        }
        public void set_class_interest(int x){
            class_interest = x;
        }
        public void set_learning_importance(int x){
            learning_importance = x;
        }
        /*public void set_learning_struggle(int x){
            learning_struggle= x;
        }*/
        public void set_class_difficulty(int x){
            class_difficulty = x;
        }
        public void set_class_speed(int x){
            class_speed = x;
        }
        public void set_hours_per_week(int x){
            hours_per_week = x;
        }


        public String getCode() {
            return code;
        }
        public String getDate() {
            return date;
        }
        public int get_stress() {
            return stress;
        }
        public int get_anxiety(){
            return anxiety;
        }
        public int get_worried_future(){
            return worried_future;
        }
        public int get_depressed(){
            return depressed;
        }
     /*   public int get_overworked(){
            return overworked;
        }*/
        public int get_hours_work(){
            return hours_work;
        }
        /*public int get_tired(){
            return tired;
        }*/
        public int get_hours_sleep(){
            return hours_sleep;
        }
        public int get_asleep_class(){
            return asleep_class;
        }
        public int get_all_nighters(){
            return all_nighters;
        }
        /*public int get_exercise() {
            return exercise;
        }*/
        public int get_hours_exercise(){
            return hours_exercise;
        }
        public int get_intensity_exercise(){
            return intensity_exercise;
        }
        /*public int get_nutrition(){
            return nutrition;
        }*/
        public int get_nutrition_consistent(){
            return nutrition_consistent;
        }
        /*public int get_weight_gain(){
            return weight_gain;
        }*/
        public int get_gain_increase(){
            return gain_increase;
        }
        /*public int get_weight_loss(){
            return weight_loss;
        }*/
        public int get_loss_decrease(){
            return loss_decrease;
        }
        /*public int get_relationship_issues(){
            return relationship_issues;
        }*/
        public int get_relationship_stability(){
            return relationship_stability;
        }
        public int get_hanging_time(){
            return hanging_time;
        }
        public int get_hobbies_time(){
            return hobbies_time;
        }
        public int get_class_interest(){
            return class_interest;
        }
        public int get_learning_importance(){
            return learning_importance;
        }
        /*public int get_learning_struggle(){
            return learning_struggle;
        }*/
        public int get_class_difficulty(){
            return class_difficulty;
        }
        public int get_class_speed(){
            return class_speed;
        }
        public int get_hours_per_week(){
            return hours_per_week;
        }


    }


