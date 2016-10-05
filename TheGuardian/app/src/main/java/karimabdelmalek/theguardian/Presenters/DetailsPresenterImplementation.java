package karimabdelmalek.theguardian.Presenters;

/**
 * Created by karimabdelmalek on 10/2/16.
 */

public class DetailsPresenterImplementation implements DetailsPresenter
{
    public DetailsView detailsView;
    public DetailsPresenterImplementation (DetailsView detailsView)
    {
        this.detailsView = detailsView;
    }

    @Override
    public void onProgressChanged(int progress) {
        if (progress == 100)
        {
            detailsView.hideProgressbar();
        }
        else
        {
            detailsView.showProgressbar();
        }
    }
}
