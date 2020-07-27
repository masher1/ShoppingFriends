package com.example.groceryshare;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Shopping_trips_available_adapter extends RecyclerView.Adapter<Shopping_trips_available_adapter.MyViewHolder> {

//    ArrayList<String> data1 = new ArrayList<String>();
//    ArrayList<String> data2 = new ArrayList<String>();
//    ArrayList<String> data3 = new ArrayList<String>();
//    ArrayList<String> orderID = new ArrayList<String>();
//    String userID;
    Context context;


    //newCode started

    List orders;

    public Shopping_trips_available_adapter(List orders) {
        this.orders = orders;
    }
    //newCode ended

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.shopping_trips_available_row, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        orderData data = (orderData) orders.get(position);

        holder.fullName_text.setText(data.buyerID);
        holder.storeName_text.setText(data.storeName);
        holder.howFar_text.setText(data.distance);
    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        //find the content here
        TextView fullName_text, storeName_text, howFar_text;
        Button button;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            fullName_text = itemView.findViewById(R.id.fullName_text);
            storeName_text = itemView.findViewById(R.id.storeName_text);
            howFar_text = itemView.findViewById(R.id.howFar_text);
            button = itemView.findViewById(R.id.pickOrder);
        }
    }
}

//    public Shopping_trips_available_adapter(Context ct, ArrayList<String> s1, ArrayList<String> s2, ArrayList<String> s3, ArrayList<String> s4, String id){
//        context = ct;
//        data1= s1;
//        data2 = s2;
//        data3 = s3;
//        orderID = s4;
//        userID = id;
//    }
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
//        holder.fullName_text.setText(data1.get(position));
//        holder.storeName_text.setText(data2.get(position));
//        holder.howFar_text.setText(data3.get(position));
//        holder.button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                System.out.println("Here");
//                ((ShoppingTripsAvailable)context).addShopper(orderID.get(position));
//                data1.remove(position);
//                data2.remove(position);
//                data3.remove(position);
//                orderID.remove(position);
//                notifyItemRemoved(position);
//                notifyItemRangeChanged(position, data1.size());
//            }
//        });
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return data1.size();
//    }
//    public void addOrder(String s1, String s2, String s3, String s4) {
//        data1.add(s1);
//        data2.add(s2);
//        data3.add(s3);
//        orderID.add(s4);
//        //notifyDataSetChanged();
//        notifyItemInserted(data1.size()-1);
//    }

