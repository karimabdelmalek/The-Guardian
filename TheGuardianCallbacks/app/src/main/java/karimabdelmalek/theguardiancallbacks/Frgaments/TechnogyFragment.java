package karimabdelmalek.theguardiancallbacks.Frgaments;

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

import karimabdelmalek.theguardiancallbacks.Adapters.CommonAdapter;
import karimabdelmalek.theguardiancallbacks.DataClasses.ParentResponse;
import karimabdelmalek.theguardiancallbacks.DataClasses.ResultItem;
import karimabdelmalek.theguardiancallbacks.Helpers.Constants;
import karimabdelmalek.theguardiancallbacks.Helpers.ServicesCallback;
import karimabdelmalek.theguardiancallbacks.Helpers.Utilities;
import karimabdelmalek.theguardiancallbacks.Helpers.WebServices;
import karimabdelmalek.theguardiancallbacks.Presenters.CommonPresenterImplementation;
import karimabdelmalek.theguardiancallbacks.Presenters.CommonView;
import karimabdelmalek.theguardiancallbacks.R;

/**
 * Created by karimabdelmalek on 9/30/16.
 */

public class TechnogyFragment extends Fragment implements CommonView {
    RecyclerView recyclerView;
    CommonAdapter recycleViewAdapter;
    ProgressBar progressBar;
    CommonPresenterImplementation presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_common, container, false);
        initUI(rootView);
        presenter = new CommonPresenterImplementation(this);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        FetchData();
    }

    public static TechnogyFragment newInstance(int sectionNumber) {
        TechnogyFragment fragment = new TechnogyFragment();
        Bundle args = new Bundle();
        args.putInt(Constants.ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }


    public void initUI(View rootView) {
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerViewCommon);
        progressBar = (ProgressBar) rootView.findViewById(R.id.progressBar);
    }

    public void FetchData() {
        if (Utilities.CheckIfApplicationIsConnected(getActivity())) {
            WebServices.getTechnologyItems(new ServicesCallback() {
                @Override
                public void onResponse(ParentResponse response) {
                    presenter.retrieveResponse(response,getString(R.string.commonErrorTxt));
                }
            },getActivity().getApplicationContext());
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
        Toast.makeText(this.getActivity(), message, Toast.LENGTH_LONG).show();

    }

    @Override
    public void setAdapterToRecyclerView(ArrayList<ResultItem> results) {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        recycleViewAdapter = new CommonAdapter(getActivity(), results);
        recyclerView.setAdapter(recycleViewAdapter);
    }
}