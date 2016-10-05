package karimabdelmalek.theguardian.Presenters;

import bolts.Continuation;
import bolts.Task;
import karimabdelmalek.theguardian.DataClasses.ParentResponse;

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
    public void retrieveTask (Task<ParentResponse> task, String errorMessage) {
        if (task != null)
        {
            commonView.hideProgressBar();
            task.continueWith(new Continuation<ParentResponse, Void>() {
                @Override
                public Void then(Task<ParentResponse> task) throws Exception {
                    commonView.setAdapterToRecyclerView(task.getResult().response.results);
                    return null;
                }
            },Task.UI_THREAD_EXECUTOR);
        }
        else
        {
            commonView.hideProgressBar();
            commonView.showErrorMessage(errorMessage);
        }
    }

    @Override
    public void showNoInternetConnectionMessage(String message) {
        commonView.hideProgressBar();
        commonView.showErrorMessage(message);
    }
}
