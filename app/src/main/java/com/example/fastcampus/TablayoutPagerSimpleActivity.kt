package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class TablayoutPagerSimpleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablayout_pager_simple)

        val viewPager = findViewById<ViewPager>(R.id.Pager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        tabLayout.addTab(tabLayout.newTab().setText("1번째"))
        tabLayout.addTab(tabLayout.newTab().setText("2번째"))
        tabLayout.addTab(tabLayout.newTab().setText("3번째"))

        viewPager.adapter = ViewPagerAdapter(LayoutInflater.from(this), 3)

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewPager.setCurrentItem(tab!!.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

    }
}

class ViewPagerAdapter(
    val layoutInflater: LayoutInflater,
    val tabCount : Int
) : PagerAdapter() {
    override fun getCount(): Int {
        return tabCount
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view ===`object` as View
//        == -> 값을 비교
//        === -> 주소값을 비교한다
//        a = 1, b=1 -> a==b(True), a===b (True, False)
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        when(position){
            0->{
                val view = layoutInflater.inflate(R.layout.first_fragment, container, false)
                container.addView(view)
                return view
            }
            1->{
                val view = layoutInflater.inflate(R.layout.activity_phone_book, container, false)
                container.addView(view)
                return view
            }
            else->{
                val view = layoutInflater.inflate(R.layout.first_fragment, container, false)
                container.addView(view)
                return view
            }
        }
    }
}