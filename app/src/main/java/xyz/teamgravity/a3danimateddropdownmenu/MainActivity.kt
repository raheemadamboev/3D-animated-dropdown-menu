package xyz.teamgravity.a3danimateddropdownmenu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                color = Color.White,
                modifier = Modifier.fillMaxSize()
            ) {
                DropDownMenu(
                    text = "Hello Raheem!",
                    modifier = Modifier.padding(16.dp)
                ) {
                    Surface(
                        color = Color.Cyan,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = "This is now revealed",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(120.dp)
                                .padding(16.dp)
                        )
                    }
                }
            }
        }
    }
}