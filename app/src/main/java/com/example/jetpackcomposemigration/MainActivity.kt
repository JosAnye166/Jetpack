package com.example.jetpackcomposemigration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //val helloView = findViewById<ComposeView>(R.id.hello)
        //helloView.setContent {
        //     Hello()
        //}
        setContent {
            Hello()
        }
    }
}

@Preview
@Composable
private fun Hello() {
    Column(Modifier.fillMaxSize()) {
        Text("Hello Jetpack Compose",
            modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally))
        AndroidView(factory = {
            TextView(it).apply {
                text = "Hello Android View"
            }
        })
    }
}