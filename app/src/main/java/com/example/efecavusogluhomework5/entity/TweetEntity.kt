package com.example.efecavusogluhomework5.entity

import java.io.Serializable

data class TweetEntity
    (var id:Int,
     var senderPicture:String,
     var senderName:String,
     var hasBlueTick:Boolean,
     var senderUsername:String,
     var tweetAge:String,
     var tweetContent:String,
     var tweetPhotoContent:String,
     var commentNumber: String,
     var retweetNumber: String,
     var likeNumber: String ,
     var statsNumber: String) : Serializable