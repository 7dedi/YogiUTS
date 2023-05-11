package com.example.yogiuts;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListRumahsakitAdapter extends RecyclerView.Adapter<ListRumahsakitAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Rumahsakit> listRumahsakit;

    public ArrayList<Rumahsakit> getListRumahsakit(){
        return listRumahsakit;
    }

    public void setListRumahsakit (ArrayList<Rumahsakit>listRumahsakit){
        this.listRumahsakit = listRumahsakit;
    }

    public ListRumahsakitAdapter(ArrayList<Rumahsakit>list, Context context){
        this.listRumahsakit = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_rumah,viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  final ListViewHolder holder, int position) {
        Rumahsakit rumahsakit = listRumahsakit.get(position);
        Glide.with(holder.itemView.getContext())
                .load(rumahsakit.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(rumahsakit.getName());

    }

    @Override
    public int getItemCount() {
        return listRumahsakit.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView tvName, tvAddress;

        ListViewHolder(View view) {
            super(view);
            imgPhoto = view.findViewById(R.id.img_item_rumah);
            tvName = view.findViewById(R.id.tv_item_rumah_name);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Rumahsakit rumahsakit = getListRumahsakit().get(position);
            Intent intent = new Intent(context, DetailRumahsakitActivity.class);
            intent.putExtra(DetailRumahsakitActivity.ITEM_EXTRA, rumahsakit);
            context.startActivity(intent);

        }
    }
}
