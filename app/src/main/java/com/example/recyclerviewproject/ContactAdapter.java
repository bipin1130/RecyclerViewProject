package com.example.recyclerviewproject;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactAdapter extends RecyclerView.
        Adapter<ContactAdapter.ContactsViewHolder> {

    Context mContext;
    List<Contact> contactList;

    public ContactAdapter(Context mContext, List<Contact> contactList) {
        this.mContext = mContext;
        this.contactList = contactList;
    }


    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.contact,viewGroup,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int i) {

        Contact contact = contactList.get(i);
        contactsViewHolder.imgCircle.setImageResource(contact.getImageId());
        contactsViewHolder.txtNumber.setText(contact.getNumber());
        contactsViewHolder.txtName.setText(contact.getName());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imgCircle;
        TextView txtName,txtNumber;
        Context context;
        public ContactsViewHolder(@NonNull final View itemView) {
            super(itemView);
            imgCircle = itemView.findViewById(R.id.imgCircle);
            txtName = itemView.findViewById(R.id.txtName);
            txtNumber = itemView.findViewById(R.id.txtNumber);
            imgCircle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(context.getApplicationContext(),DisplayActivity.class);
                    context.startActivity(intent);


                }
            });
        }
    }
}
