package com.example.fastcampus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentFirst : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflater : XML을 화면에 사용할 준비를 한다 (XML -> View로 만들어준다)
        // container : 프라그먼트에서 사용될 XML의 부모뷰
        return inflater.inflate(R.layout.first_fragment, container, false)
        // attachToRoot : 루브뷰에 붙일지 말지(X)
    }
}