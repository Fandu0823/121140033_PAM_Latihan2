package com.example.a121140033_pam_latihan2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.a121140033_pam_latihan2.ui.theme._121140014_PAM_Latihan2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _121140014_PAM_Latihan2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ButtonList()
                }
            }
        }
    }
}

@Composable
fun ButtonList() {
    Column {
        // Tombol dengan tema primary
        Button(
            onClick = {
                // Aksi yang dilakukan saat tombol ditekan
            },
        ) {
            // Memperbaiki parameter yang diperlukan
            Text("Primary Button")
        }

        // Tombol dengan tema success
        Button(
            onClick = {
                // Aksi yang dilakukan saat tombol ditekan
            },
        ) {
            Text("Success Button")
        }

        // Tombol dengan tema warning
        Button(
            onClick = {
                // Aksi yang dilakukan saat tombol ditekan
            },
        ) {
            Text("Warning Button")
        }
    }
}
