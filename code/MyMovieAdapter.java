package com.example.medicalstore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyMovieAdapter  extends RecyclerView.Adapter<MyMovieAdapter.ViewHolder>{
   MyMovieData[] myMovieData;
   Context context;


   // view code of how many activity view of list of items like as:-
   


   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity2 activity2) {
      this.myMovieData = myMovieData;
      this.context = activity2;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity26 activity26) {
      this.myMovieData = myMovieData;
      this.context = activity26;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity27 activity27) {
      this.myMovieData = myMovieData;
      this.context = activity27;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity28 activity28) {
      this.myMovieData = myMovieData;
      this.context = activity28;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity29 activity29) {
      this.myMovieData = myMovieData;
      this.context = activity29;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity30 activity30) {
      this.myMovieData = myMovieData;
      this.context = activity30;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity31 activity31) {
      this.myMovieData = myMovieData;
      this.context = activity31;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity32 activity32) {
      this.myMovieData = myMovieData;
      this.context = activity32;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity33 activity33) {
      this.myMovieData = myMovieData;
      this.context = activity33;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity34 activity34) {
      this.myMovieData = myMovieData;
      this.context = activity34;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity35 activity35) {
      this.myMovieData = myMovieData;
      this.context = activity35;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity36 activity36) {
      this.myMovieData = myMovieData;
      this.context = activity36;
   }

   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity37 activity37) {
      this.myMovieData = myMovieData;
      this.context = activity37;
   }

   public MyMovieAdapter(MyMovieData[] myMovieData,MainActivity25 activity25) {
      this.myMovieData = myMovieData;
      this.context = activity25;
   }

   public MyMovieAdapter(MyMovieData[] myMovieData,ten_percent ten_percent) {
      this.myMovieData = myMovieData;
      this.context = ten_percent;
   }
   public MyMovieAdapter(MyMovieData[] myMovieData,twenty_percent twenty_percent) {
      this.myMovieData = myMovieData;
      this.context = twenty_percent;
   }




   @NonNull
   @Override
   public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
      View view = layoutInflater.inflate(R.layout.movie_item_list,parent,false);
      ViewHolder viewHolder = new ViewHolder(view);
      return viewHolder;
   }

   @Override
   public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      final MyMovieData myMovieDataList = myMovieData[position];
      holder.textViewName.setText(myMovieDataList.getMovieName());
      holder.textViewDate.setText(myMovieDataList.getMovieData());
      holder.movieImage.setImageResource(myMovieDataList.getMovieImage());

      holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Toast.makeText(context, myMovieDataList.getMovieName(),Toast.LENGTH_SHORT).show();
         }
      });

   }

   @Override
   public int getItemCount() {
      return myMovieData.length;
   }

   public class ViewHolder extends RecyclerView.ViewHolder{
      ImageView movieImage;
      TextView textViewName;
      TextView textViewDate;



      public ViewHolder(@NonNull View itemView) {
         super(itemView);

         movieImage = itemView.findViewById(R.id.ImageView);
         textViewName = itemView.findViewById(R.id.textName);
         textViewDate = itemView.findViewById(R.id.textdate);
      }
   }
}
