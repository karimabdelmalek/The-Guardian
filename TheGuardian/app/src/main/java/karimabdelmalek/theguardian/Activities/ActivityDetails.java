package karimabdelmalek.theguardian.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import karimabdelmalek.theguardian.Presenters.DetailsPresenterImplementation;
import karimabdelmalek.theguardian.Presenters.DetailsView;
import karimabdelmalek.theguardian.R;

/**
 * Created by karimabdelmalek on 10/1/16.
 */

public class ActivityDetails extends AppCompatActivity implements DetailsView
{
    private WebView webView;
    private Toolbar toolbar;
    private ProgressBar progressBar;
    private DetailsPresenterImplementation presenter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        initUI();
        presenter = new DetailsPresenterImplementation(this);
        Intent mIntent = getIntent();
        String selectedUrl = mIntent.getExtras().getString("Url");
        String selectedTitle = mIntent.getExtras().getString("Title");
        getSupportActionBar().setTitle(selectedTitle);
        webView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                presenter.onProgressChanged(progress);
            }
        });

        webView.setWebViewClient(new WebViewClient() );

        webView.loadUrl(selectedUrl);
    }

    public void initUI ()
    {
        toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
    }


    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack())
        {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
            super.onBackPressed();
        }

    @Override
    public void showProgressbar() {
        progressBar.bringToFront();
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressbar() {
        progressBar.setVisibility(View.GONE);

    }
}


