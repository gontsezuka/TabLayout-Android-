package com.zukalover.tablayoutdesign;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {


    Context context;
    List<Contact> contactList;
    //ON-CLICK
    Dialog myDialog;

    public ContactAdapter(Context context,List<Contact> contactList)
    {
        this.context = context;
        this.contactList = contactList;
    }

    /**
     * IN THE ON-CREATE WE WILL INFLATE THE ITEM VIEW
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_contact,parent,false);
        final MyViewHolder viewHolder = new MyViewHolder(v);

        /**ON-CLICK
         *
         */
        //HERE WE SET THE DIALOG TO THE CUSTOM VIEW CREATED
        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.dialog_custom);


        viewHolder.item_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //ON -CLICK
                TextView txtDlgName= (TextView)myDialog.findViewById(R.id.dialog_name);
                TextView txtDlgNumber =(TextView)myDialog.findViewById(R.id.dialog_number);
                ImageView txtDlgImage = (ImageView)myDialog.findViewById(R.id.dialog_img);
                Button btnDlgCall = myDialog.findViewById(R.id.dialog_btn_call);
                Button btnDlgMessenger = myDialog.findViewById(R.id.dialog_btn_messenger);

                btnDlgMessenger.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context,"SENDING MESSGAE....!",Toast.LENGTH_LONG).show();
                    }
                });

                txtDlgImage.setImageResource(contactList.get(viewHolder.getAdapterPosition()).getPhoto());
                txtDlgName.setText(contactList.get(viewHolder.getAdapterPosition()).getName());
                txtDlgNumber.setText(contactList.get(viewHolder.getAdapterPosition()).getPhone());
                Toast.makeText(context,"Test",Toast.LENGTH_SHORT).show();
                myDialog.show();
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        /**
         * IN THE BIND VIEW HOLDER WE SEND DATA TO THE ITEM VIEW FROM THE DATA
         * PASSED IN RECYCLER-VIEW
         */
        holder.txt_name.setText(contactList.get(position).getName());
        holder.txt_number.setText(contactList.get(position).getPhone());
        holder.img_photo.setImageResource(contactList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        // ON-CLICK
        private LinearLayout item_contact;
        /**
         * THIS ARE LINKS TO THE ITEM_VIEW IN RECYCLER_VIEW
         */
        private TextView txt_name,txt_number;
        private ImageView img_photo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_name= itemView.findViewById(R.id.txt_contact_name);
            txt_number = itemView.findViewById(R.id.txt_phone_number);
            img_photo = itemView.findViewById(R.id.img_image);
            //ON-CLICK
            item_contact = (LinearLayout) itemView.findViewById(R.id.contact_item_id);

        }
    }


}
