package karimabdelmalek.theguardiancallbacks.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import karimabdelmalek.theguardiancallbacks.R;


/**
 * Created by karimabdelmalek on 9/28/16.
 */

public class CommonViewHolder extends RecyclerView.ViewHolder
{
    public static ImageView imageViewThumbnail;
    public static ProgressBar progressBar;
    public static TextView textViewTitle;
    public static TextView textViewDate;

    public CommonViewHolder(View itemView) {
        super(itemView);
        imageViewThumbnail = (ImageView) itemView.findViewById(R.id.imageViewThumbnail);
        progressBar = (ProgressBar) itemView.findViewById(R.id.listProgressBar);
        textViewTitle = (TextView) itemView.findViewById(R.id.textViewTitle);
        textViewDate = (TextView) itemView.findViewById(R.id.textViewDate);

    }
}
