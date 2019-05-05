package com.example.admin.demomyvietnam.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.admin.demomyvietnam.R;
import com.example.admin.demomyvietnam.entity.dacsan;
import com.example.admin.demomyvietnam.entity.noitro;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class NoitroAdapter extends RecyclerView.Adapter<NoitroAdapter.holder> {
    private Context context;
    private List<noitro> trolist;

    public NoitroAdapter(Context context, List<noitro> trolist) {
        this.context = context;
        this.trolist = trolist;
    }

    @NonNull
    @Override
    public NoitroAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.row_item_noitro,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoitroAdapter.holder holder, int position) {
        noitro ds=trolist.get(position);
        holder.ten.setText(ds.getTentro());
        holder.gia.setText(ds.getGiatro());
        holder.diachi.setText(ds.getDiachi());
    }

    @Override
    public int getItemCount() {
        if(trolist!=null){
        return trolist.size();
        }
        return 0;
    }
    public class holder extends RecyclerView.ViewHolder{
        private CircleImageView hinh;
        private TextView ten;
        private TextView gia;
        private TextView diachi;

        public holder(View itemView) {
            super(itemView);
            hinh=itemView.findViewById(R.id.noitro_hinh);
            ten=itemView.findViewById(R.id.noitro_ten_title);
            gia=itemView.findViewById(R.id.noitro_gia_subtitle);
            diachi=itemView.findViewById(R.id.noitro_diachi_subtitle);
        }
    }
}
