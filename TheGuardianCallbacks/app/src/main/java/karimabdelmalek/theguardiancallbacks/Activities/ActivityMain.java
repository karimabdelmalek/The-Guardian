package karimabdelmalek.theguardiancallbacks.Activities;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import karimabdelmalek.theguardiancallbacks.Frgaments.ArtsFragment;
import karimabdelmalek.theguardiancallbacks.Frgaments.BusinessFragment;
import karimabdelmalek.theguardiancallbacks.Frgaments.EnvironmentFragment;
import karimabdelmalek.theguardiancallbacks.Frgaments.FashionFragment;
import karimabdelmalek.theguardiancallbacks.Frgaments.HomeFragment;
import karimabdelmalek.theguardiancallbacks.Frgaments.LifestyleFragment;
import karimabdelmalek.theguardiancallbacks.Frgaments.SportsFragment;
import karimabdelmalek.theguardiancallbacks.Frgaments.TechnogyFragment;
import karimabdelmalek.theguardiancallbacks.Frgaments.TravelFragment;
import karimabdelmalek.theguardiancallbacks.Presenters.MainPresenter;
import karimabdelmalek.theguardiancallbacks.Presenters.MainPresenterImplementation;
import karimabdelmalek.theguardiancallbacks.Presenters.MainView;
import karimabdelmalek.theguardiancallbacks.R;


public class ActivityMain extends AppCompatActivity implements MainView {

    private Toolbar toolbar;
    private DrawerLayout drawer;
    private MainPresenter presenter;
    private String selectedFragmentTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenterImplementation(this);
        initUI();
    }

    public void initUI()
    {
        toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);
        initializeDrawer ();
        setHomeScreenAsDefault ();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                presenter.onItemClicked(item.getItemId());
                return true;
            }
        });
    }

    public void initializeDrawer ()
    {
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    public void setHomeScreenAsDefault ()
    {
        getSupportFragmentManager().beginTransaction()
            .replace(R.id.container, HomeFragment.newInstance(1))
            .commit();
        selectedFragmentTitle = "Home";
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public void setSelectedItemOnNavigationDrawer(int identifier) {
        drawer.closeDrawers();
        if (identifier == R.id.home_item && selectedFragmentTitle != "Home")
        {
            selectHomeItem(identifier);

        }
        else if (identifier == R.id.sports_item && selectedFragmentTitle != "Sports")
        {
            selectSportsItem(identifier);
        }
        else if (identifier == R.id.lifestyle_item && selectedFragmentTitle != "LifeStyle")
        {
            selectLifestyleItem(identifier);
        }

        else if (identifier == R.id.technology_item && selectedFragmentTitle != "Technology")
        {
            selectTechnologyItem(identifier);
        }
        else if (identifier == R.id.fashion_item && selectedFragmentTitle != "Fashion")
        {
            selectFashionItem(identifier);
        }
        else if (identifier == R.id.business_item && selectedFragmentTitle != "Business")
        {
            selectBusinessItem(identifier);
        }
        else if (identifier == R.id.environment_item && selectedFragmentTitle != "Environment")
        {
            selectEnvironmentItem(identifier);
        }

        else if (identifier == R.id.arts_item && selectedFragmentTitle != "Arts")
        {
            selectArtsItem(identifier);
        }
        else if (identifier == R.id.travel_item && selectedFragmentTitle != "Travel")
        {
            selectTravelItem(identifier);
        }
    }




    public void selectHomeItem (int identifier)
    {
        this.getSupportActionBar().setTitle(this.getString(R.string.app_name));
        selectedFragmentTitle = "Home";
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, HomeFragment.newInstance(identifier + 1))
                .commit();
    }

    public void selectSportsItem (int identifier)
    {
        this.getSupportActionBar().setTitle(this.getString(R.string.sportsTxt));
        selectedFragmentTitle = "Sports";
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, SportsFragment.newInstance(identifier + 1))
                .commit();
    }

    public void selectLifestyleItem (int identifier)
    {
        this.getSupportActionBar().setTitle(this.getString(R.string.lifestyleTxt));
        selectedFragmentTitle = "LifeStyle";
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, LifestyleFragment.newInstance(identifier + 1))
                .commit();
    }

    public void selectTechnologyItem (int identifier)
    {
        this.getSupportActionBar().setTitle(this.getString(R.string.technologyTxt));
        selectedFragmentTitle = "Technology";
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, TechnogyFragment.newInstance(identifier + 1))
                .commit();
    }

    public void selectFashionItem (int identifier)
    {
        this.getSupportActionBar().setTitle(this.getString(R.string.fashionTxt));
        selectedFragmentTitle = "Fashion";
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, FashionFragment.newInstance(identifier + 1))
                .commit();
    }

    public void selectBusinessItem (int identifier)
    {
        this.getSupportActionBar().setTitle(this.getString(R.string.businessTxt));
        selectedFragmentTitle = "Business";
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, BusinessFragment.newInstance(identifier + 1))
                .commit();
    }

    public void selectEnvironmentItem (int identifier)
    {
        this.getSupportActionBar().setTitle(this.getString(R.string.environmentTxt));
        selectedFragmentTitle = "Environment";
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, EnvironmentFragment.newInstance(identifier + 1))
                .commit();
    }

    public void selectArtsItem (int identifier)
    {
        this.getSupportActionBar().setTitle(this.getString(R.string.artsTxt));
        selectedFragmentTitle = "Arts";
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, ArtsFragment.newInstance(identifier + 1))
                .commit();
    }

    public void selectTravelItem (int identifier)
    {
        this.getSupportActionBar().setTitle(this.getString(R.string.travelTxt));
        selectedFragmentTitle = "Travel";
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, TravelFragment.newInstance(identifier + 1))
                .commit();
    }
}
