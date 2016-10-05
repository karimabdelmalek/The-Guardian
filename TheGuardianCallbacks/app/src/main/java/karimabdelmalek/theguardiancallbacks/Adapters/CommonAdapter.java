package karimabdelmalek.theguardiancallbacks.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import karimabdelmalek.theguardiancallbacks.Activities.ActivityDetails;
import karimabdelmalek.theguardiancallbacks.DataClasses.ResultItem;
import karimabdelmalek.theguardiancallbacks.Helpers.Utilities;
import karimabdelmalek.theguardiancallbacks.Presenters.ListPresenterImplementation;
import karimabdelmalek.theguardiancallbacks.Presenters.ListView;
import karimabdelmalek.theguardiancallbacks.R;
import karimabdelmalek.theguardiancallbacks.ViewHolders.CommonViewHolder;

/**
 * Created by karimabdelmalek on 9/28/16.
 */

public class CommonAdapter extends RecyclerView.Adapter <CommonViewHolder> implements ListView
{
    Context context;
    ArrayList <ResultItem> items;
    ListPresenterImplementation listPresenter;
    public CommonAdapter (Context context,ArrayList<ResultItem>items)
    {
        this.context = context;
        this.items = items;
        listPresenter = new ListPresenterImplementation(this);
    }

    @Override
    public CommonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent,false);
        return new CommonViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(final CommonViewHolder holder, int position) {
        final ResultItem currentItem = items.get(position);
        holder.textViewTitle.setText(currentItem.fields.headline);
        holder.textViewDate.setText(Utilities.formatDate(currentItem.webPublicationDate));
        Picasso.with(context).load(currentItem.fields.thumbnail).fit().centerCrop().into(holder.imageViewThumbnail, new Callback() {
            @Override
            public void onSuccess() {

                holder.progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onError() {
                holder.progressBar.setVisibility(View.GONE);

            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listPresenter.goToDetailsPage(currentItem.webUrl,currentItem.webTitle);
            }
        });

    }

    @Override
    public int getItemCount() {

        return items.size();
    }

    @Override
    public void goToDetailsPage(String url, String title) {
        Intent detailsIntent = new Intent(context, ActivityDetails.class);
        detailsIntent.putExtra("Url",url);
        detailsIntent.putExtra("Title",title);
        context.startActivity(detailsIntent);
    }


}
