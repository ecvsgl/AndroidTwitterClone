package com.example.efecavusogluhomework5.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.efecavusogluhomework5.adapter.TweetAdapter
import com.example.efecavusogluhomework5.databinding.FragmentMainpageBinding
import com.example.efecavusogluhomework5.entity.TweetEntity

class MainpageFragment : Fragment() {
    private lateinit var binding: FragmentMainpageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainpageBinding.inflate(inflater, container, false)

        binding.rvTweets.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)

        val tweetsList = ArrayList<TweetEntity>()

        val tweet1 = TweetEntity(1, "spacex", "SpaceX",
            true, "@SpaceX", "1h", "We have liftoff!",
            "spacexsampleimage350x246", "33431", "23145", "534K",
            "1M")
        tweetsList.add(tweet1)

        val tweet2 = TweetEntity(2, "natgeo", "National Geographic",
            false, "@NatGeo", "1w", "Nature (or whats left of it) is beautiful! Seriously though. Recycle.",
            "noimage", "4586", "33357", "98547",
            "7M")
        tweetsList.add(tweet2)

        val tweet3 = TweetEntity(3, "nasa", "NASA",
            true, "@NASA", "2s", "Anyone likes space?",
            "noimage", "4", "345", "246",
            "70K")
        tweetsList.add(tweet3)

        val tweet4 = TweetEntity(4, "gag", "9GAG",
            false, "@9GAG", "20m", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce ut eros ut erat euismod interdum. Morbi eleifend felis vel odio ultricies, ac rhoncus massa lobortis. Sed eu est id mi consequat suscipit. ",
            "noimage", "43", "5674", "32467",
            "1.3M")
        tweetsList.add(tweet4)



        val tweetAdapter = TweetAdapter(requireContext(),tweetsList)
        binding.rvTweets.adapter = tweetAdapter

        return binding.root
    }


}