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
                view.load(
                    pubId = "68540ce88ee8d56dbe0d78a6",
                    tagId = "6894984db91db4b4c409aeab",
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
