package karimabdelmalek.theguardiancallbacks.Presenters;

import karimabdelmalek.theguardiancallbacks.DataClasses.ParentResponse;

/**
 * Created by karimabdelmalek on 9/30/16.
 */

public class CommonPresenterImplementation implements CommonPresenter
{
    CommonView commonView;

    public CommonPresenterImplementation (CommonView commonView)
    {
        this.commonView = commonView;
        commonView.showProgressBar();

    }
    @Override
    public void retrieveResponse (ParentResponse response,String errorMessage) {
        commonView.hideProgressBar();
            if (response == null) // there was an error returned by the API
            {
                commonView.showErrorMessage(errorMessage);
            }
        else
            {
                commonView.setAdapterToRecyclerView(response.response.results);
            }
    }

    @Override
    public void showNoInternetConnectionMessage(String message) {
        commonView.hideProgressBar();
        commonView.showErrorMessage(message);
    }
}
