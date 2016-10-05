package karimabdelmalek.theguardiancallbacks.Presenters;

import karimabdelmalek.theguardiancallbacks.DataClasses.ParentResponse;

/**
 * Created by karimabdelmalek on 9/30/16.
 */

public interface CommonPresenter {
     void retrieveResponse (ParentResponse response,String errorMessage);

     void showNoInternetConnectionMessage(String message);
}
