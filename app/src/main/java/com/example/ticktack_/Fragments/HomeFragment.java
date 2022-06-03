package com.example.ticktack_.Fragments;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ticktack_.Adapter.ToDoAdapter;
import com.example.ticktack_.AddNewTask;
import com.example.ticktack_.DialogCloseListener;
import com.example.ticktack_.MainActivity;
import com.example.ticktack_.Model.ToDoModel;
import com.example.ticktack_.R;
import com.example.ticktack_.RecyclerItemTouchHelper;
import com.example.ticktack_.Utils.DatabaseHandler;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Collections;
import java.util.List;


public class HomeFragment extends Fragment  {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);






    }
}