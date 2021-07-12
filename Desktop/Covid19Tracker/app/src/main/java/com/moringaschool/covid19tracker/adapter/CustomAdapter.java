//package com.moringaschool.covid19tracker.adapter;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.moringaschool.covid19tracker.model.Countrymodel;
//import com.moringaschool.covid19tracker.R;
//

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<Countrymodel> dataList;
    private Context context;

    public CustomAdapter(Context context,List<Countrymodel> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView txtTitle, txtFlag,txtCountry,txtTodaycases,txtDeath,txtRecoverd,txtActive, txtCritical;


        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            txtTitle = mView.findViewById(R.id.title);
            txtFlag = mView.findViewById(R.id.flag);
            txtCountry = mView.findViewById(R.id.country);
            txtTodaycases = mView.findViewById(R.id.todayCases);
            txtDeath = mView.findViewById(R.id.death);
            txtRecoverd = mView.findViewById(R.id.recoverd);
            txtActive = mView.findViewById(R.id.active);
            txtCritical = mView.findViewById(R.id.critical);


        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);
        return new CustomViewHolder(view);
    }

//    @Override
//    public void onBindViewHolder(CustomViewHolder holder, int position) {
//        holder.txtFlag.setText(dataList.get(position).getFlag());
//        holder.txtCountry.setText(dataList.get(position).getCountry());
//        holder.txtTodaycases.setText(dataList.get(position).getTodayCases());
//        holder.txtDeath.setText(dataList.get(position).getDeaths());
//        holder.txtRecoverd.setText(dataList.get(position).getRecovered());
//        holder.txtActive.setText(dataList.get(position).getActive());
//        holder.txtCritical.setText(dataList.get(position).getCritical());
//
//       /* Picasso.Builder builder = new Picasso.Builder(context);
//        builder.downloader(new OkHttp3Downloader(context));
//        builder.build().load(dataList.get(position).getThumbnailUrl())
//
//                .into(holder.coverImage);*/
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return dataList.size();
//    }
//}
