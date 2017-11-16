package mekotlinapps.dnyaneshwar.`in`.recyclerlistviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myList = listOf<String>("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(ListItemDecorations(20))
        recyclerView.setHasFixedSize(true)

        myAdapter = MyAdapter(this, myList)
        recyclerView.setAdapter(myAdapter)
    }
}
