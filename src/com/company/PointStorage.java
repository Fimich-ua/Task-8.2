package com.company;

import java.util.Arrays;

public class PointStorage {

   private PointStorage[] pointStorages = new PointStorage[0];

   public PointStorage(Point p) {
   }

   public PointStorage() {

   }

//   public int size(){
//      return pointStorages.length;
//   }

//   public Point get(int index){
//      return pointStorages[index];
//   }

   public void add (PointStorage p){
      pointStorages = Arrays.copyOf(pointStorages,pointStorages.length+1);
      pointStorages[pointStorages.length-1] = p;
   }







}
