package com.example.finalexamapp

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.google.firebase.firestore.auth.User

class Adapter(private val mContext: Context, private val dataSource:List<User>) : BaseAdapter{
    override fun getCount(): Int {
        return dataSource.size

    }
    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return  position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val layoutInflater = LayoutInflater.from(mContext)
        val layout = layoutInflater.inflate(R.layout.activity_main2, parent, false)



        layout.setBackgroundColor(Color.parseColor("#34495e"))



        val currentUser: User = dataSource[position];

        nameTextView.text = "${currentUser.name} ${currentUser.lastName}"
        positionView.text = "Age: ${currentUser.age}"

        return  layout




    }
}