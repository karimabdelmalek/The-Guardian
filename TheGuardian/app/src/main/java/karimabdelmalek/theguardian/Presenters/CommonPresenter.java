package karimabdelmalek.theguardian.Presenters;

import bolts.Task;
import karimabdelmalek.theguardian.DataClasses.ParentResponse;

/**
 * Created by karimabdelmalek on 9/30/16.
 */

public interface CommonPresenter {
     void retrieveTask (Task<ParentResponse> task, String errorMessage);
     void showNoInternetConnectionMessage(String message);
}
