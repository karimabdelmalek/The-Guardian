package karimabdelmalek.theguardiancallbacks.Presenters;

/**
 * Created by karimabdelmalek on 10/1/16.
 */

public class ListPresenterImplementation implements ListPresenter
{
    public ListView listView;

    public ListPresenterImplementation (ListView listView)
    {
        this.listView = listView;
    }


    @Override
    public void goToDetailsPage(String url,String title) {
        listView.goToDetailsPage(url,title);
    }
}
