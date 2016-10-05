package karimabdelmalek.theguardiancallbacks.Presenters;

import java.util.ArrayList;

import karimabdelmalek.theguardiancallbacks.DataClasses.ResultItem;

/**
 * Created by karimabdelmalek on 9/30/16.
 */

public interface CommonView
{
    void showProgressBar();
    void hideProgressBar();
    void showErrorMessage(String message);
    void setAdapterToRecyclerView(ArrayList<ResultItem> results);
}
