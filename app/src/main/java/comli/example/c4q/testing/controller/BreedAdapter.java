package comli.example.c4q.testing.controller;

/**
 * Created by c4q on 2/25/18.
 */

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import comli.example.c4q.testing.PhotoActivity;
import comli.example.c4q.testing.R;

public class BreedAdapter extends RecyclerView.Adapter<BreedAdapter.ViewHolder> {

    ArrayList<String> breedImgUrl;

    public BreedAdapter() {
        this.breedImgUrl = new ArrayList<>();
    }

    public void setBreedImgUrl(ArrayList<String> breedImgUrl) {
        this.breedImgUrl = breedImgUrl;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Picasso.with(holder.itemView.getContext()).load(breedImgUrl.get(position)).into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),PhotoActivity.class);
                intent.putExtra("breedName", breedImgUrl.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return breedImgUrl.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.breed_images);
        }
    }
}
