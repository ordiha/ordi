package com.chad.baserecyclerviewadapterhelper.adapter.node

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.chad.baserecyclerviewadapterhelper.databinding.ItemNodeEntityBinding
import com.chad.baserecyclerviewadapterhelper.databinding.ItemNodeFirstBinding
import com.chad.baserecyclerviewadapterhelper.entity.NodeEntity
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.QuickAdapterHelper
import com.chad.library.adapter.base.SingleItemAdapter

class FirstNodeAdapter(item: NodeEntity.FirstNode?): SingleItemAdapter<NodeEntity.FirstNode, FirstNodeAdapter.VH>(item) {

    class VH(val viewBinding: ItemNodeFirstBinding): RecyclerView.ViewHolder(viewBinding.root)

    override fun onCreateViewHolder(context: Context, parent: ViewGroup, viewType: Int): VH {
        return VH(ItemNodeFirstBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, item: NodeEntity.FirstNode?) {
        holder.viewBinding.apply {
            tvContent.text = item?.content
        }
    }
}