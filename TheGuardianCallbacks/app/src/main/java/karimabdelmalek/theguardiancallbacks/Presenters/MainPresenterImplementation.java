package karimabdelmalek.theguardiancallbacks.Presenters;

/**
 * Created by karimabdelmalek on 9/30/16.
 */

public class MainPresenterImplementation implements MainPresenter {

    public MainView mainView;

    public MainPresenterImplementation (MainView mainView)
    {
            this.mainView = mainView;
    }
    @Override
    public void onItemClicked(int identifier) {
        {
            mainView.setSelectedItemOnNavigationDrawer(identifier);
        }
    }
}
