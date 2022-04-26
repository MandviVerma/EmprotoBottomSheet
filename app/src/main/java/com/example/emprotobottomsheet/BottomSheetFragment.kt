package com.example.emprotobottomsheet

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class
BottomSheetFragment : BottomSheetDialogFragment(){
    var data = ArrayList<DataModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        view?.viewTreeObserver?.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
            override fun onGlobalLayout() {
                val bottomSheet = (dialog as BottomSheetDialog).findViewById<View>(R.id.locUXView) as LinearLayout
                BottomSheetBehavior.from<View>(bottomSheet).apply {
                    peekHeight = 100
                }

                view?.viewTreeObserver?.removeOnGlobalLayoutListener(this)
            }
        })
        return inflater.inflate(R.layout.fragment_notification_bottom_sheet, container, false)
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        for (i in 1..20) {
            data.add(DataModel(R.drawable.img, "Notification Topic 1","It is a long established fact that a reader will be distracted ","1h"))
            Log.i("msg","data")
        }

        val customAdapter = CustomAdapter(context, data)
        val recyclerview = requireView().findViewById<RecyclerView>(R.id.rv)
        recyclerview?.apply {
            adapter = customAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }



    }
}