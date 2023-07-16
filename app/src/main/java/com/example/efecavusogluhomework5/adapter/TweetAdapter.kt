package com.example.efecavusogluhomework5.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.efecavusogluhomework5.databinding.CardDesignBinding
import com.example.efecavusogluhomework5.entity.TweetEntity

class TweetAdapter(var mContext:Context, var tweetsList:List<TweetEntity>)
    : RecyclerView.Adapter<TweetAdapter.CardDesignHolder>() {


    inner class CardDesignHolder(var design : CardDesignBinding) : RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding = CardDesignBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val tweet = tweetsList.get(position)
        val tweetCardTemplate = holder.design


        tweetCardTemplate.senderPicture.setImageResource(
            mContext.resources.getIdentifier(tweet.senderPicture, "drawable", mContext.packageName))

        if(tweet.tweetPhotoContent.equals("noimage") ){
            tweetCardTemplate.tweetPhotoContent.visibility = View.GONE
        } else {
            tweetCardTemplate.tweetPhotoContent.visibility = View.VISIBLE
            tweetCardTemplate.tweetPhotoContent.setImageResource(
                mContext.resources.getIdentifier(tweet.tweetPhotoContent,"drawable",mContext.packageName)
            )
        }

        if(tweet.hasBlueTick){
            tweetCardTemplate.blueTick.visibility = View.VISIBLE
        } else {
            tweetCardTemplate.blueTick.visibility = View.GONE
        }

        tweetCardTemplate.senderName.text = tweet.senderName
        tweetCardTemplate.senderUsername.text = tweet.senderUsername
        tweetCardTemplate.tweetAge.text = tweet.tweetAge
        tweetCardTemplate.tweetContent.text = tweet.tweetContent

        tweetCardTemplate.commentNumber.text = tweet.commentNumber
        tweetCardTemplate.retweetNumber.text = tweet.retweetNumber
        tweetCardTemplate.likeNumber.text = tweet.likeNumber
        tweetCardTemplate.statsNumber.text = tweet.statsNumber

    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }
}