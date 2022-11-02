package com.example.finalyearproject;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CNAdapter extends RecyclerView.Adapter<CNAdapter.ViewHolder> {

    List<String> titles;
    List<Integer> images;
    LayoutInflater inflater;

    public CNAdapter(Context ctx, List<String> titles, List<Integer> images){
        this.titles = titles;
        this.images = images;
        this.inflater = LayoutInflater.from(ctx);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_grid_layout2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(titles.get(position));
        holder.gridIcon.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView gridIcon;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView2);
            gridIcon = itemView.findViewById(R.id.imageView2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //   Toast.makeText(v.getContext(), "Clicked -> " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                    if(getAdapterPosition()==0){
                        Intent intent = new Intent(itemView.getContext(), CN_Activity.class);
                        itemView.getContext().startActivity(intent);
                        Activity activity = (Activity) itemView.getContext();
                        activity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    }
                    else if(getAdapterPosition()==1){
                        Intent intent = new Intent(itemView.getContext(), DBMS_Activity.class);
                        itemView.getContext().startActivity(intent);
                        Activity activity = (Activity) itemView.getContext();
                        activity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    }
                    else if(getAdapterPosition()==2){
                        Intent intent = new Intent(itemView.getContext(), OS_Activity.class);
                        itemView.getContext().startActivity(intent);
                        Activity activity = (Activity) itemView.getContext();
                        activity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    }
                    else if(getAdapterPosition()==3){
                        Intent intent = new Intent(itemView.getContext(), OOPS_Activity.class);
                        itemView.getContext().startActivity(intent);
                        Activity activity = (Activity) itemView.getContext();
                        activity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    }
//                    else if(getAdapterPosition()==4){
//                        Intent intent = new Intent(itemView.getContext(), UiuxActivity.class);
//                        itemView.getContext().startActivity(intent);
//                        Activity activity = (Activity) itemView.getContext();
//                        activity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//                    }
//                    else if(getAdapterPosition()==5){
//                        Intent intent = new Intent(itemView.getContext(), IotActivity.class);
//                        itemView.getContext().startActivity(intent);
//                        Activity activity = (Activity) itemView.getContext();
//                        activity.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//                    }

                }
            });
        }
    }
}