package com.example.alexcars;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

public class SwipeToDelete extends ItemTouchHelper.SimpleCallback {

    private CarAdapter adapter;

    public SwipeToDelete(CarAdapter adapter) {
        super(0,ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT);
        this.adapter=adapter;
    }

    @Override


    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {

        return false;
    }

    @Override
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
        int position = viewHolder.getAdapterPosition();
        adapter.DeleteCar(position);

    }
}
