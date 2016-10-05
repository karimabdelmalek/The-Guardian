package karimabdelmalek.theguardian.Frgaments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

import bolts.Task;
import karimabdelmalek.theguardian.Adapters.CommonAdapter;
import karimabdelmalek.theguardian.DataClasses.ParentResponse;
import karimabdelmalek.theguardian.DataClasses.ResultItem;
import karimabdelmalek.theguardian.Helpers.Constants;
import karimabdelmalek.theguardian.Helpers.Utilities;
import karimabdelmalek.theguardian.Helpers.WebServices;
import karimabdelmalek.theguardian.Presenters.CommonPresenterImplementation;
import karimabdelmalek.theguardian.Presenters.CommonView;
import karimabdelmalek.theguardian.R;

/**
 * Created by karimabdelmalek on 9/28/16.
 */

public class HomeFragment extends Fragment implements CommonView
{
    RecyclerView recyclerView;
    CommonAdapter recycleViewAdapter;
    ProgressBar progressBar;
    CommonPresenterImplementation presenter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_common, container, false);
        initUI(rootView);
        presenter = new CommonPresenterImplementation (this);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        FetchData();
    }

    public static HomeFragment newInstance(int sectionNumber) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putInt(Constants.ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }



    public void initUI (View rootView)
    {
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewCommon);
        progressBar = (ProgressBar) rootView.findViewById(R.id.progressBar);
    }

    public void FetchData ()
    {
        if (Utilities.CheckIfApplicationIsConnected(getActivity())) {
            Task<ParentResponse> returnedDataTask = WebServices.getHomeItems(getActivity().getApplicationContext());
            presenter.retrieveTask(returnedDataTask,getString(R.string.commonErrorTxt));
        }
        else
        {
            presenter.showNoInternetConnectionMessage(getString(R.string.noConnectionText));
        }
    }


    @Override
    public void showProgressBar() {
            progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);

    }

    @Override
    public void showErrorMessage(String message) {
        Toast.makeText(this.getActivity(),message,Toast.LENGTH_LONG).show();

    }

    @Override
    public void setAdapterToRecyclerView(ArrayList<ResultItem> results) {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        recycleViewAdapter = new CommonAdapter(getActivity(),results);
        recyclerView.setAdapter(recycleViewAdapter);
    }
}
