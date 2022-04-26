package com.example.emprotobottomsheet

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetBehavior as Bottom


class MainActivity : AppCompatActivity() {
    lateinit var btnShowNotifications: Button
    private lateinit var bottomSheetBehavior: Bottom<ConstraintLayout>
    lateinit var bottomSheetFragment: BottomSheetFragment
    var data = ArrayList<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowNotifications = findViewById(R.id.btnShowNotifications)
        btnShowNotifications.setOnClickListener {


            bottomSheetFragment = BottomSheetFragment()
            bottomSheetFragment.show(supportFragmentManager, "BSDialogFragment")
        }
    }

  /*  private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(this, R.style.Base_ThemeOverlay_Material3_BottomSheetDialog)
        bottomSheetDialog.setContentView(R.layout.fragment_notification_bottom_sheet)
        for (i in 1..20) {
            data.add(DataModel(R.drawable.img, "Notification Topic 1","It is a long established fact that a reader will be distracted ","1h"))
            Log.i("msg","data")
        }

        val customAdapter = CustomAdapter(this, data)
        val recyclerview = bottomSheetDialog.findViewById<RecyclerView>(R.id.rv)
        recyclerview?.apply {
            adapter = customAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }
        bottomSheetDialog.show()
    }*/


}

