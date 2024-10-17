package com.example.prac_03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {
    private List<Country> countries;
    private Context context;

    public CountryAdapter(List<Country> countries, Context context) {
        this.countries = countries;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Country country = countries.get(position);
        holder.textViewCountry.setText(country.getName());
        holder.textViewPopulation.setText("Population: " + country.getPopulation());
        holder.itemView.setOnClickListener(v -> {
            // Xử lý sự kiện nhấn vào quốc gia
            // Có thể mở một Activity mới với thông tin chi tiết
        });
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewCountry;
        TextView textViewPopulation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewCountry = itemView.findViewById(R.id.textViewCountry);
            textViewPopulation = itemView.findViewById(R.id.textViewPopulation);
        }
    }
}
