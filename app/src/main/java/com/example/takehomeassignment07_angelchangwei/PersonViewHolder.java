package com.example.takehomeassignment07_angelchangwei;

import android.content.Context;
import android.hardware.camera2.TotalCaptureResult;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class PersonViewHolder {
    public CardView cardView;
    public TextView personName;
    public TextView personInfo;
    public ImageView personPhoto;

    public PersonViewHolder(View itemView, final Context context){
        super(itemView);
        cardView=(CardView) itemView.findViewById(R.id.card_view);
        personName=(TextView) itemView.findViewById(R.id.person_name) ;
        personInfo=(TextView) itemView.findViewById(R.id.person_info);
        personPhoto=(ImageView) itemView.findViewById(R.id.person_photo);

        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(context,personName.getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
