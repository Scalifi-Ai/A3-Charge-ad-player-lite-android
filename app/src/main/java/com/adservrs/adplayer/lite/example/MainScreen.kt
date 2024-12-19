package com.adservrs.adplayer.lite.example

import androidx.compose.foundation.layout.Box
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
                view.load(pubId = BuildConfig.AV_PUB_ID, tagId = BuildConfig.AV_TAG_ID)
                view
            },
            onRelease = {
                it.release()
            },
        )
    }
}
