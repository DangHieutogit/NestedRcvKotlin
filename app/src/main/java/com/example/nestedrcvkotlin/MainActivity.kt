package com.example.nestedrcvkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val parentList = ArrayList<ParentItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.Rcv_data)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()
        val adapter = ParentAdapter(parentList)
        recyclerView.adapter = adapter


    }

    private fun addDataToList() {
        val childItems1 = ArrayList<ChildItem>()
        childItems1.add(ChildItem("Iphone 14 Pro Max Màu Đen",R.drawable.ic_ipden))
        childItems1.add(ChildItem("Iphone 14 Pro Max Màu Trắng",R.drawable.ic_iptrang))
        childItems1.add(ChildItem("Iphone 14 Pro Max Màu Đỏ",R.drawable.ic_ipdo))
        childItems1.add(ChildItem("Iphone 14 Pro Max Màu Xanh Lá",R.drawable.ic_ipxanhla))
        childItems1.add(ChildItem("Iphone 14 Pro Max Màu Xanh Dương",R.drawable.ic_ipxanhduong))

       parentList.add(ParentItem("Các Dòng Iphone 14 Pro Max",R.drawable.ic_ipden,childItems1))

        val childItems2 = ArrayList<ChildItem>()
        childItems2.add(ChildItem("Msi 1 ",R.drawable.ic_msi1))
        childItems2.add(ChildItem("Msi 2",R.drawable.ic_msi2))
        childItems2.add(ChildItem("Msi 3",R.drawable.ic_msi3))
        childItems2.add(ChildItem("Msi 4",R.drawable.ic_msi4))
        childItems2.add(ChildItem("Msi ",R.drawable.ic_msi5))

        parentList.add(ParentItem("Màn Gaming Msi",R.drawable.ic_launcher_background,childItems2))

        val childItems3 = ArrayList<ChildItem>()
        childItems3.add(ChildItem("C",R.drawable.ic_launcher_foreground))
        childItems3.add(ChildItem("C#",R.drawable.ic_launcher_foreground))
        childItems3.add(ChildItem("Java",R.drawable.ic_launcher_foreground))
        childItems3.add(ChildItem("Python",R.drawable.ic_launcher_foreground))
        childItems3.add(ChildItem("C++",R.drawable.ic_launcher_foreground))

        parentList.add(ParentItem("Game Development",R.drawable.ic_launcher_background,childItems3))



    }

}