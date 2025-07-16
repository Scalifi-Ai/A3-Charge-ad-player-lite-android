package com.adservrs.adplayer.lite.example

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.adservrs.adplayer.lite.AdPlayerView

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        AndroidView(
            factory = {
                val view = AdPlayerView(it)
//                view.load(
//                    pubId = "565c56d3181f46bd608b459a",
//                    tagId = "67dd7d7835b4a37b880f2b3c",
//                )
                view.load(
                    pubId = "67c61463b9541df7de0d1971",
                    tagId = "67c61770cabacd39ac031960",
                )
                view
            },
            onRelease = {
                it.release()
            },
            modifier = Modifier.fillMaxSize(),
        )
    }
}
